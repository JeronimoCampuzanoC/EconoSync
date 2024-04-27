/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
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
    public MovementTable(MainWindow m){
        mw = m;
    }
    public void addMovement(Movement m,DefaultTableModel dtm){
        registry.add(m);
        o[0] = m.getType();
        o[1] = m.getCategory();
        o[2] = m.getValue();
        o[3] = m.getDate();
            
        dtm.addRow(o);
    }

}
