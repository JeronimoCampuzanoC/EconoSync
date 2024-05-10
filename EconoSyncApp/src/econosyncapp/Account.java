/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package econosyncapp;

/**
 *
 * @author jeros
 */
public class Account {
    private float balance;
    private MainWindow mw;
    
    public Account(MainWindow m){
        mw = m;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
    public void addIncome(float in, javax.swing.JLabel SaldoValue){
        this.balance += in;
        SaldoValue.setText(String.valueOf(balance));
    }
    
    public void addSpend(float sp,javax.swing.JLabel SaldoValue){
        this.balance -= sp;
        SaldoValue.setText(String.valueOf(balance));
    }
    
    
    
}
