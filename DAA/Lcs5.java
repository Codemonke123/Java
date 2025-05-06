package DAA;

import java.util.Scanner;

public class Lcs5 {

    static int[][] c = new int[100][100];
    static char[][] B = new char[100][100];
    static char[] X = new char[100];
    static char[] Y = new char[100];
    static int m, n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        X = scanner.next().toCharArray();
        System.out.print("Enter the value of Y: ");
        Y = scanner.next().toCharArray();
        LCS_length();
        scanner.close();
    }

    static void LCS_length() {
        m = X.length;
        n = Y.length;

        for (int i = 0; i <= m; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    B[i][j] = 'C';
                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    B[i][j] = 'V';
                } else {
                    c[i][j] = c[i][j - 1];
                    B[i][j] = 'L';
                }
            }
        }

        System.out.println("The value of LCS is: " + c[m][n]);
        System.out.print("The LCS is: ");
        print_LCS(m, n);
        System.out.println();
    }

    static void print_LCS(int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (B[i][j] == 'C') {
            print_LCS(i - 1, j - 1);
            System.out.print(X[i - 1]);
        } else if (B[i][j] == 'V') {
            print_LCS(i - 1, j);
        } else {
            print_LCS(i, j - 1);
        }
    }
}