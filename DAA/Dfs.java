package DAA;

import java.util.Scanner;

public class Dfs {
    static int n;
    static int[][] A = new int[100][100];
    static int[] reach = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        n = sc.nextInt();

        
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        
        for (int i = 0; i < n; i++) {
            reach[i] = 0;
        }

        
        System.out.println("DFS traversal:");
        dfs(0);

        sc.close();
    }

    static void dfs(int v) {
        reach[v] = 1;
        for (int i = 0; i < n; i++) {
            if (A[v][i] == 1 && reach[i] == 0) {
                System.out.println(v + " --> " + i);
                dfs(i);
            }
        }
    }
}
