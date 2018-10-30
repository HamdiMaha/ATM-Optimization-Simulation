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
public class ArrivalEvent extends AbstractEvent {

    public ArrivalEvent(int time, Customer customer) {
        super(time, customer);
    }

    @Override
    void simulation(Controller c) {
        CustomerQueue q = c.getLine();
        if (q.isEmpty()) {
            EventQueue events = c.getEvents();
            events.add(new UseATMEvent(time, customer));
        }
        q.add(customer);

    }

}
