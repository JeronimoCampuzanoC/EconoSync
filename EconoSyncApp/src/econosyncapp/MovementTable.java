/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
import java.util.ArrayList;
/**
 *
 * @author jeros
 */
public class MovementTable {
    public ArrayList<Movement> registry = new ArrayList();
    private MainWindow mw;
    public MovementTable(MainWindow m){
        mw = m;
    }
    public void addMovement(Movement m){
        registry.add(m);
        mw.addItemMovementTable(m);
    }

}
