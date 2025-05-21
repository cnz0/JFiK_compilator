// Generated from d:/mein-craft/grammar/meincraft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class meincraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		TRUE=25, FALSE=26, AND=27, OR=28, XOR=29, NEG=30, STRING=31, ID=32, INT=33, 
		FLOAT=34, WS=35, LBRACK=36, RBRACK=37, COMMA=38;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_functionDef = 2, RULE_functionCall = 3, 
		RULE_paramList = 4, RULE_argList = 5, RULE_expr = 6, RULE_exprList = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "functionDef", "functionCall", "paramList", "argList", 
			"expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'private'", "'print'", "'read'", "'if'", "'('", 
			"')'", "'then:'", "'elif'", "'else:'", "'end'", "'for'", "'to'", "'do:'", 
			"'while'", "'return'", "'def'", "'as:'", "'=='", "'*'", "'/'", "'+'", 
			"'-'", "'true'", "'false'", "'AND'", "'OR'", "'XOR'", "'NEG'", null, 
			null, null, null, null, "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRUE", "FALSE", "AND", "OR", "XOR", "NEG", "STRING", "ID", "INT", 
			"FLOAT", "WS", "LBRACK", "RBRACK", "COMMA"
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
	public String getGrammarFileName() { return "meincraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public meincraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
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
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(meincraftParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(meincraftParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(meincraftParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(meincraftParser.RBRACK, i);
		}
		public ArrayAssignStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatContext extends StatContext {
		public List<TerminalNode> ID() { return getTokens(meincraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(meincraftParser.ID, i);
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
		public ForStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrivateAssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrivateAssignStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatContext extends StatContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatContext {
		public ExprContext cond;
		public StatContext stat;
		public List<StatContext> ifBranch = new ArrayList<StatContext>();
		public ExprContext expr;
		public List<ExprContext> elifCond = new ArrayList<ExprContext>();
		public List<StatContext> elifBranch = new ArrayList<StatContext>();
		public List<StatContext> elseBranch = new ArrayList<StatContext>();
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
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ReadStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefStatContext extends StatContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public FunctionDefStatContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__0);
				setState(23);
				expr(0);
				setState(24);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new PrivateAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__2);
				setState(27);
				match(ID);
				setState(28);
				match(T__0);
				setState(29);
				expr(0);
				setState(30);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__3);
				setState(33);
				expr(0);
				setState(34);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ReadStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(ID);
				setState(37);
				match(T__0);
				setState(38);
				match(T__4);
				setState(39);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ArrayAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(ID);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(41);
					match(LBRACK);
					setState(42);
					expr(0);
					setState(43);
					match(RBRACK);
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(49);
				match(T__0);
				setState(50);
				expr(0);
				setState(51);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__5);
				setState(54);
				match(T__6);
				setState(55);
				((IfStatContext)_localctx).cond = expr(0);
				setState(56);
				match(T__7);
				setState(57);
				match(T__8);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					((IfStatContext)_localctx).stat = stat();
					((IfStatContext)_localctx).ifBranch.add(((IfStatContext)_localctx).stat);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(63);
					match(T__9);
					setState(64);
					match(T__6);
					setState(65);
					((IfStatContext)_localctx).expr = expr(0);
					((IfStatContext)_localctx).elifCond.add(((IfStatContext)_localctx).expr);
					setState(66);
					match(T__7);
					setState(67);
					match(T__8);
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(68);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elifBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(71); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(78);
					match(T__10);
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(79);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elseBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(82); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
					}
				}

				setState(86);
				match(T__11);
				}
				break;
			case 7:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(T__12);
				setState(89);
				match(T__6);
				setState(90);
				match(ID);
				setState(91);
				match(T__0);
				setState(92);
				expr(0);
				setState(93);
				match(T__13);
				setState(94);
				match(ID);
				setState(95);
				match(T__0);
				setState(96);
				expr(0);
				setState(97);
				match(T__7);
				setState(98);
				match(T__14);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					stat();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
				setState(104);
				match(T__11);
				}
				break;
			case 8:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(T__15);
				setState(107);
				match(T__6);
				setState(108);
				expr(0);
				setState(109);
				match(T__7);
				setState(110);
				match(T__14);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					stat();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4295434328L) != 0) );
				setState(116);
				match(T__11);
				}
				break;
			case 9:
				_localctx = new FunctionDefStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				functionDef();
				}
				break;
			case 10:
				_localctx = new FunctionCallStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				functionCall();
				setState(120);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(122);
				match(T__16);
				setState(123);
				expr(0);
				setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__17);
			setState(129);
			match(ID);
			setState(130);
			match(T__6);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(131);
				paramList();
				}
			}

			setState(134);
			match(T__7);
			setState(135);
			match(T__18);
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(141);
				match(T__16);
				setState(142);
				expr(0);
				setState(143);
				match(T__1);
				}
			}

			setState(147);
			match(T__11);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(T__6);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 101032394912L) != 0)) {
				{
				setState(151);
				argList();
				}
			}

			setState(154);
			match(T__7);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(meincraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(meincraftParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(meincraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(meincraftParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				match(ID);
				}
				}
				setState(163);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(meincraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(meincraftParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expr(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				expr(0);
				}
				}
				setState(171);
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
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(meincraftParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(meincraftParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(meincraftParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(meincraftParser.FLOAT, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode XOR() { return getToken(meincraftParser.XOR, 0); }
		public XorExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEG() { return getToken(meincraftParser.NEG, 0); }
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ExprContext {
		public TerminalNode LBRACK() { return getToken(meincraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(meincraftParser.RBRACK, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(meincraftParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(meincraftParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(meincraftParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(meincraftParser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(meincraftParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(meincraftParser.RBRACK, i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadExprContext extends ExprContext {
		public ReadExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(meincraftParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				match(LBRACK);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 101032394912L) != 0)) {
					{
					setState(174);
					exprList();
					}
				}

				setState(177);
				match(RBRACK);
				}
				break;
			case 2:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				setState(186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182);
						match(LBRACK);
						setState(183);
						expr(0);
						setState(184);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(FLOAT);
				}
				break;
			case 9:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__6);
				setState(195);
				expr(0);
				setState(196);
				match(T__7);
				}
				break;
			case 11:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(202);
						match(T__19);
						setState(203);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(205);
						match(AND);
						setState(206);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(208);
						match(OR);
						setState(209);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new XorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(211);
						match(XOR);
						setState(212);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(214);
						match(T__20);
						setState(215);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(217);
						match(T__21);
						setState(218);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(220);
						match(T__22);
						setState(221);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(223);
						match(T__23);
						setState(224);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new NegExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(226);
						match(NEG);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(meincraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(meincraftParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expr(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				expr(0);
				}
				}
				setState(239);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		".\b\u0001\u000b\u0001\f\u0001/\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001<\b\u0001\u000b\u0001\f\u0001=\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001F\b\u0001"+
		"\u000b\u0001\f\u0001G\u0005\u0001J\b\u0001\n\u0001\f\u0001M\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001Q\b\u0001\u000b\u0001\f\u0001R\u0003\u0001"+
		"U\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001e\b\u0001\u000b\u0001"+
		"\f\u0001f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001q\b\u0001\u000b\u0001"+
		"\f\u0001r\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u007f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0085\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u008a\b"+
		"\u0002\u000b\u0002\f\u0002\u008b\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0092\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0099\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a0\b\u0004\n\u0004\f\u0004"+
		"\u00a3\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a8\b"+
		"\u0005\n\u0005\f\u0005\u00ab\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b0\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00bb\b\u0006\u000b\u0006\f\u0006\u00bc\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e4"+
		"\b\u0006\n\u0006\f\u0006\u00e7\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00ec\b\u0007\n\u0007\f\u0007\u00ef\t\u0007\u0001\u0007\u0000"+
		"\u0001\f\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000\u0117\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0002~\u0001\u0000\u0000\u0000\u0004\u0080"+
		"\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000\b\u009c\u0001"+
		"\u0000\u0000\u0000\n\u00a4\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000"+
		"\u0000\u0000\u000e\u00e8\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002"+
		"\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005 \u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\f\u0006\u0000"+
		"\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0005 \u0000\u0000\u001c"+
		"\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0003\f\u0006\u0000\u001e\u001f"+
		"\u0005\u0002\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000 !\u0005\u0004"+
		"\u0000\u0000!\"\u0003\f\u0006\u0000\"#\u0005\u0002\u0000\u0000#\u007f"+
		"\u0001\u0000\u0000\u0000$%\u0005 \u0000\u0000%&\u0005\u0001\u0000\u0000"+
		"&\'\u0005\u0005\u0000\u0000\'\u007f\u0005\u0002\u0000\u0000(-\u0005 \u0000"+
		"\u0000)*\u0005$\u0000\u0000*+\u0003\f\u0006\u0000+,\u0005%\u0000\u0000"+
		",.\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0005\u0001\u0000\u000023\u0003\f\u0006\u000034\u0005\u0002"+
		"\u0000\u00004\u007f\u0001\u0000\u0000\u000056\u0005\u0006\u0000\u0000"+
		"67\u0005\u0007\u0000\u000078\u0003\f\u0006\u000089\u0005\b\u0000\u0000"+
		"9;\u0005\t\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>K\u0001\u0000\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000AB\u0003\f\u0006\u0000BC\u0005\b\u0000\u0000CE\u0005\t\u0000\u0000"+
		"DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000I?\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LT\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NP\u0005\u000b\u0000\u0000OQ\u0003\u0002\u0001"+
		"\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TN\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0005\f\u0000\u0000W\u007f\u0001\u0000\u0000\u0000XY\u0005\r\u0000"+
		"\u0000YZ\u0005\u0007\u0000\u0000Z[\u0005 \u0000\u0000[\\\u0005\u0001\u0000"+
		"\u0000\\]\u0003\f\u0006\u0000]^\u0005\u000e\u0000\u0000^_\u0005 \u0000"+
		"\u0000_`\u0005\u0001\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005\b\u0000"+
		"\u0000bd\u0005\u000f\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\f\u0000\u0000i\u007f"+
		"\u0001\u0000\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0005\u0007\u0000"+
		"\u0000lm\u0003\f\u0006\u0000mn\u0005\b\u0000\u0000np\u0005\u000f\u0000"+
		"\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0005\f\u0000\u0000u\u007f\u0001\u0000\u0000\u0000"+
		"v\u007f\u0003\u0004\u0002\u0000wx\u0003\u0006\u0003\u0000xy\u0005\u0002"+
		"\u0000\u0000y\u007f\u0001\u0000\u0000\u0000z{\u0005\u0011\u0000\u0000"+
		"{|\u0003\f\u0006\u0000|}\u0005\u0002\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~\u0015\u0001\u0000\u0000\u0000~\u001a\u0001\u0000\u0000\u0000~"+
		" \u0001\u0000\u0000\u0000~$\u0001\u0000\u0000\u0000~(\u0001\u0000\u0000"+
		"\u0000~5\u0001\u0000\u0000\u0000~X\u0001\u0000\u0000\u0000~j\u0001\u0000"+
		"\u0000\u0000~v\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000~z\u0001"+
		"\u0000\u0000\u0000\u007f\u0003\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0012\u0000\u0000\u0081\u0082\u0005 \u0000\u0000\u0082\u0084\u0005\u0007"+
		"\u0000\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0089\u0005\u0013\u0000\u0000"+
		"\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0091\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u0011\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f"+
		"\u0090\u0005\u0002\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008d\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\f\u0000\u0000\u0094\u0005"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u0098\u0005"+
		"\u0007\u0000\u0000\u0097\u0099\u0003\n\u0005\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u0007\u0001\u0000\u0000"+
		"\u0000\u009c\u00a1\u0005 \u0000\u0000\u009d\u009e\u0005&\u0000\u0000\u009e"+
		"\u00a0\u0005 \u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\t\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a9\u0003\f\u0006\u0000\u00a5\u00a6\u0005&"+
		"\u0000\u0000\u00a6\u00a8\u0003\f\u0006\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u000b\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0006\uffff"+
		"\uffff\u0000\u00ad\u00af\u0005$\u0000\u0000\u00ae\u00b0\u0003\u000e\u0007"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00c8\u0005%\u0000\u0000"+
		"\u00b2\u00c8\u0005\u0019\u0000\u0000\u00b3\u00c8\u0005\u001a\u0000\u0000"+
		"\u00b4\u00c8\u0005\u001f\u0000\u0000\u00b5\u00ba\u0005 \u0000\u0000\u00b6"+
		"\u00b7\u0005$\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0000\u00b8\u00b9"+
		"\u0005%\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c8\u0001"+
		"\u0000\u0000\u0000\u00be\u00c8\u0003\u0006\u0003\u0000\u00bf\u00c8\u0005"+
		"!\u0000\u0000\u00c0\u00c8\u0005\"\u0000\u0000\u00c1\u00c8\u0005 \u0000"+
		"\u0000\u00c2\u00c3\u0005\u0007\u0000\u0000\u00c3\u00c4\u0003\f\u0006\u0000"+
		"\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0005\u0005\u0000\u0000\u00c7\u00ac\u0001\u0000\u0000\u0000\u00c7"+
		"\u00b2\u0001\u0000\u0000\u0000\u00c7\u00b3\u0001\u0000\u0000\u0000\u00c7"+
		"\u00b4\u0001\u0000\u0000\u0000\u00c7\u00b5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00be\u0001\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00e5\u0001\u0000\u0000\u0000\u00c9\u00ca\n\u0014\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0014\u0000\u0000\u00cb\u00e4\u0003\f\u0006\u0015\u00cc\u00cd\n"+
		"\u0012\u0000\u0000\u00cd\u00ce\u0005\u001b\u0000\u0000\u00ce\u00e4\u0003"+
		"\f\u0006\u0013\u00cf\u00d0\n\u0011\u0000\u0000\u00d0\u00d1\u0005\u001c"+
		"\u0000\u0000\u00d1\u00e4\u0003\f\u0006\u0012\u00d2\u00d3\n\u0010\u0000"+
		"\u0000\u00d3\u00d4\u0005\u001d\u0000\u0000\u00d4\u00e4\u0003\f\u0006\u0011"+
		"\u00d5\u00d6\n\u000b\u0000\u0000\u00d6\u00d7\u0005\u0015\u0000\u0000\u00d7"+
		"\u00e4\u0003\f\u0006\f\u00d8\u00d9\n\n\u0000\u0000\u00d9\u00da\u0005\u0016"+
		"\u0000\u0000\u00da\u00e4\u0003\f\u0006\u000b\u00db\u00dc\n\t\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0017\u0000\u0000\u00dd\u00e4\u0003\f\u0006\n\u00de"+
		"\u00df\n\b\u0000\u0000\u00df\u00e0\u0005\u0018\u0000\u0000\u00e0\u00e4"+
		"\u0003\f\u0006\t\u00e1\u00e2\n\u000f\u0000\u0000\u00e2\u00e4\u0005\u001e"+
		"\u0000\u0000\u00e3\u00c9\u0001\u0000\u0000\u0000\u00e3\u00cc\u0001\u0000"+
		"\u0000\u0000\u00e3\u00cf\u0001\u0000\u0000\u0000\u00e3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d5\u0001\u0000\u0000\u0000\u00e3\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e3\u00db\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\r\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ed\u0003\f\u0006\u0000\u00e9\u00ea\u0005&\u0000\u0000"+
		"\u00ea\u00ec\u0003\f\u0006\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u000f\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u0016\u0013/=GKRTfr~\u0084\u008b\u0091"+
		"\u0098\u00a1\u00a9\u00af\u00bc\u00c7\u00e3\u00e5\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}