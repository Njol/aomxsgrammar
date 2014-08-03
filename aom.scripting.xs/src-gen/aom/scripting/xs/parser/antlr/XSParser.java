/*
* generated by Xtext
*/
package aom.scripting.xs.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import aom.scripting.xs.services.XSGrammarAccess;

public class XSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XSGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected aom.scripting.xs.parser.antlr.internal.InternalXSParser createParser(XtextTokenStream stream) {
		return new aom.scripting.xs.parser.antlr.internal.InternalXSParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public XSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
