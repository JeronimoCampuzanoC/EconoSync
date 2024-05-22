/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author jeros
 */
public class DBHelper {
    public void writePassword(String newP) throws IOException{
        String csvFileName = "src/data/password.csv";
        FileWriter writer = new FileWriter(csvFileName, false);
        writer.write(newP);
        writer.close();
        
    }
    
    public String queryPassword(){
        String file = "src/data/password.csv";
        BufferedReader reader = null;
        String value = "";
        
        try {
            reader = new BufferedReader(new FileReader(file));
            value = reader.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }
            catch(Exception e){
            e.printStackTrace();
            }
        }
        return value;
    }
    
    public void writeMovement(Movement m)throws IOException{
        String csvFileName = "src/data/movements.csv";
        try (FileWriter writer = new FileWriter(csvFileName, true)) {
            writer.write(m.getType()+","+m.getCategory()+","+Float.toString(m.getValue())+","+m.getDate()+"\n");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Movement> readMovements(){
        ArrayList<Movement> registry = new ArrayList();
        
        String file = "src/data/movements.csv";
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] dataArray = line.split(",");
                Movement m = new Movement();
                m.setType(dataArray[0]);
                m.setCategory(dataArray[1]);
                m.setValue(Float.parseFloat(dataArray[2]));
                m.setDate(dataArray[3]);
                
                registry.add(m);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }
            catch(Exception e){
            e.printStackTrace();
            }
        }
        return registry;
    }
    
}
