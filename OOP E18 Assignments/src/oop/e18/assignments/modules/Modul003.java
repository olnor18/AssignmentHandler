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

/**
 *
 * @author Oliver
 */
public class Modul003 extends Modul {

    public Modul003(boolean active) 
    {
        super(active);
    }
    
    public static void run()
    {
        //Declaring and assigning variables
        String assigments[] =
        {
            "2.7", "3.1", "5.3", "5.5", "5.7", "B.1", "B.4", "B.5"
        };
        

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
                case "2.7":
                    print("2.7");
                    print("---------------");

                    //Ask user for input
                    print("Find the amount of years and days a amount of minutes make up. Enter a number above 0:");

                    //Declare and assaign variables
                    int minutes = userInput.nextInt();
                    int year = minutes / 525600;
                    int day = (minutes % 525600) / 1440;

                    if (minutes < 0)
                    {
                        print("Your number is not above 0.");
                        break;
                    }

                    //Print results
                    print(minutes + " minutes is approximately " + year + " years and " + day + " days.");
                    break;

                case "3.1":
                    print("3.1");
                    print("---------------");

                    //Declare variables
                    double a,
                     b,
                     c,
                     d,
                     r1,
                     r2;

                    //Ask user for input
                    print("Find the roots of a quadratic equation. First enter 'a':");
                    a = userInput.nextDouble();
                    print("Then enter 'b':");
                    b = userInput.nextDouble();
                    print("Finally, enter 'c':");
                    c = userInput.nextDouble();
                    d = Math.pow(b, 2) - 4 * a * c;

                    if (d == 0)
                    {
                        r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
                        print("The root of the equation is " + f.format(r1));
                    } else if (d < 0)
                    {
                        print("The roots for this equation does not lie within the real of natural numbers");
                    } else if (d > 0)
                    {
                        r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
                        r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
                        print("The roots of the equation is " + f.format(r1) + " and " + f.format(r2));
                    } else
                    {
                        print("Invalid input");
                    }
                    break;

                case "5.3":
                    print("5.3");
                    print("---------------");

                    //Explanation of program
                    print("A conversiontable form Celcius to Fahrenheit");
                    System.out.printf("%-10s%10s%n","Celcius","Fehrenheit");

                    for (int t = 0; t <= 100; t += 2)
                    {
                        final int FEHRENHEIT_CONVERSION_CONSTANT = t * 9 / 5 + 32;
                        /*
                        //Because i like pretty
                        String space = "                ";

                        if (t == 100)
                        {
                            space = "              ";
                        } else if (t >= 10)
                        {
                            space = "               ";
                        }

                        print(t + space + FEHRENHEIT_CONVERSION_CONSTANT);
                        */
                        System.out.printf("%-10d%10d%n",t,FEHRENHEIT_CONVERSION_CONSTANT);
                    }

                    break;

                case "5.5":
                    print("5.5");
                    print("---------------");

                    //Explanation of program
                    print("A conversiontable form Celcius to Fahrenheit and Fahrenheit to Celcius");
                    System.out.printf("%-10s%10s | %-10s%10s%n","Celcius","Fehrenheit","Fehrenheit","Celcius");

                    //Declaring and assigning variables
                    int fe = 20;

                    for (int ce = 0; ce <= 100; ce += 2)
                    {
                        final int FEHRENHEIT_CONVERSION_CONSTANT = ce * 9 / 5 + 32;
                        final int CELCIUS_CONVERSION_CONSTANT = fe / 9 * 5 - 32;
                        /*
                        //Because i like pretty
                        String space = "                ";
                        String space2 = "           ";
                        String space3 = "                  ";

                        if (ce == 100)
                        {
                            space = "              ";
                        } else if (ce >= 10)
                        {
                            space = "               ";
                        }

                        if (FEHRENHEIT_CONVERSION_CONSTANT >= 100)
                        {
                            space2 = "          ";

                        }

                        if (fe >= 100)
                        {
                            space3 = "                 ";
                        }
                        print(ce + space + FEHRENHEIT_CONVERSION_CONSTANT + space2 + "|   " + fe + space3 + CELCIUS_CONVERSION_CONSTANT);
                        */
                        System.out.printf("%-10d%10d | %-10d%10d%n",ce,FEHRENHEIT_CONVERSION_CONSTANT,fe,CELCIUS_CONVERSION_CONSTANT);
                        fe += 5;
                        
                        
                    }
                    break;

                case "5.7":
                    print("5.7");
                    print("---------------");

                    //Explanation of program
                    print("Tuition-calculator");

                    //Declaring and assigning variables
                    final double PERCENT = 0.06;
                    final int TUITION_AT_START = 10000;
                    final double TUITION_IN_TEN_YEARS = TUITION_AT_START * Math.pow(1 + PERCENT, 10);
                    double costsForFourYearsAfterTenYears = 0;

                    for (int i = 0; i <= 4; i++)
                    {
                        costsForFourYearsAfterTenYears += TUITION_IN_TEN_YEARS * Math.pow(1 + PERCENT, i);
                    }

                    print("The tuition in 10 years will be: $" + f.format(TUITION_IN_TEN_YEARS));
                    print("The cost for 4 years of tuition after ten years will be: $" + f.format(costsForFourYearsAfterTenYears));

                    break;

                case "B.1":
                    print("B.1");
                    print("---------------");
                    //Declaring and assigning variables
                    double radius = 1.0;
                    double area;

                    //Computing areal for different radius
                    for (int i = 0; i < 5; i++)
                    {
                        //Computing area
                        area = Math.pow(radius, 2.0) * Math.PI;

                        //Displaying area
                        print("The areal of a circle with a radius of " + radius + " is " + f.format(area));

                        //Enlarge radius by one;
                        radius++;
                    }
                    break;

                case "B.4":
                    print("B.4");
                    print("---------------");

                    //Announce assignment
                    print("Find the temperature differences between two days!");
                    //Declaring and assigning variables
                    int daysInMonths[] =
                    {
                        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
                    };
                    String months[] =
                    {
                        "january", "febuary", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"
                    };
                    String month;
                    int daysInMonth = 0;

                    //Announce input
                    print("Type in the month:");
                    month = userInput.nextLine();

                    if (Arrays.asList(months).indexOf(month.toLowerCase()) != -1)
                    {
                        daysInMonth = daysInMonths[Arrays.asList(months).indexOf(month.toLowerCase())];
                        print("In " + month + " there is " + daysInMonth + " days.");
                    } else
                    {
                        //Errormessage
                        print("Invalid month");
                        break;
                    }

                    break;
                
                case "B.5":
                    print("B.5");
                    print("---------------");
                    
                    //Announce assignment
                    print("Find the largest primenumber under 1,000,000");

                    //Declaring and assigning variables
                    int largestPrime = 0;
                    long time = System.nanoTime();

                    //Counting down from 1000000
                    for (int i = 3; i <= 1000000; i+=2)
                    {
                        boolean notPrime = false;
                        for (int in = 2; in < Math.sqrt(i); in++)
                        {
                            if (i % in == 0)
                            {
                                notPrime = true;
                                break;
                            }
                        }
                        if (!notPrime)
                        {
                            largestPrime = i;
                        }
                    }

                    print("The largest prime under 1,000,000 is: " + largestPrime);
                    print("This took " + f.format((double) (System.nanoTime()-time)/1000000000) + " seconds");

                    break;

                case "HELP":
                    for (int i = 0; i < assigments.length; i++)
                    {
                        print(assigments[i]);
                    }
                    break;

                case "STOP":
                case "exit":
                    active = false;
                    break;

                default:
                    print("Invalid program. Type 'help' to see availible programs.");
                    break;
            }
        }    
    }
}
