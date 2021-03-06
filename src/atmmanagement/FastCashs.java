/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Surya
 */
public class FastCashs extends javax.swing.JFrame {

    /**
     * Creates new form FastCashs
     */
    public FastCashs() {
        initComponents();
    }

    int MyAccNum;
    public FastCashs(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        //AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
Connection  Con = null ;
        PreparedStatement pst = null, pst1 = null;
        ResultSet Rs = null,Rs1 = null;
        Statement St = null,St1 = null;
        int OldBalance;
    private void GetBalance()
    {
        String Query = "select Balance from AccountTbl where AccNum = '"+MyAccNum+"'";
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
                OldBalance = Rs1.getInt(1);
                BalLbl.setText("Rs "+OldBalance);
            }else{
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DEPOSITBTN = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        DEPOSITBTN2 = new javax.swing.JButton();
        DEPOSITBTN3 = new javax.swing.JButton();
        DEPOSITBTN4 = new javax.swing.JButton();
        DEPOSITBTN5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MYCODESPACE ATM");

        jLabel8.setBackground(new java.awt.Color(255, 0, 5));
        jLabel8.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(705, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("FAST CASH");

        DEPOSITBTN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN.setText("Rs 500");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });
        DEPOSITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTNActionPerformed(evt);
            }
        });

        DEPOSITBTN1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN1.setText("Rs 100");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });
        DEPOSITBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN1ActionPerformed(evt);
            }
        });

        DEPOSITBTN2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN2.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN2.setText("Rs 1000");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });
        DEPOSITBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN2ActionPerformed(evt);
            }
        });

        DEPOSITBTN3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN3.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN3.setText("Rs 2000");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });
        DEPOSITBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN3ActionPerformed(evt);
            }
        });

        DEPOSITBTN4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN4.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN4.setText("Rs 5000");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });
        DEPOSITBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN4ActionPerformed(evt);
            }
        });

        DEPOSITBTN5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        DEPOSITBTN5.setForeground(new java.awt.Color(0, 0, 153));
        DEPOSITBTN5.setText("Rs 10000");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });
        DEPOSITBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Back");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("MYCODESPACE ATM");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BalLbl.setFont(new java.awt.Font("Adobe Heiti Std R", 0, 18)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 0, 153));
        BalLbl.setText("Balance:");
        BalLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BalLbl)))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN)
                    .addComponent(DEPOSITBTN1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN2)
                    .addComponent(DEPOSITBTN3)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN5)
                    .addComponent(DEPOSITBTN4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTNActionPerformed

    private void DEPOSITBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN1ActionPerformed

    private void DEPOSITBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN2ActionPerformed

    private void DEPOSITBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN3ActionPerformed

    private void DEPOSITBTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN4ActionPerformed

    private void DEPOSITBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN5ActionPerformed

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
        if(OldBalance < 100)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-100);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
    if(OldBalance < 500)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-500);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
if(OldBalance < 1000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
if(OldBalance < 2000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-2000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
if(OldBalance < 5000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-5000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
if(OldBalance < 10000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }else
        {
            try{
            String Query = "Update AccountTbl set Balance = ? where AccNum = ? ";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATMDb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-10000);
            ps.setInt(2, MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu(MyAccNum).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information ");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new MainMenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLbl;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton DEPOSITBTN2;
    private javax.swing.JButton DEPOSITBTN3;
    private javax.swing.JButton DEPOSITBTN4;
    private javax.swing.JButton DEPOSITBTN5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
