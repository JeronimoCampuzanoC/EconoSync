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
    private Account ac;
    private MovementTable mt;
    private SaveAccount svac; 
    
    
    private User us;
    public MainWindow(User u) {
        initComponents();
        setLocationRelativeTo(null);
        
        us = u;
        ac = new Account(this);
        mt = new MovementTable(this);
        
        
        dtm = (DefaultTableModel)Tabla1Movimientos.getModel();//Convertir clases con conversion explicita
        svac = new SaveAccount(this, ahorroProgress, ahorroValue,ac,dtm, mt);
        //Clear MovementTable
        int rowCount = dtm.getRowCount();
        if (rowCount < 4) {
          
        } else {
          //Erase all the columns
          for (int i = rowCount - 1; i >= rowCount - 4; i--) {
            dtm.removeRow(i);
          }
        
        }
        
        Tips.showTips();
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaldoText = new javax.swing.JLabel();
        SaldoValue = new javax.swing.JLabel();
        SaldoImg = new javax.swing.JLabel();
        Settings = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        investIcon1 = new javax.swing.JLabel();
        notaTitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        metasTitle = new javax.swing.JLabel();
        metasField = new javax.swing.JTextField();
        ahorroTitle = new javax.swing.JLabel();
        ahorroValue = new javax.swing.JLabel();
        ahorroProgress = new javax.swing.JProgressBar();
        ahorroField = new javax.swing.JTextField();
        añadirAhorroTitle = new javax.swing.JLabel();
        añadirAhorroButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        notasField = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Section2 = new javax.swing.JLabel();
        Bg1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ahorroSectionButton = new javax.swing.JButton();
        homeSectionButton = new javax.swing.JButton();
        estadisticasSectionButton = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(346, 611));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaldoText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SaldoText.setForeground(new java.awt.Color(255, 255, 255));
        SaldoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoText.setText("Saldo");
        getContentPane().add(SaldoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, -1));

        SaldoValue.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SaldoValue.setForeground(new java.awt.Color(255, 255, 255));
        SaldoValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoValue.setText("0");
        SaldoValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SaldoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, -1));

        SaldoImg.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        SaldoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/Bill (1).png"))); // NOI18N
        SaldoImg.setMaximumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setMinimumSize(new java.awt.Dimension(100, 100));
        SaldoImg.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(SaldoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, 110));

        Settings.setBackground(java.awt.SystemColor.control);
        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/settingsIcon.png"))); // NOI18N
        Settings.setText("jButton1");
        Settings.setBorder(new javax.swing.border.MatteBorder(null));
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        getContentPane().add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 80, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        IngresoType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        investIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/102501 (1).png"))); // NOI18N
        jPanel2.add(investIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 50, 40));

        notaTitle.setBackground(new java.awt.Color(255, 255, 255));
        notaTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        notaTitle.setForeground(new java.awt.Color(255, 255, 255));
        notaTitle.setText("Notas");
        jPanel2.add(notaTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 150));

        metasTitle.setBackground(new java.awt.Color(255, 255, 255));
        metasTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        metasTitle.setForeground(new java.awt.Color(255, 255, 255));
        metasTitle.setText("Objetivo");
        jPanel2.add(metasTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        metasField.setText("0");
        metasField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metasFieldActionPerformed(evt);
            }
        });
        jPanel2.add(metasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 90, -1));

        ahorroTitle.setBackground(new java.awt.Color(255, 255, 255));
        ahorroTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ahorroTitle.setForeground(new java.awt.Color(255, 255, 255));
        ahorroTitle.setText("Ahorrado");
        jPanel2.add(ahorroTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        ahorroValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ahorroValue.setForeground(new java.awt.Color(255, 255, 255));
        ahorroValue.setText("0");
        jPanel2.add(ahorroValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 60, -1));

        ahorroProgress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ahorroProgress.setForeground(new java.awt.Color(0, 255, 0));
        ahorroProgress.setValue(50);
        ahorroProgress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(ahorroProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 20));

        ahorroField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ahorroField.setText("0");
        ahorroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahorroFieldActionPerformed(evt);
            }
        });
        jPanel2.add(ahorroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 40));

        añadirAhorroTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        añadirAhorroTitle.setForeground(new java.awt.Color(255, 255, 255));
        añadirAhorroTitle.setText("Añadir Ahorro");
        jPanel2.add(añadirAhorroTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        añadirAhorroButton.setBackground(new java.awt.Color(0, 255, 0));
        añadirAhorroButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        añadirAhorroButton.setText("+");
        añadirAhorroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirAhorroButtonActionPerformed(evt);
            }
        });
        jPanel2.add(añadirAhorroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 60, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 350, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        notasField.setViewportView(jTextArea1);

        jPanel2.add(notasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 140));

        Section2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/PestañaSuperior_1.png"))); // NOI18N
        jPanel2.add(Section2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -30, 210, 80));

        Bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/econosyncapp/imagenes/BgMainWindow.jpeg"))); // NOI18N
        jPanel2.add(Bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 346, 611));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 350, 140));

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
    
    public javax.swing.JLabel getSaldoObj(){
        return SaldoValue;
    }
    
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
            
            
            ac.addIncome(newMove.getValue(),SaldoValue);
            mt.addMovement(newMove,dtm);
            
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
            
            
            ac.addSpend(newMove.getValue(),SaldoValue);
            mt.addMovement(newMove,dtm);
            
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

    private void metasFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metasFieldActionPerformed
        svac.createObjective(Float.parseFloat(metasField.getText()));
    }//GEN-LAST:event_metasFieldActionPerformed

    private void ahorroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahorroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ahorroFieldActionPerformed

    private void añadirAhorroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirAhorroButtonActionPerformed
        // TODO add your handling code here:
        svac.addSaving(Float.parseFloat(ahorroField.getText()));
        
    }//GEN-LAST:event_añadirAhorroButtonActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        SettingsPopUp stpup = new SettingsPopUp(us);
        stpup.setVisible(true);
        stpup.setLocationRelativeTo(this);
               // TODO add your handling code here:
    }//GEN-LAST:event_SettingsActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel Bg1;
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
    private javax.swing.JLabel Section2;
    private javax.swing.JButton Settings;
    private javax.swing.JTable Tabla1Movimientos;
    private javax.swing.JTextField ValorField;
    private javax.swing.JTextField ahorroField;
    private javax.swing.JProgressBar ahorroProgress;
    private javax.swing.JButton ahorroSectionButton;
    private javax.swing.JLabel ahorroTitle;
    private javax.swing.JLabel ahorroValue;
    private javax.swing.JButton añadirAhorroButton;
    private javax.swing.JLabel añadirAhorroTitle;
    private javax.swing.JButton estadisticasSectionButton;
    private javax.swing.JButton homeSectionButton;
    private javax.swing.JLabel investIcon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField metasField;
    private javax.swing.JLabel metasTitle;
    private javax.swing.JLabel notaTitle;
    private javax.swing.JScrollPane notasField;
    // End of variables declaration//GEN-END:variables
}
