/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pkgfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Stom extends javax.swing.JFrame {

    /**
     * Creates new form Stom
     */
    
    String email="";
    public Stom() {
        initComponents();
    }

     public Stom(String email){
         initComponents();
         this.email=email;
     }
     
      public void fetch_Data()
    {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
         
        Connection conn = DriverManager.getConnection("jdbc:mysql://root@localhost:3306/project?autoReconnect=true&useSSL=false","arundhati","arundhati");
        
        Statement stmt=conn.createStatement();
        
        String sql="select mname,contact,location,fees,expertise from mentor ;";
        ResultSet rs=stmt.executeQuery(sql);
        
         jtable1.setModel(DbUtils.resultSetToTableModel(rs));
        
         stmt.close();
         conn.close();
        
        }
        catch(ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
          System.out.println(e);
         

     }

    }  

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jscrollpane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jlabel1 = new javax.swing.JLabel();
        menttf = new javax.swing.JTextField();
        jbutton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jscrollpane1.setViewportView(jtable1);

        jlabel1.setText("Enter Mentor Name to connect");

        jbutton2.setText("Confirm Mentor");
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jscrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(menttf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jscrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fetch_Data();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: confirming mentor(Mfees table creation)
        String mname=menttf.getText();
        Float xfund = null;
        Float xfees = null;
        String memail="";
        String xname="";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
         
            Connection conn = DriverManager.getConnection("jdbc:mysql://root@localhost:3306/project?autoReconnect=true&useSSL=false","arundhati","arundhati");

            String sql1="Select fund as fund  from startup where email='"+email+"';";
            
            PreparedStatement pst1=conn.prepareStatement(sql1);
            ResultSet rs1=pst1.executeQuery();
             if(rs1.next())
                xfund=rs1.getFloat("fund");
             
            String sql2="Select fees as fees from mentor where mname='"+mname+"';";
            
            PreparedStatement pst2=conn.prepareStatement(sql2);
            ResultSet rs2=pst2.executeQuery();
             if(rs2.next())
                xfees=rs2.getFloat("fees");
             
             
             xfund=xfund-xfees;
             
            Statement stmt1=conn.createStatement();
            String insert1="update startup set fund='"+xfund+"' where email='"+this.email+"';";
            stmt1.executeUpdate(insert1);
             
            String sql3="Select email as email from mentor where mname='"+mname+"';";
            
            PreparedStatement pst3=conn.prepareStatement(sql3);
            ResultSet rs3=pst3.executeQuery();
             if(rs3.next())
                memail=rs3.getString("email");
             
             String sql4="Select name as name from startup where email='"+email+"';";
             
             PreparedStatement pst4=conn.prepareStatement(sql4);
             ResultSet rs4=pst4.executeQuery();
              if(rs4.next())
                 xname=rs4.getString("name");
             
             
             
             
             
             
             String insert5="insert into mfees values(?,?,?,?);";
             PreparedStatement stmt5=conn.prepareStatement(insert5);
             
             stmt5.setString(1, memail);
             stmt5.setString(2, mname);
             stmt5.setString(3, xname);
             stmt5.setFloat(4,xfees);
             
            int i=stmt5.executeUpdate();
        
}
        
        
        catch(ClassNotFoundException | SQLException e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
          System.out.println(e);
         

     }
        
    javax.swing.JOptionPane.showMessageDialog(this, "Connected to Mentor !");    
    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Stom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbutton2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JScrollPane jscrollpane1;
    private javax.swing.JTable jtable1;
    private javax.swing.JTextField menttf;
    // End of variables declaration//GEN-END:variables
}
