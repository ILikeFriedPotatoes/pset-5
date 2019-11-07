    /**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();
        System.out.println("\n" + ps.surroundMe("cde", "abfg"));
        System.out.println("\n" + ps.surroundMe(null, "####"));
        System.out.println("\n" + ps.surroundMe("####", null));
        System.out.println("\n" + ps.surroundMe("abc", "123"));

        System.out.println("\n" + "Exercise 2");

        System.out.println("\n" + ps.endsMeet("abcdefg", 2));
        System.out.println("\n" + ps.endsMeet(null, 2));
        System.out.println("\n" + ps.endsMeet("", 2));
        System.out.println("\n" + ps.endsMeet("abc", -1));

        System.out.println("\n" + "Exercise 3");

        System.out.println("\n" + ps.middleMan("abcdefg"));
        System.out.println("\n" + ps.middleMan(null));
        System.out.println("\n" + ps.middleMan("12"));
        System.out.println("\n" + ps.middleMan("a"));

        System.out.println("\n" + "Exercise 4");

        System.out.println("\n" + ps.isCentered("abcdefg", "cde"));
        System.out.println("\n" + ps.isCentered("abcdefg", "abc"));
        System.out.println("\n" + ps.isCentered(null, "abc"));
        System.out.println("\n" + ps.isCentered("abcd", "abc"));
        System.out.println("\n" + ps.isCentered("abc", null));
        System.out.println("\n" + ps.isCentered("abcdefg", "cd"));

        System.out.println("\n" + "Exercise 5");

        System.out.println("\n" + ps.countMe("I am an example sentence", 'e'));
        System.out.println("\n" + ps.countMe(null, 'a'));
        System.out.println("\n" + ps.countMe("abc$ def$", '$'));

        System.out.println("\n" + "Exercise 6");

        System.out.println("\n" + ps.triplets("aaabbbccc"));
        System.out.println("\n" + ps.triplets("aaaa"));
        System.out.println("\n" + ps.triplets("abc"));
        System.out.println("\n" + ps.triplets(null));

        System.out.println("\n" + "Exercise 7");

        System.out.println("\n" + ps.addMe("123 abc 123"));
        System.out.println("\n" + ps.addMe("abcdefghijk"));
        System.out.println("\n" + ps.addMe(null));

        System.out.println("\n" + "Exercise 8");

        System.out.println("\n" + ps.sequence("abbccccdddd"));
        System.out.println("\n" + ps.sequence("aAabBbBb"));
        System.out.println("\n" + ps.sequence(""));
        System.out.println("\n" + ps.sequence(null));

        System.out.println("\n" + "Exercise 9");
        System.out.println("\n" + "Exercise 10");

    }

    /*
    *
    * Unescapes the escape sequences in a strings
    *
    */
    public String unescapeString(String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <input.length(); i++) {
            switch (input.charAt(i)) {
                case '\t': sb.append("\\t"); break;
                case '\b': sb.append("\\b"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\f': sb.append("\\f"); break;
                case '\'': sb.append("\\\'"); break;
                case '\"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                default: sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

     public String surroundMe(String in, String out) {
        if (in == null) {
            return in;
        }
        in = unescapeString(in);
        String newString = in;
        if (out == null) {
            return newString;
        }
        out = unescapeString(out);
        if(out.length() != 4) {
            return newString;
        } else {
            newString = out.substring(0, 2) + in + out.substring(2, 4);
        }
        return newString;
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
        if(text == null) {
            return text;
        }
        text = unescapeString(text);
        String newString = text;
        if(text.length() < 1 || text.length() > 10) {
            return text;
        } else if (n < 1 || n > text.length()) {
            return text;
        } else {
            newString = text.substring(0, n) + text.substring(text.length() - n, text.length());
        }
        return newString;
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
        if(text == null) {
            return text;
        }
        text = unescapeString(text);
        String newString = text;
        if(text.length() < 3 || text.length() % 2 == 0) {
            return text;
        } else {
            newString = text.substring((int) Math.ceil(text.length() / 2) - 1,(int) Math.ceil(text.length() / 2) + 2);
        }
        return newString;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
        if(text == null || target == null) {
            return false;
        }
        text = unescapeString(text);
        target = unescapeString(target);
        if(text.length() < 3 || text.length() % 2 == 0) {
            return false;
        }
        String middleOfText = text.substring((int) Math.ceil(text.length() / 2) - 1,(int) Math.ceil(text.length() / 2)
         + 2);
        if (target.length() != 3) {
            return false;
        } else if (middleOfText.equals(target)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
        if(text == null) {
            return -1;
        } else if (!(Character.isLetter(suffix))) {
            return -1;
        }
        text = unescapeString(text);
        int count = 0;
        for(int i = 0; i < text.length() - 1; i ++) {
            if(text.charAt(i + 1) == ' ') {
                count = (text.charAt(i) == suffix) ? count + 1 : count;
            }
        }
        if(text.charAt(text.length() - 1) == suffix) {
            count ++;
        }
        char lastChar = text.charAt(text.length() - 1);
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
        if(text == null) {
            return -1;
        }
        text = unescapeString(text);
        int count = 0;
        for(int i = 0; i < text.length() - 2; i ++) {
            char currentCharacter = text.charAt(i);
            if(currentCharacter == text.charAt(i + 1) && currentCharacter == text.charAt(i + 2)) {
                count ++;
            }
        }
        return count;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
        if(text == null) {
            return -1;
        }
        text = unescapeString(text);
        long count = 0;
        for(int i = 0; i < text.length() - 1; i ++) {
            if(Character.isDigit(text.charAt(i))) {
                int digit = Character.getNumericValue(text.charAt(i));
                count += digit;
            }
        }
        return count;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
        if(text == null) {
            return -1;
        }
        if(text.length() == 0) {
            return 0;
        }
        text = unescapeString(text);
        long count = 1;
        long finalCount = 1;
        char currentCharacter = text.charAt(0);
        for(int i = 1; i < text.length(); i ++) {
            if(text.charAt(i) == currentCharacter) {
                count += 1;
                if(count >= finalCount) {
                    finalCount = count;
                }
            } else {
                count = 1;
            }
            currentCharacter = text.charAt(i);
        }
        return finalCount;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
        if(a == null || b == null) {
            return null;
        }
        a = unescapeString(a);
        b = unescapeString(b);
        String newString = "";
        int i;
        for(i = 0; i < a.length() && i < b.length(); i ++) {
            newString += a.charAt(i);
            newString += b.charAt(i);
        }
        if(a.length() > b.length()) {
            newString += a.substring(i, a.length());
        } else {
            newString += b.substring(i, b.length());
        }
        return newString;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
        if(text == null) {
            return false;
        }
        text = unescapeString(text);
        for(int i = 0; i < text.length() / 2; i ++) {
            if(text.charAt(i) != (text.charAt(text.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
