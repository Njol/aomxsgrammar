/*
 * generated by Xtext
 */
package aom.scripting.xs.validation

import aom.scripting.xs.xs.Call
import aom.scripting.xs.xs.GlobalVarDeclaration
import aom.scripting.xs.xs.XsPackage
import org.eclipse.xtext.validation.Check
//import de.itemis.xtext.typesystem.ITypesystem
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import aom.scripting.xs.xs.LiteralInt
import aom.scripting.xs.xs.LiteralString
import aom.scripting.xs.xs.Var
import java.lang.reflect.Array
import java.util.Arrays
import aom.scripting.xs.xs.ParameterDeclaration
import aom.scripting.xs.xs.SwitchCase
import aom.scripting.xs.xs.FunctionDeclaration
import aom.scripting.xs.xs.VectorLiteral
import aom.scripting.xs.xs.Expression
import aom.scripting.xs.xs.Literal
import aom.scripting.xs.xs.util.XsSwitch
import aom.scripting.xs.scoping.XSTypeChecker
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.common.util.DiagnosticChain
import java.util.Map
import aom.scripting.xs.xs.Assign
import aom.scripting.xs.xs.IncludeDeclaration
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import aom.scripting.xs.scoping.XSScopeProvider
import aom.scripting.xs.xs.VarDeclaration
import aom.scripting.xs.xs.RuleDeclaration
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import aom.scripting.xs.xs.ForVarDeclaration
import aom.scripting.xs.xs.LocalVarDeclaration
import aom.scripting.xs.xs.IntType
import aom.scripting.xs.xs.FloatType
import aom.scripting.xs.xs.Type

