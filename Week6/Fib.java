package Week6;

public class Fib {
    static int[] iterative_fib(int n) {
        int nums[] = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums;
    }

    static int recursive_fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursive_fib(n - 2) + recursive_fib(n - 1);
        }
    }

    static void print_array(int[] n) {
        for (int i = 0; i <= n.length - 1; i++) {
            System.out.print(n[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        // int[] itf = iterative_fib(10);
        // print_array(itf);

        for (int i = 0; i <= 10; i++) {
            System.out.print(recursive_fib(i) + " ");
        }
    }
}
