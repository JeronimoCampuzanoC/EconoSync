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
    public String queryPassword(){
        String file = "src/econosyncapp/password.csv";
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
