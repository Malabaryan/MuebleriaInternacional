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
public class ManagerProduct extends javax.swing.JFrame {

    private UIController uiController;
    
    public ManagerProduct(UIController pUiController) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("src/images/icon.png");
        this.setIconImage(image.getImage());
        String text = "<html><p>Permite tener un control absoluto de los productos"
                + " y promociones de la compañía. En esta sección podrás gestionar"
                + " el inventario, y además, administrar las promociones que quieras"
                + " ofrecer a tus clientes</p></html>";
        this.lblInstructions.setText(text);
        uiController = pUiController;
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
        btnInventory = new javax.swing.JButton();
        btnOffers = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblInstructionsTitle = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInventory.setBackground(new java.awt.Color(151, 151, 151));
        btnInventory.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("Inventario");
        btnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventoryMouseEntered(evt);
            }
        });
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 240, 40));

        btnOffers.setBackground(new java.awt.Color(151, 151, 151));
        btnOffers.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        btnOffers.setForeground(new java.awt.Color(255, 255, 255));
        btnOffers.setText("Promociones");
        btnOffers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOffers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOffersMouseEntered(evt);
            }
        });
        btnOffers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffersActionPerformed(evt);
            }
        });
        jPanel1.add(btnOffers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 240, 40));

        btnMenu.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(53, 57, 65));
        btnMenu.setText("Inicio");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, -1));

        btnProduct.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(110, 190, 68));
        btnProduct.setText("Productos");
        btnProduct.setBorder(null);
        btnProduct.setBorderPainted(false);
        btnProduct.setContentAreaFilled(false);
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 70, -1));

        btnEmployee.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(53, 57, 65));
        btnEmployee.setText("Empleados");
        btnEmployee.setBorder(null);
        btnEmployee.setBorderPainted(false);
        btnEmployee.setContentAreaFilled(false);
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 80, -1));

        btnStats.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnStats.setForeground(new java.awt.Color(53, 57, 65));
        btnStats.setText("Estadísticas");
        btnStats.setBorder(null);
        btnStats.setBorderPainted(false);
        btnStats.setContentAreaFilled(false);
        btnStats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 90, -1));

        btnExit.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(113, 117, 125));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setToolTipText("Cerrar Sesión");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, -1));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 57, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("|");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 20, 20));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 57, 65));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("|");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 20, 20));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 57, 65));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("|");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 20, 20));

        lblInstructionsTitle.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        lblInstructionsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructionsTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInstructionsTitle.setText("Administración de Productos");
        lblInstructionsTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblInstructionsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 330, 30));

        lblInstructions.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 330, 190));

        label_background.setForeground(new java.awt.Color(53, 57, 65));
        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_manager_2.png"))); // NOI18N
        jPanel1.add(label_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventoryMouseEntered
        // TODO add your handling code here:
        this.lblInstructionsTitle.setText("Administración del Inventario");
         String text = "<html><p>Permite tener un control total de los productos"
                 + " alamcenados en las establecimientos, además de de los muebles"
                 + " producidos en cada taller.</p></html>";
        this.lblInstructions.setText(text);
    }//GEN-LAST:event_btnInventoryMouseEntered

    private void btnOffersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOffersMouseEntered
        // TODO add your handling code here:
        this.lblInstructionsTitle.setText("Administración de Promociones");
         String text = "<html><p>Permite la gestión de las ofertas y promociones"
                 + "que estarán disponibles paras los clientes de todas las sedes"
                 + "de la empresa</p></html>";
        this.lblInstructions.setText(text);
    }//GEN-LAST:event_btnOffersMouseEntered

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.uiController.showWindow(ManagerMenu.class);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnOffersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOffersActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerProduct(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEmployee;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnInventory;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnOffers;
    public javax.swing.JButton btnProduct;
    public javax.swing.JButton btnStats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_background;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructionsTitle;
    // End of variables declaration//GEN-END:variables
}
