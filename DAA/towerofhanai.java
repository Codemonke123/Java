package DAA;

import java.util.Scanner;

public class towerofhanai {
    public static void tower (int n, char a, char c, char b) {
        if (n == 1) {
            System.out.println("Move the disk from " + a+" to " + c);
            return;
        }
        tower (n-1, a, b, c);
        System.out.println("Move the disk from " + a + " to " + c);
        tower(n-1, b, c, a);
    }
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        tower (n, 'x', 'y', 'z');
        sc.close();
    }
}
