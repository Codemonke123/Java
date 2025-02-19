package Basicsofjava;

import java.util.Scanner;

public class EnhancedSwitch {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What time it is?");
        int time = sc.nextInt();
        switch(time){
            case 10->
            System.out.println("The time is "+ time +"\nTime for coffee.");
          
            case 12->
            System.out.println("The time is "+ time +"\nTime for run.");
          
            case 7->
            System.out.println("The time is "+ time +"\nTime for waking up.");
         
            default->
            System.out.println("Time to relax.");
            
    }
    
}
}
