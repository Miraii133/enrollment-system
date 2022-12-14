package exer5;

import static exer5.StudentsJFrame.selected_enrollsubjid;
import static exer5.SubjectsJFrame.selected_subjid;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jiyo
 */
public class TeachersUserFormJFrame extends javax.swing.JFrame {

    private DB db;
    private SQL sql;
    public TeachersUserFormJFrame(SQL sql, DB db) {
        initComponents();
        this.sql = sql;
        this.db = db;
        sql.GetResultSetSQL(this.getName(), subjects_table);
    }

    private Functions functions;
    public void setFunctions(Functions functions){
        this.functions = functions;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjects_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        grades_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        studname_textField = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        studid_textField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        midterm_comboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        final_comboBox = new javax.swing.JComboBox<>();
        prefinal_comboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        prelim_comboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout_itemMenu = new javax.swing.JMenuItem();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "studid", "studname", "prelim", "midterm", "prefinal", "final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("teachersFormJFrame"); // NOI18N

        subjects_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "subjid", "subjode", "subjdesc", "subjunits", "subjsched", "enrolled"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjects_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjects_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjects_table);
        if (subjects_table.getColumnModel().getColumnCount() > 0) {
            subjects_table.getColumnModel().getColumn(0).setResizable(false);
        }

        grades_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "eid", "studid", "studname", "prelim", "midterm", "prefinal", "final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grades_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grades_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(grades_table);
        if (grades_table.getColumnModel().getColumnCount() > 0) {
            grades_table.getColumnModel().getColumn(1).setResizable(false);
            grades_table.getColumnModel().getColumn(2).setResizable(false);
            grades_table.getColumnModel().getColumn(4).setResizable(false);
            grades_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Teachers Class List/Grades Encoding Form");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel3.setText("studname");

        studname_textField.setFocusable(false);

        save_button.setText("Save");
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel1.setText("studid");

        studid_textField.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel4.setText("prelim");

        midterm_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B+", "C+", "C", "D", "F", "FD" }));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel7.setText("final");

        final_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B+", "C+", "C", "D", "F", "FD" }));

        prefinal_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B+", "C+", "C", "D", "F", "FD" }));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel6.setText("prefinal");

        prelim_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B+", "C+", "C", "D", "F", "FD" }));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        jLabel5.setText("midterm");

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(studname_textField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(save_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(studid_textField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(midterm_comboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(final_comboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prefinal_comboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(prelim_comboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(studid_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studname_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prelim_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(midterm_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prefinal_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(final_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_button)
                .addGap(25, 25, 25))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studid_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studname_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prelim_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_button)
                    .addComponent(midterm_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefinal_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(final_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        logout_itemMenu.setText("Logout");
        logout_itemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_itemMenuActionPerformed(evt);
            }
        });
        jMenu1.add(logout_itemMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel2)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel2)
                    .addContainerGap(579, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String selected_subjid;
    private void subjects_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjects_tableMouseClicked
        String subjid;
        int[] selectedRows = subjects_table.getSelectedRows();
        subjid = subjects_table.getValueAt(selectedRows[0], 0).toString();
        selected_subjid = subjid;
        
        
        sql.GetSecondaryResultSetSQL(this.getName(), grades_table, selected_subjid);
    }//GEN-LAST:event_subjects_tableMouseClicked

    static String selected_gradeseid;
    private void grades_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grades_tableMouseClicked
        String eid; 
        int[] selectedRows = grades_table.getSelectedRows();
        eid = grades_table.getValueAt(selectedRows[0], 0).toString();
        selected_gradeseid = eid;
        studid_textField.setText(grades_table.getValueAt(selectedRows[0], 1).toString());
        studname_textField.setText(grades_table.getValueAt(selectedRows[0], 2).toString());
    }//GEN-LAST:event_grades_tableMouseClicked

    private void logout_itemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_itemMenuActionPerformed
        this.dispose();
        var loginGUIJFrame = new LoginGUIJFrame();
        loginGUIJFrame.setVisible(true);
    }//GEN-LAST:event_logout_itemMenuActionPerformed

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
        String gradesFieldsValues[] =
        {
            // convert selected items to string because textFieldValues only take in Strings
            selected_gradeseid, prelim_comboBox.getSelectedItem().toString(),
            midterm_comboBox.getSelectedItem().toString(), prefinal_comboBox.getSelectedItem().toString(),
            final_comboBox.getSelectedItem().toString()
        };

        // if student id in Grades table does not exist yet
        if (!functions.IsExistingID(gradesFieldsValues, this.getName())){
            // includes frame name to verify which frame
            // is sending the setInsertSQL
            sql.setInsertSQL(gradesFieldsValues, this.getName());
            String insertSQL = sql.getInsertSQL(this.getName());
            db.executeUpdate(insertSQL);
            sql.GetResultSetSQL(this.getName(), grades_table);
            System.out.println("Grades inserted.");
            return;
        }

        // if the student ID in Grades table is already existing, just update it when
        // using the save button
        sql.setUpdateSQL(gradesFieldsValues, this.getName());
        String updateSQL = sql.getUpdateSQL(this.getName());
        db.executeUpdate(updateSQL);
        sql.GetResultSetSQL(this.getName(), grades_table);
        sql.GetSecondaryResultSetSQL(this.getName(), grades_table, selected_subjid);
        System.out.println("Grades inserted.");
    }//GEN-LAST:event_save_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(TeachersUserFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachersUserFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachersUserFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachersUserFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersUserFormJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> final_comboBox;
    private javax.swing.JTable grades_table;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem logout_itemMenu;
    private javax.swing.JComboBox<String> midterm_comboBox;
    private javax.swing.JComboBox<String> prefinal_comboBox;
    private javax.swing.JComboBox<String> prelim_comboBox;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField studid_textField;
    private javax.swing.JTextField studname_textField;
    private javax.swing.JTable subjects_table;
    // End of variables declaration//GEN-END:variables
}
