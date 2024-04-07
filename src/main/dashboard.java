package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Allen Caingcoy
 */
public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inventorybutton = new javax.swing.JButton();
        posbutton = new javax.swing.JButton();
        registerbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 300));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 198, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 11, 200, 40);

        inventorybutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inventorybutton.setForeground(new java.awt.Color(253, 198, 0));
        inventorybutton.setText("Inventory");
        inventorybutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inventorybutton.setEnabled(false);
        inventorybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventorybuttonActionPerformed(evt);
            }
        });
        jPanel1.add(inventorybutton);
        inventorybutton.setBounds(100, 62, 200, 40);

        posbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        posbutton.setForeground(new java.awt.Color(253, 198, 0));
        posbutton.setText("POS");
        posbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        posbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(posbutton);
        posbutton.setBounds(100, 113, 200, 40);

        registerbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(253, 198, 0));
        registerbutton.setText("Register");
        registerbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registerbutton.setEnabled(false);
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton);
        registerbutton.setBounds(100, 164, 200, 40);

        logoutbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(255, 0, 0));
        logoutbutton.setText("LOGOUT");
        logoutbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbutton);
        logoutbutton.setBounds(100, 215, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/6918302_23627.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);

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

    private void inventorybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventorybuttonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "POS LAMANG");
    }//GEN-LAST:event_inventorybuttonActionPerformed

    private void posbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posbuttonActionPerformed
        // TODO add your handling code here:
        dispose();
        pos pos = new pos();
        pos.setVisible(true);
    }//GEN-LAST:event_posbuttonActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
        dispose();
        register register = new register();
        register.setVisible(true);
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "WARNING!", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            login login = new login();
            login.setVisible(true);
        } else {
        }
    }//GEN-LAST:event_logoutbuttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton inventorybutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton posbutton;
    public static javax.swing.JButton registerbutton;
    // End of variables declaration//GEN-END:variables
}
