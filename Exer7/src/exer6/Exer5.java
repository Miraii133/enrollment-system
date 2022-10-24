/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author jiyo
 */


public class Exer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       var loginJFrame = new LoginGUIJFrame();
       loginJFrame.setVisible(true);
        var createPDF = new CreatePDF();
        createPDF.generatePDF();
        
       }
       
       
    
    
}
