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
public abstract class AbstractEvent implements Comparable <AbstractEvent>{
   protected int time;
   Customer customer;
   public AbstractEvent(int time, Customer customer) {
       this.time = time;
       this.customer = customer;
   }
   
   abstract void simulation(Controller c);
   public Customer getCustomer(){
        return customer;
   }
   @Override
   public int compareTo(AbstractEvent e){
       if (time > e.time)
           return 1;
       if (time < e.time)
           return -1;
       else
       return 0; 
   }
    
}
