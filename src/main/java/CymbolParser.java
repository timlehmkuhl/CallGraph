// Generated from G:/InfProjekte/CallGraph/src/main/java\Cymbol.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, K_FLOAT=24, 
		K_INT=25, K_VOID=26, ID=27, INT=28, WS=29, SL_COMMENT=30;
	public static final int
		RULE_file = 0, RULE_varDecl = 1, RULE_type = 2, RULE_functionDecl = 3, 
		RULE_formalParameters = 4, RULE_formalParameter = 5, RULE_block = 6, RULE_stat = 7, 
		RULE_expr = 8, RULE_exprList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "varDecl", "type", "functionDecl", "formalParameters", "formalParameter", 
			"block", "stat", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", 
			"'return'", "'['", "']'", "'-'", "'!'", "'*'", "'/'", "'+'", "'=='", 
			"'!='", "'<'", "'>'", "'>='", "'<='", "'float'", "'int'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"K_FLOAT", "K_INT", "K_VOID", "ID", "INT", "WS", "SL_COMMENT"
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
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(21);
					varDecl();
					}
					break;
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID))) != 0) );
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			type();
			setState(27);
			match(ID);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(28);
				match(T__0);
				setState(29);
				expr(0);
				}
			}

			setState(32);
			match(T__1);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_FLOAT() { return getToken(CymbolParser.K_FLOAT, 0); }
		public TerminalNode K_INT() { return getToken(CymbolParser.K_INT, 0); }
		public TerminalNode K_VOID() { return getToken(CymbolParser.K_VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			type();
			setState(37);
			match(ID);
			setState(38);
			match(T__2);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID))) != 0)) {
				{
				setState(39);
				formalParameters();
				}
			}

			setState(42);
			match(T__3);
			setState(43);
			block();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			formalParameter();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(46);
				match(T__4);
				setState(47);
				formalParameter();
				}
				}
				setState(52);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			type();
			setState(54);
			match(ID);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << K_FLOAT) | (1L << K_INT) | (1L << K_VOID) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(57);
				stat();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__6);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonReturnContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public NonReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterNonReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitNonReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitNonReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new NonReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				block();
				}
				break;
			case 2:
				_localctx = new NonReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				varDecl();
				}
				break;
			case 3:
				_localctx = new NonReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__7);
				setState(68);
				expr(0);
				setState(69);
				stat();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(70);
					match(T__8);
					setState(71);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__9);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(75);
					expr(0);
					}
				}

				setState(78);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new NonReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				expr(0);
				setState(80);
				match(T__0);
				setState(81);
				expr(0);
				setState(82);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new NonReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				expr(0);
				setState(85);
				match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonCallExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TerminalNode INT() { return getToken(CymbolParser.INT, 0); }
		public NonCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterNonCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitNonCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitNonCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				match(ID);
				setState(91);
				match(T__2);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(92);
					exprList();
					}
				}

				setState(95);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new NonCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(T__12);
				setState(97);
				expr(13);
				}
				break;
			case 3:
				{
				_localctx = new NonCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__13);
				setState(99);
				expr(12);
				}
				break;
			case 4:
				{
				_localctx = new NonCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new NonCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new NonCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__2);
				setState(103);
				expr(0);
				setState(104);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(115);
						match(T__17);
						setState(116);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						match(T__18);
						setState(119);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(121);
						match(T__19);
						setState(122);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						match(T__20);
						setState(125);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						match(T__21);
						setState(128);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(130);
						match(T__22);
						setState(131);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new NonCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(133);
						match(T__10);
						setState(134);
						expr(0);
						setState(135);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expr(0);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(143);
				match(T__4);
				setState(144);
				expr(0);
				}
				}
				setState(149);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\63\n\6\f\6"+
		"\16\6\66\13\6\3\7\3\7\3\7\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tK\n\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\5\n`\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3\13\7\13\u0094"+
		"\n\13\f\13\16\13\u0097\13\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\5"+
		"\3\2\32\34\3\2\21\22\4\2\17\17\23\23\2\u00ab\2\30\3\2\2\2\4\34\3\2\2\2"+
		"\6$\3\2\2\2\b&\3\2\2\2\n/\3\2\2\2\f\67\3\2\2\2\16:\3\2\2\2\20Y\3\2\2\2"+
		"\22l\3\2\2\2\24\u0090\3\2\2\2\26\31\5\b\5\2\27\31\5\4\3\2\30\26\3\2\2"+
		"\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3\2\2"+
		"\2\34\35\5\6\4\2\35 \7\35\2\2\36\37\7\3\2\2\37!\5\22\n\2 \36\3\2\2\2 "+
		"!\3\2\2\2!\"\3\2\2\2\"#\7\4\2\2#\5\3\2\2\2$%\t\2\2\2%\7\3\2\2\2&\'\5\6"+
		"\4\2\'(\7\35\2\2(*\7\5\2\2)+\5\n\6\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7"+
		"\6\2\2-.\5\16\b\2.\t\3\2\2\2/\64\5\f\7\2\60\61\7\7\2\2\61\63\5\f\7\2\62"+
		"\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66"+
		"\64\3\2\2\2\678\5\6\4\289\7\35\2\29\r\3\2\2\2:>\7\b\2\2;=\5\20\t\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\t\2\2B\17"+
		"\3\2\2\2CZ\5\16\b\2DZ\5\4\3\2EF\7\n\2\2FG\5\22\n\2GJ\5\20\t\2HI\7\13\2"+
		"\2IK\5\20\t\2JH\3\2\2\2JK\3\2\2\2KZ\3\2\2\2LN\7\f\2\2MO\5\22\n\2NM\3\2"+
		"\2\2NO\3\2\2\2OP\3\2\2\2PZ\7\4\2\2QR\5\22\n\2RS\7\3\2\2ST\5\22\n\2TU\7"+
		"\4\2\2UZ\3\2\2\2VW\5\22\n\2WX\7\4\2\2XZ\3\2\2\2YC\3\2\2\2YD\3\2\2\2YE"+
		"\3\2\2\2YL\3\2\2\2YQ\3\2\2\2YV\3\2\2\2Z\21\3\2\2\2[\\\b\n\1\2\\]\7\35"+
		"\2\2]_\7\5\2\2^`\5\24\13\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2am\7\6\2\2bc\7"+
		"\17\2\2cm\5\22\n\17de\7\20\2\2em\5\22\n\16fm\7\35\2\2gm\7\36\2\2hi\7\5"+
		"\2\2ij\5\22\n\2jk\7\6\2\2km\3\2\2\2l[\3\2\2\2lb\3\2\2\2ld\3\2\2\2lf\3"+
		"\2\2\2lg\3\2\2\2lh\3\2\2\2m\u008d\3\2\2\2no\f\r\2\2op\t\3\2\2p\u008c\5"+
		"\22\n\16qr\f\f\2\2rs\t\4\2\2s\u008c\5\22\n\rtu\f\13\2\2uv\7\24\2\2v\u008c"+
		"\5\22\n\fwx\f\n\2\2xy\7\25\2\2y\u008c\5\22\n\13z{\f\t\2\2{|\7\26\2\2|"+
		"\u008c\5\22\n\n}~\f\b\2\2~\177\7\27\2\2\177\u008c\5\22\n\t\u0080\u0081"+
		"\f\7\2\2\u0081\u0082\7\30\2\2\u0082\u008c\5\22\n\b\u0083\u0084\f\6\2\2"+
		"\u0084\u0085\7\31\2\2\u0085\u008c\5\22\n\7\u0086\u0087\f\20\2\2\u0087"+
		"\u0088\7\r\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\16\2\2\u008a\u008c\3"+
		"\2\2\2\u008bn\3\2\2\2\u008bq\3\2\2\2\u008bt\3\2\2\2\u008bw\3\2\2\2\u008b"+
		"z\3\2\2\2\u008b}\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0083\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\23\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0095\5\22\n\2\u0091\u0092"+
		"\7\7\2\2\u0092\u0094\5\22\n\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\20\30\32 *\64>JNY_l\u008b\u008d\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}