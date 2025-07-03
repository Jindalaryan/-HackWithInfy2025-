package GreedyApproach;

import java.util.Arrays;

public class TwoChoclates {
    

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = prices[0] + prices[1];
        if (total <= money) {
            return money - total;
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 2, 5, 7};
        int money = 10;

        int result = buyChoco(prices, money);
        System.out.println(result);
    }
}

    