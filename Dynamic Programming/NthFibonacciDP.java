import java.util.Scanner;

public class NthFibonacciDP {
    public static int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input: n
        System.out.println(nthFibonacci(n));  // Output: nth Fibonacci number
    }
}