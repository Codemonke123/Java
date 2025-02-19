package Basicsofjava;

public class FunctionReturn {
    public FunctionReturn() {
    }
 
    public static void main(String[] var0) {
       sayHello("Nayan", 12);
       sayHello("Alex", 15);
       int var1 = getMax(1, 5);
       System.out.println(var1);
    }
 
    public static void sayHello(String var0, int var1) {
       System.out.println("Hello  " + var0 + ". \nYour age is " + var1);
    }
 
    public static int getMax(int var0, int var1) {
       return var0 > var1 ? var0 : var1;
    }
 }
 