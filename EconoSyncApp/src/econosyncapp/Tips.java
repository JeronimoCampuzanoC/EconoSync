/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author jeros
 */
public class Tips {
    public static void showTips(){
        int limiteSuperior = 5;

        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 1 -> inflationTip();
            case 2 -> remindSave();
            case 3 -> investTip();
            case 4 -> savingTip();
            default -> inflationTip();
        }
    }
    private static void inflationTip(){
        int limiteSuperior = 5;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 1 -> message = "Tip1";
            case 2 -> message = "Tip2";
            case 3 -> message = "Tip3";
            case 4 -> message = "Tip4";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"InflationTIP",1);
    }
    private static void remindSave(){
        int limiteSuperior = 5;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 1 -> message = "Tip1";
            case 2 -> message = "Tip2";
            case 3 -> message = "Tip3";
            case 4 -> message = "Tip4";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"SaveRemind",1);
    }
    private static void investTip(){
        int limiteSuperior = 5;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 1 -> message = "Tip1";
            case 2 -> message = "Tip2";
            case 3 -> message = "Tip3";
            case 4 -> message = "Tip4";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"InvestTip",1);
    }
    private static void savingTip(){
        int limiteSuperior = 5;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 1 -> message = "Tip1";
            case 2 -> message = "Tip2";
            case 3 -> message = "Tip3";
            case 4 -> message = "Tip4";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"SavingTip",1);
    }
    
    
}
