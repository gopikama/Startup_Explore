/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkgfinal;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTeam extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form AddTeam
     */
    
    String email="";
    String xsname="";
    
    
    public AddTeam() {
        initComponents();
        getContentPane().setBackground(new Color(255,252,119));
       
    }
    
    public AddTeam(String email) {
        initComponents();
        this.email=email;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loctf = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        saltf = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        jlabel6 = new javax.swing.JLabel();
        eidtf = new javax.swing.JTextField();
        enametf = new javax.swing.JTextField();
        contacttf = new javax.swing.JTextField();
        desigtf = new javax.swing.JTextField();
        stf = new javax.swing.JTextField();
        jlabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 252, 119));

        jlabel1.setText("Employee ID");

        saltf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltfActionPerformed(evt);
            }
        });

        jlabel2.setText("Employee Name");

        add.setText("Add ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jlabel3.setText("Contact");

        jlabel4.setText("Designation");

        jlabel5.setText("Location");

        jlabel6.setText("Salary");

        contacttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttfActionPerformed(evt);
            }
        });

        desigtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desigtfActionPerformed(evt);
            }
        });

        jlabel7.setText("Startup Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel1)
                            .addComponent(jlabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel6)
                            .addComponent(jlabel2)
                            .addComponent(jlabel4)
                            .addComponent(jlabel5)
                            .addComponent(jlabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stf)
                            .addComponent(desigtf, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(contacttf)
                            .addComponent(enametf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loctf)
                            .addComponent(saltf)
                            .addComponent(eidtf))
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(eidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desigtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loctf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setBounds(500, 200, 439, 481);
    }// </editor-fold>//GEN-END:initComponents

    private void saltfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saltfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saltfActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try
     {   //System.out.println("start");
         Class.forName("com.mysql.jdbc.Driver");
         //System.out.println("start1");
         Connection conn = DriverManager.getConnection("jdbc:mysql://root@localhost:3306/project?autoReconnect=true&useSSL=false","arundhati","arundhati");
         System.out.println("Connection estd");
         //Statement stmt=conn.createStatement();
         //Statement stmt1=conn.createStatement();

            
         String xeid=eidtf.getText();
         String xename=enametf.getText();
         int xcontact=Integer.parseInt(contacttf.getText());
         String xdesig=desigtf.getText();
         String xloc=loctf.getText();
         Float xsal=Float.parseFloat(saltf.getText());
         String xs=stf.getText();
         //String x=this.email;
         
        /*String sql1="select name as name from startup where email='"+this.email+"';";
        PreparedStatement pst1=conn.prepareStatement(sql1);
        ResultSet rs1=pst1.executeQuery();
        if(rs1.next())
        {xsname=rs1.getString("name");
        System.out.println("test");
         System.out.println(xsname);
        }*/
        
        String insert="insert into team values(?,?,?,?,?,?,?);";
        PreparedStatement stmt=conn.prepareStatement(insert);
        
        
        stmt.setString(1, xeid);
        stmt.setString(2, xename);
        stmt.setInt(3, xcontact);
        stmt.setString(4, xdesig);
        stmt.setString(5, xloc);
        stmt.setFloat(6, xsal);
        stmt.setString(7, xs);
        
       
        
         int i =stmt.executeUpdate();
         
         //String insert="insert into Team(sname) select name from startup where email='"+this.email+"';";
        
        stmt.close();
//        pst1.close();
        conn.close();
        

     }
     catch(ClassNotFoundException | SQLException e)
     {
         //JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
          System.out.println(e);
         

     }
        javax.swing.JOptionPane.showMessageDialog(this, "Employee Details added !");
        this.setVisible(false);

    }//GEN-LAST:event_addActionPerformed

    private void contacttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttfActionPerformed

    private void desigtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desigtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desigtfActionPerformed

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
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField contacttf;
    private javax.swing.JTextField desigtf;
    private javax.swing.JTextField eidtf;
    private javax.swing.JTextField enametf;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JTextField loctf;
    private javax.swing.JTextField saltf;
    private javax.swing.JTextField stf;
    // End of variables declaration//GEN-END:variables
}
