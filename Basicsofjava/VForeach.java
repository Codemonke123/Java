package Basicsofjava;

//Vararg and Foreach

public class VForeach {
    public static void main(String[] args) {
        displaynumber(5,4,5,6,34,56,3,46,7,543,3);
        displayname("Nayan","Alex","Ioana");
        
    }
    public static void displaynumber(int...numbers) {
        for(int number : numbers){
            System.out.println(number);
        }
        
    }
    
    public static void displayname(String...names) {
        for(String name : names){
            System.out.println(name);
        }
        
    }
}
