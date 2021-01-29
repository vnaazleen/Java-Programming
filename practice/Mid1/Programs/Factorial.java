import java.util.Scanner;

//package java;

public class Factorial {

    public static int factorial(int num) {
        if (num < 0) {
            return -1;
        }

        if (num == 0 || num == 1) {
            return 1;

        }

        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = in.nextInt();

        int factNum = factorial(num);
        System.out.println("Factorial of " + num + " = " + factNum);
    }
}
