/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exer1;

/**
 *
 * @author jiyo
 */
public class Teachers extends javax.swing.JFrame {

    /**
     * Creates new form Teachers
     */
    public Teachers() {
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

        Tid_textField = new javax.swing.JTextField();
        tAddress_textField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tname_textField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tdepartment_textField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tContact_textField = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        tStatus_textField = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Teacher Address");

        jLabel5.setText("Teacher Contact ");

        jLabel6.setText("Teacher Status");

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

        jLabel1.setText("Teacher ID");

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Teacher Name");

        jLabel3.setText("Teacher Department");

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(back_button)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tname_textField)
                            .addComponent(Tid_textField)
                            .addComponent(Tdepartment_textField)
                            .addComponent(tAddress_textField)
                            .addComponent(tStatus_textField)
                            .addComponent(tContact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(save_button)
                        .addGap(31, 31, 31)
                        .addComponent(update_button)
                        .addGap(31, 31, 31)
                        .addComponent(delete_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tid_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(back_button))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tname_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tdepartment_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAddress_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tContact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tStatus_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(update_button)
                    .addComponent(delete_button))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String[] getTextFieldValues(){
        // retrieves values of all text fields and
        // stores them in an array
        // to make it much easier to pass to other methods.
        String[] values = new String[6];
        values[0] = Tid_textField.getText();
        values[1] = Tname_textField.getText();
        values[2] = Tdepartment_textField.getText();
        values[3] = tAddress_textField.getText();
        values[4] = tContact_textField.getText();
        values[5] = tStatus_textField.getText();
        return values;
    }
    
        private boolean IsExistingID(){
        
        String[] values = getTextFieldValues();
        int Tid = 0;
        try {
           Tid = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
          System.out.println("Number provided for Teacher ID is not a valid number!");
          System.out.println(ex);
           return false;
    }
        DB db = new DB();
        db.connectDB();
        
        String query = "SELECT * FROM Teachers WHERE Tid='" + Tid + "'";
        // if ID is not am existing ID.
        if (!db.executeQuery(query)){
            return false;
        }    
            
        // returns true if the ID is valid.
        return true;
        
    }
    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        String[] values = getTextFieldValues();
        int Tid = 0;
        try {
            Tid = Integer.parseInt(values[0]);
        } catch (NumberFormatException ex){
            System.out.println("Teacher ID provided is not a valid number!");
            System.out.println(ex);
            return;
        }
        String Tname = values[1];
        String Tdept = values[2];
        String Taddr = values[3];
        String Tcontact = values[4];
        String Tstatus = values[5];

        DB db = new DB();
        db.connectDB();

        // checks if ID provided already exists
        // so code can insert it to DB.
        if (!IsExistingID()){
            String update = "INSERT INTO Teachers VALUES("+ Tid + ",'" + Tname + "','" + Tdept + "','" + Taddr + "','" +
            Tcontact + "','" + Tstatus + "')";
            db.executeUpdate(update);
            System.out.println("Teacher ID data inserted.");
            return;
        }
        System.out.println("Teacher ID provided already exists!");
        System.out.println("Please use Update instead.");
    }//GEN-LAST:event_save_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        String[] values = getTextFieldValues();
        int Tid = 0;

        try {
            Tid = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
            System.out.println("Teacher ID provided is not a valid number!");
            System.out.println(ex);
            return;
        }
        if (!IsExistingID()){
            System.out.println("Teacher ID provided does not exist.");
            System.out.println("Please use Save instead.");
            return;
        }

        String Tname = values[1];
        String Tdept = values[2];
        String Taddr = values[3];
        String Tcontact = values[4];
        String Tstatus = values[5];

        DB db = new DB();
        db.connectDB();

        //Deletes row and replaces it with a new and updated one.
        String update = ""
                + "UPDATE Teachers SET " + "Tname='" + Tname + "', Tdept='" + Tdept + "', Taddr='" + Taddr + "',"
                + "Tcontact='" + Tcontact + "', Tstatus='" + Tstatus + "'"
                + "WHERE Tid=" + Tid;
        db.executeUpdate(update);
        System.out.println("Teacher ID data updated.");
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        String[] values = getTextFieldValues();
        int Tid = 0;
        try {
            Tid = Integer.parseInt(values[0]);
        }catch(NumberFormatException ex){
            System.out.println("Teacher ID provided is not a valid number!");
            System.out.println(ex);
            return;
        }

        if (!IsExistingID()){
            System.out.println("Teacher ID provided does not exist!");
            System.out.println("Cannot delete data from Teacher ID.");
            return;
        }

        String update = "DELETE FROM Teachers WHERE Tid='" + Tid + "'";
        DB db = new DB();
        db.connectDB();
        db.executeUpdate(update);
        System.out.println("Teacher ID data deleted.");
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        this.setVisible(false);
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tdepartment_textField;
    private javax.swing.JTextField Tid_textField;
    private javax.swing.JTextField Tname_textField;
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField tAddress_textField;
    private javax.swing.JTextField tContact_textField;
    private javax.swing.JTextField tStatus_textField;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
