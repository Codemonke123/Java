package DAA;

import java.util.Scanner;

public class BinarySearch {
    public static int solve(int[] a, int key, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                return solve(a, key, mid + 1, right);
            } else {
                return solve(a, key, left, mid - 1);
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        
        
        int ans = solve(a, key, 0, n - 1);
        
        
        if (ans == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: " + ans);
        }
        
        sc.close();
    }
}
