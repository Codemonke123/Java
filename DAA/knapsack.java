package DAA;

import java.util.Arrays;
import java.util.Scanner;

public class knapsack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for the number of items
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        
        // Prompt for the number of items (m) - if it's not used, you can remove this
        System.out.print("Enter the value of m (not used in this code): ");
        int m = sc.nextInt();
        
        float w[] = new float[n]; 
        float p[] = new float[n]; 
        
        // Input weights
        System.out.println("Enter the weights of the items:");
        for(int i = 0; i < n; i++) {
            System.out.print("Weight of item " + (i + 1) + ": ");
            w[i] = sc.nextFloat();
        }
        
        // Input profits
        System.out.println("Enter the profits of the items:");
        for(int i = 0; i < n; i++) {
            System.out.print("Profit of item " + (i + 1) + ": ");
            p[i] = sc.nextFloat();
        }
        
        float ratio[] = new float[n];
        
        // Calculate profit-to-weight ratios
        for(int i = 0; i < n; i++) { 
            if (w[i] != 0) {
                ratio[i] = p[i] / w[i];
            } else {
                ratio[i] = 0; // Handle division by zero
            }
        }
        
        // Sort ratios in descending order
        Arrays.sort(ratio);
        
        // Print the ratios in descending order
        System.out.println("Profit-to-weight ratios in descending order:");
        for(int i = n - 1; i >= 0; i--) {
            System.out.println(ratio[i]);
        }
        
        sc.close();
    }
    
}
