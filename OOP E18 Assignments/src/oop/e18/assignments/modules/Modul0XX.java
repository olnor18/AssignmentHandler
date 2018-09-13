/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments.modules;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import oop.e18.assignments.Modul;
import static oop.e18.assignments.Modul.active;
import static oop.e18.assignments.Modul.print;

/**
 *
 * @author Oliver
 */
public class Modul0XX extends Modul //The 'extends Modul' means that it is a child
{
    public Modul0XX(boolean active) // The constructer - means that it requires a boolean when created to control if it is active
    {
        super(active);
    }
    
    //Method for running the assignments in the module
    public static void run()
    {
        //The array which is used for listing the assignments by the 'help' command
        String assigments[] =
        {
            "X.X", "Y.Y",
        };
        

        //This is a variable which enables for rounding a number to two decimals - it's used like this 'f.format(5.21521124)'
        DecimalFormat f = new DecimalFormat("##.00");

        //Allows for selected multiple assignments without re-running the program
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
            switch (programName.toUpperCase()) //'.toUpperCase()' allow for avoiding casesensitivity
            {
                case "X.X":
                    //Assignment code
                    break;
                    
                case "Y.Y":
                    //Assignment code
                    break;
                   
                //A command for listing all assignments in the module
                case "HELP":
                    for (int i = 0; i < assigments.length; i++)
                    {
                        print(assigments[i]);
                    }
                    break;
                
                //Stops the while-loop and returning to the assignment-picker
                case "STOP":
                case "exit":
                    active = false;
                    break;
                
                //If the input is not recognized the following is printed   
                default:
                    print("Invalid program. Type 'help' to see availible programs.");
                    break;
            }
        }    
    }
}
