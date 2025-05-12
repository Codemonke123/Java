
import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {
        String name,work;        
        System.out.println("What is your name and what are you working on ?");
        Scanner s = new Scanner(System.in);
        name=s.nextLine();
        work=s.nextLine();
        System.out.println("\n");
        System.out.println("My name is "+name);
        System.out.println("I am working on "+work);

       
    }
}