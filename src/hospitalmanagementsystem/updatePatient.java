/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class updatePatient extends javax.swing.JFrame {

    /**
     * Creates new form updatePatient
     */
    public updatePatient() {
        initComponents();
        // this.setSize(1560, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        patientId = new javax.swing.JTextField();
        firstName1 = new javax.swing.JTextField();
        lastName1 = new javax.swing.JTextField();
        maritialStatus = new javax.swing.JComboBox<>();
        patientType = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        age = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        phn = new javax.swing.JTextField();
        wordNo = new javax.swing.JTextField();
        bedNo = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        update = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        addPatient = new javax.swing.JButton();
        viewPatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        patientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdActionPerformed(evt);
            }
        });
        jPanel1.add(patientId);
        patientId.setBounds(380, 290, 330, 40);
        jPanel1.add(firstName1);
        firstName1.setBounds(370, 380, 320, 40);
        jPanel1.add(lastName1);
        lastName1.setBounds(930, 390, 320, 40);

        maritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One...]", "Single", "Married", " " }));
        maritialStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maritialStatusActionPerformed(evt);
            }
        });
        jPanel1.add(maritialStatus);
        maritialStatus.setBounds(380, 580, 170, 40);

        patientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One...]", "Indoor", "Outdoor", " ", " " }));
        patientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypeActionPerformed(evt);
            }
        });
        jPanel1.add(patientType);
        patientType.setBounds(360, 800, 170, 40);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(930, 570, 180, 40);

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(360, 470, 320, 40);
        jPanel1.add(city);
        city.setBounds(350, 720, 320, 40);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[...Select One...]", "Male", "Female", "Other", " " }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(930, 470, 170, 40);

        phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnActionPerformed(evt);
            }
        });
        jPanel1.add(phn);
        phn.setBounds(920, 720, 320, 40);
        jPanel1.add(wordNo);
        wordNo.setBounds(350, 920, 320, 40);
        jPanel1.add(bedNo);
        bedNo.setBounds(920, 910, 320, 40);
        jPanel1.add(address);
        address.setBounds(350, 650, 440, 40);

        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/update.png"))); // NOI18N
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(1280, 250, 200, 100);

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(1240, 90, 130, 120);

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/logouticon.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(1370, 90, 150, 120);

        addPatient.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        addPatient.setText("Add Patient");
        addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientActionPerformed(evt);
            }
        });
        jPanel1.add(addPatient);
        addPatient.setBounds(210, 30, 160, 40);

        viewPatient.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        viewPatient.setText("View Patient");
        viewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientActionPerformed(evt);
            }
        });
        jPanel1.add(viewPatient);
        viewPatient.setBounds(430, 30, 150, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coverimage/updatepatient.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-20, 20, 1550, 980);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maritialStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maritialStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maritialStatusActionPerformed

    private void patientTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypeActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        ImageIcon i=new ImageIcon(getClass().getResource("update_1.png"));
        update.setIcon(i);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        ImageIcon i=new ImageIcon(getClass().getResource("update.png"));
        update.setIcon(i);        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        ImageIcon i=new ImageIcon(getClass().getResource("home_1.png"));
        home.setIcon(i);          // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        ImageIcon i=new ImageIcon(getClass().getResource("home.png"));
        home.setIcon(i);          // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        ImageIcon i=new ImageIcon(getClass().getResource("logouticon1.png"));
        logout.setIcon(i);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        ImageIcon i=new ImageIcon(getClass().getResource("logouticon.png"));
        logout.setIcon(i);          // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseExited

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void patientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdActionPerformed

    private void phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnActionPerformed

    private void viewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientActionPerformed
        new viewpatient().setVisible(true);   
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_viewPatientActionPerformed

    private void addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientActionPerformed
        new addPatient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addPatientActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
       new adminPortal().setVisible(true);  
       this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       new HomePage().setVisible(true);
       this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatient;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bedNo;
    private javax.swing.JTextField city;
    private javax.swing.JTextField firstName1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel home;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName1;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> maritialStatus;
    private javax.swing.JTextField patientId;
    private javax.swing.JComboBox<String> patientType;
    private javax.swing.JTextField phn;
    private javax.swing.JLabel update;
    private javax.swing.JButton viewPatient;
    private javax.swing.JTextField wordNo;
    // End of variables declaration//GEN-END:variables
}
