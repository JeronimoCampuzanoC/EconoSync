/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jeros
 */
public class MovementTable {
    public ArrayList<Movement> registry = new ArrayList();
    
    private MainWindow mw;
    private Object[] o =  new Object[4];
    public MovementTable(MainWindow m) throws IOException{
        mw = m;
    }
    public void addMovement(Movement m,DefaultTableModel dtm) throws IOException{
        registry.add(m);
        mw.getus().getdb().writeMovement(m);
        o[0] = m.getType();
        o[1] = m.getCategory();
        o[2] = m.getValue();
        o[3] = m.getDate();
            
        dtm.addRow(o);
    }
    
    public Float[] calculateStadistics(){
        Float[] spendStadistics= new Float[9];
        int indexSet;
        for (int i = 0; i < spendStadistics.length; i++) {
            spendStadistics[i] = 0.0f;
        }
        for (Movement registry1 : registry) {
            if (registry1.getType().equals("-")){
                switch (registry1.getCategory()) {
                    case "Arriendo" -> indexSet=0;
                    case "Comida" -> indexSet=1;
                    case "Servicios" -> indexSet=2;
                    case "Ropa" -> indexSet=3;
                    case "Hogar" -> indexSet=4;
                    case "Hobby" -> indexSet=5;
                    case "Urgencia" -> indexSet=6;
                    case "Deuda" -> indexSet=7;
                    case "Ahorro" -> indexSet=8;
                    default -> indexSet=8;
                }
                spendStadistics[indexSet]=spendStadistics[indexSet]+registry1.getValue();
            }
            
        }
        return spendStadistics;
    }
    
    public Float[] calculateStadisticsIngresos(){
        Float[] spendStadistics= new Float[4];
        int indexSet;
        for (int i = 0; i < spendStadistics.length; i++) {
            spendStadistics[i] = 0.0f;
        }
        for (Movement registry1 : registry) {
            if (registry1.getType().equals("+")){
                switch (registry1.getCategory()) {
                    case "Sueldo" -> indexSet=0;
                    case "Ganancia Ocasional" -> indexSet=1;
                    case "Ingreso Pasivo" -> indexSet=2;
                    case "Venta" -> indexSet=3;
                    default -> indexSet=0;
                }
                spendStadistics[indexSet]=spendStadistics[indexSet]+registry1.getValue();
            }
            
        }
        return spendStadistics;
    }
    public void recoverMovements() throws IOException{
        registry = mw.getus().getdb().readMovements();
        for (Movement m : registry) {
            o[0] = m.getType();
            o[1] = m.getCategory();
            o[2] = m.getValue();
            o[3] = m.getDate();

            mw.getdtm().addRow(o);
        }
        
    }


}
