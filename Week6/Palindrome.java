package Week6;

public class Palindrome {
    //// Create a recursion method to check for Palindrome
    static boolean palcheck(String s, int st, int e) {
        if (st == e) {
            return true;
        }
        if (s.charAt(st) != s.charAt(e)) {
            return false;
        }
        else if (st < e + 1) {
            return palcheck(s, st + 1, e - 1);
        }
        return true;
    }

    static boolean pal(String s) {
        int n = s.length();

        if (n == 0) {
            return true;
        }
        else {
            return palcheck(s, 0, n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pal("racecar"));
    }
}


//! Due Date : 24 March 2024 @ 23.59
