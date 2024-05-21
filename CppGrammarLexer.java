// Generated from C:/Users/Przemek/PycharmProjects/pythonProject2/CppGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CppGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, NAMESPACE=2, CHAR=3, SHORT=4, INT_TYPE=5, INT=6, LONG=7, FLOAT=8, 
		DOUBLE=9, VOID=10, BOOL=11, UNSIGNED=12, AUTO=13, IF=14, ELSE=15, FOR=16, 
		WHILE=17, CONTINUE=18, BREAK=19, RETURN=20, CONST=21, STATIC=22, STRUCT=23, 
		CLASS=24, ENUM=25, VIRTUAL=26, NEW=27, DELETE=28, NULLPTR=29, OPERATOR=30, 
		OVERRIDE=31, PRIVATE=32, PROTECTED=33, PUBLIC=34, SIZEOF=35, THIS=36, 
		BOOL_LITERAL=37, FALSE=38, TRUE=39, INCREMENT=40, DECREMENT=41, ADD=42, 
		SUBSTRACT=43, MULTIPLY=44, DIVIDE=45, MODULO=46, EQUAL=47, NONEQUAL=48, 
		GREATER=49, GREATER_EQUAL=50, LESSER=51, LESSER_EQUAL=52, LOG_AND=53, 
		LOG_OR=54, LOG_NOT=55, ASSIGN=56, ASSIGN_ADD=57, ASSIGN_SUBSTRACT=58, 
		ASSIGN_MULTIPLY=59, ASSIGN_DIVIDE=60, ASSIGN_MODULO=61, ARROW=62, QUESTION_MARK=63, 
		ELLIPSIS=64, SEMICOLON=65, COLON=66, LEFT_PARENTHESIS=67, RIGHT_PARENTHESIS=68, 
		LEFT_SQUARE=69, RIGHT_SQUARE=70, LEFT_BRACKET=71, RIGHT_BRACKET=72, SCOPE_RESOLUTION=73, 
		DOT=74, COMMA=75, ID=76, INT_LITERAL=77, CHAR_LITERAL=78, FLOAT_LITERAL=79, 
		DOUBLE_LITERAL=80, ANY_LITERAL=81, INCLUDELITERAL=82, Whitespace=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INCLUDE", "NAMESPACE", "CHAR", "SHORT", "INT_TYPE", "INT", "LONG", "FLOAT", 
			"DOUBLE", "VOID", "BOOL", "UNSIGNED", "AUTO", "IF", "ELSE", "FOR", "WHILE", 
			"CONTINUE", "BREAK", "RETURN", "CONST", "STATIC", "STRUCT", "CLASS", 
			"ENUM", "VIRTUAL", "NEW", "DELETE", "NULLPTR", "OPERATOR", "OVERRIDE", 
			"PRIVATE", "PROTECTED", "PUBLIC", "SIZEOF", "THIS", "BOOL_LITERAL", "FALSE", 
			"TRUE", "INCREMENT", "DECREMENT", "ADD", "SUBSTRACT", "MULTIPLY", "DIVIDE", 
			"MODULO", "EQUAL", "NONEQUAL", "GREATER", "GREATER_EQUAL", "LESSER", 
			"LESSER_EQUAL", "LOG_AND", "LOG_OR", "LOG_NOT", "ASSIGN", "ASSIGN_ADD", 
			"ASSIGN_SUBSTRACT", "ASSIGN_MULTIPLY", "ASSIGN_DIVIDE", "ASSIGN_MODULO", 
			"ARROW", "QUESTION_MARK", "ELLIPSIS", "SEMICOLON", "COLON", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"SCOPE_RESOLUTION", "DOT", "COMMA", "ID", "INT_LITERAL", "CHAR_LITERAL", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "ANY_LITERAL", "INCLUDELITERAL", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'namespace'", "'char'", "'short'", null, "'int'", 
			"'long'", "'float'", "'double'", "'void'", "'bool'", "'unsigned'", "'auto'", 
			"'if'", "'else'", "'for'", "'while'", "'continue'", "'break'", "'return'", 
			"'const'", "'static'", "'struct'", "'class'", "'enum'", "'virtual'", 
			"'new'", "'delete'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'sizeof'", "'this'", null, "'false'", "'true'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", 
			"'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'->'", "'?'", "'...'", "';'", "':'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'::'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "NAMESPACE", "CHAR", "SHORT", "INT_TYPE", "INT", "LONG", 
			"FLOAT", "DOUBLE", "VOID", "BOOL", "UNSIGNED", "AUTO", "IF", "ELSE", 
			"FOR", "WHILE", "CONTINUE", "BREAK", "RETURN", "CONST", "STATIC", "STRUCT", 
			"CLASS", "ENUM", "VIRTUAL", "NEW", "DELETE", "NULLPTR", "OPERATOR", "OVERRIDE", 
			"PRIVATE", "PROTECTED", "PUBLIC", "SIZEOF", "THIS", "BOOL_LITERAL", "FALSE", 
			"TRUE", "INCREMENT", "DECREMENT", "ADD", "SUBSTRACT", "MULTIPLY", "DIVIDE", 
			"MODULO", "EQUAL", "NONEQUAL", "GREATER", "GREATER_EQUAL", "LESSER", 
			"LESSER_EQUAL", "LOG_AND", "LOG_OR", "LOG_NOT", "ASSIGN", "ASSIGN_ADD", 
			"ASSIGN_SUBSTRACT", "ASSIGN_MULTIPLY", "ASSIGN_DIVIDE", "ASSIGN_MODULO", 
			"ARROW", "QUESTION_MARK", "ELLIPSIS", "SEMICOLON", "COLON", "LEFT_PARENTHESIS", 
			"RIGHT_PARENTHESIS", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"SCOPE_RESOLUTION", "DOT", "COMMA", "ID", "INT_LITERAL", "CHAR_LITERAL", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "ANY_LITERAL", "INCLUDELITERAL", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CppGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CppGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			INT_TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INT_TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			0,2
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000S\u0254\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0003\u0004\u00c7\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003"+
		"$\u0196\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001"+
		"E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"J\u0001J\u0001K\u0001K\u0005K\u01fe\bK\nK\fK\u0201\tK\u0001L\u0003L\u0204"+
		"\bL\u0001L\u0001L\u0001L\u0005L\u0209\bL\nL\fL\u020c\tL\u0003L\u020e\b"+
		"L\u0001M\u0001M\u0001M\u0001M\u0003M\u0214\bM\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0004O\u021d\bO\u000bO\fO\u021e\u0001O\u0004O\u0222"+
		"\bO\u000bO\fO\u0223\u0001O\u0001O\u0004O\u0228\bO\u000bO\fO\u0229\u0001"+
		"O\u0001O\u0004O\u022e\bO\u000bO\fO\u022f\u0003O\u0232\bO\u0001O\u0001"+
		"O\u0003O\u0236\bO\u0001O\u0004O\u0239\bO\u000bO\fO\u023a\u0003O\u023d"+
		"\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0244\bP\u0001Q\u0001Q\u0004"+
		"Q\u0248\bQ\u000bQ\fQ\u0249\u0001Q\u0001Q\u0001R\u0004R\u024f\bR\u000b"+
		"R\fR\u0250\u0001R\u0001R\u0000\u0000S\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6"+
		"m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008d"+
		"G\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1"+
		"Q\u00a3R\u00a5S\u0001\u0000\f\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000019\u0001\u000009\u0003\u0000\n\n\r\r\'\'\u0002\u0000FFff\u0002\u0000"+
		"EEee\u0002\u0000++--\u0002\u0000\"\"<<\u0007\u0000\t\n\f\r  \"\"\'\'<"+
		"<>>\u0002\u0000\"\">>\u0003\u0000\t\n\f\r  \u0269\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001"+
		"\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000"+
		"\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000"+
		"w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001"+
		"\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000"+
		"\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000"+
		"\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000"+
		"\u0000\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001\u0000"+
		"\u0000\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001\u0000"+
		"\u0000\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001\u0000"+
		"\u0000\u0000\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001\u0000"+
		"\u0000\u0000\u0000\u0099\u0001\u0000\u0000\u0000\u0000\u009b\u0001\u0000"+
		"\u0000\u0000\u0000\u009d\u0001\u0000\u0000\u0000\u0000\u009f\u0001\u0000"+
		"\u0000\u0000\u0000\u00a1\u0001\u0000\u0000\u0000\u0000\u00a3\u0001\u0000"+
		"\u0000\u0000\u0000\u00a5\u0001\u0000\u0000\u0000\u0001\u00a7\u0001\u0000"+
		"\u0000\u0000\u0003\u00b0\u0001\u0000\u0000\u0000\u0005\u00ba\u0001\u0000"+
		"\u0000\u0000\u0007\u00bf\u0001\u0000\u0000\u0000\t\u00c6\u0001\u0000\u0000"+
		"\u0000\u000b\u00cc\u0001\u0000\u0000\u0000\r\u00d0\u0001\u0000\u0000\u0000"+
		"\u000f\u00d5\u0001\u0000\u0000\u0000\u0011\u00db\u0001\u0000\u0000\u0000"+
		"\u0013\u00e2\u0001\u0000\u0000\u0000\u0015\u00e7\u0001\u0000\u0000\u0000"+
		"\u0017\u00ec\u0001\u0000\u0000\u0000\u0019\u00f5\u0001\u0000\u0000\u0000"+
		"\u001b\u00fa\u0001\u0000\u0000\u0000\u001d\u00fd\u0001\u0000\u0000\u0000"+
		"\u001f\u0102\u0001\u0000\u0000\u0000!\u0106\u0001\u0000\u0000\u0000#\u010c"+
		"\u0001\u0000\u0000\u0000%\u0115\u0001\u0000\u0000\u0000\'\u011b\u0001"+
		"\u0000\u0000\u0000)\u0122\u0001\u0000\u0000\u0000+\u0128\u0001\u0000\u0000"+
		"\u0000-\u012f\u0001\u0000\u0000\u0000/\u0136\u0001\u0000\u0000\u00001"+
		"\u013c\u0001\u0000\u0000\u00003\u0141\u0001\u0000\u0000\u00005\u0149\u0001"+
		"\u0000\u0000\u00007\u014d\u0001\u0000\u0000\u00009\u0154\u0001\u0000\u0000"+
		"\u0000;\u015c\u0001\u0000\u0000\u0000=\u0165\u0001\u0000\u0000\u0000?"+
		"\u016e\u0001\u0000\u0000\u0000A\u0176\u0001\u0000\u0000\u0000C\u0180\u0001"+
		"\u0000\u0000\u0000E\u0187\u0001\u0000\u0000\u0000G\u018e\u0001\u0000\u0000"+
		"\u0000I\u0195\u0001\u0000\u0000\u0000K\u0197\u0001\u0000\u0000\u0000M"+
		"\u019d\u0001\u0000\u0000\u0000O\u01a2\u0001\u0000\u0000\u0000Q\u01a5\u0001"+
		"\u0000\u0000\u0000S\u01a8\u0001\u0000\u0000\u0000U\u01aa\u0001\u0000\u0000"+
		"\u0000W\u01ac\u0001\u0000\u0000\u0000Y\u01ae\u0001\u0000\u0000\u0000["+
		"\u01b0\u0001\u0000\u0000\u0000]\u01b2\u0001\u0000\u0000\u0000_\u01b5\u0001"+
		"\u0000\u0000\u0000a\u01b8\u0001\u0000\u0000\u0000c\u01ba\u0001\u0000\u0000"+
		"\u0000e\u01bd\u0001\u0000\u0000\u0000g\u01bf\u0001\u0000\u0000\u0000i"+
		"\u01c2\u0001\u0000\u0000\u0000k\u01c5\u0001\u0000\u0000\u0000m\u01c8\u0001"+
		"\u0000\u0000\u0000o\u01ca\u0001\u0000\u0000\u0000q\u01cc\u0001\u0000\u0000"+
		"\u0000s\u01cf\u0001\u0000\u0000\u0000u\u01d2\u0001\u0000\u0000\u0000w"+
		"\u01d5\u0001\u0000\u0000\u0000y\u01d8\u0001\u0000\u0000\u0000{\u01db\u0001"+
		"\u0000\u0000\u0000}\u01de\u0001\u0000\u0000\u0000\u007f\u01e0\u0001\u0000"+
		"\u0000\u0000\u0081\u01e4\u0001\u0000\u0000\u0000\u0083\u01e6\u0001\u0000"+
		"\u0000\u0000\u0085\u01e8\u0001\u0000\u0000\u0000\u0087\u01ea\u0001\u0000"+
		"\u0000\u0000\u0089\u01ec\u0001\u0000\u0000\u0000\u008b\u01ee\u0001\u0000"+
		"\u0000\u0000\u008d\u01f0\u0001\u0000\u0000\u0000\u008f\u01f2\u0001\u0000"+
		"\u0000\u0000\u0091\u01f4\u0001\u0000\u0000\u0000\u0093\u01f7\u0001\u0000"+
		"\u0000\u0000\u0095\u01f9\u0001\u0000\u0000\u0000\u0097\u01fb\u0001\u0000"+
		"\u0000\u0000\u0099\u0203\u0001\u0000\u0000\u0000\u009b\u020f\u0001\u0000"+
		"\u0000\u0000\u009d\u0217\u0001\u0000\u0000\u0000\u009f\u0231\u0001\u0000"+
		"\u0000\u0000\u00a1\u0243\u0001\u0000\u0000\u0000\u00a3\u0245\u0001\u0000"+
		"\u0000\u0000\u00a5\u024e\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005#\u0000"+
		"\u0000\u00a8\u00a9\u0005i\u0000\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa"+
		"\u00ab\u0005c\u0000\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac\u00ad\u0005"+
		"u\u0000\u0000\u00ad\u00ae\u0005d\u0000\u0000\u00ae\u00af\u0005e\u0000"+
		"\u0000\u00af\u0002\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005n\u0000\u0000"+
		"\u00b1\u00b2\u0005a\u0000\u0000\u00b2\u00b3\u0005m\u0000\u0000\u00b3\u00b4"+
		"\u0005e\u0000\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5\u00b6\u0005p"+
		"\u0000\u0000\u00b6\u00b7\u0005a\u0000\u0000\u00b7\u00b8\u0005c\u0000\u0000"+
		"\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u0004\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005c\u0000\u0000\u00bb\u00bc\u0005h\u0000\u0000\u00bc\u00bd\u0005"+
		"a\u0000\u0000\u00bd\u00be\u0005r\u0000\u0000\u00be\u0006\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005s\u0000\u0000\u00c0\u00c1\u0005h\u0000\u0000\u00c1"+
		"\u00c2\u0005o\u0000\u0000\u00c2\u00c3\u0005r\u0000\u0000\u00c3\u00c4\u0005"+
		"t\u0000\u0000\u00c4\b\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u0017"+
		"\u000b\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\r\u0006"+
		"\u0000\u00c9\u00ca\u0006\u0004\u0000\u0000\u00ca\u00cb\u0003\u000b\u0005"+
		"\u0000\u00cb\n\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005i\u0000\u0000"+
		"\u00cd\u00ce\u0005n\u0000\u0000\u00ce\u00cf\u0005t\u0000\u0000\u00cf\f"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005l\u0000\u0000\u00d1\u00d2\u0005"+
		"o\u0000\u0000\u00d2\u00d3\u0005n\u0000\u0000\u00d3\u00d4\u0005g\u0000"+
		"\u0000\u00d4\u000e\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005f\u0000\u0000"+
		"\u00d6\u00d7\u0005l\u0000\u0000\u00d7\u00d8\u0005o\u0000\u0000\u00d8\u00d9"+
		"\u0005a\u0000\u0000\u00d9\u00da\u0005t\u0000\u0000\u00da\u0010\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005d\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000"+
		"\u00dd\u00de\u0005u\u0000\u0000\u00de\u00df\u0005b\u0000\u0000\u00df\u00e0"+
		"\u0005l\u0000\u0000\u00e0\u00e1\u0005e\u0000\u0000\u00e1\u0012\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005v\u0000\u0000\u00e3\u00e4\u0005o\u0000\u0000"+
		"\u00e4\u00e5\u0005i\u0000\u0000\u00e5\u00e6\u0005d\u0000\u0000\u00e6\u0014"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005b\u0000\u0000\u00e8\u00e9\u0005"+
		"o\u0000\u0000\u00e9\u00ea\u0005o\u0000\u0000\u00ea\u00eb\u0005l\u0000"+
		"\u0000\u00eb\u0016\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005u\u0000\u0000"+
		"\u00ed\u00ee\u0005n\u0000\u0000\u00ee\u00ef\u0005s\u0000\u0000\u00ef\u00f0"+
		"\u0005i\u0000\u0000\u00f0\u00f1\u0005g\u0000\u0000\u00f1\u00f2\u0005n"+
		"\u0000\u0000\u00f2\u00f3\u0005e\u0000\u0000\u00f3\u00f4\u0005d\u0000\u0000"+
		"\u00f4\u0018\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005a\u0000\u0000\u00f6"+
		"\u00f7\u0005u\u0000\u0000\u00f7\u00f8\u0005t\u0000\u0000\u00f8\u00f9\u0005"+
		"o\u0000\u0000\u00f9\u001a\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005i\u0000"+
		"\u0000\u00fb\u00fc\u0005f\u0000\u0000\u00fc\u001c\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005e\u0000\u0000\u00fe\u00ff\u0005l\u0000\u0000\u00ff\u0100"+
		"\u0005s\u0000\u0000\u0100\u0101\u0005e\u0000\u0000\u0101\u001e\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005f\u0000\u0000\u0103\u0104\u0005o\u0000\u0000"+
		"\u0104\u0105\u0005r\u0000\u0000\u0105 \u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005w\u0000\u0000\u0107\u0108\u0005h\u0000\u0000\u0108\u0109\u0005i"+
		"\u0000\u0000\u0109\u010a\u0005l\u0000\u0000\u010a\u010b\u0005e\u0000\u0000"+
		"\u010b\"\u0001\u0000\u0000\u0000\u010c\u010d\u0005c\u0000\u0000\u010d"+
		"\u010e\u0005o\u0000\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005"+
		"t\u0000\u0000\u0110\u0111\u0005i\u0000\u0000\u0111\u0112\u0005n\u0000"+
		"\u0000\u0112\u0113\u0005u\u0000\u0000\u0113\u0114\u0005e\u0000\u0000\u0114"+
		"$\u0001\u0000\u0000\u0000\u0115\u0116\u0005b\u0000\u0000\u0116\u0117\u0005"+
		"r\u0000\u0000\u0117\u0118\u0005e\u0000\u0000\u0118\u0119\u0005a\u0000"+
		"\u0000\u0119\u011a\u0005k\u0000\u0000\u011a&\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0005r\u0000\u0000\u011c\u011d\u0005e\u0000\u0000\u011d\u011e\u0005"+
		"t\u0000\u0000\u011e\u011f\u0005u\u0000\u0000\u011f\u0120\u0005r\u0000"+
		"\u0000\u0120\u0121\u0005n\u0000\u0000\u0121(\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005c\u0000\u0000\u0123\u0124\u0005o\u0000\u0000\u0124\u0125\u0005"+
		"n\u0000\u0000\u0125\u0126\u0005s\u0000\u0000\u0126\u0127\u0005t\u0000"+
		"\u0000\u0127*\u0001\u0000\u0000\u0000\u0128\u0129\u0005s\u0000\u0000\u0129"+
		"\u012a\u0005t\u0000\u0000\u012a\u012b\u0005a\u0000\u0000\u012b\u012c\u0005"+
		"t\u0000\u0000\u012c\u012d\u0005i\u0000\u0000\u012d\u012e\u0005c\u0000"+
		"\u0000\u012e,\u0001\u0000\u0000\u0000\u012f\u0130\u0005s\u0000\u0000\u0130"+
		"\u0131\u0005t\u0000\u0000\u0131\u0132\u0005r\u0000\u0000\u0132\u0133\u0005"+
		"u\u0000\u0000\u0133\u0134\u0005c\u0000\u0000\u0134\u0135\u0005t\u0000"+
		"\u0000\u0135.\u0001\u0000\u0000\u0000\u0136\u0137\u0005c\u0000\u0000\u0137"+
		"\u0138\u0005l\u0000\u0000\u0138\u0139\u0005a\u0000\u0000\u0139\u013a\u0005"+
		"s\u0000\u0000\u013a\u013b\u0005s\u0000\u0000\u013b0\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005e\u0000\u0000\u013d\u013e\u0005n\u0000\u0000\u013e"+
		"\u013f\u0005u\u0000\u0000\u013f\u0140\u0005m\u0000\u0000\u01402\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005v\u0000\u0000\u0142\u0143\u0005i\u0000"+
		"\u0000\u0143\u0144\u0005r\u0000\u0000\u0144\u0145\u0005t\u0000\u0000\u0145"+
		"\u0146\u0005u\u0000\u0000\u0146\u0147\u0005a\u0000\u0000\u0147\u0148\u0005"+
		"l\u0000\u0000\u01484\u0001\u0000\u0000\u0000\u0149\u014a\u0005n\u0000"+
		"\u0000\u014a\u014b\u0005e\u0000\u0000\u014b\u014c\u0005w\u0000\u0000\u014c"+
		"6\u0001\u0000\u0000\u0000\u014d\u014e\u0005d\u0000\u0000\u014e\u014f\u0005"+
		"e\u0000\u0000\u014f\u0150\u0005l\u0000\u0000\u0150\u0151\u0005e\u0000"+
		"\u0000\u0151\u0152\u0005t\u0000\u0000\u0152\u0153\u0005e\u0000\u0000\u0153"+
		"8\u0001\u0000\u0000\u0000\u0154\u0155\u0005n\u0000\u0000\u0155\u0156\u0005"+
		"u\u0000\u0000\u0156\u0157\u0005l\u0000\u0000\u0157\u0158\u0005l\u0000"+
		"\u0000\u0158\u0159\u0005p\u0000\u0000\u0159\u015a\u0005t\u0000\u0000\u015a"+
		"\u015b\u0005r\u0000\u0000\u015b:\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"o\u0000\u0000\u015d\u015e\u0005p\u0000\u0000\u015e\u015f\u0005e\u0000"+
		"\u0000\u015f\u0160\u0005r\u0000\u0000\u0160\u0161\u0005a\u0000\u0000\u0161"+
		"\u0162\u0005t\u0000\u0000\u0162\u0163\u0005o\u0000\u0000\u0163\u0164\u0005"+
		"r\u0000\u0000\u0164<\u0001\u0000\u0000\u0000\u0165\u0166\u0005o\u0000"+
		"\u0000\u0166\u0167\u0005v\u0000\u0000\u0167\u0168\u0005e\u0000\u0000\u0168"+
		"\u0169\u0005r\u0000\u0000\u0169\u016a\u0005r\u0000\u0000\u016a\u016b\u0005"+
		"i\u0000\u0000\u016b\u016c\u0005d\u0000\u0000\u016c\u016d\u0005e\u0000"+
		"\u0000\u016d>\u0001\u0000\u0000\u0000\u016e\u016f\u0005p\u0000\u0000\u016f"+
		"\u0170\u0005r\u0000\u0000\u0170\u0171\u0005i\u0000\u0000\u0171\u0172\u0005"+
		"v\u0000\u0000\u0172\u0173\u0005a\u0000\u0000\u0173\u0174\u0005t\u0000"+
		"\u0000\u0174\u0175\u0005e\u0000\u0000\u0175@\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005p\u0000\u0000\u0177\u0178\u0005r\u0000\u0000\u0178\u0179\u0005"+
		"o\u0000\u0000\u0179\u017a\u0005t\u0000\u0000\u017a\u017b\u0005e\u0000"+
		"\u0000\u017b\u017c\u0005c\u0000\u0000\u017c\u017d\u0005t\u0000\u0000\u017d"+
		"\u017e\u0005e\u0000\u0000\u017e\u017f\u0005d\u0000\u0000\u017fB\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0005p\u0000\u0000\u0181\u0182\u0005u\u0000"+
		"\u0000\u0182\u0183\u0005b\u0000\u0000\u0183\u0184\u0005l\u0000\u0000\u0184"+
		"\u0185\u0005i\u0000\u0000\u0185\u0186\u0005c\u0000\u0000\u0186D\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005s\u0000\u0000\u0188\u0189\u0005i\u0000"+
		"\u0000\u0189\u018a\u0005z\u0000\u0000\u018a\u018b\u0005e\u0000\u0000\u018b"+
		"\u018c\u0005o\u0000\u0000\u018c\u018d\u0005f\u0000\u0000\u018dF\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005t\u0000\u0000\u018f\u0190\u0005h\u0000"+
		"\u0000\u0190\u0191\u0005i\u0000\u0000\u0191\u0192\u0005s\u0000\u0000\u0192"+
		"H\u0001\u0000\u0000\u0000\u0193\u0196\u0003K%\u0000\u0194\u0196\u0003"+
		"M&\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196J\u0001\u0000\u0000\u0000\u0197\u0198\u0005f\u0000\u0000\u0198"+
		"\u0199\u0005a\u0000\u0000\u0199\u019a\u0005l\u0000\u0000\u019a\u019b\u0005"+
		"s\u0000\u0000\u019b\u019c\u0005e\u0000\u0000\u019cL\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005t\u0000\u0000\u019e\u019f\u0005r\u0000\u0000\u019f"+
		"\u01a0\u0005u\u0000\u0000\u01a0\u01a1\u0005e\u0000\u0000\u01a1N\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005+\u0000\u0000\u01a3\u01a4\u0005+\u0000"+
		"\u0000\u01a4P\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005-\u0000\u0000\u01a6"+
		"\u01a7\u0005-\u0000\u0000\u01a7R\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"+\u0000\u0000\u01a9T\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005-\u0000"+
		"\u0000\u01abV\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005*\u0000\u0000\u01ad"+
		"X\u0001\u0000\u0000\u0000\u01ae\u01af\u0005/\u0000\u0000\u01afZ\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0005%\u0000\u0000\u01b1\\\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005=\u0000\u0000\u01b3\u01b4\u0005=\u0000\u0000"+
		"\u01b4^\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005!\u0000\u0000\u01b6\u01b7"+
		"\u0005=\u0000\u0000\u01b7`\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005>"+
		"\u0000\u0000\u01b9b\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005>\u0000\u0000"+
		"\u01bb\u01bc\u0005=\u0000\u0000\u01bcd\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0005<\u0000\u0000\u01bef\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005<"+
		"\u0000\u0000\u01c0\u01c1\u0005=\u0000\u0000\u01c1h\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005&\u0000\u0000\u01c3\u01c4\u0005&\u0000\u0000\u01c4j"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005|\u0000\u0000\u01c6\u01c7\u0005"+
		"|\u0000\u0000\u01c7l\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005!\u0000"+
		"\u0000\u01c9n\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005=\u0000\u0000\u01cb"+
		"p\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005+\u0000\u0000\u01cd\u01ce\u0005"+
		"=\u0000\u0000\u01cer\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005-\u0000"+
		"\u0000\u01d0\u01d1\u0005=\u0000\u0000\u01d1t\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0005*\u0000\u0000\u01d3\u01d4\u0005=\u0000\u0000\u01d4v\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005/\u0000\u0000\u01d6\u01d7\u0005=\u0000"+
		"\u0000\u01d7x\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005%\u0000\u0000\u01d9"+
		"\u01da\u0005=\u0000\u0000\u01daz\u0001\u0000\u0000\u0000\u01db\u01dc\u0005"+
		"-\u0000\u0000\u01dc\u01dd\u0005>\u0000\u0000\u01dd|\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0005?\u0000\u0000\u01df~\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005.\u0000\u0000\u01e1\u01e2\u0005.\u0000\u0000\u01e2\u01e3\u0005"+
		".\u0000\u0000\u01e3\u0080\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005;\u0000"+
		"\u0000\u01e5\u0082\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005:\u0000\u0000"+
		"\u01e7\u0084\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005(\u0000\u0000\u01e9"+
		"\u0086\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005)\u0000\u0000\u01eb\u0088"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005[\u0000\u0000\u01ed\u008a\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0005]\u0000\u0000\u01ef\u008c\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005{\u0000\u0000\u01f1\u008e\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005}\u0000\u0000\u01f3\u0090\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005:\u0000\u0000\u01f5\u01f6\u0005:\u0000\u0000\u01f6\u0092"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005.\u0000\u0000\u01f8\u0094\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0005,\u0000\u0000\u01fa\u0096\u0001\u0000"+
		"\u0000\u0000\u01fb\u01ff\u0007\u0000\u0000\u0000\u01fc\u01fe\u0007\u0001"+
		"\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0098\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0202\u0204\u0005-\u0000\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u020d\u0001\u0000\u0000"+
		"\u0000\u0205\u020e\u00050\u0000\u0000\u0206\u020a\u0007\u0002\u0000\u0000"+
		"\u0207\u0209\u0007\u0003\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000"+
		"\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0205\u0001\u0000\u0000\u0000"+
		"\u020d\u0206\u0001\u0000\u0000\u0000\u020e\u009a\u0001\u0000\u0000\u0000"+
		"\u020f\u0213\u0005\'\u0000\u0000\u0210\u0214\b\u0004\u0000\u0000\u0211"+
		"\u0212\u0005\\\u0000\u0000\u0212\u0214\u0005\'\u0000\u0000\u0213\u0210"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005\'\u0000\u0000\u0216\u009c\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0003\u009fO\u0000\u0218\u0219\u0007\u0005"+
		"\u0000\u0000\u0219\u009e\u0001\u0000\u0000\u0000\u021a\u021c\u0005.\u0000"+
		"\u0000\u021b\u021d\u0007\u0003\u0000\u0000\u021c\u021b\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0232\u0001\u0000\u0000"+
		"\u0000\u0220\u0222\u0007\u0003\u0000\u0000\u0221\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000"+
		"\u0000\u0225\u0232\u0005.\u0000\u0000\u0226\u0228\u0007\u0003\u0000\u0000"+
		"\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000"+
		"\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0005.\u0000\u0000\u022c"+
		"\u022e\u0007\u0003\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000\u0231"+
		"\u021a\u0001\u0000\u0000\u0000\u0231\u0221\u0001\u0000\u0000\u0000\u0231"+
		"\u0227\u0001\u0000\u0000\u0000\u0232\u023c\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0007\u0006\u0000\u0000\u0234\u0236\u0007\u0007\u0000\u0000\u0235"+
		"\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0238\u0001\u0000\u0000\u0000\u0237\u0239\u0007\u0003\u0000\u0000\u0238"+
		"\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a"+
		"\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b"+
		"\u023d\u0001\u0000\u0000\u0000\u023c\u0233\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0001\u0000\u0000\u0000\u023d\u00a0\u0001\u0000\u0000\u0000\u023e"+
		"\u0244\u0003\u0099L\u0000\u023f\u0244\u0003\u009bM\u0000\u0240\u0244\u0003"+
		"\u009fO\u0000\u0241\u0244\u0003\u009dN\u0000\u0242\u0244\u0003I$\u0000"+
		"\u0243\u023e\u0001\u0000\u0000\u0000\u0243\u023f\u0001\u0000\u0000\u0000"+
		"\u0243\u0240\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u00a2\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u0007\b\u0000\u0000\u0246\u0248\b\t\u0000\u0000\u0247\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b"+
		"\u0001\u0000\u0000\u0000\u024b\u024c\u0007\n\u0000\u0000\u024c\u00a4\u0001"+
		"\u0000\u0000\u0000\u024d\u024f\u0007\u000b\u0000\u0000\u024e\u024d\u0001"+
		"\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0006R\u0001\u0000\u0253\u00a6\u0001\u0000"+
		"\u0000\u0000\u0013\u0000\u00c6\u0195\u01ff\u0203\u020a\u020d\u0213\u021e"+
		"\u0223\u0229\u022f\u0231\u0235\u023a\u023c\u0243\u0249\u0250\u0002\u0001"+
		"\u0004\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}