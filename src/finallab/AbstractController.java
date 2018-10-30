/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author scottianderson
 */
public abstract class AbstractController {
    private JPanel panel;
    
    public AbstractController(JPanel panel) {
        this.panel = panel;
    }
    
    public abstract void addATM(AbstractATM atm);
    public abstract void setAvgTransactionLength(int length);
    public abstract void setAvgPatience(int patience);
    public abstract void setAvgNumber(int number);
    
    public abstract void run(int numDays);
    public abstract void reset();
    
    abstract public ArrayList<Double> getWaitTimeList();
    abstract public ArrayList<Double> getWaitTimePerDayList();
    abstract public ArrayList<Double> getImpatientCustomersList();
    abstract public ArrayList<Double> getMoneyMadeList();
    abstract public double getAvgImpatientCustomers();

    abstract public double getMoneyMade();

}
