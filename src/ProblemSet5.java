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
import java.lang.*;

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        System.out.println("\n" + ps.surroundMe("Hello", "John"));
        System.out.println("\n" + ps.endsMeet("123456789", 3));
        System.out.println("\n" + ps.middleMan("123mid123"));
        System.out.println("\n" + ps.isCentered("123mid123", "mid"));
        System.out.println("\n" + ps.countMe("This sentence ends in three eseS.", 's'));
        System.out.println("\n" + ps.triplets("aaaaa"));
        System.out.println("\n" + ps.addMe("This 3 is a 3 test 49."));
        System.out.println("\n" + ps.sequence("TTTTtT, this is a  sssSssequence of 5."));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
        String newString = (out.length() != 4) ? in :
        (in.equals(null) || out.equals(null)) ? in :
        out.substring(0, 2) + in + out.substring(2, 4);
        return newString;
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
        String newString = (text.equals(null)) ? text:
        (text.length() < 1 || text.length() > 10) ? text:
        (n < 1 || n > text.length()) ? text:
        text.substring(0, n) + text.substring(text.length() - n, text.length());
        return newString;
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
        String newString = (text.equals(null)) ? text:
        (text.length() < 3 || text.length() % 2 == 0) ? text:
        text.substring((int) Math.ceil(text.length() / 2) - 1,(int) Math.ceil(text.length() / 2) + 2);
        return newString;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
        ProblemSet5 ps = new ProblemSet5();
        boolean isCentered = (text.equals(null)) ? false:
        (text.length() < 3 || text.length() % 2 == 0) ? false:
        (target.equals(null)) ? false:
        (target.length() != 3) ? false:
        (ps.middleMan(text).equals(target)) ? true:
        false;
        return isCentered;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
        if(text.equals(null)) {
            return -1;
        } else if (!(Character.isLetter(suffix))) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < text.length() - 1; i ++) {
            if(text.charAt(i + 1) == ' ' || text.charAt(i + 1) == '.' || text.charAt(i + 1) == ',') {
                count = (text.charAt(i) == suffix) ? count + 1 : count;
            }
        }
        char lastChar = text.charAt(text.length() - 1);
        if(text.charAt(text.length() - 1) == suffix) {
            count ++;
        }
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
        if(text.equals(null)) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < text.length() - 2; i ++) {
            char currentLetter = text.charAt(i);
            count = (currentLetter == text.charAt(i + 1)) ? (currentLetter == text.charAt(i + 2)) ? count + 1 : count
            : count;
        }
        return count;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
        if(text.equals(null)) {
            return -1;
        }
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
        if(text.equals(null)) {
            return -1;
        }
        int count = 1;
        long finalCount = 0;
        char currentLetter = text.charAt(0);
        for(int i = 1; i < text.length(); i ++) {
            if(text.charAt(i) == currentLetter) {
                count += 1;
                if(count >= finalCount) {
                    finalCount = count;
                }
            } else {
                count = 1;
            }
            currentLetter = text.charAt(i);
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

        return "Hi";
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {

        return true;
    }
}
