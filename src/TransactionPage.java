import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIKHIL GOYAL
 */
public class TransactionPage extends javax.swing.JFrame {

    /**
     * Creates new form TransactionPage
     */
    public TransactionPage() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        card = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cvv = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        CONFIRM = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 1100));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("    WELCOME TO OUR GOYAL'S HOTEL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(112, 107, 819, 56);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("             FOR AND QUERY PLEASE CONTACT TO : Mr. NIKHIL GOYAL (CEO)         ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 700, 951, 53);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("NOTE :- AT THIS TIME ONLY ONLINE PAYMENT IS ACCEPATABLE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 630, 807, 53);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 216, 34));
        jLabel2.setText("Enter your CVV Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(58, 382, 293, 52);

        card.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        card.setForeground(new java.awt.Color(0, 216, 34));
        card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardActionPerformed(evt);
            }
        });
        getContentPane().add(card);
        card.setBounds(500, 182, 344, 51);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 216, 34));
        jLabel4.setText("Your Card Type is");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(58, 317, 210, 40);

        type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(0, 216, 34));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type);
        type.setBounds(500, 311, 344, 53);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 216, 34));
        jLabel5.setText("Enter your Card Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 181, 293, 52);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 216, 34));
        jLabel6.setText("Enter your Security Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(58, 474, 293, 52);

        cvv.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cvv.setForeground(new java.awt.Color(0, 216, 34));
        getContentPane().add(cvv);
        cvv.setBounds(500, 382, 344, 52);

        password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 216, 34));
        getContentPane().add(password);
        password.setBounds(500, 465, 344, 52);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 13, 192));
        jButton1.setText("CHECK CARD TYPE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(639, 251, 205, 47);

        CONFIRM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CONFIRM.setForeground(new java.awt.Color(158, 37, 37));
        CONFIRM.setText("CONFIRM");
        CONFIRM.setEnabled(false);
        CONFIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMActionPerformed(evt);
            }
        });
        getContentPane().add(CONFIRM);
        CONFIRM.setBounds(500, 544, 119, 53);

        CLOSE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(158, 37, 37));
        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE);
        CLOSE.setBounds(720, 544, 124, 53);

        jButton5.setBackground(new java.awt.Color(37, 243, 88));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("LOGOUT");
        jButton5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(829, 13, 137, 56);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N NAME LOGO - netbeans.jpg"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        getContentPane().add(logo);
        logo.setBounds(160, 10, 87, 80);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("  GOYAL'S HOTEL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(240, 10, 580, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        
        
    }//GEN-LAST:event_typeActionPerformed

    private void cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardActionPerformed
        String cardno=card.getText();
        char ch[]=cardno.toCharArray();
        if(ch[0]=='4')
        {
            type.setText("VISA CARD");
        }
        else if(ch[0]=='5')
        {
            type.setText("MASTERCARD");
        }
        else
        {
            type.setText("AMERICAN EXPRESS CARD");
        }
    }//GEN-LAST:event_cardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String cardno=card.getText();
        char ch[]=cardno.toCharArray();
        if(ch[0]=='4')
        {
            type.setText("VISA CARD");
        }
        else if(ch[0]=='5')
        {
            type.setText("MASTERCARD");
        }
        else
        {
            type.setText("AMERICAN EXPRESS CARD");
        }
        CONFIRM.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CONFIRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMActionPerformed
        int ans=JOptionPane.showConfirmDialog(null, "              Confirm        ");
        if(ans==JOptionPane.YES_OPTION)
        {

            String cvvlength=cvv.getText();
            String cardlength=card.getText();
            if(cvvlength.length()==3 && cardlength.length()==16)
            {
            JOptionPane.showMessageDialog(null,"Your Transaction is Completed Successfully");
            JOptionPane.showMessageDialog(null,"THANKYOU VERY MUCH FOR VISITING IN OUR GOYAL'S HOTEL");
//            TransactionPage obj=new TransactionPage();
//            obj.setVisible(true);
//            this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Type Correct Information like CVV AND CARD NUMBER");
            }
        }
        card.setText("");
        password.setText("");
        type.setText("");
        cvv.setText("");
    }//GEN-LAST:event_CONFIRMActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
       
           PaymentPage obj=new PaymentPage();
           obj.setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_logoMouseClicked

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
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton CONFIRM;
    private javax.swing.JTextField card;
    private javax.swing.JPasswordField cvv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
