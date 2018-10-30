/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.awt.*;
import java.util.*;

/**
 *
 * @author scottianderson
 */
public class Grapher {

    private ArrayList<Double> data;
    private String name;
    private boolean ready;
    private Rectangle totalSpace;
    private Rectangle graphSpace;
    private int widthMargin;
    private int heightMargin;
    private Color color = Color.GREEN;

    public Grapher() {
        ready = false;
    }

    public Grapher(String name, ArrayList<Double> data) {
        this.name = name;
        this.data = data;
        ready = true;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
        ready = name != null;
    }

    public void setName(String name) {
        this.name = name;
        ready = data != null;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void graph(Graphics g, Rectangle bounds) {
        graph(g, bounds.x, bounds.y, bounds.width, bounds.height);
    }

    public void graph(Graphics g, int x, int y, int width, int height) {
        if (ready) {
            g.setColor(Color.white);
            g.fillRect(x, y, width, height);

            setRectangle(x, y, width, height);
            //g.setColor(Color.red);
            //g.fillRect(graphSpace.x, graphSpace.y, graphSpace.width, graphSpace.height);
            double max = data.get(0);
            for (Double d : data) {
                if (d > max) {
                    max = d;
                }
            }

            drawTitle(g);
            drawAxis(g, max);
            drawData(g, max);

        }
    }

    private void setRectangle(int x, int y, int width, int height) {
        totalSpace = new Rectangle(x, y, width, height);
        int dW = width / 10;
        int dH = height / 10;
        graphSpace = new Rectangle(x + dW, y + dH, width - (2 * dW), height - (2 * dW));
    }

    private void drawTitle(Graphics g) {
        g.setColor(Color.black);
        g.drawString(name, totalSpace.width / 2, 15);
    }

    private void drawAxis(Graphics g, double max) {
        g.setColor(Color.black);
        int bottom = graphSpace.y + graphSpace.height;
        int right = graphSpace.x + graphSpace.width;
        g.drawLine(graphSpace.x, graphSpace.y, graphSpace.x, bottom);
        g.drawLine(graphSpace.x, bottom, right, bottom);
        g.drawString(max + "", 5, graphSpace.y);
        g.drawString(0 + "", 5, graphSpace.y + graphSpace.height);
        g.drawString(data.size() + "", graphSpace.y + graphSpace.width, graphSpace.y + graphSpace.height + 15);
    }

    private void drawData(Graphics g, double max) {
        int numPoints = data.size();
        int barSize = graphSpace.width / numPoints;

        int currentX = graphSpace.x;
        int y = graphSpace.y + graphSpace.height;

        for (int i = 0; i < numPoints; i++) {
            int nextX = currentX + barSize;
            g.setColor(color);
            int height = getHeight(data.get(i), max);
            g.fillRect(currentX, y - height, barSize, height);
            //Rectangle bar = new Rectangle();
            currentX = nextX;

        }

    }

    private int getHeight(Double value, double max) {
        return (int) ((graphSpace.height * value) / max);
    }

}
