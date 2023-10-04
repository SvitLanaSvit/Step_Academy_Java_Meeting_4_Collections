package org.example.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberListMenu {
    public static void getMenu() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add an item to the list");
            System.out.println("2. Delete an item from the list");
            System.out.println("3. Show the contents of the list");
            System.out.println("4. Check whether a value is in the list");
            System.out.println("5. Replace values in the list");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter a number to add: ");
                    int numToAdd = scanner.nextInt();
                    list.add(numToAdd);
                    System.out.println("Number added to the list.");
                    break;
                }
                case 2: {
                    System.out.print("Enter the index to delete: ");
                    int indexToDelete = scanner.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < list.size()) {
                        list.remove(indexToDelete);
                        System.out.println("Number removed from the list.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Contents of the list:");
                    for (var num : list) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.print("Enter a number to check: ");
                    int numToCheck = scanner.nextInt();
                    if (list.contains(numToCheck)) {
                        System.out.println(numToCheck + " is in the list.");
                    } else {
                        System.out.println(numToCheck + " is not in the list.");
                    }
                    break;
                }
                case 5:{
                    System.out.print("Enter the index to replace: ");
                    int indexToReplace = scanner.nextInt();
                    if(indexToReplace >= 0 && indexToReplace < list.size()){
                        System.out.print("Enter the new value: ");
                        int newValue = scanner.nextInt();
                        list.set(indexToReplace, newValue);
                        System.out.println("Value replaced in the list.");
                    }else{
                        System.out.println("Invalid index.");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
