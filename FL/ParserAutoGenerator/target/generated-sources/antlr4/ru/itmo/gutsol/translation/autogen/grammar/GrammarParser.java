// Generated from ru/itmo/gutsol/translation/autogen/grammar/Grammar.g4 by ANTLR 4.3
package ru.itmo.gutsol.translation.autogen.grammar;
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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, SKP=9, 
		NON_TERMINAL=10, TERMINAL=11, MIXED_CASE=12, CODE=13, STRING=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'@header'", "'->'", "':'", "'['", "';'", "','", "'|'", "']'", 
		"'skip'", "NON_TERMINAL", "TERMINAL", "MIXED_CASE", "CODE", "STRING", 
		"WS"
	};
	public static final int
		RULE_gramm = 0, RULE_header = 1, RULE_nonTerminalRule = 2, RULE_nonTermProduction = 3, 
		RULE_nonTermVar = 4, RULE_inherited = 5, RULE_declAttrs = 6, RULE_arg = 7, 
		RULE_argType = 8, RULE_argName = 9, RULE_callAttrs = 10, RULE_terminalRule = 11, 
		RULE_termProduction = 12, RULE_synthesized = 13;
	public static final String[] ruleNames = {
		"gramm", "header", "nonTerminalRule", "nonTermProduction", "nonTermVar", 
		"inherited", "declAttrs", "arg", "argType", "argName", "callAttrs", "terminalRule", 
		"termProduction", "synthesized"
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
	public static class GrammContext extends ParserRuleContext {
		public TerminalRuleContext terminalRule(int i) {
			return getRuleContext(TerminalRuleContext.class,i);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public NonTerminalRuleContext nonTerminalRule(int i) {
			return getRuleContext(NonTerminalRuleContext.class,i);
		}
		public List<NonTerminalRuleContext> nonTerminalRule() {
			return getRuleContexts(NonTerminalRuleContext.class);
		}
		public List<TerminalRuleContext> terminalRule() {
			return getRuleContexts(TerminalRuleContext.class);
		}
		public GrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGramm(this);
		}
	}

	public final GrammContext gramm() throws RecognitionException {
		GrammContext _localctx = new GrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gramm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(28); header();
				}
			}

			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERMINAL) {
				{
				{
				setState(31); nonTerminalRule();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINAL) {
				{
				{
				setState(37); terminalRule();
				}
				}
				setState(42);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__7);
			setState(44); match(CODE);
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

	public static class NonTerminalRuleContext extends ParserRuleContext {
		public SynthesizedContext synthesized() {
			return getRuleContext(SynthesizedContext.class,0);
		}
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParser.NON_TERMINAL, 0); }
		public List<NonTermProductionContext> nonTermProduction() {
			return getRuleContexts(NonTermProductionContext.class);
		}
		public NonTermProductionContext nonTermProduction(int i) {
			return getRuleContext(NonTermProductionContext.class,i);
		}
		public InheritedContext inherited() {
			return getRuleContext(InheritedContext.class,0);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTerminalRule(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule() throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(NON_TERMINAL);
			setState(48);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(47); inherited();
				}
			}

			setState(51);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(50); synthesized();
				}
			}

			setState(53); match(T__5);
			setState(54); nonTermProduction();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55); match(T__1);
				setState(56); nonTermProduction();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(T__3);
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

	public static class NonTermProductionContext extends ParserRuleContext {
		public List<NonTermVarContext> nonTermVar() {
			return getRuleContexts(NonTermVarContext.class);
		}
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public NonTermVarContext nonTermVar(int i) {
			return getRuleContext(NonTermVarContext.class,i);
		}
		public NonTermProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTermProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTermProduction(this);
		}
	}

	public final NonTermProductionContext nonTermProduction() throws RecognitionException {
		NonTermProductionContext _localctx = new NonTermProductionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nonTermProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERMINAL || _la==TERMINAL) {
				{
				{
				setState(64); nonTermVar();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(70); match(CODE);
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

	public static class NonTermVarContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParser.NON_TERMINAL, 0); }
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public CallAttrsContext callAttrs() {
			return getRuleContext(CallAttrsContext.class,0);
		}
		public NonTermVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTermVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTermVar(this);
		}
	}

	public final NonTermVarContext nonTermVar() throws RecognitionException {
		NonTermVarContext _localctx = new NonTermVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nonTermVar);
		int _la;
		try {
			setState(78);
			switch (_input.LA(1)) {
			case TERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(TERMINAL);
				}
				break;
			case NON_TERMINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(NON_TERMINAL);
				setState(76);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(75); callAttrs();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InheritedContext extends ParserRuleContext {
		public DeclAttrsContext declAttrs() {
			return getRuleContext(DeclAttrsContext.class,0);
		}
		public InheritedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInherited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInherited(this);
		}
	}

	public final InheritedContext inherited() throws RecognitionException {
		InheritedContext _localctx = new InheritedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inherited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); declAttrs();
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

	public static class DeclAttrsContext extends ParserRuleContext {
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public DeclAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclAttrs(this);
		}
	}

	public final DeclAttrsContext declAttrs() throws RecognitionException {
		DeclAttrsContext _localctx = new DeclAttrsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__4);
			setState(83); arg();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(84); match(T__2);
				setState(85); arg();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91); match(T__0);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); argType();
			setState(94); argName();
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

	public static class ArgTypeContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParser.NON_TERMINAL, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public ArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgType(this);
		}
	}

	public final ArgTypeContext argType() throws RecognitionException {
		ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==NON_TERMINAL || _la==MIXED_CASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParser.NON_TERMINAL, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgName(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==NON_TERMINAL || _la==MIXED_CASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CallAttrsContext extends ParserRuleContext {
		public TerminalNode CODE(int i) {
			return getToken(GrammarParser.CODE, i);
		}
		public List<TerminalNode> CODE() { return getTokens(GrammarParser.CODE); }
		public CallAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallAttrs(this);
		}
	}

	public final CallAttrsContext callAttrs() throws RecognitionException {
		CallAttrsContext _localctx = new CallAttrsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(T__4);
			setState(101); match(CODE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(102); match(T__2);
				setState(103); match(CODE);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(T__0);
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

	public static class TerminalRuleContext extends ParserRuleContext {
		public List<TermProductionContext> termProduction() {
			return getRuleContexts(TermProductionContext.class);
		}
		public TerminalNode SKP() { return getToken(GrammarParser.SKP, 0); }
		public TermProductionContext termProduction(int i) {
			return getRuleContext(TermProductionContext.class,i);
		}
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminalRule(this);
		}
	}

	public final TerminalRuleContext terminalRule() throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_terminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(TERMINAL);
			setState(112); match(T__5);
			setState(113); termProduction();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(114); match(T__1);
				setState(115); termProduction();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(121); match(T__6);
				setState(122); match(SKP);
				}
			}

			setState(125); match(T__3);
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

	public static class TermProductionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TermProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermProduction(this);
		}
	}

	public final TermProductionContext termProduction() throws RecognitionException {
		TermProductionContext _localctx = new TermProductionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(STRING);
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

	public static class SynthesizedContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParser.NON_TERMINAL, 0); }
		public TerminalNode MIXED_CASE() { return getToken(GrammarParser.MIXED_CASE, 0); }
		public SynthesizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthesized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSynthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSynthesized(this);
		}
	}

	public final SynthesizedContext synthesized() throws RecognitionException {
		SynthesizedContext _localctx = new SynthesizedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_synthesized);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(T__6);
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==NON_TERMINAL || _la==MIXED_CASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\3\3\4\3\4\5\4\63\n"+
		"\4\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5"+
		"\7\5D\n\5\f\5\16\5G\13\5\3\5\5\5J\n\5\3\6\3\6\3\6\5\6O\n\6\5\6Q\n\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\r\3\r\5\r~\n\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3"+
		"\4\2\f\f\16\16\u0086\2\37\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\bE\3\2\2\2\n"+
		"P\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20_\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26"+
		"f\3\2\2\2\30q\3\2\2\2\32\u0081\3\2\2\2\34\u0083\3\2\2\2\36 \5\4\3\2\37"+
		"\36\3\2\2\2\37 \3\2\2\2 $\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3"+
		"\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3\2\2\2\')\5\30\r\2(\'\3\2\2\2),\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-.\7\3\2\2./\7\17\2\2/\5\3\2"+
		"\2\2\60\62\7\f\2\2\61\63\5\f\7\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2"+
		"\2\2\64\66\5\34\17\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\5"+
		"\2\28=\5\b\5\29:\7\t\2\2:<\5\b\5\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>@\3\2\2\2?=\3\2\2\2@A\7\7\2\2A\7\3\2\2\2BD\5\n\6\2CB\3\2\2\2DG\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\7\17\2\2IH\3\2\2\2IJ"+
		"\3\2\2\2J\t\3\2\2\2KQ\7\r\2\2LN\7\f\2\2MO\5\26\f\2NM\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PK\3\2\2\2PL\3\2\2\2Q\13\3\2\2\2RS\5\16\b\2S\r\3\2\2\2TU\7\6"+
		"\2\2UZ\5\20\t\2VW\7\b\2\2WY\5\20\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\n\2\2^\17\3\2\2\2_`\5\22\n\2`a\5\24"+
		"\13\2a\21\3\2\2\2bc\t\2\2\2c\23\3\2\2\2de\t\2\2\2e\25\3\2\2\2fg\7\6\2"+
		"\2gl\7\17\2\2hi\7\b\2\2ik\7\17\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\7\n\2\2p\27\3\2\2\2qr\7\r\2\2rs\7\5\2\2sx\5"+
		"\32\16\2tu\7\t\2\2uw\5\32\16\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y}\3\2\2\2zx\3\2\2\2{|\7\4\2\2|~\7\13\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\7\2\2\u0080\31\3\2\2\2\u0081\u0082\7\20\2\2\u0082\33"+
		"\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0085\t\2\2\2\u0085\35\3\2\2\2\20\37"+
		"$*\62\65=EINPZlx}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}