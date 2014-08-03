/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.Arguments#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getArguments()
 * @model
 * @generated
 */
public interface Arguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link aom.scripting.xs.xs.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see aom.scripting.xs.xs.XsPackage#getArguments_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Arguments
