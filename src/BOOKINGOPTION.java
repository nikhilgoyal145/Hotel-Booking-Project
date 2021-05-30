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
public class BOOKINGOPTION extends javax.swing.JFrame {

    /**
     * Creates new form BOOKINGOPTION
     */
    public BOOKINGOPTION() {
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

        BOOKINGPAGE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bookingno = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        CONFIRM = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        BOOKINGPAGE1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        BOOKINGPAGE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BOOKINGPAGE.setForeground(new java.awt.Color(255, 0, 0));
        BOOKINGPAGE.setText("GOTO BOOKING PAGE");
        BOOKINGPAGE.setBorder(new javax.swing.border.MatteBorder(null));
        BOOKINGPAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKINGPAGEActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 1100));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("    WELCOME TO OUR GOYAL'S HOTEL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 120, 819, 56);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("     FOR ANY QUERY PLEASE CONTACT TO : Mr. NIKHIL GOYAL (CEO)         ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(39, 838, 868, 79);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 12, 110));
        jLabel2.setText("Enter Your Type Of Booking");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(111, 255, 323, 46);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF BOOKING", "ROOM BOOKING", "PARTY BOOKING", "GROUND BOOKING", "BIRTHDAY PARTY BOOKING", "ANY OTHER TYPE OF BOOKING" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(541, 255, 345, 46);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 12, 110));
        jLabel5.setText("Enter Booking Number which you want");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(111, 374, 323, 43);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 12, 110));
        jLabel6.setText("Enter Room Number from your Choice");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(111, 505, 323, 41);

        bookingno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bookingno.setForeground(new java.awt.Color(0, 153, 153));
        bookingno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingnoActionPerformed(evt);
            }
        });
        getContentPane().add(bookingno);
        bookingno.setBounds(541, 374, 345, 43);

        roomno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        roomno.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(roomno);
        roomno.setBounds(541, 496, 345, 41);

        CLEAR.setBackground(new java.awt.Color(255, 0, 204));
        CLEAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLEAR.setForeground(new java.awt.Color(167, 36, 36));
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR);
        CLEAR.setBounds(750, 610, 130, 53);

        CONFIRM.setBackground(new java.awt.Color(255, 0, 204));
        CONFIRM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CONFIRM.setForeground(new java.awt.Color(167, 36, 36));
        CONFIRM.setText("CONFIRM");
        CONFIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMActionPerformed(evt);
            }
        });
        getContentPane().add(CONFIRM);
        CONFIRM.setBounds(541, 610, 140, 57);

        CLOSE.setBackground(new java.awt.Color(111, 38, 38));
        CLOSE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 102, 255));
        CLOSE.setText("LOGOUT");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE);
        CLOSE.setBounds(860, 20, 121, 53);

        BOOKINGPAGE1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BOOKINGPAGE1.setForeground(new java.awt.Color(255, 0, 0));
        BOOKINGPAGE1.setText("GOTO BOOKING PAGE");
        BOOKINGPAGE1.setBorder(new javax.swing.border.MatteBorder(null));
        BOOKINGPAGE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKINGPAGE1ActionPerformed(evt);
            }
        });
        getContentPane().add(BOOKINGPAGE1);
        BOOKINGPAGE1.setBounds(99, 610, 227, 58);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N NAME LOGO - netbeans.jpg"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(150, 10, 87, 80);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("  GOYAL'S HOTEL");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(230, 10, 580, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingnoActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        bookingno.setText("");
        roomno.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void CONFIRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMActionPerformed
        try
        {        
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/HOTEL","root","");
            Statement stmt=con.createStatement();
            String query="insert into BOOKING(BOOKING_NO,ROOM_NO) values ("+bookingno.getText()+","+roomno.getText()+");";
            stmt.executeUpdate(query);          
            con.close();
            int ans=JOptionPane.showConfirmDialog(null, "Do you want to book an Room");
            if(ans==JOptionPane.YES_OPTION)
            {

                JOptionPane.showMessageDialog(null,"Booking Successfull");
            }
            int ans1=JOptionPane.showConfirmDialog(null, "Do you want to make Payment of your Room");
            if(ans==JOptionPane.YES_OPTION)
            {
               PaymentPage obj=new PaymentPage();
               obj.setVisible(true);
               this.setVisible(false);
            }
            bookingno.setText("");
            roomno.setText("");
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CONFIRMActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void BOOKINGPAGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKINGPAGEActionPerformed
        BOOKINGPAGE obj=new BOOKINGPAGE();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BOOKINGPAGEActionPerformed

    private void BOOKINGPAGE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKINGPAGE1ActionPerformed
        BOOKINGPAGE obj=new BOOKINGPAGE();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BOOKINGPAGE1ActionPerformed

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
            java.util.logging.Logger.getLogger(BOOKINGOPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOKINGOPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOKINGOPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOKINGOPTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOKINGOPTION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOKINGPAGE;
    private javax.swing.JButton BOOKINGPAGE1;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton CONFIRM;
    private javax.swing.JTextField bookingno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField roomno;
    // End of variables declaration//GEN-END:variables
}