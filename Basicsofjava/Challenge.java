package Basicsofjava;

public class Challenge {
    public Challenge() {
    }
 
    public static void main(String[] var0) {
       int[] var1 = new int[]{347823, 3483, 12883, 87, 67};
       int var2 = getMax(var1);
       System.out.println("The maximum number is ");
       System.out.println(var2);
    }
 
    public static int getMax(int[] var0) {
       int var1 = var0[0];
       int[] var2 = var0;
       int var3 = var0.length;
 
       for(int var4 = 0; var4 < var3; ++var4) {
          int var5 = var2[var4];
          if (var5 > var1) {
             var1 = var5;
          }
       }
 
       return var1;
    }
    
}
