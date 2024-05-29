package view;

import model.Order;

import javax.swing.*;
import java.awt.*;

public class OrderPanel extends JPanel {
    private JTextArea orderDetails;

    public OrderPanel() {
        setLayout(new BorderLayout());
        orderDetails = new JTextArea();
        orderDetails.setEditable(false);
        add(new JScrollPane(orderDetails), BorderLayout.CENTER);
    }

    public void displayOrder(Order order) {
        StringBuilder details = new StringBuilder();
        order.displayOrder(); // This will print to console, you may want to adapt this method
        details.append("Total: ").append(order.getTotalPrice()).append("\n");

        orderDetails.setText(details.toString());
    }
}
