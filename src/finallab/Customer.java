/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

/**
 *
 * @author hamdi
 */

public class Customer {
    private int arrival_time;
    private int departure_time;
    private double amount_withrown;
    private boolean user_error = false;
    public int number_transactions;
    public int count_transactions = 0;

    public Customer(int arrival_time, int departure_time, double amount_withrown, boolean user_error) {
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.amount_withrown = amount_withrown;
        this.user_error = user_error;
    }
    
    public int getarrival_time() {
       return arrival_time;
    }
    public void setarrival_time(int arrival_time ) {
       this.arrival_time = arrival_time;
    }
    public int getdeparture_time() {
       return departure_time ;
    }
    public void setdeparture_time(int departure_time ) {
       this.departure_time = departure_time;
    }
    public double getamount_withrown() {
       return amount_withrown;
    }
    public void setamount_withrown(double amount_withrown ) {
       this.amount_withrown = amount_withrown;
    }
    public boolean getuser_error() {
       return user_error;
    }
    public void setuser_error(boolean user_error ) {
       this.user_error = user_error;
    }
    public int getnumber_transactions() {
       return number_transactions;
    }
    public void setnumber_transactions(int number_transactions ) {
       this.number_transactions = number_transactions;
    }
    
   public int transaction_time(){
        int trans_time;
        int delay;
        if (user_error)
            delay = 3;
        else 
            delay = 0;
        trans_time = departure_time - arrival_time + delay;
        //count_transactions++;
        return trans_time;
    
    }
    
    
}
