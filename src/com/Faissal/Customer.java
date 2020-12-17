package com.Faissal;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double>transaction;

    public Customer(String customerName, double initialAmount) {
        super();
        this.name = customerName;
        this.transaction= new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public String getName()
    {
        return this.name;
    }
    public ArrayList getTransaction()
    {
        return  transaction;
    }
    public void addTransaction(double Transaction)
    {
        transaction.add(Transaction);
    }

}
