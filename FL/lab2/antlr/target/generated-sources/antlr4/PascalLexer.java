// Generated from Pascal.g4 by ANTLR 4.3
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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, WS=8, IF_LITERAL=9, 
		DO_LITERAL=10, THEN=11, ELSE_LITERAL=12, WHILE_LITERAL=13, TYPE=14, WRITELN=15, 
		WRITE=16, READ=17, OB=18, CB=19, SEMI=20, LOGIC_OPERATION=21, MATH_OPERATION=22, 
		NUMBER=23, WORD=24, STRING_LITERAL=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", "IF_LITERAL", 
		"DO_LITERAL", "THEN", "ELSE_LITERAL", "WHILE_LITERAL", "TYPE", "WRITELN", 
		"WRITE", "READ", "OB", "CB", "SEMI", "LOGIC_OPERATION", "MATH_OPERATION", 
		"NUMBER", "WORD", "STRING_LITERAL"
	};


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0086\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0092\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a1\n\26\3\27\3\27\3\30\6\30\u00a6"+
		"\n\30\r\30\16\30\u00a7\3\31\3\31\7\31\u00ac\n\31\f\31\16\31\u00af\13\31"+
		"\3\32\3\32\7\32\u00b3\n\32\f\32\16\32\u00b6\13\32\3\32\3\32\3\u00b4\2"+
		"\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\4\2\13\f"+
		"\"\"\5\2,-//\61\61\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\u00c0\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7<\3\2\2\2\tB\3\2\2\2\13F\3\2"+
		"\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23P\3\2\2\2\25S\3\2\2\2\27V\3"+
		"\2\2\2\31[\3\2\2\2\33`\3\2\2\2\35f\3\2\2\2\37n\3\2\2\2!\u0085\3\2\2\2"+
		"#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u00a0\3"+
		"\2\2\2-\u00a2\3\2\2\2/\u00a5\3\2\2\2\61\u00a9\3\2\2\2\63\u00b0\3\2\2\2"+
		"\65\66\7<\2\2\66\67\7?\2\2\67\4\3\2\2\289\7x\2\29:\7c\2\2:;\7t\2\2;\6"+
		"\3\2\2\2<=\7d\2\2=>\7g\2\2>?\7i\2\2?@\7k\2\2@A\7p\2\2A\b\3\2\2\2BC\7g"+
		"\2\2CD\7p\2\2DE\7f\2\2E\n\3\2\2\2FG\7<\2\2G\f\3\2\2\2HI\7.\2\2I\16\3\2"+
		"\2\2JK\7\60\2\2K\20\3\2\2\2LM\t\2\2\2MN\3\2\2\2NO\b\t\2\2O\22\3\2\2\2"+
		"PQ\7k\2\2QR\7h\2\2R\24\3\2\2\2ST\7f\2\2TU\7q\2\2U\26\3\2\2\2VW\7v\2\2"+
		"WX\7j\2\2XY\7g\2\2YZ\7p\2\2Z\30\3\2\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^"+
		"_\7g\2\2_\32\3\2\2\2`a\7y\2\2ab\7j\2\2bc\7k\2\2cd\7n\2\2de\7g\2\2e\34"+
		"\3\2\2\2fg\7k\2\2gh\7p\2\2hi\7v\2\2ij\7g\2\2jk\7i\2\2kl\7g\2\2lm\7t\2"+
		"\2m\36\3\2\2\2no\7y\2\2op\7t\2\2pq\7k\2\2qr\7v\2\2rs\7g\2\2st\7n\2\2t"+
		"u\7p\2\2uv\7*\2\2vw\7+\2\2wx\7=\2\2x \3\2\2\2yz\7y\2\2z{\7t\2\2{|\7k\2"+
		"\2|}\7v\2\2}\u0086\7g\2\2~\177\7y\2\2\177\u0080\7t\2\2\u0080\u0081\7k"+
		"\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0086"+
		"\7p\2\2\u0085y\3\2\2\2\u0085~\3\2\2\2\u0086\"\3\2\2\2\u0087\u0088\7t\2"+
		"\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u0092\7f\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7c\2\2\u008e\u008f\7f\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0092\7p\2\2\u0091\u0087\3\2\2\2\u0091\u008b\3\2\2"+
		"\2\u0092$\3\2\2\2\u0093\u0094\7*\2\2\u0094&\3\2\2\2\u0095\u0096\7+\2\2"+
		"\u0096(\3\2\2\2\u0097\u0098\7=\2\2\u0098*\3\2\2\2\u0099\u00a1\4>@\2\u009a"+
		"\u009b\7@\2\2\u009b\u00a1\7?\2\2\u009c\u009d\7>\2\2\u009d\u00a1\7?\2\2"+
		"\u009e\u009f\7#\2\2\u009f\u00a1\7?\2\2\u00a0\u0099\3\2\2\2\u00a0\u009a"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1,\3\2\2\2\u00a2"+
		"\u00a3\t\3\2\2\u00a3.\3\2\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\60"+
		"\3\2\2\2\u00a9\u00ad\t\5\2\2\u00aa\u00ac\t\6\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\62\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b3\13\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7)\2\2\u00b8\64\3\2\2\2"+
		"\t\2\u0085\u0091\u00a0\u00a7\u00ad\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}