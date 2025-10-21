package services;

import models.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountService {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer() {
        System.out.println("\n--- Add New Customer ---");
        System.out.print("Enter Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = scanner.nextLine();

        // Create customer object
        Customer newCustomer = new Customer(id, name, email);
        customers.add(newCustomer); // store it in list

        System.out.println("\n✅ Customer added successfully!");
        System.out.println(newCustomer);
    }

    public void viewAllCustomers() {
        System.out.println("\n--- Customer List ---");

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        for (Customer c : customers) {
            System.out.println(c);
            System.out.println("----------------------");
        }
    }

    public void openNewAccount() {
        viewAllCustomers();
        System.out.println("select a customer with id");
        int choice;
        choice = scanner.nextInt();
        Customer selectedCustomer = new Customer();
        selectedCustomer = findCustomerById(choice);
        int id = selectedCustomer.getId();
        String email = selectedCustomer.getEmail();
        String Name = selectedCustomer.getName();
        System.out.println(id + " " + email + " " + Name);

    }

    public Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
