/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;
import java.io.*;
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
    
}
