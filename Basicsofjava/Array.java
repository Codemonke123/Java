package Basicsofjava;

public class Array {
    public static void main(String[] args) {
        int [] numbers = {12,23,43,34,123,345,123};
        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("\n");
        String[] names ={"A" ,"B"};
        for ( int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            
        }
        int[] numbers2 = new int[5];
        numbers2[0]=1;
        numbers2[1]=4;
        numbers2[2]=7;
        numbers2[3]=8;
        numbers2[4]=4;
        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);
        System.out.println(numbers2[4]);
        
           
            
        
    }
    
}
