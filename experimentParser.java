// Generated from experiment.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class experimentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NEWLINE=3, LE=4;
	public static final int
		RULE_prog = 0, RULE_em = 1, RULE_exf = 2, RULE_fex = 3, RULE_exl = 4, 
		RULE_ex = 5;
	public static final String[] ruleNames = {
		"prog", "em", "exf", "fex", "exl", "ex"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "NEWLINE", "LE"
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

	@Override
	public String getGrammarFileName() { return "experiment.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public experimentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<EmContext> em() {
			return getRuleContexts(EmContext.class);
		}
		public EmContext em(int i) {
			return getRuleContext(EmContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LE) {
				{
				{
				setState(12);
				em();
				setState(13);
				match(NEWLINE);
				}
				}
				setState(19);
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

	public static class EmContext extends ParserRuleContext {
		public ExfContext exf() {
			return getRuleContext(ExfContext.class,0);
		}
		public ExlContext exl() {
			return getRuleContext(ExlContext.class,0);
		}
		public EmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_em; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterEm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitEm(this);
		}
	}

	public final EmContext em() throws RecognitionException {
		EmContext _localctx = new EmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_em);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			exf();
			{
			setState(21);
			match(T__0);
			}
			setState(22);
			exl();
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

	public static class ExfContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public List<FexContext> fex() {
			return getRuleContexts(FexContext.class);
		}
		public FexContext fex(int i) {
			return getRuleContext(FexContext.class,i);
		}
		public ExfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExf(this);
		}
	}

	public final ExfContext exf() throws RecognitionException {
		ExfContext _localctx = new ExfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exf);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				ex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				ex();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(26);
					fex();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FexContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public FexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterFex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitFex(this);
		}
	}

	public final FexContext fex() throws RecognitionException {
		FexContext _localctx = new FexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			match(T__1);
			}
			setState(35);
			ex();
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

	public static class ExlContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public List<FexContext> fex() {
			return getRuleContexts(FexContext.class);
		}
		public FexContext fex(int i) {
			return getRuleContext(FexContext.class,i);
		}
		public ExlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExl(this);
		}
	}

	public final ExlContext exl() throws RecognitionException {
		ExlContext _localctx = new ExlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			ex();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(38);
				fex();
				}
				}
				setState(43);
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

	public static class ExContext extends ParserRuleContext {
		public List<TerminalNode> LE() { return getTokens(experimentParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(experimentParser.LE, i);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitEx(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(LE);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LE );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\5\4#\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\7\6\7\60\n\7\r\7\16\7\61"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\2\62\2\23\3\2\2\2\4\26\3\2\2\2\6\"\3\2\2\2\b"+
		"$\3\2\2\2\n\'\3\2\2\2\f/\3\2\2\2\16\17\5\4\3\2\17\20\7\5\2\2\20\22\3\2"+
		"\2\2\21\16\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2"+
		"\2\2\25\23\3\2\2\2\26\27\5\6\4\2\27\30\7\3\2\2\30\31\5\n\6\2\31\5\3\2"+
		"\2\2\32#\5\f\7\2\33\37\5\f\7\2\34\36\5\b\5\2\35\34\3\2\2\2\36!\3\2\2\2"+
		"\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!\37\3\2\2\2\"\32\3\2\2\2\"\33\3\2"+
		"\2\2#\7\3\2\2\2$%\7\4\2\2%&\5\f\7\2&\t\3\2\2\2\'+\5\f\7\2(*\5\b\5\2)("+
		"\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-+\3\2\2\2.\60\7\6\2"+
		"\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\r\3\2\2\2\7\23"+
		"\37\"+\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}