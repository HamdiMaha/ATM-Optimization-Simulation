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
public class UseATMEvent extends AbstractEvent {

    public UseATMEvent(int time, Customer customer) {
        super(time, customer);
    }

    @Override
    void simulation(Controller c) {
        EventQueue events = c.getEvents();
        int waitTime = time - customer.getarrival_time();
        if (waitTime <= c.getAveragePatience()) {
            events.add(new DepartureEvent(time + customer.transaction_time(), customer));
            AbstractATM atm = c.getAtm();
            if (!atm.withdraw(customer.getamount_withrown())) {
                CustomerQueue line = c.getLine();
                if (!line.isEmpty()) {
                    line.pop();
                    if (!line.isEmpty()) {
                        events.add(new UseATMEvent(time, line.peek()));
                    }
                    c.customerLeaves();
                }
            }
        } else {

            CustomerQueue line = c.getLine();
            if (!line.isEmpty()) {
                line.pop();
                if (!line.isEmpty()) {
                    events.add(new UseATMEvent(time, line.peek()));
                }
                c.customerLeaves();
            }
            //System.out.println("Customer left: " + waitTime);
        }
    }

}
