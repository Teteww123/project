package view;

import model.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AdminPanel extends JPanel {
    private JButton editMenuButton;
    private JButton viewHistoryButton;

    public AdminPanel() {
        setLayout(new BorderLayout());

        editMenuButton = new JButton("Edit Menu");
        viewHistoryButton = new JButton("Lihat Riwayat Pemesanan");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(editMenuButton);
        buttonPanel.add(viewHistoryButton);

        add(buttonPanel, BorderLayout.CENTER);
    }

    public JButton getEditMenuButton() {
        return editMenuButton;
    }

    public JButton getViewHistoryButton() {
        return viewHistoryButton;
    }

    public void updateMenu(List<MenuItem> makananList, List<MenuItem> minumanList) {
        // Implementasi untuk menampilkan daftar menu dan fungsi edit
    }
}
