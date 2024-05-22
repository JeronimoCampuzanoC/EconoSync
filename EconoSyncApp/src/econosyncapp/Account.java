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
public class Account {
    private float balance;
    private MainWindow mw;
    
    public Account(MainWindow m){
        mw = m;
        balance= Float.parseFloat(mw.getus().getdb().queryBalance());
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
    public void addIncome(float in, javax.swing.JLabel SaldoValue) throws IOException{
        this.balance += in;
        mw.getus().getdb().writeBalance(Float.toString(this.balance));
        SaldoValue.setText(String.valueOf(balance));
    }
    
    public void addSpend(float sp,javax.swing.JLabel SaldoValue) throws IOException{
        this.balance -= sp;
        mw.getus().getdb().writeBalance(Float.toString(this.balance));
        SaldoValue.setText(String.valueOf(balance));
    }
    
    
    
}
