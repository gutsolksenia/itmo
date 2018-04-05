// Generated from Pascal.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, WS=8, IF_LITERAL=9, 
		DO_LITERAL=10, THEN=11, ELSE_LITERAL=12, WHILE_LITERAL=13, TYPE=14, WRITELN=15, 
		WRITE=16, READ=17, OB=18, CB=19, SEMI=20, LOGIC_OPERATION=21, MATH_OPERATION=22, 
		NUMBER=23, WORD=24, STRING_LITERAL=25;
	public static final String[] tokenNames = {
		"<INVALID>", "':='", "'var'", "'begin'", "'end'", "':'", "','", "'.'", 
		"WS", "'if'", "'do'", "'then'", "'else'", "'while'", "'integer'", "'writeln();'", 
		"WRITE", "READ", "'('", "')'", "';'", "LOGIC_OPERATION", "MATH_OPERATION", 
		"NUMBER", "WORD", "STRING_LITERAL"
	};
	public static final int
		RULE_programm = 0, RULE_variables = 1, RULE_main = 2, RULE_operation = 3, 
		RULE_whileCase = 4, RULE_variableDeclaration = 5, RULE_variablesList = 6, 
		RULE_assignment = 7, RULE_read = 8, RULE_readArgumentList = 9, RULE_write = 10, 
		RULE_writeArgumentList = 11, RULE_writeArgument = 12, RULE_math = 13, 
		RULE_mathArgument = 14, RULE_ifOp = 15, RULE_ifCase = 16, RULE_logic = 17, 
		RULE_elseCase = 18, RULE_codeBlock = 19;
	public static final String[] ruleNames = {
		"programm", "variables", "main", "operation", "whileCase", "variableDeclaration", 
		"variablesList", "assignment", "read", "readArgumentList", "write", "writeArgumentList", 
		"writeArgument", "math", "mathArgument", "ifOp", "ifCase", "logic", "elseCase", 
		"codeBlock"
	};

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); variables();
			setState(41); main();
			setState(42); match(T__0);
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

	public static class VariablesContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			setState(52);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(T__5);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WORD) {
					{
					{
					setState(46); variableDeclaration();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class MainContext extends ParserRuleContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(T__4);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << IF_LITERAL) | (1L << WHILE_LITERAL) | (1L << WRITELN) | (1L << WRITE) | (1L << READ) | (1L << WORD))) != 0)) {
				{
				{
				setState(55); operation();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); match(T__3);
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

	public static class OperationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ElseCaseContext elseCase() {
			return getRuleContext(ElseCaseContext.class,0);
		}
		public WhileCaseContext whileCase() {
			return getRuleContext(WhileCaseContext.class,0);
		}
		public IfOpContext ifOp() {
			return getRuleContext(IfOpContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); write();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); read();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); assignment();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(T__5);
				setState(67); variableDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); ifOp();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69); ifOp();
				setState(70); elseCase();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72); whileCase();
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

	public static class WhileCaseContext extends ParserRuleContext {
		public TerminalNode WHILE_LITERAL() { return getToken(PascalParser.WHILE_LITERAL, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode DO_LITERAL() { return getToken(PascalParser.DO_LITERAL, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWhileCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWhileCase(this);
		}
	}

	public final WhileCaseContext whileCase() throws RecognitionException {
		WhileCaseContext _localctx = new WhileCaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(WHILE_LITERAL);
			setState(76); logic();
			setState(77); match(DO_LITERAL);
			setState(78); codeBlock();
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
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public VariablesListContext variablesList() {
			return getRuleContext(VariablesListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); variablesList();
			setState(81); match(T__2);
			setState(82); match(TYPE);
			setState(83); match(SEMI);
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

	public static class VariablesListContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PascalParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PascalParser.WORD, i);
		}
		public VariablesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariablesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariablesList(this);
		}
	}

	public final VariablesListContext variablesList() throws RecognitionException {
		VariablesListContext _localctx = new VariablesListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variablesList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85); match(WORD);
					setState(86); match(T__1);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92); match(WORD);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PascalParser.WORD, 0); }
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(WORD);
			setState(95); match(T__6);
			setState(96); math(0);
			setState(97); match(SEMI);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public TerminalNode CB() { return getToken(PascalParser.CB, 0); }
		public TerminalNode READ() { return getToken(PascalParser.READ, 0); }
		public ReadArgumentListContext readArgumentList() {
			return getRuleContext(ReadArgumentListContext.class,0);
		}
		public TerminalNode OB() { return getToken(PascalParser.OB, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(READ);
			setState(100); match(OB);
			setState(101); readArgumentList();
			setState(102); match(CB);
			setState(103); match(SEMI);
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

	public static class ReadArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PascalParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PascalParser.WORD, i);
		}
		public ReadArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterReadArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitReadArgumentList(this);
		}
	}

	public final ReadArgumentListContext readArgumentList() throws RecognitionException {
		ReadArgumentListContext _localctx = new ReadArgumentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_readArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105); match(WORD);
					setState(106); match(T__1);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(112); match(WORD);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public WriteArgumentListContext writeArgumentList() {
			return getRuleContext(WriteArgumentListContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(PascalParser.WRITE, 0); }
		public TerminalNode CB() { return getToken(PascalParser.CB, 0); }
		public TerminalNode OB() { return getToken(PascalParser.OB, 0); }
		public TerminalNode WRITELN() { return getToken(PascalParser.WRITELN, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_write);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(WRITE);
				setState(115); match(OB);
				setState(116); writeArgumentList();
				setState(117); match(CB);
				setState(118); match(SEMI);
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(WRITELN);
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

	public static class WriteArgumentListContext extends ParserRuleContext {
		public WriteArgumentContext writeArgument(int i) {
			return getRuleContext(WriteArgumentContext.class,i);
		}
		public List<WriteArgumentContext> writeArgument() {
			return getRuleContexts(WriteArgumentContext.class);
		}
		public WriteArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWriteArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWriteArgumentList(this);
		}
	}

	public final WriteArgumentListContext writeArgumentList() throws RecognitionException {
		WriteArgumentListContext _localctx = new WriteArgumentListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writeArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); writeArgument();
					setState(124); match(T__1);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131); writeArgument();
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

	public static class WriteArgumentContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public WriteArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWriteArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWriteArgument(this);
		}
	}

	public final WriteArgumentContext writeArgument() throws RecognitionException {
		WriteArgumentContext _localctx = new WriteArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_writeArgument);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(STRING_LITERAL);
				}
				break;
			case OB:
			case NUMBER:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); math(0);
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

	public static class MathContext extends ParserRuleContext {
		public MathArgumentContext mathArgument() {
			return getRuleContext(MathArgumentContext.class,0);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public TerminalNode CB() { return getToken(PascalParser.CB, 0); }
		public TerminalNode MATH_OPERATION() { return getToken(PascalParser.MATH_OPERATION, 0); }
		public TerminalNode OB() { return getToken(PascalParser.OB, 0); }
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		return math(0);
	}

	private MathContext math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathContext _localctx = new MathContext(_ctx, _parentState);
		MathContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch (_input.LA(1)) {
			case NUMBER:
			case WORD:
				{
				setState(138); mathArgument();
				}
				break;
			case OB:
				{
				setState(139); match(OB);
				setState(140); math(0);
				setState(141); match(CB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math);
					setState(145);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(146); match(MATH_OPERATION);
					setState(147); math(2);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class MathArgumentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PascalParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(PascalParser.NUMBER, 0); }
		public MathArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMathArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMathArgument(this);
		}
	}

	public final MathArgumentContext mathArgument() throws RecognitionException {
		MathArgumentContext _localctx = new MathArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==WORD) ) {
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

	public static class IfOpContext extends ParserRuleContext {
		public IfCaseContext ifCase() {
			return getRuleContext(IfCaseContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfOp(this);
		}
	}

	public final IfOpContext ifOp() throws RecognitionException {
		IfOpContext _localctx = new IfOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); ifCase();
			setState(156); match(THEN);
			setState(157); codeBlock();
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

	public static class IfCaseContext extends ParserRuleContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode IF_LITERAL() { return getToken(PascalParser.IF_LITERAL, 0); }
		public IfCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfCase(this);
		}
	}

	public final IfCaseContext ifCase() throws RecognitionException {
		IfCaseContext _localctx = new IfCaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(IF_LITERAL);
			setState(160); logic();
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode LOGIC_OPERATION() { return getToken(PascalParser.LOGIC_OPERATION, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); math(0);
			setState(163); match(LOGIC_OPERATION);
			setState(164); math(0);
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

	public static class ElseCaseContext extends ParserRuleContext {
		public TerminalNode ELSE_LITERAL() { return getToken(PascalParser.ELSE_LITERAL, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterElseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitElseCase(this);
		}
	}

	public final ElseCaseContext elseCase() throws RecognitionException {
		ElseCaseContext _localctx = new ElseCaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(ELSE_LITERAL);
			setState(167); codeBlock();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_codeBlock);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); main();
				}
				break;
			case T__5:
			case IF_LITERAL:
			case WHILE_LITERAL:
			case WRITELN:
			case WRITE:
			case READ:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); operation();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return math_sempred((MathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sempred(MathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\5\3\67\n\3\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\7\r\u0081"+
		"\n\r\f\r\16\r\u0084\13\r\3\r\3\r\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0092\n\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17"+
		"\16\17\u009a\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25\u00ae\n\25\3\25\2\3\34\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\31\32\u00ac\2*\3"+
		"\2\2\2\4\66\3\2\2\2\68\3\2\2\2\bK\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16[\3"+
		"\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24o\3\2\2\2\26{\3\2\2\2\30\u0082\3\2\2"+
		"\2\32\u0089\3\2\2\2\34\u0091\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\""+
		"\u00a1\3\2\2\2$\u00a4\3\2\2\2&\u00a8\3\2\2\2(\u00ad\3\2\2\2*+\5\4\3\2"+
		"+,\5\6\4\2,-\7\t\2\2-\3\3\2\2\2.\67\3\2\2\2/\63\7\4\2\2\60\62\5\f\7\2"+
		"\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\66.\3\2\2\2\66/\3\2\2\2\67\5\3\2\2\28<\7\5\2\29;\5\b\5"+
		"\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\6\2"+
		"\2@\7\3\2\2\2AL\5\26\f\2BL\5\22\n\2CL\5\20\t\2DE\7\4\2\2EL\5\f\7\2FL\5"+
		" \21\2GH\5 \21\2HI\5&\24\2IL\3\2\2\2JL\5\n\6\2KA\3\2\2\2KB\3\2\2\2KC\3"+
		"\2\2\2KD\3\2\2\2KF\3\2\2\2KG\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\7\17\2\2N"+
		"O\5$\23\2OP\7\f\2\2PQ\5(\25\2Q\13\3\2\2\2RS\5\16\b\2ST\7\7\2\2TU\7\20"+
		"\2\2UV\7\26\2\2V\r\3\2\2\2WX\7\32\2\2XZ\7\b\2\2YW\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\32\2\2_\17\3\2\2\2`a\7\32"+
		"\2\2ab\7\3\2\2bc\5\34\17\2cd\7\26\2\2d\21\3\2\2\2ef\7\23\2\2fg\7\24\2"+
		"\2gh\5\24\13\2hi\7\25\2\2ij\7\26\2\2j\23\3\2\2\2kl\7\32\2\2ln\7\b\2\2"+
		"mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2"+
		"\2s\25\3\2\2\2tu\7\22\2\2uv\7\24\2\2vw\5\30\r\2wx\7\25\2\2xy\7\26\2\2"+
		"y|\3\2\2\2z|\7\21\2\2{t\3\2\2\2{z\3\2\2\2|\27\3\2\2\2}~\5\32\16\2~\177"+
		"\7\b\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\31\3\2\2\2\u0087\u008a\7\33\2\2\u0088\u008a\5\34"+
		"\17\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\33\3\2\2\2\u008b\u008c"+
		"\b\17\1\2\u008c\u0092\5\36\20\2\u008d\u008e\7\24\2\2\u008e\u008f\5\34"+
		"\17\2\u008f\u0090\7\25\2\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0092\u0098\3\2\2\2\u0093\u0094\f\3\2\2\u0094\u0095\7\30"+
		"\2\2\u0095\u0097\5\34\17\4\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\35\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009c\t\2\2\2\u009c\37\3\2\2\2\u009d\u009e\5\"\22\2\u009e\u009f"+
		"\7\r\2\2\u009f\u00a0\5(\25\2\u00a0!\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2"+
		"\u00a3\5$\23\2\u00a3#\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\27\2"+
		"\2\u00a6\u00a7\5\34\17\2\u00a7%\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa"+
		"\5(\25\2\u00aa\'\3\2\2\2\u00ab\u00ae\5\6\4\2\u00ac\u00ae\5\b\5\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae)\3\2\2\2\16\63\66<K[o{\u0082"+
		"\u0089\u0091\u0098\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}