import java.util.*;

public class MinCoinsDP {
    public static void main(String[] args) {
        int amount = 93;
        int[] coins = {1, 2, 5, 10, 20, 50, 100};

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); 
        dp[0] = 0; 

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] > amount) {
            System.out.println("It's not possible to make the amount with the given coins.");
        } else {
            System.out.println("Minimum Coins Needed: " + dp[amount]);
        }
    }
}
