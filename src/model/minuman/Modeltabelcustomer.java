/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.minuman;


import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Malik
 */
public class Modeltabelcustomer extends AbstractTableModel {
    List<Modelminuman> daftarminuman;
    String kolom[] = {"ID", "Menu makanan", "Harga"};
    
    public Modeltabelcustomer(List<Modelminuman> daftarminuman) {
        this.daftarminuman = daftarminuman;
    }
    
    @Override
    public int getRowCount() {
        return daftarminuman.size();
    }
    
    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarminuman.get(rowIndex).getId();
            case 1:
                return daftarminuman.get(rowIndex).getName();
            case 2:
                return daftarminuman.get(rowIndex).getPrice();
            default:
                return null;
        }
    }
}