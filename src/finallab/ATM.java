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
class ATM extends AbstractATM {
    private int ATM_Cost;
    private int malfunction;
    private double machine_cash;
    private double transaction_cost;
    private int withdrawn_limit;
    private int days;
    private double cash_left = machine_cash;
    

    public int getATM_Cost() {
       return ATM_Cost;
    }
    public int getdays(){
        return days;
    }
   
    @Override
    public void setCostOfATM(int ATM_Cost ) {
       this.ATM_Cost = ATM_Cost;
    }
    public double machine_cash() {
       return machine_cash;
    }
    @Override
    public void setCashLoad(double machine_cash ) {
       this.machine_cash = machine_cash;
       this.refill();
    }
    @Override
    public double getTransaction_cost() {
       return transaction_cost;
    }
    @Override
    public void setCostOfTransaction(double transaction_cost ) {
       this.transaction_cost = transaction_cost;
    }
    public int getwithdrawn_limit() {
       return withdrawn_limit;
    }
    @Override
    public void setWithdrawLimit(int withdrawn_limit ) {
       this.withdrawn_limit = withdrawn_limit;
    }
    public int getmalfunction() {
       return malfunction;
    }
    @Override
    public void setMalfunctionProbability(int malfunction ) {
       this.malfunction = malfunction;
    }
   
    @Override
    public void setdays(int days){
        this.days = days;
    }
    
    @Override
    public boolean withdraw(double amount){
        if (amount > cash_left || amount > withdrawn_limit)
            return false;
        else{
            cash_left = cash_left - amount;
            System.out.println(cash_left);
            return true;
        }
            
        
    }
    @Override
    public  void refill(){
       
        cash_left = machine_cash;
            
    }

    @Override
    public double getCash_left() {
        return cash_left;
    }

    @Override
    public double getMachine_cash() {
        return machine_cash;
    }


}
