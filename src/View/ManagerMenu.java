/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UIController;
import javax.swing.ImageIcon;

/**
 *
 * @author Yelson
 */
public class ManagerMenu extends javax.swing.JFrame {

    private UIController uiController;
    
    public ManagerMenu(UIController pUiController) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("src/images/icon.png");
        this.setIconImage(image.getImage());
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
        btnEmployees = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        btnEmployees.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmployees.setContentAreaFilled(false);
        btnEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 350));

        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        btnProducts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProducts.setContentAreaFilled(false);
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 200, 350));

        btnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistics.png"))); // NOI18N
        btnStats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStats.setContentAreaFilled(false);
        btnStats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, 350));

        btnSignOut.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnSignOut.setForeground(new java.awt.Color(102, 102, 102));
        btnSignOut.setText("Cerrar Sesión");
        btnSignOut.setBorder(null);
        btnSignOut.setBorderPainted(false);
        btnSignOut.setContentAreaFilled(false);
        btnSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bakground_manager.png"))); // NOI18N
        jPanel1.add(label_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEmployees;
    public javax.swing.JButton btnProducts;
    public javax.swing.JButton btnSignOut;
    public javax.swing.JButton btnStats;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_background;
    // End of variables declaration//GEN-END:variables
}
