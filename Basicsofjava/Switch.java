package Basicsofjava;

import java.util.Scanner;

public class Switch {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What time it is?");
        int time = sc.nextInt();
        switch(time){
            case 10:
            System.out.println("The time is "+ time +"\nTime for coffee.");
            break;
            case 12:
            System.out.println("The time is "+ time +"\nTime for run.");
            break;
            case 7:
            System.out.println("The time is "+ time +"\nTime for waking up.");
            break;
            default:
            System.out.println("Time to relax.");
            break;

        }
    }
    
}

