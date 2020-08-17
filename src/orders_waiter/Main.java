package orders_waiter;

import javax.swing.*;
import java.awt.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }
    
    public void run() {
        JFrame frame = new JFrame("ORDERS WAITER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] data = {"one", "two", "three"};
        JList<String> orders = new JList<String>(data);
        
        frame.getContentPane().add(orders, BorderLayout.CENTER);
        frame.setSize(300, 420);
//        frame.pack();
        frame.setVisible(true);
        frame.setLocation(20, 40);
        // Invoked on the event dispatching thread.
        // Construct and show GUI.
    }
}
