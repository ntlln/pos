package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Allen Caingcoy
 */
public class login extends javax.swing.JFrame {

    public static String adminusername = "admin", adminpassword = "admin";

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginpassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        loginbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 198, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign In");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 11, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 198, 0));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 62, 200, 20);

        loginusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginusername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(loginusername);
        loginusername.setBounds(100, 88, 200, 30);

        jLabel3.setForeground(new java.awt.Color(253, 198, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 129, 200, 20);
        jPanel1.add(loginpassword);
        loginpassword.setBounds(100, 155, 200, 30);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(253, 198, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(100, 190, 200, 20);

        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(253, 198, 0));
        loginbutton.setText("Login");
        loginbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton);
        loginbutton.setBounds(100, 220, 80, 30);

        exitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(255, 0, 0));
        exitbutton.setText("Exit");
        exitbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton);
        exitbutton.setBounds(220, 220, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/6918302_23627.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        String usernameinput = loginusername.getText();
        String passwordinput = loginpassword.getText();

        if (usernameinput.equals(adminusername) && passwordinput.equals(adminpassword)) {
            JOptionPane.showMessageDialog(null, "Logging In...", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            dashboard dashboard = new dashboard();
            dashboard.inventorybutton.setEnabled(true);
            dashboard.registerbutton.setEnabled(true);
            dashboard.setVisible(true);
        } else {
            boolean match = false;

            for (int i = 0; i < register.usernamelist.length; i++) {
                if (usernameinput.equals(register.usernamelist[i]) && passwordinput.equals(register.passwordlist[i])) {
                    match = true;
                    break;
                }
            }

            if (match) {
                JOptionPane.showMessageDialog(null, "Logging In...", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                dashboard dashboard = new dashboard();
                dashboard.setVisible(true);
            } else if (!usernameinput.equals(register.usernamelist) && passwordinput.equals(register.passwordlist) || !usernameinput.equals(adminusername) && passwordinput.equals(adminpassword)) {
                JOptionPane.showMessageDialog(null, "Incorrect Username", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                loginusername.setText("");
                loginpassword.setText("");
            } else if (usernameinput.equals(register.usernamelist) && !passwordinput.equals(register.passwordlist) || usernameinput.equals(adminusername) && !passwordinput.equals(adminpassword)) {
                JOptionPane.showMessageDialog(null, "Incorrect Password", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                loginusername.setText("");
                loginpassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Fill all Fields", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                loginusername.setText("");
                loginpassword.setText("");
            }
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?", "WARNING!", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            loginpassword.setEchoChar((char) 0);
        } else {
            loginpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JTextField loginusername;
    // End of variables declaration//GEN-END:variables
}
