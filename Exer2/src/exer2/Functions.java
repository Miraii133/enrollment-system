/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer2;

/**
 *
 * @author jiyo
 */
 public class Functions {
    
     StudentsJFrame studentsFrame = new StudentsJFrame();
     // 1st parameter: which frame
    public String[] getTextFieldValues(String[] textFieldValues){
        // retrieves values of all text fields and
        // stores them in an array
        // to make it much easier to pass to other methods.
        String[] values = new String[textFieldValues.length];
        // loops to assign values to values array from textFieldValues array.
        for (int i = 0; i < textFieldValues.length; i++){
            values[i] = textFieldValues[i];
            System.out.println(values[i]);
        }
        
        if (values[0].equalsIgnoreCase(studentsFrame.getName())){
            System.out.println("Hello");

        }
        
       
        return values;
    }
    
    private void displayTableValues(){
        
    }
    
}
