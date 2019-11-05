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


        //System.out.println("\n" + ps.surroundMe("e lord of the rin", "Thgs"));
        //System.out.println("\n" + ps.endsMeet("Testing", 3));
        //System.out.println("\n" + ps.middleMan("t"));
        //System.out.println("\n" + ps.isCentered("123mid123", "mid"));
        //System.out.println("\n" + ps.countMe("The soda pop was taken by a cop", 'a'));
        System.out.println("\n" + ps.triplets("TTT This is a 900000 \\\\\\ test case /// www"));
        //System.out.println("\n" + ps.addMe("This 3 is a 3 test 49."));
        //System.out.println("\n" + ps.sequence("tjjjjjjjjjjt ttt ttttt Testing this ia pop quiz jjjj"));
        //System.out.println("\n" + ps.intertwine("ACEGIKMOQSUWY", "BDFHJLNPRTVXZ Now I know my ABC's"));
        //System.out.println("\n" + ps.isPalindrome("123racecar321"));

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

     public String surroundMe(String in, String out) {
        String newString = "in";
        if (in == null || out == null) {
            return in;
        } else if(out.length() != 4) {
            return in;
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
        String newString = text;
        if(text == null) {
            return text;
        } else if(text.length() < 1 || text.length() > 10) {
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
        String newString = text;
        if(text == null) {
            return text;
        } else if(text.length() < 3 || text.length() % 2 == 0) {
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
        ProblemSet5 ps = new ProblemSet5();
        if(text == null) {
            return false;
        } else if(text.length() < 3 || text.length() % 2 == 0) {
            return false;
        } else if (target == null) {
            return false;
        } else if (target.length() != 3) {
            return false;
        } else if (ps.middleMan(text).equals(target)) {
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
        int count = 0;
        for(int i = 0; i < text.length() - 2; i ++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == text.charAt(i + 1) && currentLetter == text.charAt(i + 2)) {
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
        long count = 1;
        long finalCount = 1;
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
        if(a == null || b == null) {
            return null;
        }
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
        for(int i = 0; i < text.length() / 2; i ++) {
            if(text.charAt(i) != (text.charAt(text.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
