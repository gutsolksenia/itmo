// Generated from Grammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, OB=3, CB=4, SEMI=5, OR=6, END=7, WORD=8, UN_OP=9, LIIERAL=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'grammar'", "WS", "'('", "')'", "':'", "'|'", "';'", "WORD", 
		"UN_OP", "LIIERAL"
	};
	public static final int
		RULE_grammr = 0, RULE_title = 1, RULE_notTerminal = 2, RULE_rul = 3, RULE_option = 4, 
		RULE_word = 5;
	public static final String[] ruleNames = {
		"grammr", "title", "notTerminal", "rul", "option", "word"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammrContext extends ParserRuleContext {
		public NotTerminalContext notTerminal(int i) {
			return getRuleContext(NotTerminalContext.class,i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<NotTerminalContext> notTerminal() {
			return getRuleContexts(NotTerminalContext.class);
		}
		public GrammrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGrammr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGrammr(this);
		}
	}

	public final GrammrContext grammr() throws RecognitionException {
		GrammrContext _localctx = new GrammrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); title();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(13); notTerminal();
				}
				}
				setState(18);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(T__0);
			setState(20); match(WORD);
			setState(21); match(END);
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

	public static class NotTerminalContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode SEMI() { return getToken(GrammarParser.SEMI, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<RulContext> rul() {
			return getRuleContexts(RulContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public RulContext rul(int i) {
			return getRuleContext(RulContext.class,i);
		}
		public NotTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNotTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNotTerminal(this);
		}
	}

	public final NotTerminalContext notTerminal() throws RecognitionException {
		NotTerminalContext _localctx = new NotTerminalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_notTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(WORD);
			setState(24); match(SEMI);
			setState(25); rul();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(26); match(OR);
				setState(27); rul();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); match(END);
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

	public static class RulContext extends ParserRuleContext {
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public RulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRul(this);
		}
	}

	public final RulContext rul() throws RecognitionException {
		RulContext _localctx = new RulContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35); option(0);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << WORD) | (1L << LIIERAL))) != 0) );
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

	public static class OptionContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public TerminalNode CB() { return getToken(GrammarParser.CB, 0); }
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public TerminalNode UN_OP() { return getToken(GrammarParser.UN_OP, 0); }
		public TerminalNode OB() { return getToken(GrammarParser.OB, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		return option(0);
	}

	private OptionContext option(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OptionContext _localctx = new OptionContext(_ctx, _parentState);
		OptionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_option, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case OB:
				{
				setState(41); match(OB);
				setState(42); option(0);
				setState(43); match(CB);
				}
				break;
			case WORD:
			case LIIERAL:
				{
				setState(46); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(45); word();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(48); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OptionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_option);
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53); match(UN_OP);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode LIIERAL() { return getToken(GrammarParser.LIIERAL, 0); }
		public TerminalNode UN_OP() { return getToken(GrammarParser.UN_OP, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(WORD);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(LIIERAL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(WORD);
				setState(62); match(UN_OP);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); match(LIIERAL);
				setState(64); match(UN_OP);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return option_sempred((OptionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean option_sempred(OptionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fF\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4\3"+
		"\4\3\5\6\5\'\n\5\r\5\16\5(\3\6\3\6\3\6\3\6\3\6\3\6\6\6\61\n\6\r\6\16\6"+
		"\62\5\6\65\n\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7D\n\7\3\7\2\3\n\b\2\4\6\b\n\f\2\2H\2\16\3\2\2\2\4\25\3\2\2\2\6\31"+
		"\3\2\2\2\b&\3\2\2\2\n\64\3\2\2\2\fC\3\2\2\2\16\22\5\4\3\2\17\21\5\6\4"+
		"\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2"+
		"\2\24\22\3\2\2\2\25\26\7\3\2\2\26\27\7\n\2\2\27\30\7\t\2\2\30\5\3\2\2"+
		"\2\31\32\7\n\2\2\32\33\7\7\2\2\33 \5\b\5\2\34\35\7\b\2\2\35\37\5\b\5\2"+
		"\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2"+
		"#$\7\t\2\2$\7\3\2\2\2%\'\5\n\6\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)\t\3\2\2\2*+\b\6\1\2+,\7\5\2\2,-\5\n\6\2-.\7\6\2\2.\65\3\2\2\2/\61"+
		"\5\f\7\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3"+
		"\2\2\2\64*\3\2\2\2\64\60\3\2\2\2\65:\3\2\2\2\66\67\f\4\2\2\679\7\13\2"+
		"\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2=D\7"+
		"\n\2\2>D\7\f\2\2?@\7\n\2\2@D\7\13\2\2AB\7\f\2\2BD\7\13\2\2C=\3\2\2\2C"+
		">\3\2\2\2C?\3\2\2\2CA\3\2\2\2D\r\3\2\2\2\t\22 (\62\64:C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}