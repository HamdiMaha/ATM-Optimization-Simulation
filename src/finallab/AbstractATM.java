/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

/**
 *
 * @author scottianderson
 */
public abstract class AbstractATM {
    
    public abstract void setWithdrawLimit(int limit);
    public abstract void setMalfunctionProbability(int prob);
    public abstract void setCostOfATM(int cost);
    public abstract void setCostOfTransaction(double cost);
    public abstract void setCashLoad(double load);
    public abstract void setdays(int days);
    public abstract boolean withdraw(double amount);
    public abstract void refill();
    
    public abstract int getwithdrawn_limit();
    public abstract double getCash_left();
    public abstract double getMachine_cash();
    abstract public double getTransaction_cost();
}
