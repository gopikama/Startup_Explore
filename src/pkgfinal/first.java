/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;

/**
 *
 * @author arundhati
 */
public class first extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
    public first() {
        initComponents();
        getContentPane().setBackground(new Color(23,253,160));
        this.setTitle("Welcome Page");


       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JLabel();
        s = new javax.swing.JButton();
        startup = new javax.swing.JButton();
        investor = new javax.swing.JButton();
        mentor = new javax.swing.JButton();
        explore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(23, 253, 160));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/search_here.gif"))); // NOI18N

        s.setBackground(new java.awt.Color(26, 174, 234));
        s.setFont(new java.awt.Font("Lobster Two", 0, 18)); // NOI18N
        s.setText("Back ");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        startup.setBackground(new java.awt.Color(248, 253, 23));
        startup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/up.jpg"))); // NOI18N
        startup.setText("jButton2");
        startup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startupActionPerformed(evt);
            }
        });

        investor.setBackground(new java.awt.Color(248, 253, 23));
        investor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/invest.jpg"))); // NOI18N
        investor.setText("jButton3");
        investor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investorActionPerformed(evt);
            }
        });

        mentor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mentor.jpg"))); // NOI18N
        mentor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentorActionPerformed(evt);
            }
        });

        explore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/ex.jpg"))); // NOI18N
        explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploreActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/followus.jpg"))); // NOI18N

        s1.setBackground(new java.awt.Color(26, 174, 234));
        s1.setFont(new java.awt.Font("Lobster Two", 0, 18)); // NOI18N
        s1.setText("Search Now");
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startup, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mentor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(investor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(explore, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(18, 18, 18)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startup, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(investor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mentor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explore, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        setBounds(400, 100, 700, 544);
    }// </editor-fold>//GEN-END:initComponents

    private void startupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startupActionPerformed
        // TODO add your handling code here:
           startuplog s=new startuplog();
           s.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_startupActionPerformed

    private void exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploreActionPerformed
        // TODO add your handling code here:
        explore e=new explore();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exploreActionPerformed

    private void investorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investorActionPerformed
        // TODO add your handling code here:
           invlog i=new invlog();
           i.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_investorActionPerformed

    private void mentorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentorActionPerformed
        // TODO add your handling code here:
           mentlog m=new mentlog();
           m.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_mentorActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
        welcome w =new welcome();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here: 
        search s =new search();
        s.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_s1ActionPerformed

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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton explore;
    private javax.swing.JButton investor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mentor;
    private javax.swing.JButton s;
    private javax.swing.JButton s1;
    private javax.swing.JLabel search;
    private javax.swing.JButton startup;
    // End of variables declaration//GEN-END:variables

    private static class getContentPane {

        private static void setBackground(Color yellow) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public getContentPane() {
        }
    }
}
