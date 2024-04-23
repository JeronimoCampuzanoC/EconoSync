/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

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
            MainWindow Main = new MainWindow();
            Main.setVisible(true);
            lg.setVisible(false);
            success = true;
            
        }
        return success;
    }
    public boolean changePassword(){
        return false;
    }
}
