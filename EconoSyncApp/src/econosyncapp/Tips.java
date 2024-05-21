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
        int limiteSuperior = 4;

        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 0 -> inflationTip();
            case 1 -> remindSave();
            case 2 -> investTip();
            case 3 -> savingTip();
            default -> inflationTip();
        }
    }
    private static void inflationTip(){
        int limiteSuperior = 4;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 0 -> message = "Busca aumentar tus ingresos e invertir en activos que protejan tu dinero";
            case 1 -> message = "No dejes tu dinero sin mover mucho tiempo, se devalua";
            case 2 -> message = "Busca un trabajo secundario o invierte en activos que generen ingresos.";
            case 3 -> message = "Invierte en activos que superen la inflación, como inversiones en la bolsa de valores o bienes raíces.";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"InflationTIP",1);
    }
    private static void remindSave(){
        int limiteSuperior = 4;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 0 -> message = "Es un buen momento para no antojarte de algo y ahorrar ese dinero";
            case 1 -> message = "¿Y si enves de comprar la suscripcion metes eso a un CDT?";
            case 2 -> message = "¿Que porcentaje llevas ahorrado este mes";
            case 3 -> message = "¿Ya ahorraste hoy?";
        }
        
        JOptionPane.showMessageDialog(null, message,"SaveRemind",1);
    }
    private static void investTip(){
        int limiteSuperior = 4;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
            case 0 -> message = "Distribuye tu dinero en diferentes tipos de inversiones para reducir el riesgo.";
            case 1 -> message = "Antes de invertir, entiende tu tolerancia al riesgo.";
            case 2 -> message = "Usa las ganancias para generar mayor retorno";
            case 3 -> message = "Analiza periódicamente tu cartera y haz ajustes si es necesario.";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"InvestTip",1);
    }
    private static void savingTip(){
        int limiteSuperior = 4;
        String message = "";
        Random random = new Random();
        int rand = random.nextInt(limiteSuperior);
        switch(rand){
             case 0 -> message = "Crea un plan para tus ingresos y gastos.";
            case 1 -> message = "Elimina compras innecesarias y busca alternativas más económicas.";
            case 2 -> message = "Separa una cantidad fija de tus ingresos cada mes.";
            case 3 -> message = "¿Ya ahorraste hoy?";
                
        }
        
        JOptionPane.showMessageDialog(null, message,"SavingTip",1);
    }
    
    
}
