// Generated from ru/itmo/ctddev/sorokin/parsing/pfunc/grammar/PFunc.g4 by ANTLR 4.3
package ru.itmo.ctddev.sorokin.parsing.pfunc.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PFuncParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEW_LINE=2, EQ=3, DISJ=4, COLON=5, LPAR=6, RPAR=7, ARROW=8, RUN=9, 
		DATA_KEYWORD=10, LITERAL=11;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'\n'", "'='", "'|'", "':'", "'('", "')'", "'->'", 
		"'>'", "'data'", "LITERAL"
	};
	public static final int
		RULE_program = 0, RULE_entity = 1, RULE_dataDeclaration = 2, RULE_dataConstructor = 3, 
		RULE_variableDeclaration = 4, RULE_type = 5, RULE_atomType = 6, RULE_variableAssignment = 7, 
		RULE_pattern = 8, RULE_expression = 9, RULE_atomExpression = 10, RULE_runExpression = 11, 
		RULE_placeholder = 12;
	public static final String[] ruleNames = {
		"program", "entity", "dataDeclaration", "dataConstructor", "variableDeclaration", 
		"type", "atomType", "variableAssignment", "pattern", "expression", "atomExpression", 
		"runExpression", "placeholder"
	};

	@Override
	public String getGrammarFileName() { return "PFunc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PFuncParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW_LINE) | (1L << RUN) | (1L << DATA_KEYWORD) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(26); entity();
				}
				}
				setState(31);
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

	public static class EntityContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public PlaceholderContext placeholder() {
			return getRuleContext(PlaceholderContext.class,0);
		}
		public RunExpressionContext runExpression() {
			return getRuleContext(RunExpressionContext.class,0);
		}
		public DataDeclarationContext dataDeclaration() {
			return getRuleContext(DataDeclarationContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); dataDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); variableDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); variableAssignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35); placeholder();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36); runExpression();
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

	public static class DataDeclarationContext extends ParserRuleContext {
		public TerminalNode DATA_KEYWORD() { return getToken(PFuncParser.DATA_KEYWORD, 0); }
		public TerminalNode DISJ(int i) {
			return getToken(PFuncParser.DISJ, i);
		}
		public List<TerminalNode> DISJ() { return getTokens(PFuncParser.DISJ); }
		public TerminalNode EQ() { return getToken(PFuncParser.EQ, 0); }
		public List<DataConstructorContext> dataConstructor() {
			return getRuleContexts(DataConstructorContext.class);
		}
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public TerminalNode NEW_LINE() { return getToken(PFuncParser.NEW_LINE, 0); }
		public DataConstructorContext dataConstructor(int i) {
			return getRuleContext(DataConstructorContext.class,i);
		}
		public DataDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterDataDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitDataDeclaration(this);
		}
	}

	public final DataDeclarationContext dataDeclaration() throws RecognitionException {
		DataDeclarationContext _localctx = new DataDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(DATA_KEYWORD);
			setState(40); match(LITERAL);
			setState(41); match(EQ);
			setState(42); dataConstructor();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJ) {
				{
				{
				setState(43); match(DISJ);
				setState(44); dataConstructor();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50); match(NEW_LINE);
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

	public static class DataConstructorContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public DataConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterDataConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitDataConstructor(this);
		}
	}

	public final DataConstructorContext dataConstructor() throws RecognitionException {
		DataConstructorContext _localctx = new DataConstructorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(LITERAL);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR || _la==LITERAL) {
				{
				{
				setState(53); type();
				}
				}
				setState(58);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PFuncParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public TerminalNode NEW_LINE() { return getToken(PFuncParser.NEW_LINE, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(LITERAL);
			setState(60); match(COLON);
			setState(61); type();
			setState(62); match(NEW_LINE);
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
		public AtomTypeContext atomType() {
			return getRuleContext(AtomTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PFuncParser.ARROW, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); atomType();
				setState(65); match(ARROW);
				setState(66); type();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); atomType();
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

	public static class AtomTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PFuncParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PFuncParser.RPAR, 0); }
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public AtomTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterAtomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitAtomType(this);
		}
	}

	public final AtomTypeContext atomType() throws RecognitionException {
		AtomTypeContext _localctx = new AtomTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atomType);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(LPAR);
				setState(72); type();
				setState(73); match(RPAR);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(LITERAL);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PFuncParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public TerminalNode NEW_LINE() { return getToken(PFuncParser.NEW_LINE, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(LITERAL);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR || _la==LITERAL) {
				{
				{
				setState(79); pattern();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(EQ);
			setState(86); expression();
			setState(87); match(NEW_LINE);
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

	public static class PatternContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(PFuncParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PFuncParser.RPAR, 0); }
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattern);
		int _la;
		try {
			setState(99);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(LITERAL);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(LPAR);
				setState(91); match(LITERAL);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR || _la==LITERAL) {
					{
					{
					setState(92); pattern();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98); match(RPAR);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AtomExpressionContext atomExpression(int i) {
			return getRuleContext(AtomExpressionContext.class,i);
		}
		public List<AtomExpressionContext> atomExpression() {
			return getRuleContexts(AtomExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(101); atomExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AtomExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PFuncParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PFuncParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(PFuncParser.LITERAL, 0); }
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitAtomExpression(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atomExpression);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); match(LITERAL);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(LPAR);
				setState(108); expression();
				setState(109); match(RPAR);
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

	public static class RunExpressionContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(PFuncParser.RUN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RunExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterRunExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitRunExpression(this);
		}
	}

	public final RunExpressionContext runExpression() throws RecognitionException {
		RunExpressionContext _localctx = new RunExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_runExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(RUN);
			setState(114); expression();
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

	public static class PlaceholderContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(PFuncParser.NEW_LINE, 0); }
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PFuncListener ) ((PFuncListener)listener).exitPlaceholder(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_placeholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(NEW_LINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\ry\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3\4"+
		"\3\4\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\7\tS\n\t\f\t\16\t"+
		"V\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n\3\n\5\n"+
		"f\n\n\3\13\6\13i\n\13\r\13\16\13j\3\f\3\f\3\f\3\f\3\f\5\fr\n\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2y\2\37"+
		"\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\66\3\2\2\2\n=\3\2\2\2\fG\3\2\2\2\16"+
		"N\3\2\2\2\20P\3\2\2\2\22e\3\2\2\2\24h\3\2\2\2\26q\3\2\2\2\30s\3\2\2\2"+
		"\32v\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"(\5\6\4\2#(\5\n\6\2$(\5\20\t\2%(\5\32"+
		"\16\2&(\5\30\r\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2"+
		"\2(\5\3\2\2\2)*\7\f\2\2*+\7\r\2\2+,\7\5\2\2,\61\5\b\5\2-.\7\6\2\2.\60"+
		"\5\b\5\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64\65\7\4\2\2\65\7\3\2\2\2\66:\7\r\2\2\679\5\f\7\28\67"+
		"\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<:\3\2\2\2=>\7\r\2\2"+
		">?\7\7\2\2?@\5\f\7\2@A\7\4\2\2A\13\3\2\2\2BC\5\16\b\2CD\7\n\2\2DE\5\f"+
		"\7\2EH\3\2\2\2FH\5\16\b\2GB\3\2\2\2GF\3\2\2\2H\r\3\2\2\2IJ\7\b\2\2JK\5"+
		"\f\7\2KL\7\t\2\2LO\3\2\2\2MO\7\r\2\2NI\3\2\2\2NM\3\2\2\2O\17\3\2\2\2P"+
		"T\7\r\2\2QS\5\22\n\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VT\3\2\2\2WX\7\5\2\2XY\5\24\13\2YZ\7\4\2\2Z\21\3\2\2\2[f\7\r\2\2\\]\7"+
		"\b\2\2]a\7\r\2\2^`\5\22\n\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd"+
		"\3\2\2\2ca\3\2\2\2df\7\t\2\2e[\3\2\2\2e\\\3\2\2\2f\23\3\2\2\2gi\5\26\f"+
		"\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\25\3\2\2\2lr\7\r\2\2mn\7\b"+
		"\2\2no\5\24\13\2op\7\t\2\2pr\3\2\2\2ql\3\2\2\2qm\3\2\2\2r\27\3\2\2\2s"+
		"t\7\13\2\2tu\5\24\13\2u\31\3\2\2\2vw\7\4\2\2w\33\3\2\2\2\r\37\'\61:GN"+
		"Taejq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}