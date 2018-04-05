// Generated from ru/itmo/gutsol/translation/autogen/grammar/Grammar.g4 by ANTLR 4.3
package ru.itmo.gutsol.translation.autogen.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, SKP=9, 
		NON_TERMINAL=10, TERMINAL=11, MIXED_CASE=12, CODE=13, STRING=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SKP", 
		"NON_TERMINAL", "TERMINAL", "MIXED_CASE", "CODE", "STRING", "WS"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13@\n\13\f\13\16\13C\13\13\3\f\3\f"+
		"\7\fG\n\f\f\f\16\fJ\13\f\3\r\3\r\7\rN\n\r\f\r\16\rQ\13\r\3\16\3\16\6\16"+
		"U\n\16\r\16\16\16V\3\16\5\16Z\n\16\7\16\\\n\16\f\16\16\16_\13\16\3\16"+
		"\3\16\3\17\3\17\7\17e\n\17\f\17\16\17h\13\17\3\17\3\17\3\20\6\20m\n\20"+
		"\r\20\16\20n\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21\3\2\n\3\2c|\6\2\62;C\\aac|\3\2C\\\5"+
		"\2\62;C\\aa\4\2C\\c|\4\2}}\177\177\4\2\f\f~~\5\2\13\f\17\17\"\"y\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7"+
		",\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3"+
		"\2\2\2\238\3\2\2\2\25=\3\2\2\2\27D\3\2\2\2\31K\3\2\2\2\33R\3\2\2\2\35"+
		"b\3\2\2\2\37l\3\2\2\2!\"\7B\2\2\"#\7j\2\2#$\7g\2\2$%\7c\2\2%&\7f\2\2&"+
		"\'\7g\2\2\'(\7t\2\2(\4\3\2\2\2)*\7/\2\2*+\7@\2\2+\6\3\2\2\2,-\7<\2\2-"+
		"\b\3\2\2\2./\7]\2\2/\n\3\2\2\2\60\61\7=\2\2\61\f\3\2\2\2\62\63\7.\2\2"+
		"\63\16\3\2\2\2\64\65\7~\2\2\65\20\3\2\2\2\66\67\7_\2\2\67\22\3\2\2\28"+
		"9\7u\2\29:\7m\2\2:;\7k\2\2;<\7r\2\2<\24\3\2\2\2=A\t\2\2\2>@\t\3\2\2?>"+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\26\3\2\2\2CA\3\2\2\2DH\t\4\2\2"+
		"EG\t\5\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\30\3\2\2\2JH\3\2\2"+
		"\2KO\t\6\2\2LN\t\3\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\32\3\2"+
		"\2\2QO\3\2\2\2R]\7}\2\2SU\n\7\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XZ\5\33\16\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[T\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\177\2\2a\34\3\2"+
		"\2\2bf\7$\2\2ce\n\b\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2"+
		"\2\2hf\3\2\2\2ij\7$\2\2j\36\3\2\2\2km\t\t\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2op\3\2\2\2pq\b\20\2\2q \3\2\2\2\13\2AHOVY]fn\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}