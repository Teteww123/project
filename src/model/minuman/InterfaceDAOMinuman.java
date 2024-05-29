/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.minuman;


import java.util.List;

/**
 *
 * @author Malik
 */
public interface InterfaceDAOMinuman {
    public void insert(Modelminuman mahasiswa);
    
    // Method untuk mengupdate (mengedit) suatu data mahasiswa
    public void update(Modelminuman mahasiswa);
    
    // Method untuk menghapus suatu data mahasiswa
    public void delete(int id);
    
    // Method untuk mengambil data mahasiswa
    public List<Modelminuman> getAll();
}
