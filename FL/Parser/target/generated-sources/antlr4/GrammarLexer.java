// Generated from Grammar.g4 by ANTLR 4.3
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
		T__0=1, WS=2, OB=3, CB=4, SEMI=5, OR=6, END=7, WORD=8, UN_OP=9, LIIERAL=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__0", "WS", "OB", "CB", "SEMI", "OR", "END", "WORD", "UN_OP", "LIIERAL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f?\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t\60\n\t\f\t\16\t\63\13\t\3\n\3\n\3\13"+
		"\3\13\7\139\n\13\f\13\16\13<\13\13\3\13\3\13\3:\2\f\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\3\2\6\4\2\13\f\"\"\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\4\2,-AA@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3"+
		"\27\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2"+
		"\17+\3\2\2\2\21-\3\2\2\2\23\64\3\2\2\2\25\66\3\2\2\2\27\30\7i\2\2\30\31"+
		"\7t\2\2\31\32\7c\2\2\32\33\7o\2\2\33\34\7o\2\2\34\35\7c\2\2\35\36\7t\2"+
		"\2\36\4\3\2\2\2\37 \t\2\2\2 !\3\2\2\2!\"\b\3\2\2\"\6\3\2\2\2#$\7*\2\2"+
		"$\b\3\2\2\2%&\7+\2\2&\n\3\2\2\2\'(\7<\2\2(\f\3\2\2\2)*\7~\2\2*\16\3\2"+
		"\2\2+,\7=\2\2,\20\3\2\2\2-\61\t\3\2\2.\60\t\4\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\22\3\2\2\2\63\61\3\2\2\2\64\65\t\5\2"+
		"\2\65\24\3\2\2\2\66:\7)\2\2\679\13\2\2\28\67\3\2\2\29<\3\2\2\2:;\3\2\2"+
		"\2:8\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7)\2\2>\26\3\2\2\2\5\2\61:\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}