/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package econosyncapp;
import java.time.LocalDate;
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
    private Object[] o =  new Object[4];
    

    public Account ac;
    public MovementTable mt;
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        ac = new Account(this);
        mt = new MovementTable(this);
        
        
        dtm = (DefaultTableModel)Tabla1Movimientos.getModel();
        
        //Clear Table
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        IngresoType = new javax.swing.JComboBox<>();
        GastoType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1Movimientos = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        Bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ahorroSectionButton = new javax.swing.JButton();
        homeSectionButton = new javax.swing.JButton();
        estadisticasSectionButton = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(346, 611));
        setPreferredSize(new java.awt.Dimension(350, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaldoValue.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SaldoValue.setForeground(new java.awt.Color(255, 255, 255));
        SaldoValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoValue.setText("0");
        SaldoValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(SaldoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, -1));

        SaldoText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SaldoText.setForeground(new java.awt.Color(255, 255, 255));
        SaldoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoText.setText("Saldo");
        jPanel1.add(SaldoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, -1));

        SaldoImg.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        SaldoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/Bill (1).png"))); // NOI18N
        SaldoImg.setMaximumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setMinimumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(SaldoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, 110));

        HomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/Home (1).png"))); // NOI18N
        jPanel1.add(HomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        IngresoText.setBackground(new java.awt.Color(255, 255, 255));
        IngresoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IngresoText.setForeground(new java.awt.Color(255, 255, 255));
        IngresoText.setText("Ingreso");
        jPanel1.add(IngresoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gasto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        ValorField.setBackground(new java.awt.Color(0, 43, 83));
        ValorField.setForeground(new java.awt.Color(255, 255, 255));
        ValorField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ValorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 110, 30));

        Section.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/PestañaSuperior_1.png"))); // NOI18N
        jPanel1.add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -30, 210, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inserte un valor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        GastoButton.setBackground(new java.awt.Color(204, 204, 0));
        GastoButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        GastoButton.setText("-");
        GastoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GastoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(GastoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, 50));

        IngresoButton.setBackground(new java.awt.Color(0, 204, 0));
        IngresoButton.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        IngresoButton.setText("+");
        IngresoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IngresoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(IngresoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 50, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 350, 10));

        IngresoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sueldo", "Ganancia Ocasional", "Ingreso Pasivo", "Venta" }));
        IngresoType.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(IngresoType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        GastoType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arriendo", "Comida", "Servicios", "Ropa", "Hogar", "Hobby", "Urgencia", "Deuda" }));
        GastoType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(GastoType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(153, 51, 255));

        Tabla1Movimientos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla1Movimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Categoria", "Valor", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Tabla1Movimientos);
        if (Tabla1Movimientos.getColumnModel().getColumnCount() > 0) {
            Tabla1Movimientos.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 306, 325, 190));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 350, 10));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/BgMainWindow.jpeg"))); // NOI18N
        jPanel1.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 346, 611));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab3", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 350, 540));

        ahorroSectionButton.setBackground(new java.awt.Color(20, 45, 143));
        ahorroSectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/RmestadisticasPiggyCenter.png"))); // NOI18N
        ahorroSectionButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ahorroSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahorroSectionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ahorroSectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 140, 70));

        homeSectionButton.setBackground(new java.awt.Color(20, 45, 143));
        homeSectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/houseIcon.png"))); // NOI18N
        homeSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeSectionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeSectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 70, 70));

        estadisticasSectionButton.setBackground(new java.awt.Color(20, 45, 143));
        estadisticasSectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/MovementIcon.png"))); // NOI18N
        estadisticasSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasSectionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(estadisticasSectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, 70));

        Menu.setBackground(new java.awt.Color(0, 102, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/BgMainWindow.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 350, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFieldActionPerformed

    private void IngresoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoButtonActionPerformed
        String valorIngresado = ValorField.getText();
        if (!valorIngresado.equals("")){
            
            
            
            float numeroValor = Float.parseFloat(valorIngresado);
            
            
            Movement newMove = new Movement();
            newMove.setType("+");
            newMove.setCategory((String)IngresoType.getSelectedItem());
            newMove.setValue(numeroValor);
            
            LocalDate fechaActual = LocalDate.now();
            newMove.setDate(fechaActual.toString());
            
            
            ac.addIncome(newMove.getValue());
            
            mt.addMovement(newMove);
            
            ValorField.setText("");
            
        }
        
    }//GEN-LAST:event_IngresoButtonActionPerformed

    private void GastoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastoButtonActionPerformed
        String valorIngresado = ValorField.getText();
        if (!valorIngresado.equals("")){
            
            float numeroValor = Float.parseFloat(valorIngresado);
            
            
            Movement newMove = new Movement();
            newMove.setType("-");
            newMove.setCategory((String)GastoType.getSelectedItem());
            newMove.setValue(numeroValor);
            
            LocalDate fechaActual = LocalDate.now();
            newMove.setDate(fechaActual.toString());
            
            
            ac.addSpend(numeroValor);
            mt.addMovement(newMove);
            
            ValorField.setText("");
            
        }
    }//GEN-LAST:event_GastoButtonActionPerformed

    private void ahorroSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahorroSectionButtonActionPerformed
        jTabbedPane1.setSelectedIndex(1); 
    }//GEN-LAST:event_ahorroSectionButtonActionPerformed

    private void estadisticasSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasSectionButtonActionPerformed
        jTabbedPane1.setSelectedIndex(2); 
    }//GEN-LAST:event_estadisticasSectionButtonActionPerformed

    private void homeSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeSectionButtonActionPerformed
        jTabbedPane1.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_homeSectionButtonActionPerformed

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
        o[3] = m.getDate();
            
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
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel SaldoImg;
    private javax.swing.JLabel SaldoText;
    private javax.swing.JLabel SaldoValue;
    private javax.swing.JLabel Section;
    private javax.swing.JTable Tabla1Movimientos;
    private javax.swing.JTextField ValorField;
    private javax.swing.JButton ahorroSectionButton;
    private javax.swing.JButton estadisticasSectionButton;
    private javax.swing.JButton homeSectionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
