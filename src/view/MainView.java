package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

import model.MenuItem;
import model.Order;

public class MainView extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private CustomerPanel customerPanel;
    private AdminPanel adminPanel;
    private OrderPanel orderPanel;
    private LoginPanel loginPanel;
    private HistoryPanel historyPanel;

    public MainView() {
        setTitle("Restoran XYZ");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        add(mainPanel);
        setVisible(true);

        JPanel mainMenu = new JPanel(new GridLayout(1, 2));
        JButton customerButton = new JButton("Customer");
        JButton adminButton = new JButton("Admin");
        mainMenu.add(customerButton);
        mainMenu.add(adminButton);

        mainPanel.add(mainMenu, "MainMenu");
    }

    public void setCustomerPanel(CustomerPanel customerPanel) {
        this.customerPanel = customerPanel;
        mainPanel.add(customerPanel, "CustomerPanel");
    }

    public void setAdminPanel(AdminPanel adminPanel) {
        this.adminPanel = adminPanel;
        mainPanel.add(adminPanel, "AdminPanel");
    }

    public void setOrderPanel(OrderPanel orderPanel) {
        this.orderPanel = orderPanel;
        mainPanel.add(orderPanel, "OrderPanel");
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
        mainPanel.add(loginPanel, "LoginPanel");
    }

    public void setHistoryPanel(HistoryPanel historyPanel) {
        this.historyPanel = historyPanel;
        mainPanel.add(historyPanel, "HistoryPanel");
    }

    public void showMainMenu() {
        cardLayout.show(mainPanel, "MainMenu");
    }

    public void showCustomerPanel(List<MenuItem> makananList, List<MenuItem> minumanList) {
        customerPanel.updateMenu(makananList, minumanList);
        cardLayout.show(mainPanel, "CustomerPanel");
    }

    public void showAdminPanel() {
        cardLayout.show(mainPanel, "AdminPanel");
    }

    public void showOrderPanel(Order order) {
        orderPanel.displayOrder(order);
        cardLayout.show(mainPanel, "OrderPanel");
    }

    public void showLoginPanel() {
        cardLayout.show(mainPanel, "LoginPanel");
    }

    public void showMenuPanel(List<MenuItem> makananList, List<MenuItem> minumanList) {
        adminPanel.updateMenu(makananList, minumanList);
        cardLayout.show(mainPanel, "AdminPanel");
    }

    public void showHistoryPanel(List<model.History> historyList) {
        historyPanel.updateHistory(historyList);
        cardLayout.show(mainPanel, "HistoryPanel");
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public CustomerPanel getCustomerPanel() {
        return customerPanel;
    }

    public void addCustomerButtonListener(ActionListener listener) {
        JButton customerButton = (JButton) ((JPanel) mainPanel.getComponent(0)).getComponent(0);
        customerButton.addActionListener(listener);
    }

    public void addAdminButtonListener(ActionListener listener) {
        JButton adminButton = (JButton) ((JPanel) mainPanel.getComponent(0)).getComponent(1);
        adminButton.addActionListener(listener);
    }

    public void addLoginButtonListener(ActionListener listener) {
        loginPanel.getLoginButton().addActionListener(listener);
    }

    public void addOrderButtonListener(ActionListener listener) {
        customerPanel.getOrderButton().addActionListener(listener);
    }

    public void addEditMenuButtonListener(ActionListener listener) {
        adminPanel.getEditMenuButton().addActionListener(listener);
    }

    public void addViewHistoryButtonListener(ActionListener listener) {
        adminPanel.getViewHistoryButton().addActionListener(listener);
    }
}