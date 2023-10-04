package org.example.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLoginManager {
    public static void getMenu() {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new user");
            System.out.println("2. Delete an existing user");
            System.out.println("3. Check whether the user exists");
            System.out.println("4. Change the login of an existing user");
            System.out.println("5. Change the password of an existing user");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter a new username: ");
                    String newUsername = scanner.next();
                    System.out.print("Enter a password: ");
                    String newPassword = scanner.next();
                    map.put(newUsername, newPassword);
                    System.out.println("User added successfully.");
                    break;
                }
                case 2: {
                    System.out.print("Enter the username to delete: ");
                    String usernameToDelete = scanner.next();
                    if (map.containsKey(usernameToDelete)) {
                        map.remove(usernameToDelete);
                        System.out.println("User deleted.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter the username to check: ");
                    String usernameToCheck = scanner.next();
                    if (map.containsKey(usernameToCheck)) {
                        System.out.println("User exists.");
                    } else {
                        System.out.println("User does not exist.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter the username to change: ");
                    String oldUsername = scanner.next();
                    if (map.containsKey(oldUsername)) {
                        System.out.print("Enter the new username: ");
                        String newUsername = scanner.next();
                        String password = map.remove(oldUsername);
                        map.put(newUsername, password);
                        System.out.println("Username changed.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter the username to change password: ");
                    String usernameToChangePassword = scanner.next();
                    if (map.containsKey(usernameToChangePassword)) {
                        System.out.print("Enter the new password: ");
                        String newPassword = scanner.next();
                        map.put(usernameToChangePassword, newPassword);
                        System.out.println("Password changed.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                }
                case 6: {
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
