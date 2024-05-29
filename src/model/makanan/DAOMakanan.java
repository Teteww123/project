/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.makanan;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Database;

        
public class DAOMakanan implements InterfaceDAOMakanan {
    
    
    
    
   
    


    @Override
    public List<modelmakanan> getAll() {
        List<modelmakanan> daftarmakanan = null;
        try{
            daftarmakanan = new ArrayList <>();
            Statement st = Database.connect().createStatement();
            String select = "SELECT * FROM makanan;";
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                modelmakanan makanan = new modelmakanan ();
          
            makanan.setId(rs.getInt("id"));
            makanan.setName(rs.getString("name"));
            makanan.setPrice(rs.getDouble("price"));
           
                daftarmakanan.add(makanan);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAOMakanan.class.getName()).log(Level.SEVERE, null,ex);
        }
        return daftarmakanan;
    }

    @Override
    public void insert(modelmakanan mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(modelmakanan mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
