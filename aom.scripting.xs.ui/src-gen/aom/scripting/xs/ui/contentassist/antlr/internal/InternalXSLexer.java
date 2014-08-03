package aom.scripting.xs.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXSLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalXSLexer() {;} 
    public InternalXSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:11:7: ( '+' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:12:7: ( '-' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:13:7: ( 'true' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:13:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:14:7: ( 'false' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:15:7: ( 'inactive' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:15:9: 'inactive'
            {
            match("inactive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:16:7: ( 'int' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:16:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:17:7: ( 'float' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:17:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:18:7: ( 'bool' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:18:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:19:7: ( 'vector' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:19:9: 'vector'
            {
            match("vector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:20:7: ( 'string' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:20:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:21:7: ( 'void' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:21:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:22:7: ( '++' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:22:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:23:7: ( '--' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:23:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:24:7: ( '==' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:24:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:25:7: ( '!=' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:25:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:26:7: ( '<=' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:26:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:27:7: ( '<' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:27:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:28:7: ( '>' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:29:7: ( '>=' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:29:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:30:7: ( '*' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:31:7: ( '/' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:32:7: ( '%' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:32:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:33:7: ( ';' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:33:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:34:7: ( '.' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:35:7: ( '(' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:36:7: ( ',' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:37:7: ( ')' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:38:7: ( '=' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:38:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:39:7: ( 'include' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:39:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:40:7: ( 'rule' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:40:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:41:7: ( 'group' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:41:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:42:7: ( 'minInterval' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:42:9: 'minInterval'
            {
            match("minInterval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:43:7: ( 'maxInterval' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:43:9: 'maxInterval'
            {
            match("maxInterval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:44:7: ( '{' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:44:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:45:7: ( '}' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:45:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:46:7: ( 'if' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:47:7: ( 'else' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:47:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:48:7: ( 'while' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:48:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:49:7: ( 'for' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:49:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:50:7: ( 'switch' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:50:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:51:7: ( 'case' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:51:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:52:7: ( ':' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:53:7: ( 'default' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:53:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:54:7: ( 'return' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:54:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:55:7: ( 'continue' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:55:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:56:7: ( 'break' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:56:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:57:7: ( 'active' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:57:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:58:7: ( 'runImmediately' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:58:9: 'runImmediately'
            {
            match("runImmediately"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:59:7: ( 'highFrequency' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:59:9: 'highFrequency'
            {
            match("highFrequency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:60:7: ( 'static' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:60:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:61:7: ( 'const' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:61:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:62:7: ( 'extern' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:62:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:63:7: ( 'mutable' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:63:9: 'mutable'
            {
            match("mutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:64:7: ( '||' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:64:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:65:7: ( '&&' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:65:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9338:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9338:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9338:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9338:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9338:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9340:10: ( ( '0' .. '9' )+ )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9340:12: ( '0' .. '9' )+
            {
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9340:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9340:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9342:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9344:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9344:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9344:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9344:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:41: ( '\\r' )? '\\n'
                    {
                    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9346:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9348:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9350:16: ( . )
            // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:9350:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=62;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:340: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:348: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:357: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:369: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:385: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:401: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 62 :
                // ../aom.scripting.xs.ui/src-gen/aom/scripting/xs/ui/contentassist/antlr/internal/InternalXS.g:1:409: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\53\1\55\6\57\1\74\1\51\1\77\1\101\1\uffff\1\105\6\uffff"+
        "\3\57\2\uffff\3\57\1\uffff\3\57\3\51\2\uffff\2\51\6\uffff\1\57\1"+
        "\uffff\4\57\1\151\6\57\21\uffff\6\57\2\uffff\5\57\1\uffff\3\57\5"+
        "\uffff\3\57\1\u0083\1\57\1\u0085\1\57\1\uffff\26\57\1\u009e\2\57"+
        "\1\uffff\1\57\1\uffff\1\57\1\u00a3\2\57\1\u00a6\3\57\1\u00aa\6\57"+
        "\1\u00b1\2\57\1\u00b4\5\57\1\uffff\1\u00ba\1\u00bb\2\57\1\uffff"+
        "\1\u00be\1\57\1\uffff\3\57\1\uffff\2\57\1\u00c5\3\57\1\uffff\1\57"+
        "\1\u00ca\1\uffff\1\57\1\u00cc\3\57\2\uffff\2\57\1\uffff\1\u00d2"+
        "\1\u00d3\1\u00d4\1\u00d5\1\57\1\u00d7\1\uffff\3\57\1\u00db\1\uffff"+
        "\1\57\1\uffff\1\57\1\u00de\2\57\1\u00e1\4\uffff\1\57\1\uffff\2\57"+
        "\1\u00e5\1\uffff\1\57\1\u00e7\1\uffff\1\57\1\u00e9\1\uffff\3\57"+
        "\1\uffff\1\u00ed\1\uffff\1\57\1\uffff\3\57\1\uffff\6\57\1\u00f8"+
        "\1\u00f9\2\57\2\uffff\2\57\1\u00fe\1\u00ff\2\uffff";
    static final String DFA12_eofS =
        "\u0100\uffff";
    static final String DFA12_minS =
        "\1\0\1\53\1\55\1\162\1\141\1\146\1\157\1\145\1\164\4\75\1\uffff"+
        "\1\52\6\uffff\1\145\1\162\1\141\2\uffff\1\154\1\150\1\141\1\uffff"+
        "\1\145\1\143\1\151\1\174\1\46\1\101\2\uffff\2\0\6\uffff\1\165\1"+
        "\uffff\1\154\1\157\1\162\1\141\1\60\1\157\1\145\1\143\1\151\1\141"+
        "\1\151\21\uffff\1\154\1\164\1\157\1\156\1\170\1\164\2\uffff\1\163"+
        "\1\164\1\151\1\163\1\156\1\uffff\1\146\1\164\1\147\5\uffff\1\145"+
        "\1\163\1\141\1\60\1\143\1\60\1\154\1\uffff\1\154\1\141\1\164\1\144"+
        "\1\151\2\164\1\145\1\111\2\165\2\111\1\141\2\145\1\154\1\145\1\163"+
        "\1\141\1\151\1\150\1\60\1\145\1\164\1\uffff\1\164\1\uffff\1\165"+
        "\1\60\1\153\1\157\1\60\1\156\1\151\1\143\1\60\1\155\1\162\1\160"+
        "\2\156\1\142\1\60\1\162\1\145\1\60\1\151\1\164\1\165\1\166\1\106"+
        "\1\uffff\2\60\1\151\1\144\1\uffff\1\60\1\162\1\uffff\1\147\1\143"+
        "\1\150\1\uffff\1\155\1\156\1\60\2\164\1\154\1\uffff\1\156\1\60\1"+
        "\uffff\1\156\1\60\1\154\1\145\1\162\2\uffff\1\166\1\145\1\uffff"+
        "\4\60\1\145\1\60\1\uffff\3\145\1\60\1\uffff\1\165\1\uffff\1\164"+
        "\1\60\2\145\1\60\4\uffff\1\144\1\uffff\2\162\1\60\1\uffff\1\145"+
        "\1\60\1\uffff\1\161\1\60\1\uffff\1\151\2\166\1\uffff\1\60\1\uffff"+
        "\1\165\1\uffff\3\141\1\uffff\1\145\1\164\2\154\1\156\1\145\2\60"+
        "\1\143\1\154\2\uffff\2\171\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\53\1\55\1\162\1\157\1\156\1\162\1\157\1\167\4\75\1\uffff"+
        "\1\57\6\uffff\1\165\1\162\1\165\2\uffff\1\170\1\150\1\157\1\uffff"+
        "\1\145\1\143\1\151\1\174\1\46\1\172\2\uffff\2\uffff\6\uffff\1\165"+
        "\1\uffff\1\154\1\157\1\162\1\164\1\172\1\157\1\145\1\143\1\151\1"+
        "\162\1\151\21\uffff\1\156\1\164\1\157\1\156\1\170\1\164\2\uffff"+
        "\1\163\1\164\1\151\1\163\1\156\1\uffff\1\146\1\164\1\147\5\uffff"+
        "\1\145\1\163\1\141\1\172\1\143\1\172\1\154\1\uffff\1\154\1\141\1"+
        "\164\1\144\1\151\2\164\1\145\1\111\2\165\2\111\1\141\2\145\1\154"+
        "\1\145\1\164\1\141\1\151\1\150\1\172\1\145\1\164\1\uffff\1\164\1"+
        "\uffff\1\165\1\172\1\153\1\157\1\172\1\156\1\151\1\143\1\172\1\155"+
        "\1\162\1\160\2\156\1\142\1\172\1\162\1\145\1\172\1\151\1\164\1\165"+
        "\1\166\1\106\1\uffff\2\172\1\151\1\144\1\uffff\1\172\1\162\1\uffff"+
        "\1\147\1\143\1\150\1\uffff\1\155\1\156\1\172\2\164\1\154\1\uffff"+
        "\1\156\1\172\1\uffff\1\156\1\172\1\154\1\145\1\162\2\uffff\1\166"+
        "\1\145\1\uffff\4\172\1\145\1\172\1\uffff\3\145\1\172\1\uffff\1\165"+
        "\1\uffff\1\164\1\172\2\145\1\172\4\uffff\1\144\1\uffff\2\162\1\172"+
        "\1\uffff\1\145\1\172\1\uffff\1\161\1\172\1\uffff\1\151\2\166\1\uffff"+
        "\1\172\1\uffff\1\165\1\uffff\3\141\1\uffff\1\145\1\164\2\154\1\156"+
        "\1\145\2\172\1\143\1\154\2\uffff\2\171\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\24\1\uffff\1\26\1\27\1\30\1\31\1\32\1\33\3\uffff\1"+
        "\42\1\43\3\uffff\1\52\6\uffff\1\70\1\71\2\uffff\1\75\1\76\1\14\1"+
        "\1\1\15\1\2\1\uffff\1\70\13\uffff\1\16\1\34\1\17\1\20\1\21\1\23"+
        "\1\22\1\24\1\73\1\74\1\25\1\26\1\27\1\30\1\31\1\32\1\33\6\uffff"+
        "\1\42\1\43\5\uffff\1\52\3\uffff\1\66\1\67\1\71\1\72\1\75\7\uffff"+
        "\1\44\31\uffff\1\47\1\uffff\1\6\30\uffff\1\3\4\uffff\1\10\2\uffff"+
        "\1\13\3\uffff\1\36\6\uffff\1\45\2\uffff\1\51\5\uffff\1\4\1\7\2\uffff"+
        "\1\56\6\uffff\1\37\4\uffff\1\46\1\uffff\1\63\5\uffff\1\11\1\12\1"+
        "\62\1\50\1\uffff\1\54\3\uffff\1\64\2\uffff\1\57\2\uffff\1\35\3\uffff"+
        "\1\65\1\uffff\1\53\1\uffff\1\5\3\uffff\1\55\12\uffff\1\40\1\41\4"+
        "\uffff\1\61\1\60";
    static final String DFA12_specialS =
        "\1\2\45\uffff\1\0\1\1\u00d8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\12\1\46\2\51\1\17\1\42\1"+
            "\47\1\22\1\24\1\15\1\1\1\23\1\2\1\21\1\16\12\45\1\35\1\20\1"+
            "\13\1\11\1\14\2\51\32\44\3\51\1\43\1\44\1\51\1\37\1\6\1\34\1"+
            "\36\1\32\1\4\1\26\1\40\1\5\3\44\1\27\4\44\1\25\1\10\1\3\1\44"+
            "\1\7\1\33\3\44\1\30\1\41\1\31\uff82\51",
            "\1\52",
            "\1\54",
            "\1\56",
            "\1\60\12\uffff\1\61\2\uffff\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65\2\uffff\1\66",
            "\1\67\11\uffff\1\70",
            "\1\71\2\uffff\1\72",
            "\1\73",
            "\1\75",
            "\1\76",
            "\1\100",
            "",
            "\1\103\4\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115\17\uffff\1\114",
            "\1\116",
            "\1\120\7\uffff\1\117\13\uffff\1\121",
            "",
            "",
            "\1\124\13\uffff\1\125",
            "\1\126",
            "\1\127\15\uffff\1\130",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\0\140",
            "\0\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\1\uffff\1\150\20\uffff\1\147",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\20\uffff\1\156",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161\1\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0084",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u009a\1\u0099",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a4",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b2",
            "\1\u00b3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00cb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00df",
            "\1\u00e0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00e6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00e8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='+') ) {s = 1;}

                        else if ( (LA12_0=='-') ) {s = 2;}

                        else if ( (LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='f') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='v') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='=') ) {s = 9;}

                        else if ( (LA12_0=='!') ) {s = 10;}

                        else if ( (LA12_0=='<') ) {s = 11;}

                        else if ( (LA12_0=='>') ) {s = 12;}

                        else if ( (LA12_0=='*') ) {s = 13;}

                        else if ( (LA12_0=='/') ) {s = 14;}

                        else if ( (LA12_0=='%') ) {s = 15;}

                        else if ( (LA12_0==';') ) {s = 16;}

                        else if ( (LA12_0=='.') ) {s = 17;}

                        else if ( (LA12_0=='(') ) {s = 18;}

                        else if ( (LA12_0==',') ) {s = 19;}

                        else if ( (LA12_0==')') ) {s = 20;}

                        else if ( (LA12_0=='r') ) {s = 21;}

                        else if ( (LA12_0=='g') ) {s = 22;}

                        else if ( (LA12_0=='m') ) {s = 23;}

                        else if ( (LA12_0=='{') ) {s = 24;}

                        else if ( (LA12_0=='}') ) {s = 25;}

                        else if ( (LA12_0=='e') ) {s = 26;}

                        else if ( (LA12_0=='w') ) {s = 27;}

                        else if ( (LA12_0=='c') ) {s = 28;}

                        else if ( (LA12_0==':') ) {s = 29;}

                        else if ( (LA12_0=='d') ) {s = 30;}

                        else if ( (LA12_0=='a') ) {s = 31;}

                        else if ( (LA12_0=='h') ) {s = 32;}

                        else if ( (LA12_0=='|') ) {s = 33;}

                        else if ( (LA12_0=='&') ) {s = 34;}

                        else if ( (LA12_0=='^') ) {s = 35;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='q')||LA12_0=='u'||(LA12_0>='x' && LA12_0<='z')) ) {s = 36;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 37;}

                        else if ( (LA12_0=='\"') ) {s = 38;}

                        else if ( (LA12_0=='\'') ) {s = 39;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 40;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}