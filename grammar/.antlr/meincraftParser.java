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
		T__17=18, T__18=19, T__19=20, TRUE=21, FALSE=22, AND=23, OR=24, XOR=25, 
		NEG=26, STRING=27, ID=28, INT=29, FLOAT=30, WS=31, LBRACK=32, RBRACK=33, 
		COMMA=34;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_exprList = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'print'", "'read'", "'if'", "'('", "')'", "'then:'", 
			"'elif'", "'else:'", "'end'", "'for'", "'to'", "'do:'", "'while'", "'=='", 
			"'*'", "'/'", "'+'", "'-'", "'true'", "'false'", "'AND'", "'OR'", "'XOR'", 
			"'NEG'", null, null, null, null, null, "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
			"AND", "OR", "XOR", "NEG", "STRING", "ID", "INT", "FLOAT", "WS", "LBRACK", 
			"RBRACK", "COMMA"
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
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
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(ID);
				setState(14);
				match(T__0);
				setState(15);
				expr(0);
				setState(16);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(T__2);
				setState(19);
				expr(0);
				setState(20);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ReadStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(ID);
				setState(23);
				match(T__0);
				setState(24);
				match(T__3);
				setState(25);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ArrayAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(ID);
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					match(LBRACK);
					setState(28);
					expr(0);
					setState(29);
					match(RBRACK);
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(35);
				match(T__0);
				setState(36);
				expr(0);
				setState(37);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(T__4);
				setState(40);
				match(T__5);
				setState(41);
				((IfStatContext)_localctx).cond = expr(0);
				setState(42);
				match(T__6);
				setState(43);
				match(T__7);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					((IfStatContext)_localctx).stat = stat();
					((IfStatContext)_localctx).ifBranch.add(((IfStatContext)_localctx).stat);
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(49);
					match(T__8);
					setState(50);
					match(T__5);
					setState(51);
					((IfStatContext)_localctx).expr = expr(0);
					((IfStatContext)_localctx).elifCond.add(((IfStatContext)_localctx).expr);
					setState(52);
					match(T__6);
					setState(53);
					match(T__7);
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(54);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elifBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(64);
					match(T__9);
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(65);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elseBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(68); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
					}
				}

				setState(72);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__11);
				setState(75);
				match(T__5);
				setState(76);
				match(ID);
				setState(77);
				match(T__0);
				setState(78);
				expr(0);
				setState(79);
				match(T__12);
				setState(80);
				match(ID);
				setState(81);
				match(T__0);
				setState(82);
				expr(0);
				setState(83);
				match(T__6);
				setState(84);
				match(T__13);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					stat();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
				setState(90);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__14);
				setState(93);
				match(T__5);
				setState(94);
				expr(0);
				setState(95);
				match(T__6);
				setState(96);
				match(T__13);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					stat();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 268472360L) != 0) );
				setState(102);
				match(T__10);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(107);
				match(LBRACK);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6314524752L) != 0)) {
					{
					setState(108);
					exprList();
					}
				}

				setState(111);
				match(RBRACK);
				}
				break;
			case 2:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(ID);
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(116);
						match(LBRACK);
						setState(117);
						expr(0);
						setState(118);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__5);
				setState(128);
				expr(0);
				setState(129);
				match(T__6);
				}
				break;
			case 10:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(135);
						match(T__15);
						setState(136);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(138);
						match(AND);
						setState(139);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(141);
						match(OR);
						setState(142);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new XorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(144);
						match(XOR);
						setState(145);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(147);
						match(T__16);
						setState(148);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(150);
						match(T__17);
						setState(151);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(153);
						match(T__18);
						setState(154);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(156);
						match(T__19);
						setState(157);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new NegExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(159);
						match(NEG);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expr(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				expr(0);
				}
				}
				setState(172);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001"+
		"!\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001.\b\u0001"+
		"\u000b\u0001\f\u0001/\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u00018\b\u0001\u000b\u0001\f\u00019\u0005"+
		"\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001C\b\u0001\u000b\u0001\f\u0001D\u0003\u0001G\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001W\b\u0001\u000b\u0001\f\u0001X\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001c\b\u0001\u000b\u0001\f\u0001d\u0001\u0001\u0001\u0001"+
		"\u0003\u0001i\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"n\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002y\b\u0002"+
		"\u000b\u0002\f\u0002z\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00a1\b\u0002\n\u0002\f\u0002\u00a4"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a9\b\u0003"+
		"\n\u0003\f\u0003\u00ac\t\u0003\u0001\u0003\u0000\u0001\u0004\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0000\u00cd\u0000\t\u0001\u0000\u0000\u0000\u0002"+
		"h\u0001\u0000\u0000\u0000\u0004\u0084\u0001\u0000\u0000\u0000\u0006\u00a5"+
		"\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0005\u001c\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0010"+
		"\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0002\u0000\u0000\u0011i\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0014\u0003"+
		"\u0004\u0002\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015i\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u001c\u0000\u0000\u0017\u0018\u0005\u0001"+
		"\u0000\u0000\u0018\u0019\u0005\u0004\u0000\u0000\u0019i\u0005\u0002\u0000"+
		"\u0000\u001a\u001f\u0005\u001c\u0000\u0000\u001b\u001c\u0005 \u0000\u0000"+
		"\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005!\u0000\u0000\u001e"+
		" \u0001\u0000\u0000\u0000\u001f\u001b\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003\u0004"+
		"\u0002\u0000%&\u0005\u0002\u0000\u0000&i\u0001\u0000\u0000\u0000\'(\u0005"+
		"\u0005\u0000\u0000()\u0005\u0006\u0000\u0000)*\u0003\u0004\u0002\u0000"+
		"*+\u0005\u0007\u0000\u0000+-\u0005\b\u0000\u0000,.\u0003\u0002\u0001\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000=\u0001\u0000\u0000\u000012\u0005\t\u0000"+
		"\u000023\u0005\u0006\u0000\u000034\u0003\u0004\u0002\u000045\u0005\u0007"+
		"\u0000\u000057\u0005\b\u0000\u000068\u0003\u0002\u0001\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;1\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>F\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0005\n\u0000"+
		"\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0005\u000b\u0000\u0000Ii\u0001\u0000\u0000"+
		"\u0000JK\u0005\f\u0000\u0000KL\u0005\u0006\u0000\u0000LM\u0005\u001c\u0000"+
		"\u0000MN\u0005\u0001\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005\r\u0000"+
		"\u0000PQ\u0005\u001c\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0003\u0004"+
		"\u0002\u0000ST\u0005\u0007\u0000\u0000TV\u0005\u000e\u0000\u0000UW\u0003"+
		"\u0002\u0001\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u000b\u0000\u0000[i\u0001\u0000\u0000\u0000\\]\u0005\u000f"+
		"\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0003\u0004\u0002\u0000_`\u0005"+
		"\u0007\u0000\u0000`b\u0005\u000e\u0000\u0000ac\u0003\u0002\u0001\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u000b"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000h\u0012"+
		"\u0001\u0000\u0000\u0000h\u0016\u0001\u0000\u0000\u0000h\u001a\u0001\u0000"+
		"\u0000\u0000h\'\u0001\u0000\u0000\u0000hJ\u0001\u0000\u0000\u0000h\\\u0001"+
		"\u0000\u0000\u0000i\u0003\u0001\u0000\u0000\u0000jk\u0006\u0002\uffff"+
		"\uffff\u0000km\u0005 \u0000\u0000ln\u0003\u0006\u0003\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0085"+
		"\u0005!\u0000\u0000p\u0085\u0005\u0015\u0000\u0000q\u0085\u0005\u0016"+
		"\u0000\u0000r\u0085\u0005\u001b\u0000\u0000sx\u0005\u001c\u0000\u0000"+
		"tu\u0005 \u0000\u0000uv\u0003\u0004\u0002\u0000vw\u0005!\u0000\u0000w"+
		"y\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0085\u0001"+
		"\u0000\u0000\u0000|\u0085\u0005\u001d\u0000\u0000}\u0085\u0005\u001e\u0000"+
		"\u0000~\u0085\u0005\u001c\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000"+
		"\u0080\u0081\u0003\u0004\u0002\u0000\u0081\u0082\u0005\u0007\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0004\u0000\u0000"+
		"\u0084j\u0001\u0000\u0000\u0000\u0084p\u0001\u0000\u0000\u0000\u0084q"+
		"\u0001\u0000\u0000\u0000\u0084r\u0001\u0000\u0000\u0000\u0084s\u0001\u0000"+
		"\u0000\u0000\u0084|\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000\u0000"+
		"\u0084~\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u00a2\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\n\u0013\u0000\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u00a1"+
		"\u0003\u0004\u0002\u0014\u0089\u008a\n\u0011\u0000\u0000\u008a\u008b\u0005"+
		"\u0017\u0000\u0000\u008b\u00a1\u0003\u0004\u0002\u0012\u008c\u008d\n\u0010"+
		"\u0000\u0000\u008d\u008e\u0005\u0018\u0000\u0000\u008e\u00a1\u0003\u0004"+
		"\u0002\u0011\u008f\u0090\n\u000f\u0000\u0000\u0090\u0091\u0005\u0019\u0000"+
		"\u0000\u0091\u00a1\u0003\u0004\u0002\u0010\u0092\u0093\n\n\u0000\u0000"+
		"\u0093\u0094\u0005\u0011\u0000\u0000\u0094\u00a1\u0003\u0004\u0002\u000b"+
		"\u0095\u0096\n\t\u0000\u0000\u0096\u0097\u0005\u0012\u0000\u0000\u0097"+
		"\u00a1\u0003\u0004\u0002\n\u0098\u0099\n\b\u0000\u0000\u0099\u009a\u0005"+
		"\u0013\u0000\u0000\u009a\u00a1\u0003\u0004\u0002\t\u009b\u009c\n\u0007"+
		"\u0000\u0000\u009c\u009d\u0005\u0014\u0000\u0000\u009d\u00a1\u0003\u0004"+
		"\u0002\b\u009e\u009f\n\u000e\u0000\u0000\u009f\u00a1\u0005\u001a\u0000"+
		"\u0000\u00a0\u0086\u0001\u0000\u0000\u0000\u00a0\u0089\u0001\u0000\u0000"+
		"\u0000\u00a0\u008c\u0001\u0000\u0000\u0000\u00a0\u008f\u0001\u0000\u0000"+
		"\u0000\u00a0\u0092\u0001\u0000\u0000\u0000\u00a0\u0095\u0001\u0000\u0000"+
		"\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u0005\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00aa\u0003\u0004\u0002\u0000\u00a6\u00a7\u0005\"\u0000\u0000"+
		"\u00a7\u00a9\u0003\u0004\u0002\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0007\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u0010\u000b!/9=DFXdhmz\u0084\u00a0"+
		"\u00a2\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}