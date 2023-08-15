package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BusurJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // mulai dari 0 sampai 360 derajat
        g.setColor(Color.RED);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80, 0, 360);

        // mulai dari 0 sampai 110 derajat
        g.setColor(Color.RED);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);

        // mulai dari 0 sampai -270 derajat
        g.setColor(Color.RED);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, -270);

        // mulai dari 0 sampai 360 derajat
        g.fillArc(15, 120, 80, 40, 0, 360);

        // mulai dari -270 sampai -90 derajat
        g.fillArc(100, 120, 80, 40, 0, 360);

        // mulai dari 0 sampai -270 derajat
        g.fillArc(185, 120, 80, 40, 0, -270);
    }
}