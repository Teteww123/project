/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.riwayat;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.minuman.Modelminuman;

/**
 *
 * @author acer
 */
public class Modeltabelriwayat extends AbstractTableModel {
    List<Modelriwayat> daftarriwayat;
    String kolom[] = {"ID", "Nama Customer", "Total_Harga", "Tanggal"};
    
    public Modeltabelriwayat(List<Modelminuman> daftarminuman) {
        this.daftarriwayat = daftarriwayat;
    }
    
    @Override
    public int getRowCount() {
        return daftarriwayat.size();
    }
    
    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarriwayat.get(rowIndex).getId();
            case 1:
                return daftarriwayat.get(rowIndex).getName();
            case 2:
                return daftarriwayat.get(rowIndex).getTotal_Harga();
            case 3:
                return daftarriwayat.get(rowIndex).getTanggal();
            default:
                return null;
        }
    }
}
