package Java.Practice;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");   
        x=s.nextInt();
        System.out.println("Enter the Second number : ");
        y=s.nextInt();
        z =x+y;
        System.out.println("Addition of "+x+ " and "+ y +" is "+z);


    }
    
}
