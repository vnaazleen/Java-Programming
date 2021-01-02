import java.util.HashMap;
import java.util.Scanner;


public class HashMapCollection {
    public static void displayMenu(){
        System.out.println("1. Add Item");
        System.out.println("2. Delete Item");
        System.out.println("3. Change quantity of item");
        System.out.println("4. Display list");
        System.out.println("5. Exit");
    }

    public static void displayList(HashMap<String, Integer> list) {
        System.out.println("Item\tQuantity");
        System.out.println("====\t========");
        for (String item : list.keySet()) {
            System.out.println(item + "\t" + list.get(item));
        }
    }
    public static void main(String[] args) {
        // a sample program to store grocery list ( Key: grocery items and value : quantity)

        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> groceryList = new HashMap<>();

        while (true) {
            Boolean exit = false;
            displayMenu();
            System.out.print("Enter you choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.print("Enter item: ");
                    String item = input.next();
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    groceryList.put(item, quantity);
                    System.out.println(item + " added!");
                    break;
                }
                case 2 : {
                    System.out.print("Enter item: ");
                    String item = input.next();
                    groceryList.remove(item);
                    System.out.println(item + " removed!");
                    break;
                }
                case 3 : {
                    System.out.print("Enter item: ");
                    String item = input.next();
                    System.out.print("Enter new quantity: ");
                    int quantity = input.nextInt();
                    groceryList.replace(item, quantity);
                    System.out.println(item + " quantity changed to " + quantity);
                    break;
                } case 4 : {
                    displayList(groceryList);
                    break;
                } case 5 : {
                    exit = true;
                } 

            }

            if (exit) {
                break;
            }
        }
        input.close();
    }
}
