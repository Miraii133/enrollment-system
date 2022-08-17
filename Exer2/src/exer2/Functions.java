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
    
     // 1st parameter: which frame
    private String[] getTextFieldValues(String frameName){
        // retrieves values of all text fields and
        // stores them in an array
        // to make it much easier to pass to other methods.
        String[] values = new String[6];
        if (frameName == "studentsJFrame"){
            StudentsJFrame studentsFrame = new StudentsJFrame();
            values[0] = .getText();
            values[1] = name_textField.getText();
            values[2] = address_textField.getText();
            values[3] = course_textField.getText();
            values[4] = gender_textField.getText();
            values[5] = yrlevel_textField.getText();

        }
        
       
        return values;
    }
    
    private void displayTableValues(){
        
    }
    
}
