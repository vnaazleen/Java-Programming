//package java;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int x = 10;
        int leftX = x << 2;  // left shift
        int rightX = x >> 2;

        System.out.println("Left shift " + x + " by 2: " + leftX);
        System.out.println("Right shift " + x + " by 2: " + rightX);

        int y = 20;
        int xAndY = x & y;
        int xOrY =  x ^ y;
        int XEorY = x | y;
        System.out.println(x + " & " + y + " = " + xAndY);
        System.out.println(x + " ^ " + y + " = " + xOrY);
        System.out.println(x + " | " + y + " = " + XEorY); 
        
        /*
        
        Output:        
        Left shift 10 by 2: 40
        Right shift 10 by 2: 2
        10 & 20 = 0
        10 ^ 20 = 30
        10 | 20 = 30

        */ 
    }
}
