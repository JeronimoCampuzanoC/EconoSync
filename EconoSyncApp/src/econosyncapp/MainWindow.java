/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package econosyncapp;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeros
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    private DefaultTableModel dtm;
    private Object[] o =  new Object[3];
    

    public Account ac;
    public MovementTable mt;
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        ac = new Account(this);
        mt = new MovementTable(this);
        
        
        dtm = (DefaultTableModel)Tabla1Movimientos.getModel();
        int rowCount = dtm.getRowCount();
        if (rowCount < 4) {
          
        } else {
          // Loop through the last 3 rows and remove them in reverse order
          // This ensures row indices don't become invalid as rows are removed
          for (int i = rowCount - 1; i >= rowCount - 4; i--) {
            dtm.removeRow(i);
          }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaldoValue = new javax.swing.JLabel();
        SaldoText = new javax.swing.JLabel();
        SaldoImg = new javax.swing.JLabel();
        HomeIcon = new javax.swing.JLabel();
        IngresoText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ValorField = new javax.swing.JTextField();
        Section = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GastoButton = new javax.swing.JButton();
        IngresoButton = new javax.swing.JButton();
        ahorroValue = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        IngresoType = new javax.swing.JComboBox<>();
        GastoType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1Movimientos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 610));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaldoValue.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SaldoValue.setForeground(new java.awt.Color(255, 255, 255));
        SaldoValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoValue.setText("0");
        SaldoValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SaldoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, -1));

        SaldoText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SaldoText.setForeground(new java.awt.Color(255, 255, 255));
        SaldoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoText.setText("Saldo");
        getContentPane().add(SaldoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, -1));

        SaldoImg.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        SaldoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/Bill (1).png"))); // NOI18N
        SaldoImg.setMaximumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setMinimumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(SaldoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 240, 110));

        HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/Home (1).png"))); // NOI18N
        getContentPane().add(HomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        IngresoText.setBackground(new java.awt.Color(255, 255, 255));
        IngresoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IngresoText.setForeground(new java.awt.Color(255, 255, 255));
        IngresoText.setText("Ingreso");
        getContentPane().add(IngresoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gasto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        ValorField.setBackground(new java.awt.Color(0, 43, 83));
        ValorField.setForeground(new java.awt.Color(255, 255, 255));
        ValorField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ValorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 110, 30));

        Section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/PestañaSuperior_1.png"))); // NOI18N
        getContentPane().add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -30, 210, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inserte un valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        GastoButton.setBackground(new java.awt.Color(204, 204, 0));
        GastoButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        GastoButton.setText("-");
        GastoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GastoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 50));

        IngresoButton.setBackground(new java.awt.Color(0, 204, 0));
        IngresoButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        IngresoButton.setText("+");
        IngresoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IngresoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 229, 70, 50));

        ahorroValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ahorroValue.setForeground(new java.awt.Color(0, 255, 0));
        ahorroValue.setValue(50);
        ahorroValue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ahorroValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 160, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, 10));

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 10, 240));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, 10));

        IngresoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sueldo", "Ganancia Ocasional", "Ingreso Pasivo", "Venta" }));
        getContentPane().add(IngresoType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        GastoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arriendo", "Comida", "Servicios", "Ropa", "Hogar", "Hobby", "Urgencia", "Deuda" }));
        getContentPane().add(GastoType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        Tabla1Movimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Categoria", "Valor"
            }
        ));
        jScrollPane1.setViewportView(Tabla1Movimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 230));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ahorrado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Añadir Ahorro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 60, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("+");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 60, 40));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 40));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/BgMainWindow.jpeg"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 346, 611));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFieldActionPerformed

    private void IngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoButtonActionPerformed
        String valorIngresado = ValorField.getText();
        if (!valorIngresado.equals("")){
            
            float numeroValor = Float.parseFloat(valorIngresado);
            ac.addIncome(numeroValor);
            
            Movement newMove = new Movement();
            newMove.setType("+");
            newMove.setCategory((String)IngresoType.getSelectedItem());
            newMove.setValue(numeroValor);
            
            mt.addMovement(newMove);
            
            ValorField.setText("");
            
        }
        
    }//GEN-LAST:event_IngresoButtonActionPerformed

    private void GastoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastoButtonActionPerformed
        String valorIngresado = ValorField.getText();
        if (!valorIngresado.equals("")){
            
            float numeroValor = Float.parseFloat(valorIngresado);
            ac.addSpend(numeroValor);
            
            Movement newMove = new Movement();
            newMove.setType("-");
            newMove.setCategory((String)GastoType.getSelectedItem());
            newMove.setValue(numeroValor);
            
            mt.addMovement(newMove);
            ValorField.setText("");
            
        }
    }//GEN-LAST:event_GastoButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    public void refreshBalance(float v){
        SaldoValue.setText(String.valueOf(v));
    }
    
    public void addItemMovementTable(Movement m){
        o[0] = m.getType();
        o[1] = m.getCategory();
        o[2] = m.getValue();
            
        dtm.addRow(o);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JButton GastoButton;
    private javax.swing.JComboBox<String> GastoType;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JButton IngresoButton;
    private javax.swing.JLabel IngresoText;
    private javax.swing.JComboBox<String> IngresoType;
    private javax.swing.JLabel SaldoImg;
    private javax.swing.JLabel SaldoText;
    private javax.swing.JLabel SaldoValue;
    private javax.swing.JLabel Section;
    private javax.swing.JTable Tabla1Movimientos;
    private javax.swing.JTextField ValorField;
    private javax.swing.JProgressBar ahorroValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
