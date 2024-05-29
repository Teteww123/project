/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.makanan;

import java.util.List;

/**
 *
 * @author Malik
 */
public interface InterfaceDAOMakanan {
    public void insert(modelmakanan mahasiswa);
    
    // Method untuk mengupdate (mengedit) suatu data mahasiswa
    public void update(modelmakanan mahasiswa);
    
    // Method untuk menghapus suatu data mahasiswa
    public void delete(int id);
    
    // Method untuk mengambil data mahasiswa
    public List<modelmakanan> getAll();
}
