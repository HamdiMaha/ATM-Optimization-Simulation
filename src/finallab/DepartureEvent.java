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
public class DepartureEvent extends AbstractEvent {

    public DepartureEvent(int time, Customer customer) {
        super(time, customer);
    }

    @Override
    void simulation(Controller c) {
        CustomerQueue line = c.getLine();
        if (!line.isEmpty()) {
            
            line.pop();
            if (!line.isEmpty()) {

                EventQueue events = c.getEvents();
                events.add(new UseATMEvent(time, line.peek()));
            }
        }
    }

}
