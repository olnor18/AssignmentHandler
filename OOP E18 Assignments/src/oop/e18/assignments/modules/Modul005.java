/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments.modules;

import java.text.DecimalFormat;
import java.util.Scanner;
import oop.e18.assignments.Modul;
import static oop.e18.assignments.Modul.active;
import static oop.e18.assignments.Modul.print;

/**
 *
 * @author Oliver
 */
public class Modul005 extends Modul //The 'extends Modul' means that it is a child
{
    public Modul005(boolean active) // The constructer - means that it requires a boolean when created to control if it is active
    {
        super(active);
    }
    
    //Method for running the assignments in the module
    public static void run()
    {
        //The array which is used for listing the assignments by the 'help' command
        String assigments[] =
        {
            "6.2", "6.3",
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
                case "6.2":
                    print("6.2");
                    print("---------------");

                    //Ask user for input
                    print("Find the sum of all digits in a number. Enter a number:");

                    //Declare and assaign variables
                    int number = userInput.nextInt();
                    int total = sumDigits(number);
                    
                    //Print results
                    print("The multiplication of all digits in " + number + " is " + total);
                    
                    break;
                    
                case "6.3":
                    print("6.3");
                    print("---------------");

                    //Ask user for input
                    print("Check if a number is a palindrome. Enter a number:");

                    //Declare and assaign variables
                    int n = userInput.nextInt();
                    
                    if (isPalindrome(n) == true)
                    {
                        print("The number " + n + " is a palindrome: " + reverse(n));
                    }
                    else
                    {
                        print("The number " + n + " is not a palindrome: " + reverse(n));
                    }
                    break;
                    
                case "6.8":
                    print("6.8");
                    print("---------------");
                    print("A conversiontable form Miles to Kilometers and Kilometers to Miles");
                    System.out.printf("%-10s%10s | %-10s%10s%n","Miles","Kilometers","Kilometers","Miles");
                    
                    double km = 20;

                    for (double mi = 1; mi <= 10; mi+=1)
                    {
                        System.out.printf("%-10s%10s | %-10s%10s%n",f.format(mi),f.format(mileToKilometer(mi)),f.format(km),f.format(kilometerToMile(km)));
                        km += 5;
                    }
                    break;
                    
                case "6.22":
                    print("6.22");
                    print("---------------");
                    double t = 0.0001;
                    
                    //Ask user for input
                    print("Find a numbers square root with the tolerence "+t+". Enter a number:");

                    //Declare and assaign variables
                    long n622 = userInput.nextLong();
                    
                    
                    print("The square root of " + n622 + " is " + f.format(sqrt(n622,t)));
                    break;
                
                case "6.25":
                    print("6.25");
                    print("---------------");
                    
                    //Ask user for input
                    print("Convert milliseconds to hours, minuttes and seconds. Enter a number:");

                    //Declare and assaign variables
                    long millis = userInput.nextLong();
                    
                    print(convertMillis(millis));
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
    
    /**
     * Methods for the different assignments goes under here
     */
    
    //6.2
    public static int sumDigits(long n)
    {
        int output = 0;
        //Find sum of all digits
        while (n > 0) {
            output += n % 10;
            n /= 10;
        }
        
        return output;
    }
    
    //6.3
    public static int reverse(int number)
    {
        int output = 0;
        int length =(int)(Math.log10(number)+1);
        int tempStorage[] = new int[length];
        //Reverse all digits
        int i = 0;
        while (number > 0) {
            tempStorage[i++] = number % 10;
            number /= 10;
        }
        
        //Combine array to int
        for (int j = 0; j <= length-1; j++)
        {
            output += tempStorage[j]*Math.pow(10, length-1-j);
        }
        return output;
    }
    
    public static boolean isPalindrome(int number)
    {
        boolean output = false;
        if (number == reverse(number))
        {
            output = true;
        }
        return output;
    }
    
    //6.8
    public static double mileToKilometer(double mile)
    {
        double output = mile * 1.6;
        return output;
    }

    public static double kilometerToMile(double kilometer)
    {
        double output = kilometer / 1.6;
        return output;
    }
    
    //6.22
    public static double sqrt(long n, double t)
    {
        double output = 0;
        double nextGuess = n;
        double lastGuess = n;
        
        boolean notSqrt = true;
        
        while (notSqrt)
        {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
            if ((Math.abs(nextGuess - lastGuess) < t))
            {
                output = nextGuess;
                notSqrt = false;
            }
        }
        
        return output;
    }
    
    //6.25
    public static String convertMillis(long millis)
    {
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = ((millis % 3600000) % 60000) / 1000;
       
        String output = String.format("%d:%d:%d", hours, minutes, seconds);
        return output;
    }
    
    //6.28
}
