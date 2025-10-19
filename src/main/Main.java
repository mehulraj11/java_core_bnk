package main;

import services.AccountService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountService();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n======== BANK MANAGEMENT SYSTEM ========");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Open New Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Transfer Money");
            System.out.println("7. View Account Details");
            System.out.println("8. Show Bank Reports");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    accountService.addCustomer();
                    break;
                case 2:
                    accountService.viewAllCustomers();
                    break;
                case 3:
                    System.out.println("Open New Account feature coming soon...");
                    break;
                case 4:
                    System.out.println("Deposit Money feature coming soon...");
                    break;
                case 5:
                    System.out.println("Transfer Money feature coming soon...");
                    break;
                case 6:
                    System.out.println("View Account Details feature coming soon...");
                    break;
                case 7:
                    System.out.println("View Transaction History feature coming soon...");
                    break;
                case 8:
                    System.out.println("Show Bank Reports feature coming soon...");
                    break;
                case 9:
                    System.out.println("Exiting... Thank you for using the system!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
