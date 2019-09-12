package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    /**
     * construct operand from string token.
     */
    private String token;

    public Operand(String token) {
        this.token = token;
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.token = value + "";
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return Integer.parseInt(token);
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        int length = token.length();
        if ( length <= 0)   {
            return false;
        }
        int isNegative = 0;
        if (length >= 2 && token.charAt(0) == '-') {
            isNegative = 1;
        }
        for(int i = isNegative; i< token.length(); i++) {
            char digit = token.charAt(i);
            if ( digit > '9' || digit < '0' ) {
                return false;
            }
        }
        return true;
    }
}
