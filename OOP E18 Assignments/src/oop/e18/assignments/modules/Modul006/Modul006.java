/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments.modules.Modul006;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import oop.e18.assignments.Modul;

/**
 *
 * @author Oliver
 */
public class Modul006 extends Modul //The 'extends Modul' means that it is a child
{
    public Modul006(boolean active) // The constructer - means that it requires a boolean when created to control if it is active
    {
        super(active);
    }
    
    //Method for running the assignments in the module
    public static void run()
    {
        //Declaring and assigning variables
        String assigments[] =
        {
            "1", "2"
        };
        boolean active = true;

        //Declaring DecimalFormat for rounding of correctly
        DecimalFormat f = new DecimalFormat("##.00");

        //Looping program
        while (active)
        {

            //Introduction to program
            print("---------------");
            print("Please write the name of a program:");
            print("---------------");

            //Listen for program names
            Scanner userInput = new Scanner(System.in);
            String programName = userInput.nextLine();

            //Initialise program
            switch (programName.toUpperCase())
            {
                case "1":
                    System.out.println("1");
                    System.out.println("---------------");
                    
                    //Declaring variable
                    Customer aCustomer = new Customer("Kakarotto Son Gokū", 42, 9000.1);
                    
                    //Depositing $10
                    aCustomer.deposit(10);
                    
                    //Withdrawing $5
                    aCustomer.withdraw(5);
                    
                    System.out.println("The balance of "+aCustomer.name+" is "+aCustomer.getBalance());
                    break;
                    
                case "2":
                    System.out.println("2");
                    System.out.println("---------------");
                    
                    //Declaring variables
                    CustomerDatabase aCustomerDatabase = new CustomerDatabase();
                    Customer aNewCustomer = new Customer("Kakarotto Son Gokū", 42, 9000.1);
                    Customer anotherNewCustomer = new Customer("Pusjme Tooda Edj", 1, 50);
                    Customer onemoreNewCustomer = new Customer("Almar Frenz Aded", 2, -100);
                    
                    //Adding a few customers
                    aCustomerDatabase.createCustomer(aNewCustomer);
                    aCustomerDatabase.createCustomer(anotherNewCustomer);
                    aCustomerDatabase.createCustomer(onemoreNewCustomer);
                    
                    //Removing a customer
                    aCustomerDatabase.removeCustomer(42);
                    
                    //Getting info about a customer
                    Customer copiedCustomer = aCustomerDatabase.getCustomer(2);
                    
                    //Printing customers
                    aCustomerDatabase.printCustomers();
                    break;    

                case "HELP":
                    for (int i = 0; i < assigments.length; i++)
                    {
                        print(assigments[i]);
                    }
                    break;

                case "STOP":
                case "EXIT":
                    active = false;
                    break;

                default:
                    print("Invalid program. Type 'help' to see availible programs.");
                    break;
            }
        }
    }

}
