/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments;

import oop.e18.assignments.modules.Modul008.Modul008;
import java.util.Scanner;
import static oop.e18.assignments.Modul.print;
import oop.e18.assignments.modules.*;
import oop.e18.assignments.modules.Modul006.Modul006;
import oop.e18.assignments.modules.Modul008.Modul008;

/**
 *
 * @author Oliver
 */
public class OOPE18Assignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add modules in an array of the type Modul, which is the parent class of the modules - it takes in a boolean as an argument for whether the module is active
        Modul[] modules = {
           new Modul002(false),
           new Modul003(false),
           new Modul004(false),
           new Modul005(false),
           new Modul006(false),
           new Modul008(false),
           new Modul0XX(false), //XX is a placeholder class
           //Add any new assignments here - beware: the has to be a class made for the module - use Modul0XX as a template
       };

        
        
        String moduleNames[]
                = {
                    //Rembember to add any new module to this array, as this is the array that is used for the 'help' option further down
                    "002", "003", "004", "005", "006", "0XX"                                 
                };
        //Running is a boolean that allows to end the following while-loop
        boolean running = true;
        
        //The while-loop allows you to select different modules after they are closed
        while (running) {
            //Introduction to program
            print("---------------"); //print is a costom method that replaces 'System.out.printf("");' - The method resides in the Modul class NB: IT'S RATHER USELESS
            print("Please write the name of an assignment:");
            print("---------------");

            //Listen for program names
            Scanner userInput = new Scanner(System.in);
            String assignmentName = userInput.nextLine();

            //Initialise program
            switch (assignmentName.toUpperCase()) {
                case "002":
                    //Sets the modul as active which allows a while-loop inside the Modul to run
                    modules[0].active = true;
                    //Runs the moduls assignments
                    Modul002.run();
                    break;
                    
                case "003":
                    modules[1].active = true;
                    Modul003.run();
                    break;
                    
                case "004":
                    modules[2].active = true;
                    Modul004.run();
                    break;    
                
                case "005":
                    modules[3].active = true; 
                    Modul005.run();
                    break;    
                    
                case "006":
                    modules[4].active = true; 
                    Modul006.run();
                    break;
                    
                case "008":
                    modules[5].active = true; 
                    Modul008.run();
                    break;
                    
                case "0XX":
                    //Remember to count the array up for each new module - fx. the next module would be 'modules[3].active = true;'
                    //modules[3].active = true; 
                    //Modul0XX.run();
                    break;
                
                //Stops the while-loop    
                case "EXIT":
                case "STOP":
                    running = false;
                    break;
                
                //Prints out all of the modules    
                case "HELP":
                    for (int i = 0; i < moduleNames.length; i++) {
                        print(moduleNames[i]);
                    }
                    break;
                
                //When a userInput is not recognized the following message appers    
                default:
                    print("Invalid program. Type 'help' to see availible programs.");
                    break;

            }
        }

    }

}
