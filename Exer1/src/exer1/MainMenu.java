/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exer1;

/**
 *
 * @author jiyo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nonIntID = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        invalidID = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        id_textField = new javax.swing.JTextField();
        course_textField = new javax.swing.JTextField();
        name_textField = new javax.swing.JTextField();
        address_textField = new javax.swing.JTextField();
        gender_textField = new javax.swing.JTextField();
        yrlevel_textField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        save_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();

        nonIntID.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        nonIntID.setAlwaysOnTop(true);
        nonIntID.setLocation(new java.awt.Point(200, 200));
        nonIntID.setMinimumSize(new java.awt.Dimension(250, 250));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("ID must be a number!");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout nonIntIDLayout = new javax.swing.GroupLayout(nonIntID.getContentPane());
        nonIntID.getContentPane().setLayout(nonIntIDLayout);
        nonIntIDLayout.setHorizontalGroup(
            nonIntIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nonIntIDLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(90, 90, 90))
        );
        nonIntIDLayout.setVerticalGroup(
            nonIntIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nonIntIDLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Non-Existing ID!");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout invalidIDLayout = new javax.swing.GroupLayout(invalidID.getContentPane());
        invalidID.getContentPane().setLayout(invalidIDLayout);
        invalidIDLayout.setHorizontalGroup(
            invalidIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invalidIDLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(112, 112, 112))
        );
        invalidIDLayout.setVerticalGroup(
            invalidIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invalidIDLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Course");

        jLabel5.setText("Gender");

        jLabel6.setText("Year Level");

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save_button)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(update_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(delete_button)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(id_textField)
                            .addComponent(address_textField)
                            .addComponent(course_textField)
                            .addComponent(yrlevel_textField)
                            .addComponent(gender_textField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yrlevel_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(update_button)
                    .addComponent(delete_button))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String[] getTextFieldValues(){
        // retrieves values of all text fields and
        // stores them in an array
        // to make it much easier to pass to other methods.
        String[] values = new String[6];
        values[0] = id_textField.getText();
        values[1] = name_textField.getText();
        values[2] = address_textField.getText();
        values[3] = course_textField.getText();
        values[4] = gender_textField.getText();
        values[5] = yrlevel_textField.getText();
        return values;
    }
    
        private boolean IsExistingID(){
        
        String[] values = getTextFieldValues();
        int id = 0;
        try {
           id = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
          System.out.println("Number provided for ID is not a valid number!");
          System.out.println(ex);
           return false;
    }
        DB db = new DB();
        db.connectDB();
        
        String query = "SELECT * FROM Students WHERE studid='" + id + "'";
        // if ID is not am existing ID.
        if (!db.executeQuery(query)){
            return false;
        }    
            
        // returns true if the ID is valid.
        return true;
        
    }
    
    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
       String[] values = getTextFieldValues();
       int id = 0;
       try {
          id = Integer.parseInt(values[0]);
       } catch (NumberFormatException ex){
           System.out.println("ID provided is not a valid number!");
           System.out.println(ex);
           return;
       }
    
       
       String studName = values[1];
       String studAddress = values[2];
       String studCourse = values[3];
       String studGender = values[4];
       String studYrlevel = values[5];
       
       DB db = new DB();
       db.connectDB();

       // checks if ID provided already exists
       // so code can insert it to DB.
       if (!IsExistingID()){
        String update = "INSERT INTO Students VALUES("+ id + ",'" + studName + "','" + studAddress + "','" + studCourse + "','" +
               studGender + "','" + studYrlevel + "')";
       db.executeUpdate(update);
       return;
       }
       System.out.println("ID provided already exists!");
       System.out.println("Please use update instead.");
       
       
    }//GEN-LAST:event_save_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        String[] values = getTextFieldValues();
        int id = 0;
        try {
           id = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
           System.out.println("ID provided is not a valid number!");
           System.out.println(ex);
           return;
        }
        
        if (!IsExistingID()){
               System.out.println("ID provided does not exist.");
               System.out.println("Cannot delete data from ID");
               return; 
           }
        
        String update = "DELETE FROM Students WHERE studid='" + id + "'";
        DB db = new DB();
        db.connectDB();
        db.executeUpdate(update);
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        String[] values = getTextFieldValues();
          int id = 0;
           
        try {
           id = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
           System.out.println("ID provided is not a valid number!");
           System.out.println(ex);
           return;
        }
            if (!IsExistingID()){
               System.out.println("ID provided does not exist.");
               System.out.println("Please use Save instead.");
               return; 
           }
        
       String studName = values[1];
       String studAddress = values[2];
       String studCourse = values[3];
       String studGender = values[4];
       String studYrlevel = values[5];
       
       DB db = new DB();
       db.connectDB();
       
       //Deletes row and replaces it with a new and updated one.
       String update = "DELETE FROM Students WHERE studid='" + id + "'";
       db.executeUpdate(update);
       update = "INSERT INTO Students VALUES("+ id + ",'" + studName + "','" + studAddress + "','" + studCourse + "','" +
               studGender + "','" + studYrlevel + "')";
       db.executeUpdate(update);
           
        
    
    }//GEN-LAST:event_update_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_textField;
    private javax.swing.JTextField course_textField;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField gender_textField;
    private javax.swing.JTextField id_textField;
    private javax.swing.JDialog invalidID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name_textField;
    private javax.swing.JDialog nonIntID;
    private javax.swing.JButton save_button;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField yrlevel_textField;
    // End of variables declaration//GEN-END:variables
}
