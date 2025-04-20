package DAA;

import java.util.Scanner;

public class OptimalSolutionForMaximumProfit {
    public static int knapsack(int W, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0; // Base case
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        
        int[] weights = new int[n];
        int[] values = new int[n];
        
        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        
        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        
        System.out.print("Enter the maximum weight capacity of the knapsack: ");
        int W = sc.nextInt();
        
        int maxProfit = knapsack(W, weights, values, n);
        System.out.println("Maximum profit: " + maxProfit);
        
        sc.close();
    }
}
