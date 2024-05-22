/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
/**
 *
 * @author jeros
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        switch (row) {
            case 0 -> {setBackground(new Color(255,0,0));setForeground(new Color(0,0,0));}
            case 1 -> {setBackground(new Color(66,135,245));setForeground(new Color(0,0,0));}
            case 2 -> {setBackground(new Color(66,209,54));setForeground(new Color(0,0,0));}
            case 3 -> {setBackground(new Color(106,44,171));setForeground(new Color(0,0,0));}
            case 4 -> {setBackground(new Color(204,29,105));setForeground(new Color(0,0,0));}
            case 5 -> {setBackground(new Color(255,255,0));setForeground(new Color(0,0,0));}
            case 6 -> {setBackground(new Color(82,79,80));setForeground(new Color(0,0,0));}
            case 7 -> {setBackground(new Color(0,0,0)); setForeground(new Color(255,255,255));}
            case 8 -> {setBackground(new Color(255,255,255)); setForeground(new Color(0,0,0));}
            default -> setBackground(null); // Usa el color de fondo por defecto
        }

        return this;
    }
}
