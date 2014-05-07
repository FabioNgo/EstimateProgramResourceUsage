/* Generated By:JavaCC: Do not edit this line. RulesReaderConstants.java */
package core.rules;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface RulesReaderConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 9;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 10;
  /** RegularExpression Id. */
  int ACTIVE = 12;
  /** RegularExpression Id. */
  int DEACTIVE = 13;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 14;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 15;
  /** RegularExpression Id. */
  int HEX_LITERAL = 16;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 17;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 18;
  /** RegularExpression Id. */
  int DECIMAL_FLOATING_POINT_LITERAL = 19;
  /** RegularExpression Id. */
  int DECIMAL_EXPONENT = 20;
  /** RegularExpression Id. */
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 21;
  /** RegularExpression Id. */
  int HEXADECIMAL_EXPONENT = 22;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 23;
  /** RegularExpression Id. */
  int STRING_LITERAL = 24;
  /** RegularExpression Id. */
  int IDENTIFIER = 25;
  /** RegularExpression Id. */
  int LETTER = 26;
  /** RegularExpression Id. */
  int PART_LETTER = 27;
  /** RegularExpression Id. */
  int LPAREN = 28;
  /** RegularExpression Id. */
  int RPAREN = 29;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 1;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<token of kind 6>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 11>",
    "\"active\"",
    "\"deactive\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<DECIMAL_FLOATING_POINT_LITERAL>",
    "<DECIMAL_EXPONENT>",
    "<HEXADECIMAL_FLOATING_POINT_LITERAL>",
    "<HEXADECIMAL_EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<PART_LETTER>",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\";\"",
  };

}
