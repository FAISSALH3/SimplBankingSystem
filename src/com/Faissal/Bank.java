package com.Faissal;



import java.util.ArrayList;

public class Bank {
       private String name;
    private ArrayList<Branch> branches ;

    public Bank(String name) {
        this.name = name;
        this.branches= new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName) != null)
        {
            return true;
        }
            return false;

    }
    public boolean addCustomerTransaction(String branchName){
        if(findBranch(branchName)!=null)
        {
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String BranchName  , String customerName , double transaction)
    {
       if(transaction>=1)
       {
           return  true;
       }
       return false;
    }
    public Branch findBranch(String branchName)
    {

        if(branches.contains(branchName))
        {
            Branch newBranch = branches.get(branches.indexOf(branchName));
            return newBranch;
        }
        return null;

    }
    public boolean listCustomers(String branchName, boolean transaction ){

        if(branches.contains(branchName))
    {
        return true;
    }
        return false;}

}
