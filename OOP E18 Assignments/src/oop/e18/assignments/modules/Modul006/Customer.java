/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments.modules.Modul006;

/**
 *
 * @author Oliver
 */
public class Customer
{
    public String name;
    public int id;
    public double balance;

    public Customer(String name, int id)
    {
        this.name = name;
        if (id <= 999)
        {
            this.id = id;
        }
        this.balance = 0;
    }

    public Customer(String name, int id, double balance)
    {
        this.name = name;
        if (id <= 999)
        {
            this.id = id;
        }
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
}
