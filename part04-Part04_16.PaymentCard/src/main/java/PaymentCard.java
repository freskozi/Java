/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denis
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }
    public void eatAffordably() {
    // write code here
    if (this.balance >= 2.60) {
        this.balance = this.balance -2.60;
    }
}

public void eatHeartily() {
    if (this.balance >= 4.60) {
        this.balance = this.balance -4.60;
    }
    // write code here
    
}
public void addMoney(double amount) {
    if (amount > 0) {
        if (this.balance + amount < 150.0) {
            this.balance = this.balance + amount;
        } else {
            this.balance = 150.0;
        }
    }
    // write code here
}

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
}