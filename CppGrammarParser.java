// Generated from C:/Users/Przemek/PycharmProjects/pythonProject2/CppGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CppGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_include = 1, RULE_statement = 2, RULE_namespace = 3, 
		RULE_enum = 4, RULE_struct = 5, RULE_struct_body = 6, RULE_variable = 7, 
		RULE_assign = 8, RULE_function = 9, RULE_function_scope = 10, RULE_function_call = 11, 
		RULE_for_loop = 12, RULE_loop_scope = 13, RULE_while_loop = 14, RULE_if_expression = 15, 
		RULE_if_statement = 16, RULE_enum_namespace_call = 17, RULE_arithmetic_operation = 18, 
		RULE_assingment_options = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "include", "statement", "namespace", "enum", "struct", "struct_body", 
			"variable", "assign", "function", "function_scope", "function_call", 
			"for_loop", "loop_scope", "while_loop", "if_expression", "if_statement", 
			"enum_namespace_call", "arithmetic_operation", "assingment_options"
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

	@Override
	public String getGrammarFileName() { return "CppGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CppGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCLUDE:
					{
					setState(40);
					include();
					}
					break;
				case NAMESPACE:
				case CHAR:
				case SHORT:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case VOID:
				case BOOL:
				case UNSIGNED:
				case AUTO:
				case CONST:
				case STATIC:
				case STRUCT:
				case ENUM:
				case ID:
					{
					setState(41);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 48250846L) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(CppGrammarParser.INCLUDE, 0); }
		public TerminalNode INCLUDELITERAL() { return getToken(CppGrammarParser.INCLUDELITERAL, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INCLUDE);
			setState(47);
			match(INCLUDELITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Enum_namespace_callContext enum_namespace_call() {
			return getRuleContext(Enum_namespace_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(49);
				enum_namespace_call();
				}
			}

			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(52);
				namespace();
				}
				break;
			case 2:
				{
				setState(53);
				enum_();
				}
				break;
			case 3:
				{
				setState(54);
				variable();
				}
				break;
			case 4:
				{
				setState(55);
				function();
				}
				break;
			case 5:
				{
				setState(56);
				struct();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(CppGrammarParser.NAMESPACE, 0); }
		public TerminalNode ID() { return getToken(CppGrammarParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<EnumContext> enum_() {
			return getRuleContexts(EnumContext.class);
		}
		public EnumContext enum_(int i) {
			return getRuleContext(EnumContext.class,i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NAMESPACE);
			setState(60);
			match(ID);
			setState(61);
			match(LEFT_BRACKET);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					function();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6306776L) != 0)) {
				{
				{
				setState(68);
				variable();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRUCT) {
				{
				{
				setState(74);
				struct();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM) {
				{
				{
				setState(80);
				enum_();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RIGHT_BRACKET);
			setState(87);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CppGrammarParser.ENUM, 0); }
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public TerminalNode CLASS() { return getToken(CppGrammarParser.CLASS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CppGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CppGrammarParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CppGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CppGrammarParser.ASSIGN, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(CppGrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CppGrammarParser.INT_LITERAL, i);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ENUM);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(90);
				match(CLASS);
				}
			}

			setState(93);
			match(ID);
			setState(94);
			match(LEFT_BRACKET);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(95);
				match(ID);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(96);
					match(ASSIGN);
					setState(97);
					match(INT_LITERAL);
					}
				}

				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					match(ID);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(102);
						match(ASSIGN);
						setState(103);
						match(INT_LITERAL);
						}
					}

					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(113);
			match(RIGHT_BRACKET);
			setState(114);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CppGrammarParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CppGrammarParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(STRUCT);
			setState(117);
			match(ID);
			setState(118);
			match(LEFT_BRACKET);
			setState(119);
			struct_body();
			setState(120);
			match(RIGHT_BRACKET);
			setState(121);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_bodyContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(CppGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CppGrammarParser.COLON, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(CppGrammarParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(CppGrammarParser.PRIVATE, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(CppGrammarParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(CppGrammarParser.PUBLIC, i);
		}
		public List<TerminalNode> PROTECTED() { return getTokens(CppGrammarParser.PROTECTED); }
		public TerminalNode PROTECTED(int i) {
			return getToken(CppGrammarParser.PROTECTED, i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				match(COLON);
				}
			}

			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(127);
				variable();
				}
				break;
			case 2:
				{
				setState(128);
				function();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30071078872L) != 0)) {
				{
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
					{
					setState(131);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(132);
					match(COLON);
					}
				}

				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(135);
					variable();
					}
					break;
				case 2:
					{
					setState(136);
					function();
					}
					break;
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public TerminalNode CHAR() { return getToken(CppGrammarParser.CHAR, 0); }
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public TerminalNode SHORT() { return getToken(CppGrammarParser.SHORT, 0); }
		public List<TerminalNode> LONG() { return getTokens(CppGrammarParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CppGrammarParser.LONG, i);
		}
		public TerminalNode INT() { return getToken(CppGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CppGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CppGrammarParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(CppGrammarParser.BOOL, 0); }
		public TerminalNode AUTO() { return getToken(CppGrammarParser.AUTO, 0); }
		public TerminalNode ASSIGN() { return getToken(CppGrammarParser.ASSIGN, 0); }
		public TerminalNode STATIC() { return getToken(CppGrammarParser.STATIC, 0); }
		public TerminalNode CONST() { return getToken(CppGrammarParser.CONST, 0); }
		public TerminalNode INT_LITERAL() { return getToken(CppGrammarParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CppGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(CppGrammarParser.DOUBLE_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CppGrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CppGrammarParser.BOOL_LITERAL, 0); }
		public TerminalNode UNSIGNED() { return getToken(CppGrammarParser.UNSIGNED, 0); }
		public Enum_namespace_callContext enum_namespace_call() {
			return getRuleContext(Enum_namespace_callContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(144);
				match(STATIC);
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(147);
				match(CONST);
				}
			}

			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(150);
					match(UNSIGNED);
					}
				}

				setState(153);
				match(CHAR);
				setState(154);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(155);
					match(ASSIGN);
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CHAR_LITERAL:
						{
						setState(156);
						match(CHAR_LITERAL);
						}
						break;
					case ID:
						{
						setState(158);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
						case 1:
							{
							setState(157);
							enum_namespace_call();
							}
							break;
						}
						setState(160);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 2:
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(165);
					match(UNSIGNED);
					}
				}

				setState(168);
				match(SHORT);
				setState(169);
				match(ID);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(170);
					match(ASSIGN);
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_LITERAL:
						{
						setState(171);
						match(INT_LITERAL);
						}
						break;
					case ID:
						{
						setState(173);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(172);
							enum_namespace_call();
							}
							break;
						}
						setState(175);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 3:
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(180);
					match(UNSIGNED);
					}
				}

				setState(183);
				match(LONG);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(184);
					match(LONG);
					}
				}

				setState(187);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(188);
					match(ASSIGN);
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_LITERAL:
						{
						setState(189);
						match(INT_LITERAL);
						}
						break;
					case ID:
						{
						setState(191);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(190);
							enum_namespace_call();
							}
							break;
						}
						setState(193);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 4:
				{
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(198);
					match(UNSIGNED);
					}
				}

				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(201);
					match(LONG);
					}
					break;
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(204);
					match(LONG);
					}
				}

				setState(207);
				match(INT);
				setState(208);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(209);
					match(ASSIGN);
					setState(215);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT_LITERAL:
						{
						setState(210);
						match(INT_LITERAL);
						}
						break;
					case ID:
						{
						setState(212);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(211);
							enum_namespace_call();
							}
							break;
						}
						setState(214);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 5:
				{
				setState(219);
				match(FLOAT);
				setState(220);
				match(ID);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(221);
					match(ASSIGN);
					setState(227);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FLOAT_LITERAL:
						{
						setState(222);
						match(FLOAT_LITERAL);
						}
						break;
					case ID:
						{
						setState(224);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(223);
							enum_namespace_call();
							}
							break;
						}
						setState(226);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 6:
				{
				setState(231);
				match(DOUBLE);
				setState(232);
				match(ID);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(233);
					match(ASSIGN);
					setState(239);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOUBLE_LITERAL:
						{
						setState(234);
						match(DOUBLE_LITERAL);
						}
						break;
					case ID:
						{
						setState(236);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(235);
							enum_namespace_call();
							}
							break;
						}
						setState(238);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 7:
				{
				setState(243);
				match(BOOL);
				setState(244);
				match(ID);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(245);
					match(ASSIGN);
					setState(251);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
						{
						setState(246);
						match(BOOL_LITERAL);
						}
						break;
					case ID:
						{
						setState(248);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(247);
							enum_namespace_call();
							}
							break;
						}
						setState(250);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 8:
				{
				setState(255);
				match(AUTO);
				setState(256);
				match(ID);
				setState(257);
				match(ASSIGN);
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_LITERAL:
					{
					setState(258);
					match(INT_LITERAL);
					}
					break;
				case CHAR_LITERAL:
					{
					setState(259);
					match(CHAR_LITERAL);
					}
					break;
				case DOUBLE_LITERAL:
					{
					setState(260);
					match(DOUBLE_LITERAL);
					}
					break;
				case FLOAT_LITERAL:
					{
					setState(261);
					match(FLOAT_LITERAL);
					}
					break;
				case BOOL_LITERAL:
					{
					setState(262);
					match(BOOL_LITERAL);
					}
					break;
				case ID:
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(263);
						enum_namespace_call();
						}
						break;
					}
					setState(266);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(271);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(CppGrammarParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(CppGrammarParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CppGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(CppGrammarParser.DOUBLE_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CppGrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CppGrammarParser.BOOL_LITERAL, 0); }
		public Enum_namespace_callContext enum_namespace_call() {
			return getRuleContext(Enum_namespace_callContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ID);
			setState(274);
			match(ASSIGN);
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(275);
					enum_namespace_call();
					}
					break;
				}
				setState(278);
				match(ID);
				}
				break;
			case 2:
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(280);
				function_call();
				}
				break;
			}
			setState(283);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CppGrammarParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CppGrammarParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public Function_scopeContext function_scope() {
			return getRuleContext(Function_scopeContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public TerminalNode VOID() { return getToken(CppGrammarParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(CppGrammarParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(CppGrammarParser.SHORT, 0); }
		public TerminalNode LONG() { return getToken(CppGrammarParser.LONG, 0); }
		public TerminalNode INT() { return getToken(CppGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CppGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CppGrammarParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(CppGrammarParser.BOOL, 0); }
		public TerminalNode STATIC() { return getToken(CppGrammarParser.STATIC, 0); }
		public TerminalNode CONST() { return getToken(CppGrammarParser.CONST, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode UNSIGNED() { return getToken(CppGrammarParser.UNSIGNED, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CppGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CppGrammarParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(285);
				match(STATIC);
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(288);
				match(CONST);
				}
			}

			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(291);
				match(VOID);
				}
				break;
			case 2:
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(292);
					match(UNSIGNED);
					}
				}

				setState(295);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(296);
					match(UNSIGNED);
					}
				}

				setState(299);
				match(SHORT);
				}
				break;
			case 4:
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(300);
					match(UNSIGNED);
					}
				}

				setState(303);
				match(LONG);
				}
				break;
			case 5:
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(304);
					match(UNSIGNED);
					}
				}

				setState(307);
				match(INT);
				}
				break;
			case 6:
				{
				setState(308);
				match(FLOAT);
				}
				break;
			case 7:
				{
				setState(309);
				match(DOUBLE);
				}
				break;
			case 8:
				{
				setState(310);
				match(BOOL);
				}
				break;
			}
			setState(313);
			match(ID);
			setState(314);
			match(LEFT_PARENTHESIS);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6306776L) != 0)) {
				{
				setState(315);
				variable();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(316);
					match(COMMA);
					setState(317);
					variable();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
			match(RIGHT_PARENTHESIS);
			setState(326);
			match(LEFT_BRACKET);
			setState(327);
			function_scope();
			setState(328);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_scopeContext extends ParserRuleContext {
		public List<For_loopContext> for_loop() {
			return getRuleContexts(For_loopContext.class);
		}
		public For_loopContext for_loop(int i) {
			return getRuleContext(For_loopContext.class,i);
		}
		public List<While_loopContext> while_loop() {
			return getRuleContexts(While_loopContext.class);
		}
		public While_loopContext while_loop(int i) {
			return getRuleContext(While_loopContext.class,i);
		}
		public List<Arithmetic_operationContext> arithmetic_operation() {
			return getRuleContexts(Arithmetic_operationContext.class);
		}
		public Arithmetic_operationContext arithmetic_operation(int i) {
			return getRuleContext(Arithmetic_operationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CppGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CppGrammarParser.SEMICOLON, i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<Enum_namespace_callContext> enum_namespace_call() {
			return getRuleContexts(Enum_namespace_callContext.class);
		}
		public Enum_namespace_callContext enum_namespace_call(int i) {
			return getRuleContext(Enum_namespace_callContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public TerminalNode RETURN() { return getToken(CppGrammarParser.RETURN, 0); }
		public TerminalNode INT_LITERAL() { return getToken(CppGrammarParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CppGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(CppGrammarParser.DOUBLE_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CppGrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CppGrammarParser.BOOL_LITERAL, 0); }
		public Function_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterFunction_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitFunction_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitFunction_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_scopeContext function_scope() throws RecognitionException {
		Function_scopeContext _localctx = new Function_scopeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6519768L) != 0) || _la==ID) {
				{
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(330);
					for_loop();
					}
					break;
				case 2:
					{
					setState(331);
					while_loop();
					}
					break;
				case 3:
					{
					setState(332);
					arithmetic_operation();
					setState(333);
					match(SEMICOLON);
					}
					break;
				case 4:
					{
					setState(335);
					if_statement();
					}
					break;
				case 5:
					{
					setState(336);
					function_call();
					}
					break;
				case 6:
					{
					setState(337);
					variable();
					}
					break;
				case 7:
					{
					setState(338);
					assign();
					}
					break;
				case 8:
					{
					setState(339);
					enum_namespace_call();
					setState(340);
					match(ID);
					}
					break;
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(347);
				match(RETURN);
				setState(353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(348);
						enum_namespace_call();
						}
						break;
					}
					setState(351);
					match(ID);
					}
					break;
				case BOOL_LITERAL:
				case INT_LITERAL:
				case CHAR_LITERAL:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
					{
					setState(352);
					_la = _input.LA(1);
					if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(355);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CppGrammarParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0); }
		public List<Enum_namespace_callContext> enum_namespace_call() {
			return getRuleContexts(Enum_namespace_callContext.class);
		}
		public Enum_namespace_callContext enum_namespace_call(int i) {
			return getRuleContext(Enum_namespace_callContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CppGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CppGrammarParser.COMMA, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(CppGrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CppGrammarParser.INT_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(CppGrammarParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(CppGrammarParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> DOUBLE_LITERAL() { return getTokens(CppGrammarParser.DOUBLE_LITERAL); }
		public TerminalNode DOUBLE_LITERAL(int i) {
			return getToken(CppGrammarParser.DOUBLE_LITERAL, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(CppGrammarParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(CppGrammarParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(CppGrammarParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(CppGrammarParser.BOOL_LITERAL, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(358);
				enum_namespace_call();
				}
				break;
			}
			setState(361);
			match(ID);
			setState(362);
			match(LEFT_PARENTHESIS);
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(363);
					enum_namespace_call();
					}
					break;
				}
				setState(366);
				match(ID);
				}
				break;
			case BOOL_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
				{
				setState(367);
				_la = _input.LA(1);
				if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RIGHT_PARENTHESIS:
			case COMMA:
				break;
			default:
				break;
			}
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(373);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(371);
					match(ID);
					}
					break;
				case BOOL_LITERAL:
				case INT_LITERAL:
				case CHAR_LITERAL:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
					{
					setState(372);
					_la = _input.LA(1);
					if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CppGrammarParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CppGrammarParser.LEFT_PARENTHESIS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CppGrammarParser.SEMICOLON, 0); }
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public Loop_scopeContext loop_scope() {
			return getRuleContext(Loop_scopeContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(FOR);
			setState(383);
			match(LEFT_PARENTHESIS);
			setState(384);
			variable();
			setState(385);
			if_expression();
			setState(386);
			match(SEMICOLON);
			setState(387);
			arithmetic_operation();
			setState(388);
			match(RIGHT_PARENTHESIS);
			setState(389);
			match(LEFT_BRACKET);
			setState(390);
			loop_scope();
			setState(391);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_scopeContext extends ParserRuleContext {
		public List<For_loopContext> for_loop() {
			return getRuleContexts(For_loopContext.class);
		}
		public For_loopContext for_loop(int i) {
			return getRuleContext(For_loopContext.class,i);
		}
		public List<While_loopContext> while_loop() {
			return getRuleContexts(While_loopContext.class);
		}
		public While_loopContext while_loop(int i) {
			return getRuleContext(While_loopContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(CppGrammarParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(CppGrammarParser.BREAK, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CppGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CppGrammarParser.SEMICOLON, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(CppGrammarParser.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(CppGrammarParser.CONTINUE, i);
		}
		public List<Arithmetic_operationContext> arithmetic_operation() {
			return getRuleContexts(Arithmetic_operationContext.class);
		}
		public Arithmetic_operationContext arithmetic_operation(int i) {
			return getRuleContext(Arithmetic_operationContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(CppGrammarParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(CppGrammarParser.RETURN, i);
		}
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public List<Enum_namespace_callContext> enum_namespace_call() {
			return getRuleContexts(Enum_namespace_callContext.class);
		}
		public Enum_namespace_callContext enum_namespace_call(int i) {
			return getRuleContext(Enum_namespace_callContext.class,i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(CppGrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CppGrammarParser.INT_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(CppGrammarParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(CppGrammarParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> DOUBLE_LITERAL() { return getTokens(CppGrammarParser.DOUBLE_LITERAL); }
		public TerminalNode DOUBLE_LITERAL(int i) {
			return getToken(CppGrammarParser.DOUBLE_LITERAL, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(CppGrammarParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(CppGrammarParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(CppGrammarParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(CppGrammarParser.BOOL_LITERAL, i);
		}
		public Loop_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterLoop_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitLoop_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitLoop_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_scopeContext loop_scope() throws RecognitionException {
		Loop_scopeContext _localctx = new Loop_scopeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8354776L) != 0) || _la==SEMICOLON || _la==ID) {
				{
				{
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(393);
					for_loop();
					}
					break;
				case 2:
					{
					setState(394);
					while_loop();
					}
					break;
				case 3:
					{
					setState(395);
					match(BREAK);
					setState(396);
					match(SEMICOLON);
					}
					break;
				case 4:
					{
					setState(397);
					match(CONTINUE);
					setState(398);
					match(SEMICOLON);
					}
					break;
				case 5:
					{
					setState(399);
					arithmetic_operation();
					setState(400);
					match(SEMICOLON);
					}
					break;
				case 6:
					{
					setState(402);
					if_statement();
					}
					break;
				case 7:
					{
					setState(403);
					variable();
					}
					break;
				case 8:
					{
					setState(404);
					assign();
					}
					break;
				case 9:
					{
					setState(405);
					function_call();
					}
					break;
				case 10:
					{
					setState(406);
					match(RETURN);
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(408);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(407);
							enum_namespace_call();
							}
							break;
						}
						setState(410);
						match(ID);
						}
						break;
					case 2:
						{
						setState(411);
						_la = _input.LA(1);
						if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					break;
				case 11:
					{
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(414);
						enum_namespace_call();
						}
					}

					setState(417);
					match(SEMICOLON);
					}
					break;
				}
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CppGrammarParser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(CppGrammarParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(CppGrammarParser.LEFT_BRACKET, 0); }
		public Loop_scopeContext loop_scope() {
			return getRuleContext(Loop_scopeContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CppGrammarParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> TRUE() { return getTokens(CppGrammarParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(CppGrammarParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(CppGrammarParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(CppGrammarParser.FALSE, i);
		}
		public List<TerminalNode> LOG_NOT() { return getTokens(CppGrammarParser.LOG_NOT); }
		public TerminalNode LOG_NOT(int i) {
			return getToken(CppGrammarParser.LOG_NOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public List<TerminalNode> LESSER() { return getTokens(CppGrammarParser.LESSER); }
		public TerminalNode LESSER(int i) {
			return getToken(CppGrammarParser.LESSER, i);
		}
		public List<TerminalNode> LESSER_EQUAL() { return getTokens(CppGrammarParser.LESSER_EQUAL); }
		public TerminalNode LESSER_EQUAL(int i) {
			return getToken(CppGrammarParser.LESSER_EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(CppGrammarParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(CppGrammarParser.GREATER, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(CppGrammarParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(CppGrammarParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CppGrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CppGrammarParser.EQUAL, i);
		}
		public List<TerminalNode> NONEQUAL() { return getTokens(CppGrammarParser.NONEQUAL); }
		public TerminalNode NONEQUAL(int i) {
			return getToken(CppGrammarParser.NONEQUAL, i);
		}
		public List<TerminalNode> LOG_AND() { return getTokens(CppGrammarParser.LOG_AND); }
		public TerminalNode LOG_AND(int i) {
			return getToken(CppGrammarParser.LOG_AND, i);
		}
		public List<TerminalNode> LOG_OR() { return getTokens(CppGrammarParser.LOG_OR); }
		public TerminalNode LOG_OR(int i) {
			return getToken(CppGrammarParser.LOG_OR, i);
		}
		public List<Enum_namespace_callContext> enum_namespace_call() {
			return getRuleContexts(Enum_namespace_callContext.class);
		}
		public Enum_namespace_callContext enum_namespace_call(int i) {
			return getRuleContext(Enum_namespace_callContext.class,i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(CppGrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CppGrammarParser.INT_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(CppGrammarParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(CppGrammarParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> DOUBLE_LITERAL() { return getTokens(CppGrammarParser.DOUBLE_LITERAL); }
		public TerminalNode DOUBLE_LITERAL(int i) {
			return getToken(CppGrammarParser.DOUBLE_LITERAL, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(CppGrammarParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(CppGrammarParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(CppGrammarParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(CppGrammarParser.BOOL_LITERAL, i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(WHILE);
			setState(426);
			match(LEFT_PARENTHESIS);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOG_NOT) {
				{
				setState(427);
				match(LOG_NOT);
				}
			}

			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(430);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(431);
				match(FALSE);
				}
				break;
			case ID:
				{
				{
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(432);
					enum_namespace_call();
					}
					break;
				}
				setState(435);
				match(ID);
				setState(436);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(438);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(437);
						enum_namespace_call();
						}
						break;
					}
					setState(440);
					match(ID);
					}
					break;
				case BOOL_LITERAL:
				case INT_LITERAL:
				case CHAR_LITERAL:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
					{
					setState(441);
					_la = _input.LA(1);
					if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOG_AND || _la==LOG_OR) {
					{
					{
					setState(444);
					_la = _input.LA(1);
					if ( !(_la==LOG_AND || _la==LOG_OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOG_NOT) {
						{
						setState(445);
						match(LOG_NOT);
						}
					}

					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(448);
						enum_namespace_call();
						}
						break;
					}
					setState(451);
					match(ID);
					setState(452);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8867286400106496L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(458);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(454);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(453);
							enum_namespace_call();
							}
							break;
						}
						setState(456);
						match(ID);
						}
						break;
					case BOOL_LITERAL:
					case INT_LITERAL:
					case CHAR_LITERAL:
					case FLOAT_LITERAL:
					case DOUBLE_LITERAL:
						{
						setState(457);
						_la = _input.LA(1);
						if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(467);
			match(RIGHT_PARENTHESIS);
			setState(468);
			match(LEFT_BRACKET);
			setState(469);
			loop_scope();
			setState(470);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_expressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public List<TerminalNode> LESSER() { return getTokens(CppGrammarParser.LESSER); }
		public TerminalNode LESSER(int i) {
			return getToken(CppGrammarParser.LESSER, i);
		}
		public List<TerminalNode> LESSER_EQUAL() { return getTokens(CppGrammarParser.LESSER_EQUAL); }
		public TerminalNode LESSER_EQUAL(int i) {
			return getToken(CppGrammarParser.LESSER_EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(CppGrammarParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(CppGrammarParser.GREATER, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(CppGrammarParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(CppGrammarParser.GREATER_EQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CppGrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CppGrammarParser.EQUAL, i);
		}
		public List<TerminalNode> NONEQUAL() { return getTokens(CppGrammarParser.NONEQUAL); }
		public TerminalNode NONEQUAL(int i) {
			return getToken(CppGrammarParser.NONEQUAL, i);
		}
		public List<TerminalNode> LOG_NOT() { return getTokens(CppGrammarParser.LOG_NOT); }
		public TerminalNode LOG_NOT(int i) {
			return getToken(CppGrammarParser.LOG_NOT, i);
		}
		public List<Enum_namespace_callContext> enum_namespace_call() {
			return getRuleContexts(Enum_namespace_callContext.class);
		}
		public Enum_namespace_callContext enum_namespace_call(int i) {
			return getRuleContext(Enum_namespace_callContext.class,i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(CppGrammarParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CppGrammarParser.INT_LITERAL, i);
		}
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(CppGrammarParser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(CppGrammarParser.CHAR_LITERAL, i);
		}
		public List<TerminalNode> DOUBLE_LITERAL() { return getTokens(CppGrammarParser.DOUBLE_LITERAL); }
		public TerminalNode DOUBLE_LITERAL(int i) {
			return getToken(CppGrammarParser.DOUBLE_LITERAL, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(CppGrammarParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(CppGrammarParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> BOOL_LITERAL() { return getTokens(CppGrammarParser.BOOL_LITERAL); }
		public TerminalNode BOOL_LITERAL(int i) {
			return getToken(CppGrammarParser.BOOL_LITERAL, i);
		}
		public List<TerminalNode> LOG_AND() { return getTokens(CppGrammarParser.LOG_AND); }
		public TerminalNode LOG_AND(int i) {
			return getToken(CppGrammarParser.LOG_AND, i);
		}
		public List<TerminalNode> LOG_OR() { return getTokens(CppGrammarParser.LOG_OR); }
		public TerminalNode LOG_OR(int i) {
			return getToken(CppGrammarParser.LOG_OR, i);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOG_NOT) {
				{
				setState(472);
				match(LOG_NOT);
				}
			}

			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(475);
				enum_namespace_call();
				}
				break;
			}
			setState(478);
			match(ID);
			setState(479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(480);
					enum_namespace_call();
					}
					break;
				}
				setState(483);
				match(ID);
				}
				break;
			case BOOL_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
				{
				setState(484);
				_la = _input.LA(1);
				if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_AND || _la==LOG_OR) {
				{
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==LOG_AND || _la==LOG_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOG_NOT) {
					{
					setState(488);
					match(LOG_NOT);
					}
				}

				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(491);
					enum_namespace_call();
					}
					break;
				}
				setState(494);
				match(ID);
				setState(495);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(496);
						enum_namespace_call();
						}
						break;
					}
					setState(499);
					match(ID);
					}
					break;
				case BOOL_LITERAL:
				case INT_LITERAL:
				case CHAR_LITERAL:
				case FLOAT_LITERAL:
				case DOUBLE_LITERAL:
					{
					setState(500);
					_la = _input.LA(1);
					if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CppGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CppGrammarParser.IF, i);
		}
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(CppGrammarParser.LEFT_PARENTHESIS); }
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(CppGrammarParser.LEFT_PARENTHESIS, i);
		}
		public List<If_expressionContext> if_expression() {
			return getRuleContexts(If_expressionContext.class);
		}
		public If_expressionContext if_expression(int i) {
			return getRuleContext(If_expressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(CppGrammarParser.RIGHT_PARENTHESIS); }
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(CppGrammarParser.RIGHT_PARENTHESIS, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(CppGrammarParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(CppGrammarParser.LEFT_BRACKET, i);
		}
		public List<Loop_scopeContext> loop_scope() {
			return getRuleContexts(Loop_scopeContext.class);
		}
		public Loop_scopeContext loop_scope(int i) {
			return getRuleContext(Loop_scopeContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(CppGrammarParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(CppGrammarParser.RIGHT_BRACKET, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CppGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CppGrammarParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IF);
			setState(509);
			match(LEFT_PARENTHESIS);
			setState(510);
			if_expression();
			setState(511);
			match(RIGHT_PARENTHESIS);
			setState(512);
			match(LEFT_BRACKET);
			setState(513);
			loop_scope();
			setState(514);
			match(RIGHT_BRACKET);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					match(ELSE);
					setState(516);
					match(IF);
					setState(517);
					match(LEFT_PARENTHESIS);
					setState(518);
					if_expression();
					setState(519);
					match(RIGHT_PARENTHESIS);
					setState(520);
					match(LEFT_BRACKET);
					setState(521);
					loop_scope();
					setState(522);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(529);
				match(ELSE);
				setState(530);
				match(LEFT_BRACKET);
				setState(531);
				loop_scope();
				setState(532);
				match(RIGHT_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_namespace_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CppGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CppGrammarParser.ID, i);
		}
		public List<TerminalNode> SCOPE_RESOLUTION() { return getTokens(CppGrammarParser.SCOPE_RESOLUTION); }
		public TerminalNode SCOPE_RESOLUTION(int i) {
			return getToken(CppGrammarParser.SCOPE_RESOLUTION, i);
		}
		public Enum_namespace_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_namespace_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterEnum_namespace_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitEnum_namespace_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitEnum_namespace_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_namespace_callContext enum_namespace_call() throws RecognitionException {
		Enum_namespace_callContext _localctx = new Enum_namespace_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum_namespace_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(ID);
			setState(537);
			match(SCOPE_RESOLUTION);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(ID);
					setState(539);
					match(SCOPE_RESOLUTION);
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_operationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CppGrammarParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(CppGrammarParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(CppGrammarParser.DECREMENT, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(CppGrammarParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUBSTRACT() { return getToken(CppGrammarParser.ASSIGN_SUBSTRACT, 0); }
		public TerminalNode ASSIGN_MULTIPLY() { return getToken(CppGrammarParser.ASSIGN_MULTIPLY, 0); }
		public TerminalNode ASSIGN_DIVIDE() { return getToken(CppGrammarParser.ASSIGN_DIVIDE, 0); }
		public Assingment_optionsContext assingment_options() {
			return getRuleContext(Assingment_optionsContext.class,0);
		}
		public Arithmetic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterArithmetic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitArithmetic_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitArithmetic_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operationContext arithmetic_operation() throws RecognitionException {
		Arithmetic_operationContext _localctx = new Arithmetic_operationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithmetic_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(ID);
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(546);
				match(INCREMENT);
				}
				break;
			case DECREMENT:
				{
				setState(547);
				match(DECREMENT);
				}
				break;
			case ASSIGN_ADD:
				{
				setState(548);
				match(ASSIGN_ADD);
				{
				setState(549);
				assingment_options();
				}
				}
				break;
			case ASSIGN_SUBSTRACT:
				{
				setState(550);
				match(ASSIGN_SUBSTRACT);
				{
				setState(551);
				assingment_options();
				}
				}
				break;
			case ASSIGN_MULTIPLY:
				{
				setState(552);
				match(ASSIGN_MULTIPLY);
				{
				setState(553);
				assingment_options();
				}
				}
				break;
			case ASSIGN_DIVIDE:
				{
				setState(554);
				match(ASSIGN_DIVIDE);
				{
				setState(555);
				assingment_options();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assingment_optionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CppGrammarParser.ID, 0); }
		public Enum_namespace_callContext enum_namespace_call() {
			return getRuleContext(Enum_namespace_callContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(CppGrammarParser.INT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(CppGrammarParser.CHAR_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(CppGrammarParser.DOUBLE_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CppGrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CppGrammarParser.BOOL_LITERAL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Assingment_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).enterAssingment_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CppGrammarListener ) ((CppGrammarListener)listener).exitAssingment_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppGrammarVisitor ) return ((CppGrammarVisitor<? extends T>)visitor).visitAssingment_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingment_optionsContext assingment_options() throws RecognitionException {
		Assingment_optionsContext _localctx = new Assingment_optionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assingment_options);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(558);
					enum_namespace_call();
					}
					break;
				}
				setState(561);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				_la = _input.LA(1);
				if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 16492674416641L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001S\u0237\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0004\u0000+\b\u0000"+
		"\u000b\u0000\f\u0000,\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003"+
		"\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0005\u0003"+
		"L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0005\u0003R\b\u0003\n"+
		"\u0003\f\u0003U\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0005\u0004k\b\u0004\n\u0004"+
		"\f\u0004n\t\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0086\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008a\b\u0006\u0005"+
		"\u0006\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0007\u0003\u0007"+
		"\u0092\b\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0098\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u009f\b\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007"+
		"\u0003\u0007\u00a4\b\u0007\u0001\u0007\u0003\u0007\u00a7\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ae"+
		"\b\u0007\u0001\u0007\u0003\u0007\u00b1\b\u0007\u0003\u0007\u00b3\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00b6\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00ba\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00c0\b\u0007\u0001\u0007\u0003\u0007\u00c3\b\u0007\u0003\u0007\u00c5"+
		"\b\u0007\u0001\u0007\u0003\u0007\u00c8\b\u0007\u0001\u0007\u0003\u0007"+
		"\u00cb\b\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d5\b\u0007\u0001"+
		"\u0007\u0003\u0007\u00d8\b\u0007\u0003\u0007\u00da\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e1\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00e4\b\u0007\u0003\u0007\u00e6\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ed"+
		"\b\u0007\u0001\u0007\u0003\u0007\u00f0\b\u0007\u0003\u0007\u00f2\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00f9\b\u0007\u0001\u0007\u0003\u0007\u00fc\b\u0007\u0003\u0007\u00fe"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0109\b\u0007\u0001"+
		"\u0007\u0003\u0007\u010c\b\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0115\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u011a\b\b\u0001\b\u0001\b\u0001\t\u0003\t\u011f\b\t\u0001"+
		"\t\u0003\t\u0122\b\t\u0001\t\u0001\t\u0003\t\u0126\b\t\u0001\t\u0001\t"+
		"\u0003\t\u012a\b\t\u0001\t\u0001\t\u0003\t\u012e\b\t\u0001\t\u0001\t\u0003"+
		"\t\u0132\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0138\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u013f\b\t\n\t\f\t\u0142\t\t\u0003"+
		"\t\u0144\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0157\b\n\n\n\f\n\u015a\t\n\u0001\n\u0001\n\u0003\n\u015e\b"+
		"\n\u0001\n\u0001\n\u0003\n\u0162\b\n\u0001\n\u0003\n\u0165\b\n\u0001\u000b"+
		"\u0003\u000b\u0168\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u016d\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0171\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0176\b\u000b\u0005\u000b\u0178"+
		"\b\u000b\n\u000b\f\u000b\u017b\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0199"+
		"\b\r\u0001\r\u0001\r\u0003\r\u019d\b\r\u0001\r\u0003\r\u01a0\b\r\u0001"+
		"\r\u0003\r\u01a3\b\r\u0005\r\u01a5\b\r\n\r\f\r\u01a8\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01ad\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b2\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u01b7\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01bb\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01bf\b\u000e\u0001\u000e\u0003\u000e"+
		"\u01c2\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01c7\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01cb\b\u000e\u0005\u000e\u01cd"+
		"\b\u000e\n\u000e\f\u000e\u01d0\t\u000e\u0003\u000e\u01d2\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003"+
		"\u000f\u01da\b\u000f\u0001\u000f\u0003\u000f\u01dd\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u01e2\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u01e6\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01ea\b"+
		"\u000f\u0001\u000f\u0003\u000f\u01ed\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u01f2\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01f6"+
		"\b\u000f\u0005\u000f\u01f8\b\u000f\n\u000f\f\u000f\u01fb\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u020d\b\u0010\n"+
		"\u0010\f\u0010\u0210\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0217\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u021d\b\u0011\n\u0011\f\u0011\u0220\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u022d\b\u0012\u0001\u0013\u0003\u0013\u0230\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0235\b\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0005\u0001\u0000 \"\u0002\u0000%%MP\u0001\u0000"+
		"/4\u0001\u000056\u0002\u0000&\'/4\u02b4\u0000*\u0001\u0000\u0000\u0000"+
		"\u0002.\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006;"+
		"\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000"+
		"\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000"+
		"\u0010\u0111\u0001\u0000\u0000\u0000\u0012\u011e\u0001\u0000\u0000\u0000"+
		"\u0014\u0158\u0001\u0000\u0000\u0000\u0016\u0167\u0001\u0000\u0000\u0000"+
		"\u0018\u017e\u0001\u0000\u0000\u0000\u001a\u01a6\u0001\u0000\u0000\u0000"+
		"\u001c\u01a9\u0001\u0000\u0000\u0000\u001e\u01d9\u0001\u0000\u0000\u0000"+
		" \u01fc\u0001\u0000\u0000\u0000\"\u0218\u0001\u0000\u0000\u0000$\u0221"+
		"\u0001\u0000\u0000\u0000&\u0234\u0001\u0000\u0000\u0000(+\u0003\u0002"+
		"\u0001\u0000)+\u0003\u0004\u0002\u0000*(\u0001\u0000\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-\u0001\u0001\u0000\u0000\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0005R\u0000\u00000\u0003\u0001\u0000\u0000\u000013\u0003"+
		"\"\u0011\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000039\u0001"+
		"\u0000\u0000\u00004:\u0003\u0006\u0003\u00005:\u0003\b\u0004\u00006:\u0003"+
		"\u000e\u0007\u00007:\u0003\u0012\t\u00008:\u0003\n\u0005\u000094\u0001"+
		"\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0005\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0002\u0000\u0000<=\u0005L\u0000\u0000=A\u0005G\u0000"+
		"\u0000>@\u0003\u0012\t\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\u000e\u0007\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HM\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JL\u0003\n\u0005\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0003\b\u0004\u0000QP\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0005H\u0000\u0000WX\u0005A\u0000\u0000X\u0007\u0001\u0000\u0000\u0000"+
		"Y[\u0005\u0019\u0000\u0000Z\\\u0005\u0018\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005L"+
		"\u0000\u0000^o\u0005G\u0000\u0000_b\u0005L\u0000\u0000`a\u00058\u0000"+
		"\u0000ac\u0005M\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cl\u0001\u0000\u0000\u0000de\u0005K\u0000\u0000eh\u0005L\u0000\u0000"+
		"fg\u00058\u0000\u0000gi\u0005M\u0000\u0000hf\u0001\u0000\u0000\u0000h"+
		"i\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000o_\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0005H\u0000\u0000rs\u0005A\u0000\u0000s\t\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0017\u0000\u0000uv\u0005L\u0000\u0000vw\u0005G\u0000\u0000w"+
		"x\u0003\f\u0006\u0000xy\u0005H\u0000\u0000yz\u0005A\u0000\u0000z\u000b"+
		"\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000\u0000|~\u0005B\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0003\u000e\u0007\u0000\u0080\u0082\u0003\u0012"+
		"\t\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u008d\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000\u0000"+
		"\u0000\u0084\u0086\u0005B\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0003\u000e\u0007\u0000\u0088\u008a\u0003\u0012\t\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u0016\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0015\u0000\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u010d"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005\f\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u00a3\u0005"+
		"L\u0000\u0000\u009b\u00a1\u00058\u0000\u0000\u009c\u00a2\u0005N\u0000"+
		"\u0000\u009d\u009f\u0003\"\u0011\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0005L\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1"+
		"\u009e\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3"+
		"\u009b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u010e\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\f\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9\u00b2"+
		"\u0005L\u0000\u0000\u00aa\u00b0\u00058\u0000\u0000\u00ab\u00b1\u0005M"+
		"\u0000\u0000\u00ac\u00ae\u0003\"\u0011\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0005L\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u010e\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\f\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0007\u0000\u0000\u00b8"+
		"\u00ba\u0005\u0007\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00c4\u0005L\u0000\u0000\u00bc\u00c2\u00058\u0000\u0000\u00bd\u00c3\u0005"+
		"M\u0000\u0000\u00be\u00c0\u0003\"\u0011\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0005L\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u010e\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\f\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0007\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u0007\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000"+
		"\u00d0\u00d9\u0005L\u0000\u0000\u00d1\u00d7\u00058\u0000\u0000\u00d2\u00d8"+
		"\u0005M\u0000\u0000\u00d3\u00d5\u0003\"\u0011\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d8\u0005L\u0000\u0000\u00d7\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d1\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u010e\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\b\u0000"+
		"\u0000\u00dc\u00e5\u0005L\u0000\u0000\u00dd\u00e3\u00058\u0000\u0000\u00de"+
		"\u00e4\u0005O\u0000\u0000\u00df\u00e1\u0003\"\u0011\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005L\u0000\u0000\u00e3\u00de\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u010e\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\t\u0000\u0000\u00e8\u00f1\u0005L\u0000\u0000\u00e9\u00ef\u00058\u0000"+
		"\u0000\u00ea\u00f0\u0005P\u0000\u0000\u00eb\u00ed\u0003\"\u0011\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005L\u0000\u0000\u00ef"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u010e\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u000b\u0000\u0000\u00f4\u00fd\u0005L\u0000\u0000\u00f5\u00fb"+
		"\u00058\u0000\u0000\u00f6\u00fc\u0005%\u0000\u0000\u00f7\u00f9\u0003\""+
		"\u0011\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005L\u0000"+
		"\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u010e\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\r\u0000\u0000\u0100\u0101\u0005L\u0000\u0000"+
		"\u0101\u010b\u00058\u0000\u0000\u0102\u010c\u0005M\u0000\u0000\u0103\u010c"+
		"\u0005N\u0000\u0000\u0104\u010c\u0005P\u0000\u0000\u0105\u010c\u0005O"+
		"\u0000\u0000\u0106\u010c\u0005%\u0000\u0000\u0107\u0109\u0003\"\u0011"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0005L\u0000\u0000"+
		"\u010b\u0102\u0001\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000"+
		"\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000"+
		"\u010b\u0106\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0097\u0001\u0000\u0000\u0000"+
		"\u010d\u00a6\u0001\u0000\u0000\u0000\u010d\u00b5\u0001\u0000\u0000\u0000"+
		"\u010d\u00c7\u0001\u0000\u0000\u0000\u010d\u00db\u0001\u0000\u0000\u0000"+
		"\u010d\u00e7\u0001\u0000\u0000\u0000\u010d\u00f3\u0001\u0000\u0000\u0000"+
		"\u010d\u00ff\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005A\u0000\u0000\u0110\u000f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005L\u0000\u0000\u0112\u0119\u00058\u0000\u0000\u0113\u0115\u0003"+
		"\"\u0011\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u011a\u0005L\u0000"+
		"\u0000\u0117\u011a\u0007\u0001\u0000\u0000\u0118\u011a\u0003\u0016\u000b"+
		"\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005A\u0000\u0000\u011c\u0011\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u0005\u0016\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0005\u0015\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0137\u0001\u0000\u0000\u0000"+
		"\u0123\u0138\u0005\n\u0000\u0000\u0124\u0126\u0005\f\u0000\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0138\u0005\u0003\u0000\u0000\u0128"+
		"\u012a\u0005\f\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0138"+
		"\u0005\u0004\u0000\u0000\u012c\u012e\u0005\f\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0138\u0005\u0007\u0000\u0000\u0130\u0132\u0005"+
		"\f\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0138\u0005\u0006"+
		"\u0000\u0000\u0134\u0138\u0005\b\u0000\u0000\u0135\u0138\u0005\t\u0000"+
		"\u0000\u0136\u0138\u0005\u000b\u0000\u0000\u0137\u0123\u0001\u0000\u0000"+
		"\u0000\u0137\u0125\u0001\u0000\u0000\u0000\u0137\u0129\u0001\u0000\u0000"+
		"\u0000\u0137\u012d\u0001\u0000\u0000\u0000\u0137\u0131\u0001\u0000\u0000"+
		"\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005L\u0000\u0000\u013a\u0143\u0005C\u0000\u0000\u013b"+
		"\u0140\u0003\u000e\u0007\u0000\u013c\u013d\u0005K\u0000\u0000\u013d\u013f"+
		"\u0003\u000e\u0007\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0143\u013b\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0005D\u0000\u0000\u0146\u0147\u0005G\u0000\u0000\u0147\u0148\u0003\u0014"+
		"\n\u0000\u0148\u0149\u0005H\u0000\u0000\u0149\u0013\u0001\u0000\u0000"+
		"\u0000\u014a\u0157\u0003\u0018\f\u0000\u014b\u0157\u0003\u001c\u000e\u0000"+
		"\u014c\u014d\u0003$\u0012\u0000\u014d\u014e\u0005A\u0000\u0000\u014e\u0157"+
		"\u0001\u0000\u0000\u0000\u014f\u0157\u0003 \u0010\u0000\u0150\u0157\u0003"+
		"\u0016\u000b\u0000\u0151\u0157\u0003\u000e\u0007\u0000\u0152\u0157\u0003"+
		"\u0010\b\u0000\u0153\u0154\u0003\"\u0011\u0000\u0154\u0155\u0005L\u0000"+
		"\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u014a\u0001\u0000\u0000"+
		"\u0000\u0156\u014b\u0001\u0000\u0000\u0000\u0156\u014c\u0001\u0000\u0000"+
		"\u0000\u0156\u014f\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000"+
		"\u0000\u0156\u0151\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000"+
		"\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u0164\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u0161\u0005\u0014\u0000\u0000\u015c\u015e\u0003\"\u0011\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0162\u0005L\u0000\u0000\u0160"+
		"\u0162\u0007\u0001\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0005A\u0000\u0000\u0164\u015b"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0015"+
		"\u0001\u0000\u0000\u0000\u0166\u0168\u0003\"\u0011\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005L\u0000\u0000\u016a\u0170\u0005C\u0000"+
		"\u0000\u016b\u016d\u0003\"\u0011\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0005L\u0000\u0000\u016f\u0171\u0007\u0001\u0000\u0000\u0170"+
		"\u016c\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0179\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0005K\u0000\u0000\u0173\u0176\u0005L\u0000\u0000\u0174\u0176\u0007"+
		"\u0001\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0172\u0001"+
		"\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"D\u0000\u0000\u017d\u0017\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0010"+
		"\u0000\u0000\u017f\u0180\u0005C\u0000\u0000\u0180\u0181\u0003\u000e\u0007"+
		"\u0000\u0181\u0182\u0003\u001e\u000f\u0000\u0182\u0183\u0005A\u0000\u0000"+
		"\u0183\u0184\u0003$\u0012\u0000\u0184\u0185\u0005D\u0000\u0000\u0185\u0186"+
		"\u0005G\u0000\u0000\u0186\u0187\u0003\u001a\r\u0000\u0187\u0188\u0005"+
		"H\u0000\u0000\u0188\u0019\u0001\u0000\u0000\u0000\u0189\u01a3\u0003\u0018"+
		"\f\u0000\u018a\u01a3\u0003\u001c\u000e\u0000\u018b\u018c\u0005\u0013\u0000"+
		"\u0000\u018c\u01a3\u0005A\u0000\u0000\u018d\u018e\u0005\u0012\u0000\u0000"+
		"\u018e\u01a3\u0005A\u0000\u0000\u018f\u0190\u0003$\u0012\u0000\u0190\u0191"+
		"\u0005A\u0000\u0000\u0191\u01a3\u0001\u0000\u0000\u0000\u0192\u01a3\u0003"+
		" \u0010\u0000\u0193\u01a3\u0003\u000e\u0007\u0000\u0194\u01a3\u0003\u0010"+
		"\b\u0000\u0195\u01a3\u0003\u0016\u000b\u0000\u0196\u019c\u0005\u0014\u0000"+
		"\u0000\u0197\u0199\u0003\"\u0011\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019d\u0005L\u0000\u0000\u019b\u019d\u0007\u0001\u0000\u0000\u019c"+
		"\u0198\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u01a3\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0003\"\u0011\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0005A\u0000\u0000\u01a2\u0189\u0001\u0000\u0000\u0000\u01a2\u018a\u0001"+
		"\u0000\u0000\u0000\u01a2\u018b\u0001\u0000\u0000\u0000\u01a2\u018d\u0001"+
		"\u0000\u0000\u0000\u01a2\u018f\u0001\u0000\u0000\u0000\u01a2\u0192\u0001"+
		"\u0000\u0000\u0000\u01a2\u0193\u0001\u0000\u0000\u0000\u01a2\u0194\u0001"+
		"\u0000\u0000\u0000\u01a2\u0195\u0001\u0000\u0000\u0000\u01a2\u0196\u0001"+
		"\u0000\u0000\u0000\u01a2\u019f\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u001b\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0005\u0011\u0000\u0000\u01aa\u01ac\u0005"+
		"C\u0000\u0000\u01ab\u01ad\u00057\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01d1\u0001\u0000\u0000"+
		"\u0000\u01ae\u01d2\u0005\'\u0000\u0000\u01af\u01d2\u0005&\u0000\u0000"+
		"\u01b0\u01b2\u0003\"\u0011\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005L\u0000\u0000\u01b4\u01ba\u0007\u0002\u0000\u0000\u01b5\u01b7"+
		"\u0003\"\u0011\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0005"+
		"L\u0000\u0000\u01b9\u01bb\u0007\u0001\u0000\u0000\u01ba\u01b6\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ce\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0007\u0003\u0000\u0000\u01bd\u01bf\u00057\u0000"+
		"\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003\"\u0011\u0000"+
		"\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005L\u0000\u0000\u01c4"+
		"\u01ca\u0007\u0004\u0000\u0000\u01c5\u01c7\u0003\"\u0011\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01cb\u0005L\u0000\u0000\u01c9\u01cb\u0007"+
		"\u0001\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01bc\u0001"+
		"\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01ae\u0001"+
		"\u0000\u0000\u0000\u01d1\u01af\u0001\u0000\u0000\u0000\u01d1\u01b1\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005"+
		"D\u0000\u0000\u01d4\u01d5\u0005G\u0000\u0000\u01d5\u01d6\u0003\u001a\r"+
		"\u0000\u01d6\u01d7\u0005H\u0000\u0000\u01d7\u001d\u0001\u0000\u0000\u0000"+
		"\u01d8\u01da\u00057\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db"+
		"\u01dd\u0003\"\u0011\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0005L\u0000\u0000\u01df\u01e5\u0007\u0002\u0000\u0000\u01e0\u01e2\u0003"+
		"\"\u0011\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e6\u0005L\u0000"+
		"\u0000\u01e4\u01e6\u0007\u0001\u0000\u0000\u01e5\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6\u01f9\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e9\u0007\u0003\u0000\u0000\u01e8\u01ea\u00057\u0000\u0000"+
		"\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003\"\u0011\u0000\u01ec"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005L\u0000\u0000\u01ef\u01f5"+
		"\u0007\u0002\u0000\u0000\u01f0\u01f2\u0003\"\u0011\u0000\u01f1\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f6\u0005L\u0000\u0000\u01f4\u01f6\u0007\u0001"+
		"\u0000\u0000\u01f5\u01f1\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01e7\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u001f\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u000e"+
		"\u0000\u0000\u01fd\u01fe\u0005C\u0000\u0000\u01fe\u01ff\u0003\u001e\u000f"+
		"\u0000\u01ff\u0200\u0005D\u0000\u0000\u0200\u0201\u0005G\u0000\u0000\u0201"+
		"\u0202\u0003\u001a\r\u0000\u0202\u020e\u0005H\u0000\u0000\u0203\u0204"+
		"\u0005\u000f\u0000\u0000\u0204\u0205\u0005\u000e\u0000\u0000\u0205\u0206"+
		"\u0005C\u0000\u0000\u0206\u0207\u0003\u001e\u000f\u0000\u0207\u0208\u0005"+
		"D\u0000\u0000\u0208\u0209\u0005G\u0000\u0000\u0209\u020a\u0003\u001a\r"+
		"\u0000\u020a\u020b\u0005H\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000"+
		"\u020c\u0203\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020f\u0216\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0005\u000f\u0000\u0000\u0212\u0213\u0005G\u0000\u0000\u0213"+
		"\u0214\u0003\u001a\r\u0000\u0214\u0215\u0005H\u0000\u0000\u0215\u0217"+
		"\u0001\u0000\u0000\u0000\u0216\u0211\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217!\u0001\u0000\u0000\u0000\u0218\u0219\u0005"+
		"L\u0000\u0000\u0219\u021e\u0005I\u0000\u0000\u021a\u021b\u0005L\u0000"+
		"\u0000\u021b\u021d\u0005I\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f#\u0001\u0000\u0000\u0000\u0220"+
		"\u021e\u0001\u0000\u0000\u0000\u0221\u022c\u0005L\u0000\u0000\u0222\u022d"+
		"\u0005(\u0000\u0000\u0223\u022d\u0005)\u0000\u0000\u0224\u0225\u00059"+
		"\u0000\u0000\u0225\u022d\u0003&\u0013\u0000\u0226\u0227\u0005:\u0000\u0000"+
		"\u0227\u022d\u0003&\u0013\u0000\u0228\u0229\u0005;\u0000\u0000\u0229\u022d"+
		"\u0003&\u0013\u0000\u022a\u022b\u0005<\u0000\u0000\u022b\u022d\u0003&"+
		"\u0013\u0000\u022c\u0222\u0001\u0000\u0000\u0000\u022c\u0223\u0001\u0000"+
		"\u0000\u0000\u022c\u0224\u0001\u0000\u0000\u0000\u022c\u0226\u0001\u0000"+
		"\u0000\u0000\u022c\u0228\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022d%\u0001\u0000\u0000\u0000\u022e\u0230\u0003\"\u0011"+
		"\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0235\u0005L\u0000\u0000"+
		"\u0232\u0235\u0007\u0001\u0000\u0000\u0233\u0235\u0003\u0016\u000b\u0000"+
		"\u0234\u022f\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000"+
		"\u0234\u0233\u0001\u0000\u0000\u0000\u0235\'\u0001\u0000\u0000\u0000f"+
		"*,29AGMS[bhlo}\u0081\u0085\u0089\u008d\u0091\u0094\u0097\u009e\u00a1\u00a3"+
		"\u00a6\u00ad\u00b0\u00b2\u00b5\u00b9\u00bf\u00c2\u00c4\u00c7\u00ca\u00cd"+
		"\u00d4\u00d7\u00d9\u00e0\u00e3\u00e5\u00ec\u00ef\u00f1\u00f8\u00fb\u00fd"+
		"\u0108\u010b\u010d\u0114\u0119\u011e\u0121\u0125\u0129\u012d\u0131\u0137"+
		"\u0140\u0143\u0156\u0158\u015d\u0161\u0164\u0167\u016c\u0170\u0175\u0179"+
		"\u0198\u019c\u019f\u01a2\u01a6\u01ac\u01b1\u01b6\u01ba\u01be\u01c1\u01c6"+
		"\u01ca\u01ce\u01d1\u01d9\u01dc\u01e1\u01e5\u01e9\u01ec\u01f1\u01f5\u01f9"+
		"\u020e\u0216\u021e\u022c\u022f\u0234";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}