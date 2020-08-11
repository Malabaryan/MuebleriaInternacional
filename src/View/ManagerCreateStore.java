/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainController;
import Controller.UIController;
import Model.Admin.FurnitureStore;
import Model.Location;
import javax.swing.ImageIcon;

/**
 *
 * @author Yelson
 */
public class ManagerCreateStore extends javax.swing.JFrame {

    private UIController uiController;
    
    public ManagerCreateStore(UIController pUiController) {
        uiController = pUiController;
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
        btnMenu = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        txtName.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, 30));

        btnSave.setBackground(new java.awt.Color(53, 57, 65));
        btnSave.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Guardar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 140, -1));

        btnCancel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(53, 57, 65));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 150, -1));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 57, 65));
        jLabel4.setText("Registrar Tienda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 250, 30));

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

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucursal", "Taller" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 200, 30));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Locación");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 30));

        txtCountry.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel1.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 200, 30));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estado:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, 30));

        txtState.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 200, 30));

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dirección:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 30));

        txtAddress.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 200, 30));

        jLabel14.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("País:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opaque.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 710, 380));

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        MainController.getInstance().getAdminController().addFurnitureStore(
                new FurnitureStore(
                        new Location(
                                this.txtCountry.getText(),
                                this.txtState.getText(),
                                this.txtAddress.getText()
                        ),
                MainController.getInstance().getAdminController().getCurrentManager(),
                this.txtName.getText()));
        
        this.uiController.showWindow(ManagerMenu.class);
        this.setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerCreateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerCreateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerCreateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerCreateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerCreateProduct(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    public javax.swing.JButton btnEmployee;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton btnProduct;
    private javax.swing.JButton btnSave;
    public javax.swing.JButton btnStats;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_background;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
