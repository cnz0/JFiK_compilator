// Generated from grammar/meincraft.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class meincraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, TRUE=30, FALSE=31, AND=32, 
		OR=33, XOR=34, NEG=35, STRING=36, ID=37, INT=38, FLOAT=39, WS=40, LBRACK=41, 
		RBRACK=42, COMMA=43;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_functionDef = 2, RULE_functionCall = 3, 
		RULE_paramList = 4, RULE_argList = 5, RULE_structField = 6, RULE_expr = 7, 
		RULE_exprList = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "functionDef", "functionCall", "paramList", "argList", 
			"structField", "expr", "exprList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'private'", "'print'", "'read'", "'if'", "'('", 
			"')'", "'then:'", "'elif'", "'else:'", "'end'", "'for'", "'to'", "'do:'", 
			"'while'", "'struct'", "':'", "'return'", "'def'", "'as:'", "'=='", "'*'", 
			"'/'", "'+'", "'-'", "'.'", "'get'", "'set'", "'true'", "'false'", "'AND'", 
			"'OR'", "'XOR'", "'NEG'", null, null, null, null, null, "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TRUE", "FALSE", "AND", "OR", "XOR", 
			"NEG", "STRING", "ID", "INT", "FLOAT", "WS", "LBRACK", "RBRACK", "COMMA"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitArrayAssignStat(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrivateAssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrivateAssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitPrivateAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDefStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructDefStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitStructDefStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatContext extends StatContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFunctionCallStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatContext extends StatContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ReadStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitReadStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefStatContext extends StatContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public FunctionDefStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFunctionDefStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(ID);
				setState(24);
				match(T__0);
				setState(25);
				expr(0);
				setState(26);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new PrivateAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T__2);
				setState(29);
				match(ID);
				setState(30);
				match(T__0);
				setState(31);
				expr(0);
				setState(32);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(T__3);
				setState(35);
				expr(0);
				setState(36);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ReadStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(ID);
				setState(39);
				match(T__0);
				setState(40);
				match(T__4);
				setState(41);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ArrayAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(ID);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(LBRACK);
					setState(44);
					expr(0);
					setState(45);
					match(RBRACK);
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(51);
				match(T__0);
				setState(52);
				expr(0);
				setState(53);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(T__5);
				setState(56);
				match(T__6);
				setState(57);
				((IfStatContext)_localctx).cond = expr(0);
				setState(58);
				match(T__7);
				setState(59);
				match(T__8);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					((IfStatContext)_localctx).stat = stat();
					((IfStatContext)_localctx).ifBranch.add(((IfStatContext)_localctx).stat);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(65);
					match(T__9);
					setState(66);
					match(T__6);
					setState(67);
					((IfStatContext)_localctx).expr = expr(0);
					((IfStatContext)_localctx).elifCond.add(((IfStatContext)_localctx).expr);
					setState(68);
					match(T__7);
					setState(69);
					match(T__8);
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(70);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elifBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(73); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(80);
					match(T__10);
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(81);
						((IfStatContext)_localctx).stat = stat();
						((IfStatContext)_localctx).elseBranch.add(((IfStatContext)_localctx).stat);
						}
						}
						setState(84); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
					}
				}

				setState(88);
				match(T__11);
				}
				break;
			case 7:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(T__12);
				setState(91);
				match(T__6);
				setState(92);
				match(ID);
				setState(93);
				match(T__0);
				setState(94);
				expr(0);
				setState(95);
				match(T__13);
				setState(96);
				match(ID);
				setState(97);
				match(T__0);
				setState(98);
				expr(0);
				setState(99);
				match(T__7);
				setState(100);
				match(T__14);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					stat();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
				setState(106);
				match(T__11);
				}
				break;
			case 8:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(T__15);
				setState(109);
				match(T__6);
				setState(110);
				expr(0);
				setState(111);
				match(T__7);
				setState(112);
				match(T__14);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					stat();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137440731224L) != 0) );
				setState(118);
				match(T__11);
				}
				break;
			case 9:
				_localctx = new FunctionDefStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				functionDef();
				}
				break;
			case 10:
				_localctx = new FunctionCallStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				functionCall();
				setState(122);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new StructDefStatContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(124);
				match(T__16);
				setState(125);
				match(ID);
				setState(126);
				match(T__17);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(127);
					structField();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__11);
				}
				break;
			case 12:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(134);
				match(T__18);
				setState(135);
				expr(0);
				setState(136);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__19);
			setState(141);
			match(ID);
			setState(142);
			match(T__6);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(143);
				paramList();
				}
			}

			setState(146);
			match(T__7);
			setState(147);
			match(T__20);
			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(153);
				match(T__18);
				setState(154);
				expr(0);
				setState(155);
				match(T__1);
				}
			}

			setState(159);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(T__6);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3233036632224L) != 0)) {
				{
				setState(163);
				argList();
				}
			}

			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				match(ID);
				}
				}
				setState(175);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expr(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				expr(0);
				}
				}
				setState(183);
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
	public static class StructFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(T__0);
			setState(186);
			expr(0);
			setState(187);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(meincraftParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(meincraftParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(meincraftParser.FLOAT, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(meincraftParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitXorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructSetExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(meincraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(meincraftParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructSetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitStructSetExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEG() { return getToken(meincraftParser.NEG, 0); }
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ExprContext {
		public TerminalNode LBRACK() { return getToken(meincraftParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(meincraftParser.RBRACK, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(meincraftParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructGetExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(meincraftParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(meincraftParser.ID, i);
		}
		public StructGetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitStructGetExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadExprContext extends ExprContext {
		public ReadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(meincraftParser.INT, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitIntExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(LBRACK);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3233036632224L) != 0)) {
					{
					setState(191);
					exprList();
					}
				}

				setState(194);
				match(RBRACK);
				}
				break;
			case 2:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(ID);
				setState(203); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(199);
						match(LBRACK);
						setState(200);
						expr(0);
						setState(201);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new StructGetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				setState(208);
				match(T__26);
				setState(209);
				match(T__27);
				setState(210);
				match(T__6);
				setState(211);
				match(ID);
				setState(212);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new StructSetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(ID);
				setState(214);
				match(T__26);
				setState(215);
				match(T__28);
				setState(216);
				match(T__6);
				setState(217);
				match(ID);
				setState(218);
				match(T__0);
				setState(219);
				expr(0);
				setState(220);
				match(T__7);
				}
				break;
			case 8:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				functionCall();
				}
				break;
			case 9:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(FLOAT);
				}
				break;
			case 11:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(T__6);
				setState(227);
				expr(0);
				setState(228);
				match(T__7);
				}
				break;
			case 13:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(234);
						match(T__21);
						setState(235);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(237);
						match(AND);
						setState(238);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(240);
						match(OR);
						setState(241);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new XorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(243);
						match(XOR);
						setState(244);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(246);
						match(T__22);
						setState(247);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(249);
						match(T__23);
						setState(250);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(252);
						match(T__24);
						setState(253);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(255);
						match(T__25);
						setState(256);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new NegExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(258);
						match(NEG);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof meincraftVisitor ) return ((meincraftVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expr(0);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				expr(0);
				}
				}
				setState(271);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00010\b\u0001\u000b\u0001\f\u00011\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001>\b\u0001\u000b\u0001\f\u0001?\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"H\b\u0001\u000b\u0001\f\u0001I\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001S\b\u0001\u000b\u0001\f\u0001"+
		"T\u0003\u0001W\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001g\b\u0001"+
		"\u000b\u0001\f\u0001h\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001s\b\u0001"+
		"\u000b\u0001\f\u0001t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0081\b\u0001\n\u0001\f\u0001\u0084\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008b\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0096\b\u0002\u000b\u0002\f"+
		"\u0002\u0097\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u009e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00a5\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004\f\u0004\u00af\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b4\b\u0005\n\u0005\f\u0005"+
		"\u00b7\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c1\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u00cc\b\u0007\u000b\u0007\f\u0007"+
		"\u00cd\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00e8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0104"+
		"\b\u0007\n\u0007\f\u0007\u0107\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u010c\b\b\n\b\f\b\u010f\t\b\u0001\b\u0000\u0001\u000e\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0000\u013a\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0002\u008a\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000\u0000"+
		"\u0000\u0006\u00a1\u0001\u0000\u0000\u0000\b\u00a8\u0001\u0000\u0000\u0000"+
		"\n\u00b0\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e"+
		"\u00e7\u0001\u0000\u0000\u0000\u0010\u0108\u0001\u0000\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005%\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a"+
		"\u0003\u000e\u0007\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u008b"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0003\u0000\u0000\u001d\u001e"+
		"\u0005%\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003\u000e"+
		"\u0007\u0000 !\u0005\u0002\u0000\u0000!\u008b\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0004\u0000\u0000#$\u0003\u000e\u0007\u0000$%\u0005\u0002\u0000"+
		"\u0000%\u008b\u0001\u0000\u0000\u0000&\'\u0005%\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000()\u0005\u0005\u0000\u0000)\u008b\u0005\u0002\u0000\u0000"+
		"*/\u0005%\u0000\u0000+,\u0005)\u0000\u0000,-\u0003\u000e\u0007\u0000-"+
		".\u0005*\u0000\u0000.0\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0003\u000e"+
		"\u0007\u000056\u0005\u0002\u0000\u00006\u008b\u0001\u0000\u0000\u0000"+
		"78\u0005\u0006\u0000\u000089\u0005\u0007\u0000\u00009:\u0003\u000e\u0007"+
		"\u0000:;\u0005\b\u0000\u0000;=\u0005\t\u0000\u0000<>\u0003\u0002\u0001"+
		"\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@M\u0001\u0000\u0000\u0000AB\u0005"+
		"\n\u0000\u0000BC\u0005\u0007\u0000\u0000CD\u0003\u000e\u0007\u0000DE\u0005"+
		"\b\u0000\u0000EG\u0005\t\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KA\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NV\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0005"+
		"\u000b\u0000\u0000QS\u0003\u0002\u0001\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\f\u0000\u0000Y\u008b\u0001"+
		"\u0000\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0005\u0007\u0000\u0000\\"+
		"]\u0005%\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0003\u000e\u0007\u0000"+
		"_`\u0005\u000e\u0000\u0000`a\u0005%\u0000\u0000ab\u0005\u0001\u0000\u0000"+
		"bc\u0003\u000e\u0007\u0000cd\u0005\b\u0000\u0000df\u0005\u000f\u0000\u0000"+
		"eg\u0003\u0002\u0001\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0005\f\u0000\u0000k\u008b\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0010\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0003\u000e\u0007\u0000"+
		"op\u0005\b\u0000\u0000pr\u0005\u000f\u0000\u0000qs\u0003\u0002\u0001\u0000"+
		"rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\f\u0000"+
		"\u0000w\u008b\u0001\u0000\u0000\u0000x\u008b\u0003\u0004\u0002\u0000y"+
		"z\u0003\u0006\u0003\u0000z{\u0005\u0002\u0000\u0000{\u008b\u0001\u0000"+
		"\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u0005%\u0000\u0000~\u0082\u0005"+
		"\u0012\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008b\u0005\f\u0000"+
		"\u0000\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u0088\u0003\u000e\u0007"+
		"\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008a\u001c\u0001\u0000\u0000"+
		"\u0000\u008a\"\u0001\u0000\u0000\u0000\u008a&\u0001\u0000\u0000\u0000"+
		"\u008a*\u0001\u0000\u0000\u0000\u008a7\u0001\u0000\u0000\u0000\u008aZ"+
		"\u0001\u0000\u0000\u0000\u008al\u0001\u0000\u0000\u0000\u008ax\u0001\u0000"+
		"\u0000\u0000\u008ay\u0001\u0000\u0000\u0000\u008a|\u0001\u0000\u0000\u0000"+
		"\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u0003\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0014\u0000\u0000\u008d\u008e\u0005%\u0000\u0000\u008e"+
		"\u0090\u0005\u0007\u0000\u0000\u008f\u0091\u0003\b\u0004\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0095\u0005"+
		"\u0015\u0000\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009d\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0013\u0000\u0000\u009a\u009b\u0003"+
		"\u000e\u0007\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\f\u0000\u0000\u00a0\u0005\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005%"+
		"\u0000\u0000\u00a2\u00a4\u0005\u0007\u0000\u0000\u00a3\u00a5\u0003\n\u0005"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000"+
		"\u00a7\u0007\u0001\u0000\u0000\u0000\u00a8\u00ad\u0005%\u0000\u0000\u00a9"+
		"\u00aa\u0005+\u0000\u0000\u00aa\u00ac\u0005%\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003\u000e"+
		"\u0007\u0000\u00b1\u00b2\u0005+\u0000\u0000\u00b2\u00b4\u0003\u000e\u0007"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u000b\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005%\u0000\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000"+
		"\u00ba\u00bb\u0003\u000e\u0007\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000"+
		"\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\u0007\uffff\uffff\u0000"+
		"\u00be\u00c0\u0005)\u0000\u0000\u00bf\u00c1\u0003\u0010\b\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00e8\u0005*\u0000\u0000\u00c3\u00e8"+
		"\u0005\u001e\u0000\u0000\u00c4\u00e8\u0005\u001f\u0000\u0000\u00c5\u00e8"+
		"\u0005$\u0000\u0000\u00c6\u00cb\u0005%\u0000\u0000\u00c7\u00c8\u0005)"+
		"\u0000\u0000\u00c8\u00c9\u0003\u000e\u0007\u0000\u00c9\u00ca\u0005*\u0000"+
		"\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00e8\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005%\u0000\u0000\u00d0\u00d1\u0005\u001b\u0000\u0000"+
		"\u00d1\u00d2\u0005\u001c\u0000\u0000\u00d2\u00d3\u0005\u0007\u0000\u0000"+
		"\u00d3\u00d4\u0005%\u0000\u0000\u00d4\u00e8\u0005\b\u0000\u0000\u00d5"+
		"\u00d6\u0005%\u0000\u0000\u00d6\u00d7\u0005\u001b\u0000\u0000\u00d7\u00d8"+
		"\u0005\u001d\u0000\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00da"+
		"\u0005%\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0003"+
		"\u000e\u0007\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00e8\u0001\u0000"+
		"\u0000\u0000\u00de\u00e8\u0003\u0006\u0003\u0000\u00df\u00e8\u0005&\u0000"+
		"\u0000\u00e0\u00e8\u0005\'\u0000\u0000\u00e1\u00e8\u0005%\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0007\u0000\u0000\u00e3\u00e4\u0003\u000e\u0007\u0000"+
		"\u00e4\u00e5\u0005\b\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0005\u0005\u0000\u0000\u00e7\u00bd\u0001\u0000\u0000\u0000\u00e7"+
		"\u00c3\u0001\u0000\u0000\u0000\u00e7\u00c4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00e7\u00c6\u0001\u0000\u0000\u0000\u00e7"+
		"\u00cf\u0001\u0000\u0000\u0000\u00e7\u00d5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00de\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u0105\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u0016\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0016\u0000\u0000\u00eb\u0104\u0003\u000e\u0007\u0017\u00ec\u00ed"+
		"\n\u0014\u0000\u0000\u00ed\u00ee\u0005 \u0000\u0000\u00ee\u0104\u0003"+
		"\u000e\u0007\u0015\u00ef\u00f0\n\u0013\u0000\u0000\u00f0\u00f1\u0005!"+
		"\u0000\u0000\u00f1\u0104\u0003\u000e\u0007\u0014\u00f2\u00f3\n\u0012\u0000"+
		"\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u0104\u0003\u000e\u0007\u0013"+
		"\u00f5\u00f6\n\r\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7"+
		"\u0104\u0003\u000e\u0007\u000e\u00f8\u00f9\n\f\u0000\u0000\u00f9\u00fa"+
		"\u0005\u0018\u0000\u0000\u00fa\u0104\u0003\u000e\u0007\r\u00fb\u00fc\n"+
		"\u000b\u0000\u0000\u00fc\u00fd\u0005\u0019\u0000\u0000\u00fd\u0104\u0003"+
		"\u000e\u0007\f\u00fe\u00ff\n\n\u0000\u0000\u00ff\u0100\u0005\u001a\u0000"+
		"\u0000\u0100\u0104\u0003\u000e\u0007\u000b\u0101\u0102\n\u0011\u0000\u0000"+
		"\u0102\u0104\u0005#\u0000\u0000\u0103\u00e9\u0001\u0000\u0000\u0000\u0103"+
		"\u00ec\u0001\u0000\u0000\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103"+
		"\u00f2\u0001\u0000\u0000\u0000\u0103\u00f5\u0001\u0000\u0000\u0000\u0103"+
		"\u00f8\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103"+
		"\u00fe\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u000f\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u010d\u0003\u000e\u0007\u0000\u0109"+
		"\u010a\u0005+\u0000\u0000\u010a\u010c\u0003\u000e\u0007\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0011"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0017\u0015"+
		"1?IMTVht\u0082\u008a\u0090\u0097\u009d\u00a4\u00ad\u00b5\u00c0\u00cd\u00e7"+
		"\u0103\u0105\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}