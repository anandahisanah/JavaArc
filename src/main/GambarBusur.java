package main;

import javax.swing.JFrame;

public class GambarBusur {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Busur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BusurJPanel busurJPanel = new BusurJPanel();
        frame.add(busurJPanel);
        frame.setSize(300, 210);
        frame.setVisible(true);
    }
}