/**
 * Custom validation rules. 
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class XSValidator extends AbstractXSValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
//	@Inject
//	private ITypesystem ts;
//	@Check
//	def checkTypesystemRules(EObject x) {
//		// System.out.println("Checking type of " + x.toString())
//		ts.checkTypesystemConstraints(x, this);
//	}
	final XSTypeChecker typeChecker = new XSTypeChecker(this);

	@Check
	def checkTypes(EObject eo) {
		typeChecker.check(eo);
	}

	@Inject
	XSScopeProvider scopeProvider;

	@Check
	def checkDoubleDeclaration(EObject eo) {
		// rules: no identifier may exists twice except for the following cases:
		// - 'for' loops create an int variable implicitly if the variable does not exist yet (the game crashes if the variable is not actually an int or float)
		// --- cannot use parameters or global variables though
		// - global variables can be redeclared, even with different types and 'const'-ness, but no 'extern' declaration may follow a non-'extern' one (the other way around is fine)
		// - global variables can be shadowed by local variables and parameters of any type
		// (this list is likely not complete)
		switch (eo) {
			FunctionDeclaration: {
				val existingDeclDesc = scopeProvider.getScope(eo, null).getSingleElement(QualifiedName.create(eo.name));
				val existingDecl = existingDeclDesc.EObjectOrProxy
				if (existingDecl != null) {
					if (existingDecl instanceof FunctionDeclaration) {
						if (!("true".equals(existingDeclDesc.getUserData("mutable")) || existingDecl.mutable))
							error("This method is already declared, but not 'mutable'",
								XsPackage.Literals.FUNCTION_DECLARATION__NAME);
						return;
					}
					error("The identifier '" + eo.name + "' is already used",
						XsPackage.Literals.FUNCTION_DECLARATION__NAME);
				}
			}
			RuleDeclaration: {
				val existingDecl = scopeProvider.getScope(eo, null).getSingleElement(QualifiedName.create(eo.name)).
					EObjectOrProxy;
				if (existingDecl != null)
					error("The identifier '" + eo.name + "' is already used",
						XsPackage.Literals.RULE_DECLARATION__NAME);
			}
			ForVarDeclaration: {
				// If a variable of a 'for' statement does not exist, is is created with type int.
				// If the variable already exists then that variable is used, potentially crashing AoM if it is not an int or float (e.g. bool)
				val existingDecl = scopeProvider.getScope(eo, null).getSingleElement(QualifiedName.create(eo.name)).
					EObjectOrProxy;
				if (existingDecl != null) {
					switch (existingDecl) {
						ForVarDeclaration: {
							return; // valid if first declaration was a for loop too
						}
						LocalVarDeclaration: {
							error("This loop variable has previously been declared, but not as 'int' or 'float'",
								XsPackage.Literals.VAR_DECLARATION__NAME);
							return;
						}
						GlobalVarDeclaration: {
							// global variables cannot be shadowed by a 'for' var, even if a local variable of the same name exists
							error("This loop variable has previously been declared as a global variable",
								XsPackage.Literals.VAR_DECLARATION__NAME);
							return;
						}
						ParameterDeclaration: {
							// for loops cannot use parameters
							error("This loop variable has previously been declared as a parameter",
								XsPackage.Literals.VAR_DECLARATION__NAME);
							return;
						}
					}
					// function, trigger, etc.
					error("The identifier '" + eo.name + "' is already used", XsPackage.Literals.VAR_DECLARATION__NAME);
				}
			}
			GlobalVarDeclaration: {
				val existingDecl = scopeProvider.getScope(eo, null).getSingleElement(QualifiedName.create(eo.name)).
					EObjectOrProxy;
				if (existingDecl != null) {
					if (existingDecl instanceof GlobalVarDeclaration) {
						// global variables can be redeclared, but messing up the 'extern' values is bad
						val existingExtern = existingDecl.extern || existingDecl.eIsProxy; // proxies are not resolved, but since a proxy must be from another file it can only be extern
						if (existingExtern != eo.extern)
							error("This global variable has been declared " + (if(existingExtern) "" else "non-") +
								"'extern' previously", XsPackage.Literals.VAR_DECLARATION__NAME);
					} else {
						error("The identifier '" + eo.name + "' is already used",
							XsPackage.Literals.VAR_DECLARATION__NAME);
					}
				}
			}
			LocalVarDeclaration,
			ParameterDeclaration: {
				// these can shadow global variables, but nothing else
				val existingDecl = scopeProvider.getScope(eo, null).getSingleElement(QualifiedName.create(eo.name)).
					EObjectOrProxy;
				if (existingDecl != null && !(existingDecl instanceof GlobalVarDeclaration))
					error("The identifier '" + eo.name + "' is already used", XsPackage.Literals.VAR_DECLARATION__NAME);
			}
		}
	}

	@Inject
	private IResourceDescriptionsProvider resourceDescriptionsProvider;

	@Check
	def checkInclude(IncludeDeclaration include) {
		if (XSScopeProvider.getFile(resourceDescriptionsProvider, include.eResource, include.filePath) == null)
			error("Invalid file", XsPackage.Literals.INCLUDE_DECLARATION__FILE_PATH);
	}

	@Check
	def checkParameterCount(Call function) { // TODO perform type checks
		val declaration = function.function;
		if (!declaration.eIsProxy && function.arguments.size() > declaration.parameters.size()) {
			error("Too many arguments", XsPackage.Literals.CALL__FUNCTION);
		}
	}

	@Check
	def checkConstAssign(Assign assign) {
		val v = assign.^var.declaration
		if (v instanceof GlobalVarDeclaration && (v as GlobalVarDeclaration).const) {
			error("Assignment to constant", XsPackage.Literals.ASSIGN__VAR);
		}
	}

	@Check
	def checkIntDigits(LiteralInt intLiteral) {
		if (intLiteral.value > 999999999 || intLiteral.value < -999999999)
			error("Too many digits", XsPackage.Literals.LITERAL_INT__VALUE);
	}

	@Check
	def checkStringLength(LiteralString string) {
		if (string.value.length > 127)
			error("String is too long, only 127 characters are allowed", XsPackage.Literals.LITERAL_STRING__VALUE);
	}

	def isConstant(Expression expr) {
		return expr instanceof Literal ||
			expr instanceof Var && (expr as Var).declaration instanceof GlobalVarDeclaration &&
				((expr as Var).declaration as GlobalVarDeclaration).const;
	}

	@Check
	def checkConstantsInVector(VectorLiteral vector) {
		for (l : Arrays.asList(XsPackage.Literals.VECTOR_LITERAL__X, XsPackage.Literals.VECTOR_LITERAL__Y,
			XsPackage.Literals.VECTOR_LITERAL__Z)) {
			if (!isConstant(vector.eGet(l) as Expression))
				error("vector() requires constant arguments, use xsVectorSet() for dynamic values", l);
		}
	}

	@Check
	def checkConstantInGlobalVarDecl(GlobalVarDeclaration v) {
		if (!isConstant(v.value))
			error("Global variables must be initialized to a constant value",
				XsPackage.Literals.VAR_DECLARATION__VALUE);
	}

	@Check
	def checkConstantInParameter(ParameterDeclaration p) {
		if (!isConstant(p.value))
			error("Parameter default must be a constant value", XsPackage.Literals.VAR_DECLARATION__VALUE);
	}

	@Check
	def checkConstantInSwitchCase(SwitchCase c) {
		if (!isConstant(c.value))
			error("Switch case must use a constant value", XsPackage.Literals.SWITCH_CASE__VALUE);
	}

}
