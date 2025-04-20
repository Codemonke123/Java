package DAA;

import java.util.Scanner;

public class mergesort {
    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] left1 = new int[n1];
        int[] right1 = new int[n2];

        for (int i = 0; i < n1; i++) {
            left1[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) {
            right1[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (left1[i] <= right1[j]) {
                a[k] = left1[i];
                i++;
            } else {
                a[k] = right1[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = left1[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = right1[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        mergeSort(a, 0, n - 1);
        
        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
