package Week6;

public class Time {
    static int iterative_factorial(int n) {
        int i = 1;
        for(int j = 1; j <= n; j++) {
            i = i * j;
        }
        return i;
    }

    static int recursive_factorial(int n) {
        if (n==1) {
            return n;
        } else {
            return n * recursive_factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Runtime rt = Runtime.getRuntime();

        int itf = iterative_factorial(5);
        int rcf = recursive_factorial(5);

        System.out.println(itf);
        System.out.println(rcf);

        long end = System.currentTimeMillis();

        long timeElapsed = end - start;

        long total_mem = rt.totalMemory();
        long free_mem = rt.freeMemory();   
        long used_mem = total_mem - free_mem;
        
        System.out.println(timeElapsed);
        System.out.println(used_mem);
    }
    
}
