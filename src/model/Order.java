package model;

import model.makanan.Customer;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Customer customer;
    private Map<MenuItem, Integer> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new HashMap<>();
    }

    public void addItem(MenuItem menu, int quantity) {
        items.put(menu, items.getOrDefault(menu, 0) + quantity);
    }

    public double getTotalPrice() {
        return items.entrySet().stream()
            .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
            .sum();
    }

    public void displayOrder() {
        System.out.println("Pesanan untuk " + customer.getName() + ":");
        for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + " x " + entry.getValue() + " = " + (entry.getKey().getPrice() * entry.getValue()));
        }
        System.out.println("Total: " + getTotalPrice());
    }
}
