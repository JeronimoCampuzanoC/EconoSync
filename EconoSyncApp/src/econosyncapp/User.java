/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

import java.io.IOException;

/**
 *
 * @author jeros
 */
public class User {
    private Login lg;
    
    private String password;
    private DBHelper db;
    
    public User(Login l){
        db = new DBHelper();
        lg = l;
    }
    public boolean login(String pass){
        boolean success = false;
        password= db.queryPassword();
        
        if(password.equals(pass)){
            MainWindow Main = new MainWindow(this);
            Main.setVisible(true);
            Main.setSize(360, 620);
            lg.setVisible(false);
            success = true;
        }
        return success;
    }
    public boolean changePassword(String pass) throws IOException{
        boolean success = false;
        
        db.writePassword(pass);
        success = true;
        
        return success;
    }
}
