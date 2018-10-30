/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.util.*;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author scottianderson
 */
public class Controller extends AbstractController {

    private AbstractATM atm;
    private int avgTransactionLength;
    private int avgPatience;
    private int avgNumber;
    private double avgImpatientCustomers;
    private double moneyMade = 0;
    
    private int counter = 0;

    private EventQueue events;
    private CustomerQueue line;
    private ArrayList<Double> waitTimeList;
    private ArrayList<Double> waitTimePerDayList;
    private ArrayList<Double> impatientCustomersList;
    private ArrayList<Double> moneyMadeList;

    public Controller(JPanel panel) {
        super(panel);
        //atms = new ATM_list();
        events = new EventQueue();
        line = new CustomerQueue();
        waitTimeList = new ArrayList<>();
        waitTimePerDayList = new ArrayList<>();
        impatientCustomersList = new ArrayList<>();
        moneyMadeList = new ArrayList<>();
    }

    @Override
    public void addATM(AbstractATM atm) {
        this.atm = atm;
    }

    @Override
    public void setAvgTransactionLength(int length) {
        avgTransactionLength = length;
    }

    @Override
    public void setAvgPatience(int avgPatience) {
        this.avgPatience = avgPatience;
    }

    @Override
    public void setAvgNumber(int avgNumber) {
        this.avgNumber = avgNumber;
    }

    public int getAvgNumber() {
        return avgNumber;
    }

    public EventQueue getEvents() {
        return events;
    }

    public CustomerQueue getLine() {
        return line;
    }

    @Override
    public void run(int numDays) {
        waitTimePerDayList = new ArrayList<>();
        impatientCustomersList = new ArrayList<>();
        moneyMadeList = new ArrayList<>();
        moneyMade = 0;
        double totalImpatientCustomer = 0;
        for (int day = 0; day < numDays; day++) {
            counter = 0;
            waitTimeList = new ArrayList<>();
            double total = 0;
            
//            for (int i = 0; i < numDays; i++) {
            /// Create list of customers

            /// Generate time of day / length of transaction / withdraw amount
                /// Push customers into event queue for arrival
                Customer_list customers = new Customer_list();
                //  System.out.print(avgNumber);
//                ATM atm = new ATM();
                //System.out.println("avgNum" + avgNumber);
                for (int j = 0; j < avgNumber; j++) {
                    Random rand = new Random();
                    int arrival = rand.nextInt(1440);

                    int depart = arrival + rand.nextInt(7);
                    //System.out.println("withdraw limit " + atm.getwithdrawn_limit());
                    int amount_withrown = rand.nextInt(atm.getwithdrawn_limit()); //change the 300  to withdrown limit
                    boolean error = rand.nextBoolean();
                    customers.add(new Customer(arrival, depart, amount_withrown, error));

                }

                for (Customer c : customers) {
                    events.add(new ArrivalEvent(c.getarrival_time(), c));
                }

                /// Calculate time spent
                while (!events.isEmpty()) {
                    AbstractEvent e = events.poll();
                    e.simulation(this);

                    if (e instanceof DepartureEvent) {
                        double value = (double) e.time - e.getCustomer().getarrival_time() - e.getCustomer().transaction_time();
                        waitTimeList.add(value);
                        total += value;
                    }
               // }

                
            }
                //System.out.println(atm);
                //System.out.println(waitTimeList);
                if (atm.getCash_left() <= atm.getMachine_cash() / 4) {
                    atm.refill();
                }
                double moneyDay = (customers.size() - counter) * atm.getTransaction_cost();
                moneyMadeList.add(moneyDay);
                moneyMade += moneyDay;
                totalImpatientCustomer += counter;
                impatientCustomersList.add((double) counter);
                waitTimePerDayList.add(total / waitTimeList.size());
                System.out.println("Wait time: " + total / waitTimeList.size());
        }
        avgImpatientCustomers = totalImpatientCustomer / numDays;
        //System.out.println("moneyMade" + moneyMade);   
    }

    @Override
    public void reset() {
        //atms = new ATM_list();
    }

    @Override
    public ArrayList<Double> getWaitTimeList() {
        return waitTimeList;
    }

    public void setWaitTimePerDayList(ArrayList<Double> waitTimePerDayList) {
        this.waitTimePerDayList = waitTimePerDayList;
    }

    @Override
    public ArrayList<Double> getWaitTimePerDayList() {
        return waitTimePerDayList;
    }

    int getAveragePatience() {
        return avgPatience;
    }

    public void customerLeaves() {
        counter++;
    }

    @Override
    public ArrayList<Double> getImpatientCustomersList() {
        return impatientCustomersList;
    }

    @Override
    public double getAvgImpatientCustomers() {
        return avgImpatientCustomers;
    }

    public AbstractATM getAtm() {
        return atm;
    }

    @Override
    public ArrayList<Double> getMoneyMadeList() {
        return moneyMadeList;
    }

    @Override
    public double getMoneyMade() {
        return moneyMade;
    }

}
