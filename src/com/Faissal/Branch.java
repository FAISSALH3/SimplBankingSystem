package com.Faissal;


import java.util.ArrayList;

public class Branch {
    private String name  ;
    private ArrayList<Customer> customers;
    private Customer customer;

    public void Customer(String nameOfBranch , ArrayList<Customer> Customers)
    {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfcustomer , double Transaction)
    {
        if(findCustomer(nameOfcustomer)== null)
        {
            customer = new Customer(nameOfcustomer,Transaction);
            customers.add(customer);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String nameOfCustomer , double transaction)
    {
        if(transaction>0)
        {
            customer = new Customer(nameOfCustomer,transaction);
           customers.add(customer);
            return true;
        }
        return false;

    }
    public Customer findCustomer(String nameOfCustomer) {
        if (customers.contains(nameOfCustomer)) {
            return customers.get(customers.indexOf(nameOfCustomer));
        }
        return null;
    }
}