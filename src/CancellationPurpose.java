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
public class CancellationPurpose extends javax.swing.JFrame {

    /**
     * Creates new form CancellationPurpose
     */
    public CancellationPurpose() {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bookingno = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        CONFIRM = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bookingno1 = new javax.swing.JTextField();
        roomno1 = new javax.swing.JTextField();
        CLEAR1 = new javax.swing.JButton();
        CONFIRM1 = new javax.swing.JButton();
        CLOSE1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        BOOKINGPAGE1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("                   GOYAL'S HOTEL");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("    WELCOME TO OUR GOYAL'S HOTEL");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("     FOR ANY QUERY PLEASE CONTACT TO : Mr. NIKHIL GOYAL (CEO)         ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Enter Your Type Of Booking");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF BOOKING", "ROOM BOOKING", "PARTY BOOKING", "GROUND BOOKING", "BIRTHDAY PARTY BOOKING", "ANY OTHER TYPE OF BOOKING" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Enter Booking Number which you want");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Enter Room Number from your Choice");

        bookingno.setForeground(new java.awt.Color(0, 153, 153));
        bookingno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingnoActionPerformed(evt);
            }
        });

        roomno.setForeground(new java.awt.Color(0, 153, 153));

        CLEAR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        CONFIRM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CONFIRM.setText("CONFIRM");
        CONFIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMActionPerformed(evt);
            }
        });

        CLOSE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(58, 70, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(CONFIRM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, 0, 345, Short.MAX_VALUE)
                            .addComponent(bookingno)
                            .addComponent(roomno))))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CONFIRM, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 1100));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("    WELCOME TO OUR GOYAL'S HOTEL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 110, 819, 56);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("             FOR AND QUERY PLEASE CONTACT TO : Mr. NIKHIL GOYAL (CEO)         ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 630, 955, 62);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Enter Booking Number which you want to Cancel");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(66, 281, 509, 43);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Enter Room Number which you want to Cancel");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(66, 415, 509, 41);

        bookingno1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bookingno1.setForeground(new java.awt.Color(0, 153, 153));
        bookingno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingno1ActionPerformed(evt);
            }
        });
        getContentPane().add(bookingno1);
        bookingno1.setBounds(695, 281, 306, 43);

        roomno1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        roomno1.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(roomno1);
        roomno1.setBounds(695, 398, 306, 41);

        CLEAR1.setBackground(new java.awt.Color(153, 153, 153));
        CLEAR1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLEAR1.setForeground(new java.awt.Color(228, 141, 43));
        CLEAR1.setText("CLEAR");
        CLEAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR1ActionPerformed(evt);
            }
        });
        getContentPane().add(CLEAR1);
        CLEAR1.setBounds(890, 514, 119, 53);

        CONFIRM1.setBackground(new java.awt.Color(153, 153, 153));
        CONFIRM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CONFIRM1.setForeground(new java.awt.Color(228, 141, 43));
        CONFIRM1.setText("CONFIRM");
        CONFIRM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRM1ActionPerformed(evt);
            }
        });
        getContentPane().add(CONFIRM1);
        CONFIRM1.setBounds(706, 517, 119, 50);

        CLOSE1.setBackground(new java.awt.Color(255, 51, 51));
        CLOSE1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CLOSE1.setForeground(new java.awt.Color(157, 67, 67));
        CLOSE1.setText("LOGOUT");
        CLOSE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSE1ActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE1);
        CLOSE1.setBounds(873, 13, 128, 53);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(202, 35, 238));
        jLabel12.setText("  CANCELLATION FORM");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 190, 334, 63);

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
        BOOKINGPAGE1.setBounds(66, 514, 227, 58);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N NAME LOGO - netbeans.jpg"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(180, 20, 87, 80);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("  GOYAL'S HOTEL");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 10, 580, 80);

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

    }//GEN-LAST:event_CONFIRMActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void bookingno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingno1ActionPerformed

    private void CLEAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR1ActionPerformed
        bookingno1.setText("");
        roomno1.setText("");
    }//GEN-LAST:event_CLEAR1ActionPerformed

    private void CONFIRM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRM1ActionPerformed
       int ans=JOptionPane.showConfirmDialog(null, "Do you want to Cancel the Room Booking");
       if(ans==JOptionPane.YES_OPTION)
       {
            try
            {
                 Class.forName("java.sql.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/HOTEL","root","");
                 Statement stmt=con.createStatement();
                 String query="Delete from BOOKING where BOOKING_NO="+bookingno1.getText()+" AND ROOM_NO="+roomno1.getText()+";";
                 stmt.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Your Room is Successfully Deleted");
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, e);
             }
       }
        bookingno1.setText("");
        roomno1.setText("");
    }//GEN-LAST:event_CONFIRM1ActionPerformed

    private void CLOSE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSE1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSE1ActionPerformed

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
            java.util.logging.Logger.getLogger(CancellationPurpose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancellationPurpose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancellationPurpose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancellationPurpose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancellationPurpose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOKINGPAGE1;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton CLEAR1;
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton CLOSE1;
    private javax.swing.JButton CONFIRM;
    private javax.swing.JButton CONFIRM1;
    private javax.swing.JTextField bookingno;
    private javax.swing.JTextField bookingno1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField roomno;
    private javax.swing.JTextField roomno1;
    // End of variables declaration//GEN-END:variables
}
