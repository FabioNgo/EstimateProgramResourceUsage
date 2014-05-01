/* Generated By:JavaCC: Do not edit this line. RulesReader.java */
package core.rules;

import core.checker.*;

import java.io.*;
import java.util.Vector;

/**
 * Grammar to parse Java version 1.5
 * @author Sreenivasa Viswanadha - Simplified and enhanced for 1.5
 */
public class RulesReader implements RulesReaderConstants {
  public final Vector<Rule > rules = new Vector<Rule >();
  public RulesReader(String fileName)
   {
      this(System.in);
      try { ReInit(new FileInputStream(new File(fileName))); }
      catch(Exception e) { e.printStackTrace(); }
   }

/*****************************************
 * THE RULES FILE GRAMMAR STARTS HERE *
 *****************************************/
  final public void CompilationUnit() throws ParseException {
  Rule r;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      r = RuleDeclaration();
      if (r!=null)
        rules.add(r);
    }
    jj_consume_token(0);
  }

  final public Rule RuleDeclaration() throws ParseException {
  String name;
  boolean active;
  Vector < String > args = new Vector < String > ();
  String s;
    name = RuleName();
    jj_consume_token(LPAREN);
    active = Active();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 30:
      jj_consume_token(30);
      s = Argument();
      args.add(s);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 30:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        jj_consume_token(30);
        s = Argument();
        args.add(s);
      }
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
    jj_consume_token(31);
    Rule r = new Rule(RuleType.valueOf(name), active, args);
    {if (true) return r;}
    throw new Error("Missing return statement in function");
  }

  final public String Argument() throws ParseException {
  Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL:
      t = jj_consume_token(STRING_LITERAL);
      break;
    case IDENTIFIER:
      t = jj_consume_token(IDENTIFIER);
      break;
    case INTEGER_LITERAL:
      t = jj_consume_token(INTEGER_LITERAL);
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

  final public String RuleName() throws ParseException {
  Token t;
    t = jj_consume_token(IDENTIFIER);
    {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

  final public boolean Active() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ACTIVE:
      jj_consume_token(ACTIVE);
    {if (true) return true;}
      break;
    case DEACTIVE:
      jj_consume_token(DEACTIVE);
    {if (true) return false;}
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public RulesReaderTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2000000,0x40000000,0x40000000,0x3004000,0x3000,};
   }

  /** Constructor with InputStream. */
  public RulesReader(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public RulesReader(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new RulesReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public RulesReader(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new RulesReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public RulesReader(RulesReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RulesReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[32];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 32; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
