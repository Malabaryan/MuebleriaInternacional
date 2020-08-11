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
public class ManagerProductInventory extends javax.swing.JFrame {

    private UIController uiController;
    
    public ManagerProductInventory(UIController pUiController) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("src/images/icon.png");
        this.setIconImage(image.getImage());
        String text = "<html><p>Permite tener un control absoluto de los productos"
                + " y promociones de la compañía. En esta sección podrás gestionar"
                + " el inventario, y además, administrar las promociones que quieras"
                + " ofrecer a tus clientes</p></html>";
        this.lblInstructions.setText(text);
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
        btnMenu = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditProduct = new javax.swing.JButton();
        btnViewProduct = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        lblInstructions = new javax.swing.JLabel();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 57, 65));
        jLabel4.setText("Lista de Productos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 170, 660, 290));

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

        btnEditProduct.setBackground(new java.awt.Color(53, 57, 65));
        btnEditProduct.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_edit.png"))); // NOI18N
        btnEditProduct.setToolTipText("Editar Producto");
        btnEditProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnEditProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 40, 30));

        btnViewProduct.setBackground(new java.awt.Color(53, 57, 65));
        btnViewProduct.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_expand.png"))); // NOI18N
        btnViewProduct.setToolTipText("Ver Producto");
        btnViewProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnViewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 40, 30));

        btnAddProduct.setBackground(new java.awt.Color(53, 57, 65));
        btnAddProduct.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_plus.png"))); // NOI18N
        btnAddProduct.setToolTipText("Agregar Producto");
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 40, 30));

        lblInstructions.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 330, 190));

        label_background.setForeground(new java.awt.Color(53, 57, 65));
        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager_background.png"))); // NOI18N
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

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProductActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerProductInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProductInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProductInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProductInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerProductInventory(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnEditProduct;
    public javax.swing.JButton btnEmployee;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnProduct;
    public javax.swing.JButton btnStats;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_background;
    private javax.swing.JLabel lblInstructions;
    // End of variables declaration//GEN-END:variables
}
