package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Allen Caingcoy
 */
public class register extends javax.swing.JFrame {

    public static String[] usernamelist = new String[10];
    public static String[] passwordlist = new String[10];
    public int count = 0;

    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        registerusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        registerpassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        registercpassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        registerbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 500));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 198, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 11, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 198, 0));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 69, 200, 20);

        registername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(registername);
        registername.setBounds(100, 95, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 198, 0));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 136, 200, 20);

        registerusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerusername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(registerusername);
        registerusername.setBounds(100, 162, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 198, 0));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 203, 200, 20);

        registerpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registerpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(registerpassword);
        registerpassword.setBounds(100, 229, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 198, 0));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 270, 200, 20);

        registercpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registercpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(registercpassword);
        registercpassword.setBounds(100, 296, 200, 30);

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
        jCheckBox1.setBounds(100, 328, 200, 20);

        registerbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(253, 198, 0));
        registerbutton.setText("Register");
        registerbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton);
        registerbutton.setBounds(100, 366, 200, 30);

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 0, 0));
        backbutton.setText("Back to Login");
        backbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);
        backbutton.setBounds(100, 402, 200, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/6918302_23627.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            registerpassword.setEchoChar((char) 0);
            registercpassword.setEchoChar((char) 0);
        } else {
            registerpassword.setEchoChar('*');
            registercpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
        if (registername.getText().isEmpty() || registerusername.getText().isEmpty() || registerpassword.getText().isEmpty() || registercpassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all Fields", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (!registerpassword.getText().equals(registercpassword.getText())) {
            JOptionPane.showMessageDialog(null, "Passwords do not match", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registration Successful", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
            usernamelist[count] = registerusername.getText();
            passwordlist[count] = registerpassword.getText();
            count++;
            registername.setText("");
            registerusername.setText("");
            registerpassword.setText("");
            registercpassword.setText("");
        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        dispose();
        login login = new login();
        login.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerbutton;
    private javax.swing.JPasswordField registercpassword;
    private javax.swing.JTextField registername;
    public static javax.swing.JPasswordField registerpassword;
    public static javax.swing.JTextField registerusername;
    // End of variables declaration//GEN-END:variables
}
