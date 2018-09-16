/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.e18.assignments;

/**
 *
 * @author Oliver
 */
public class Modul {

    public static boolean active;
    
    //Parrent class for the modules - includes the boolean active for activating the while-loop inside a modul
    public Modul(boolean active)
    {
        this.active = active;
    
    }
    
    //A costom method for printing out a line (it's rather useless)
    /**
     * 
     * @param string use as printf
     */
    public static void print(String string)
    {
        System.out.printf(string+"%n");
    }
    
    
  
}
