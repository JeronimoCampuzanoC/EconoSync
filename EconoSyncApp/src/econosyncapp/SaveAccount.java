/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeros
 */
public class SaveAccount {
    private float objective;
    private float accumulated;
    private javax.swing.JLabel acumTxt;
    private MainWindow mw;
    private Account ac; 
    private MovementTable mt;
    private javax.swing.JProgressBar prbar;
    
    private DefaultTableModel dtm;
    
    
    public SaveAccount(MainWindow m,javax.swing.JProgressBar ahorroProgress,javax.swing.JLabel acumText, Account a,DefaultTableModel dt, MovementTable mta){
        mw = m;
        ac = a;
        prbar = ahorroProgress;
        acumTxt= acumText;
        dtm = dt;
        mt= mta;
        
    }
    
    public void addSaving(float v){
        this.accumulated += v;
        acumTxt.setText(String.valueOf(accumulated));
        refreshProgressBar();
        
        Movement newMove = new Movement();
        newMove.setType("-");
        newMove.setCategory("Ahorro");
        newMove.setValue(v);

        LocalDate fechaActual = LocalDate.now();
        newMove.setDate(fechaActual.toString());


        ac.addSpend(newMove.getValue(),mw.getSaldoObj());
        try {
            mt.addMovement(newMove, dtm);
        } catch (IOException ex) {
            Logger.getLogger(SaveAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void substractSavig(float v){
        this.accumulated -= v;
        acumTxt.setText(String.valueOf(accumulated));
        refreshProgressBar();
    }
    
    public void createObjective(float v){
        this.objective = v;
        refreshProgressBar();
    }
    
    public void refreshProgressBar(){
        float calc = (100*accumulated)/objective;
        if (calc>100){
            prbar.setValue(100);
        }
        else if(calc<0){
            prbar.setValue(0);
        }
        else{
            prbar.setValue((int)calc);
        }
        
    }
}
