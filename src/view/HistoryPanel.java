package view;

import model.History;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class HistoryPanel extends JPanel {
    private JTextArea historyArea;

    public HistoryPanel() {
        setLayout(new BorderLayout());
        historyArea = new JTextArea();
        historyArea.setEditable(false);
        add(new JScrollPane(historyArea), BorderLayout.CENTER);
    }

    public void updateHistory(List<History> historyList) {
        StringBuilder details = new StringBuilder();

        for (History history : historyList) {
            details.append("Nama: ").append(history.getCustomerName()).append(", Total: ").append(history.getTotalPrice()).append("\n");
        }

        historyArea.setText(details.toString());
    }
}