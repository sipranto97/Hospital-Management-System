/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class adminLogin extends javax.swing.JFrame {

    /**
     * Creates new form adminLogin
     */
    public adminLogin() {
        initComponents();
         this.setSize(1540, 970);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);
        jPanel3.add(username);
        username.setBounds(170, 490, 360, 60);
        jPanel3.add(password);
        password.setBounds(170, 640, 360, 50);

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/login.png"))); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        jPanel3.add(login);
        login.setBounds(350, 800, 210, 80);

        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/sign up.png"))); // NOI18N
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        jPanel3.add(signup);
        signup.setBounds(60, 800, 230, 80);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel3.add(back);
        back.setBounds(40, 20, 110, 120);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coverimage/adminlogin.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 1550, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
         ImageIcon i=new ImageIcon(getClass().getResource("login1.png"));
        login.setIcon(i);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       ImageIcon i=new ImageIcon(getClass().getResource("login.png"));
        login.setIcon(i);
    }//GEN-LAST:event_loginMouseExited

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
       ImageIcon i=new ImageIcon(getClass().getResource("sign up1.png"));
        signup.setIcon(i);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        ImageIcon i=new ImageIcon(getClass().getResource("sign up.png"));
        signup.setIcon(i);
    }//GEN-LAST:event_signupMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
ImageIcon i=new ImageIcon(getClass().getResource("arrow1.png"));
        back.setIcon(i);        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
   ImageIcon i=new ImageIcon(getClass().getResource("arrow.png"));
        back.setIcon(i);       // TODO add your handling code here:
    }//GEN-LAST:event_backMouseExited

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked

        new adminSignup().setVisible(true);
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_signupMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         new HomePage().setVisible(true);  
         this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
       Connection cn;
       int flag=0;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sd","root","12345678");
            Statement st =cn.createStatement();
            
            ResultSet r = st.executeQuery("select * from admin_login");
            while (r.next())
            {
                String un=r.getString("username");
                String pw =r.getString("password");
                if(un.equals(username.getText()) && pw.equals(password.getText()))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                {
                    JOptionPane.showMessageDialog(null, "Login complete");
                    new adminPortal().setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    username.setText("");
                    password.setText("");
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
             
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
