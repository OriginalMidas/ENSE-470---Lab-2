/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

/**
 *
 * @author Dolan
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        TankFactory factory = new TankFactory();
        UI ui = new UI();
        ui.mainArea(factory);        
    }    
}

