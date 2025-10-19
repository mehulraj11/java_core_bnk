package models;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String name, email;
    ArrayList<Integer> listOfAccounts = new ArrayList<>();

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //ID
    public int getId() {
        return id;
    }

    //EMAIL
    public String getEmail() {
        return email;
    }

    //NAME
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + "\nName: " + name + "\nEmail: " + email;
    }
}
