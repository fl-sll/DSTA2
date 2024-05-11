package Week6;

public class Factorial {
    static int iterative_factorial(int n) {
        int i = 1;
        for (int j = 1; j <= n; j++) {
            i = i * j;
        }
        return i;
    }

    static int recursive_factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * recursive_factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int itf = iterative_factorial(5);
        int rcf = recursive_factorial(5);

        System.out.println(itf);
        System.out.println(rcf);
    }
}
