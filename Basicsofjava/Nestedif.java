package Basicsofjava;

public class Nestedif {
    public static void main(String[] args) {
        int Age = 14;
        if(Age >= 18) {
            System.out.println("You can vote");
        }else{
            if(18-Age ==1){
                System.out.println("You cannot vote\nPlease come back in " +(18-Age) + " year");

            }else{
                System.out.println("You cannot vote\nPlease come back in " +(18-Age) + " years");
            }
        }
    }
}

