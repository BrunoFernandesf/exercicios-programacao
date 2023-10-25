package ex45;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;
    double salary;
    String email;

    User(String username, String password, double salary, String email) {
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.email = email;
    }
}

public class CheckingUser {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            // Check if username or email already exists
            boolean exists = false;
            for (User user : users) {
                if (user.username.equals(username) || user.email.equals(email)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                User newUser = new User(username, password, salary, email);
                users.add(newUser);
                System.out.println("User created successfully!");
            } else {
                System.out.println("Username or email already exists. Please try again.");
            }

            System.out.print("Do you want to add another user? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        // Print all users
        System.out.println("All Users:");
        for (User user : users) {
            System.out.println("Username: " + user.username);
            System.out.println("Email: " + user.email);
            System.out.println("Salary: " + user.salary);
            System.out.println("Password: " + user.password);
            System.out.println("----------------------");
        }
    }
}
