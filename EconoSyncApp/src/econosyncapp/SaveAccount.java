/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

/**
 *
 * @author jeros
 */
public class SaveAccount {
    private float objective;
    private float accumulated;
    private javax.swing.JLabel acumTxt;
    private MainWindow mw;
    private javax.swing.JProgressBar prbar;
    public SaveAccount(MainWindow m,javax.swing.JProgressBar ahorroProgress,javax.swing.JLabel acumText){
        mw = m;
        prbar = ahorroProgress;
        acumTxt= acumText;
    }
    
    public void addSaving(float v){
        this.accumulated += v;
        acumTxt.setText(String.valueOf(accumulated));
        refreshProgressBar();
        
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
        float calc = (objective/accumulated)*100;
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
