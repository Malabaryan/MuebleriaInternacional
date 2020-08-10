/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UIController;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yelson
 */
public class ManagerEmployees extends javax.swing.JFrame {

    private UIController uiController;
    
    public ManagerEmployees(UIController pUiController) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("src/images/icon.png");
        this.setIconImage(image.getImage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JButton();
        btnStats = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnViewEmp = new javax.swing.JButton();
        btnAddEmp = new javax.swing.JButton();
        btnSalaries = new javax.swing.JButton();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 680, 350));

        btnMenu.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(53, 57, 65));
        btnMenu.setText("Inicio");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 57, 65));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("|");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 20, 20));

        btnProduct.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(53, 57, 65));
        btnProduct.setText("Productos");
        btnProduct.setBorder(null);
        btnProduct.setBorderPainted(false);
        btnProduct.setContentAreaFilled(false);
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 70, -1));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 57, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("|");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 20, 20));

        btnEmployee.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(110, 190, 68));
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

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 57, 65));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("|");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 20, 20));

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

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 57, 65));
        jLabel4.setText("Lista de Empleados");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        btnViewEmp.setBackground(new java.awt.Color(53, 57, 65));
        btnViewEmp.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_expand.png"))); // NOI18N
        btnViewEmp.setToolTipText("Ver Empleado");
        btnViewEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnViewEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 40, 30));

        btnAddEmp.setBackground(new java.awt.Color(53, 57, 65));
        btnAddEmp.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_add.png"))); // NOI18N
        btnAddEmp.setToolTipText("Agregar Empleado");
        btnAddEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 40, 30));

        btnSalaries.setBackground(new java.awt.Color(53, 57, 65));
        btnSalaries.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        btnSalaries.setForeground(new java.awt.Color(255, 255, 255));
        btnSalaries.setText("Administrar Salarios");
        btnSalaries.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnSalaries, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager_background.png"))); // NOI18N
        jPanel1.add(label_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.uiController.showWindow(ManagerLogin.class);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerEmployees(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnEmployee;
    public javax.swing.JButton btnExit;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnSalaries;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton btnViewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_background;
    // End of variables declaration//GEN-END:variables
}
