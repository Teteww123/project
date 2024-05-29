package view;

import model.makanan.Customer;
import model.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerPanel extends JPanel {
    private JTextField nameField;
    private JButton orderButton;
    private JPanel menuPanel;
    private Map<Integer, JTextField> quantityFields;

    public CustomerPanel() {
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));
        topPanel.add(new JLabel("Nama:"));
        nameField = new JTextField();
        topPanel.add(nameField);
        add(topPanel, BorderLayout.NORTH);

        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 3));
        add(new JScrollPane(menuPanel), BorderLayout.CENTER);

        orderButton = new JButton("Pesan");
        add(orderButton, BorderLayout.SOUTH);
    }

    public Customer getCustomer() {
        return new Customer(nameField.getText());
    }

    public JButton getOrderButton() {
        return orderButton;
    }

    public void updateMenu(List<MenuItem> makananList, List<MenuItem> minumanList) {
        menuPanel.removeAll();
        quantityFields = new HashMap<>();

        for (MenuItem menuItem : makananList) {
            menuPanel.add(new JLabel(menuItem.getName()));
            menuPanel.add(new JLabel(String.valueOf(menuItem.getPrice())));
            JTextField quantityField = new JTextField();
            menuPanel.add(quantityField);
            quantityFields.put(menuItem.getId(), quantityField);
        }

        for (MenuItem menuItem : minumanList) {
            menuPanel.add(new JLabel(menuItem.getName()));
            menuPanel.add(new JLabel(String.valueOf(menuItem.getPrice())));
            JTextField quantityField = new JTextField();
            menuPanel.add(quantityField);
            quantityFields.put(menuItem.getId(), quantityField);
        }

        revalidate();
        repaint();
    }

    public int getQuantity(int menuId) {
        String quantityText = quantityFields.get(menuId).getText();
        return quantityText.isEmpty() ? 0 : Integer.parseInt(quantityText);
    }
}
