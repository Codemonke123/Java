package DAA;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();
        
        int L[][] = new int[n][n];
        int D[][] = new int[n][n];
        
        System.out.println("Enter the adjacency matrix (use a large number for infinity):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                L[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = L[i][j];
            }
        }
        
        System.out.println("Original adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(L[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (D[i][j] > D[i][k] + D[k][j]) {
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
        
        System.out.println("Shortest path matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
