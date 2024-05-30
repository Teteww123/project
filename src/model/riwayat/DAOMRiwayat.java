/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.riwayat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Database;
import model.riwayat.Modelriwayat;

/**
 *
 * @author acer
 */
public class DAOMRiwayat implements InterfaceDAORiwayat {
    @Override
    public List<Modelriwayat> getAll() {
        List<Modelriwayat> daftarriwayat = null;
        try{
            daftarriwayat = new ArrayList <>();
            Statement st = Database.connect().createStatement();
            String select = "SELECT * FROM riwayat;";
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Modelriwayat riwayat = new Modelriwayat ();
          
            riwayat.setId(rs.getInt("id"));
            riwayat.setName(rs.getString("customer_name"));
            riwayat.setTotal_Harga(rs.getDouble("total_price"));
            riwayat.setTanggal(rs.getString("order_date"));
           
                daftarriwayat.add(riwayat);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAORiwayat.class.getName()).log(Level.SEVERE, null,ex);
        }
        return daftarriwayat;
    }

    @Override
    public void insert(Modelriwayat mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Modelriwayat mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

}
