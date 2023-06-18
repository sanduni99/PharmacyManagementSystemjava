/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacyjava;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanduni
 */
public class Agent extends javax.swing.JFrame {

    /**
     * Creates new form Agent
     */
    public Agent() {
        initComponents();
        SelectMed();
    }
    Connection Con = null;
    Statement St = null;
    ResulSet Rs = null,Rs1=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Apassword = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Aid = new javax.swing.JTextField();
        Aname = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Apass = new javax.swing.JTextField();
        GenderCb = new javax.swing.JComboBox<>();
        Aphone = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgentTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        Apassword.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE AGENTS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("AGE");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("NAME");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("GENDER");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("PASSWORD");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("PHONE");

        Aid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AidActionPerformed(evt);
            }
        });

        Aname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Aage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        Apass.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        GenderCb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Aphone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        UpdateBtn.setBackground(new java.awt.Color(255, 204, 204));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 204, 204));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        Addbtn.setBackground(new java.awt.Color(255, 204, 204));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addbtn.setText("ADD");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 204, 204));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ApasswordLayout = new javax.swing.GroupLayout(Apassword);
        Apassword.setLayout(ApasswordLayout);
        ApasswordLayout.setHorizontalGroup(
            ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApasswordLayout.createSequentialGroup()
                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApasswordLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ApasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ApasswordLayout.createSequentialGroup()
                                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Aid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ApasswordLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(Aage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ApasswordLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aphone))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApasswordLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ApasswordLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Apass))))
                    .addGroup(ApasswordLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(UpdateBtn)
                        .addGap(35, 35, 35)
                        .addComponent(DeleteBtn)
                        .addGap(28, 28, 28)
                        .addComponent(ClearBtn)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        ApasswordLayout.setVerticalGroup(
            ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Aphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Apass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Aage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(ApasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(Addbtn)
                    .addComponent(ClearBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("COMPANY");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("MEDICINES");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("SELLING");

        AgentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Phone", "Password", "Gender"
            }
        ));
        AgentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgentTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("AGENTS LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Apassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(264, 264, 264))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Apassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void SelectMed()
    {
        try{
    
        Con.DriverManager.getConnection("");
        St = (Statement) Con.createStatement();
        Rs = St1.executeQuery("Select * from.User1.MEDICINETBL");
        AgentTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch(SQLException e)
    {
            e.printStackTrace();
     }
    }
    private void AidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AidActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        try{
          Con = DriverManager.getConnection("");
            PreparedStatement add = Con.prepareStatement("insert into AGENTTBL values(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(Aid.getText()));
            add.setString(2, (Aname.getText()));
            add.setInt(3, Integer.valueOf(Aage.getText()));
            add.setString(4, (Aphone.getText()));
            add.setString(5, (Apass.getText()));
            add.setString(6, (GenderCb.getSelectedItem().toString()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Agent Successfully Added");
            Con.close();
            SelectMed();
            
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       Aid.setText("");
       Aname.setText("");
       Aage.setText("");
       Aphone.setText("");
       Apassword.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Aid.getText().isEmpty())
     {
        JOptionPane.showMessageDialog(this, "Enter the Medicine to be Deleted"); 
     }
     else{
       try{
          Con = DriverManager.getConnection("");
          String Id = Aid.getText();
          String Query = "Delete from User1.MEDICINETBL where AID="+Id;
          Statement Add = (Statement) Con.createStatement();
          Add.executeUpdate(Query);
          SelectMed();
           JOptionPane.showMessageDialog(this, "Agent Deleted Successfully");
          
       }catch(SQLException e)
       {
         e.printStackTrace();
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void AgentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)AgentTable.getModel();
       int Myindex = AgentTable.getSelectedRow();
       Aid.setText(model.getValueAt(Myindex,0).toString());
       Aname.setText(model.getValueAt(Myindex,1).toString());
       Aage.setText(model.getValueAt(Myindex,2).toString());
      Aphone.setText(model.getValueAt(Myindex,3).toString());
       Apass.setText(model.getValueAt(Myindex,3).toString());
       
    
    }//GEN-LAST:event_AgentTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
       if(Aid.getText().isEmpty()|| Aname.getText().isEmpty()||Aage.getText().isEmpty()||Aphone.getText().isEmpty()||Apass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try{
           Con = DriverManager.getConnection("");
           String UpdateQuery = "Update User1.AGENTTBL set ANAME= '"+Aname.getText()+"'"+",AAGE = "+Aage.getText()+"'"+",APHONE = "+Aphone.getText()+"'"+",APASS = "+Apass.getText()+"'"+",AGENDER= "+GenderCb.getSelectedItem().toString()+"'"+"where AID = "+Aid.getText();
           Statement Add = (Statement) Con.createStatement();
          Add.executeUpdate(UpdateQuery);
          JOptionPane.showMessageDialog(this, "Agent Updated Successfully");
            }catch(SQLException e)
            {
               e.printStackTrace(); 
            }
            SelectMed();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     new Company().setVisible(true);
        this.dispose();
                        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Medicine().setVisible(true);
        this.dispose();
                        
    }//GEN-LAST:event_jLabel4MouseClicked
    
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
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aage;
    private javax.swing.JButton Addbtn;
    private javax.swing.JTable AgentTable;
    private javax.swing.JTextField Aid;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Apass;
    private javax.swing.JPanel Apassword;
    private javax.swing.JTextField Aphone;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
