package Programs.Collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListCollection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating a linked list instance
        LinkedList<Integer> list = new LinkedList<>();

        int size;
        System.out.print("Enter number of elements to want to add: ");
        size = input.nextInt();

        // adding elements to linked list
        System.out.print("Enter elements one by one: ");
        for (int i = 0; i < size; i++) {
            list.add(input.nextInt());
        }

        // searching for an element in a linked list
        int searchElem;
        System.out.print("Enter the search element: ");
        searchElem = input.nextInt();

        int index = list.indexOf(searchElem);
        if (index != -1) {
            System.out.println(searchElem + " found at " + (index + 1) + " position.");
        } else {
            System.out.println(searchElem + " not found!");
        }

        // getting element at particular index
        System.out.print("Enter index: ");
        index = input.nextInt();
        if (index < 0 && index > list.size() - 1) {
            System.out.println("Invalid Index!");
        } else {
            System.out.println(list.get(index) + " is the element at " + index);
        }

        // getting first element in linked list
        System.out.println("First element in linked list: " + list.getFirst());
        // getiing last element in linked list
        System.out.println("Last elemet in linked list: " + list.getLast());

        // removing & returning the first (or head) element in linked list
        System.out.println("Popped first element which is " + list.poll());

        // removing & returning the last element in linked list
        System.out.println("Popped last element which is " + list.pollLast());

        // iterating over linked list
        ListIterator listItr = list.listIterator(0); //iterating from 0 index
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }
        System.out.println();

        input.close();
    }
}
