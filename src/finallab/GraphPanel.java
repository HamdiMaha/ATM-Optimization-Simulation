package finallab;

import java.awt.*;
import java.util.*;

/**
 *
 * @author scottianderson Apr 10, 2018 3:08:30 PM
 */
public class GraphPanel extends javax.swing.JPanel {

    private Grapher grapher;
    
    public GraphPanel() {
        grapher = new Grapher();
        initComponents();
        setLayout(null);
        setVisible(true);
    }

    public void setColor(Color c) {
        grapher.setColor(c);
    }
    
    public void graph(String name, ArrayList<Double> data) {
        grapher.setData(data);
        grapher.setName(name);
        repaint();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        grapher.graph(g, this.getBounds());            // Just checking!
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
