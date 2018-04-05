// Generated from /home/ksenia/workspace/itmo/antlr/src/main/antlr4/Pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, TYPE=11, WORD=12, NUMBER=13, READ=14, WRITE=15, WRITE_ARGUMENT=16, 
		MATH_ARGUMENT=17, MATH_OPERATION=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"WS", "TYPE", "WORD", "NUMBER", "READ", "WRITE", "WRITE_ARGUMENT", "MATH_ARGUMENT", 
		"MATH_OPERATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "';'", "'begin'", "'end.'", "':='", "'('", "');'", 
		"','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS", "TYPE", 
		"WORD", "NUMBER", "READ", "WRITE", "WRITE_ARGUMENT", "MATH_ARGUMENT", 
		"MATH_OPERATION"
	};
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fa\n\f\3\r\3\r\7\re\n\r\f\r\16"+
		"\rh\13\r\3\16\6\16k\n\16\r\16\16\16l\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17y\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008f"+
		"\n\21\3\22\3\22\5\22\u0093\n\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2"+
		"\7\4\2\13\f\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2,-//\61\61\2\u009f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\67\3\2\2\2\13<\3"+
		"\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27`"+
		"\3\2\2\2\31b\3\2\2\2\33j\3\2\2\2\35x\3\2\2\2\37\u0086\3\2\2\2!\u008e\3"+
		"\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'(\7r\2\2()\7t\2\2)*\7q\2\2*+\7i"+
		"\2\2+,\7t\2\2,-\7c\2\2-.\7o\2\2.\4\3\2\2\2/\60\7=\2\2\60\6\3\2\2\2\61"+
		"\62\7d\2\2\62\63\7g\2\2\63\64\7i\2\2\64\65\7k\2\2\65\66\7p\2\2\66\b\3"+
		"\2\2\2\678\7g\2\289\7p\2\29:\7f\2\2:;\7\60\2\2;\n\3\2\2\2<=\7<\2\2=>\7"+
		"?\2\2>\f\3\2\2\2?@\7*\2\2@\16\3\2\2\2AB\7+\2\2BC\7=\2\2C\20\3\2\2\2DE"+
		"\7.\2\2E\22\3\2\2\2FG\7+\2\2G\24\3\2\2\2HI\t\2\2\2IJ\3\2\2\2JK\b\13\2"+
		"\2K\26\3\2\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2OP\7g\2\2PQ\7i\2\2Qa\7t\2\2R"+
		"S\7t\2\2ST\7g\2\2TU\7c\2\2Ua\7n\2\2VW\7f\2\2WX\7q\2\2XY\7w\2\2YZ\7d\2"+
		"\2Z[\7n\2\2[a\7g\2\2\\]\7e\2\2]^\7j\2\2^_\7c\2\2_a\7t\2\2`L\3\2\2\2`R"+
		"\3\2\2\2`V\3\2\2\2`\\\3\2\2\2a\30\3\2\2\2bf\t\3\2\2ce\t\4\2\2dc\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\32\3\2\2\2hf\3\2\2\2ik\t\5\2\2ji\3\2"+
		"\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\34\3\2\2\2no\7t\2\2op\7g\2\2pq\7c"+
		"\2\2qy\7f\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2vw\7n\2\2wy\7p\2\2xn"+
		"\3\2\2\2xr\3\2\2\2y\36\3\2\2\2z{\7y\2\2{|\7t\2\2|}\7k\2\2}~\7v\2\2~\u0087"+
		"\7g\2\2\177\u0080\7y\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0087\7p\2\2\u0086"+
		"z\3\2\2\2\u0086\177\3\2\2\2\u0087 \3\2\2\2\u0088\u008f\5\31\r\2\u0089"+
		"\u008f\5\33\16\2\u008a\u008b\7)\2\2\u008b\u008c\5\31\r\2\u008c\u008d\7"+
		")\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008f\"\3\2\2\2\u0090\u0093\5\31\r\2\u0091\u0093\5\33\16"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\t\6\2\2\u0095&\3\2\2\2\n\2`flx\u0086\u008e\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}