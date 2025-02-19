package Basicsofjava;

public class ControlFlow {
    public static void main(String[] args) {
        int Age = 12;//assignment operator

        if (Age >=  18){
            System.out.println("You can vote");
            System.out.println("Put X in the ballot");
        }else{
            System.out.println("You cannot vote;\nplease come in " + (18 - Age) + " year");
        }
        
    }
    
}
