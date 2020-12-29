import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public void division (int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Oops! Can't divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExceptionHandling myExc = new ExceptionHandling();

        try {
            System.out.print("Enter numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            myExc.division(num1, num2);
        }
        catch (InputMismatchException e) {
            System.out.println("Enter interger values!");
        }

        input.close();
    }    
}
