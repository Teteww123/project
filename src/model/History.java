package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class History {
    private String customerName;
    private double totalPrice;

    public History(String customerName, double totalPrice) {
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void save() {
        try (Connection conn = Database.getConnection()) {
            String sql = "INSERT INTO riwayat_pemesanan (customer_name, total_price) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, customerName);
                stmt.setDouble(2, totalPrice);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}