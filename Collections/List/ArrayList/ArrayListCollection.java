package Programs.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array list: ");
        int size = input.nextInt();

        // arraylist constructor with size
        ArrayList<Integer> myArrayList = new ArrayList<>(size);

        System.out.print("Enter elements: ");
        // adding elements to the list
        for (int i = 0; i < size; i++) {
            myArrayList.add(input.nextInt());
        }

        // accessing elements in a arraylist
        System.out.print("The ArrayList elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println();

        // checking whether a number is present in arraylist or not
        System.out.print("Enter a number to check whether it is present in list or not: ");
        int checkInt = input.nextInt();
        if (myArrayList.contains(checkInt)) {
            System.out.println(checkInt + " is present at "+ (myArrayList.indexOf(checkInt) + 1) + " position in ArrayList");
        } else {
            System.out.println(checkInt + " is not present in ArrayList");
        }


    }
}
