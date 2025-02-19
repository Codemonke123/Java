package Basicsofjava;

public class StoringDVar {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE ;
        int min = Integer.MIN_VALUE;
        System.out.println("max value in Int Datatype " + max);
        System.out.println("min value in Int Datatype" + min);

        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        System.out.println("max value in Byte Datatype " + byteMaxValue);
        System.out.println("min value in Byte Datatype" + byteMinValue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("max value in Long Datatype " + maxLongValue);
        System.out.println("min value in Long Datatype" + minLongValue);

        long myNumber = 2147483647L;
        System.out.println("Number is " + myNumber);

    }
    
}

