/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.minuman;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Database;

        
public class DAOMinuman implements InterfaceDAOMinuman {
    
    
    
    
   
    


    @Override
    public List<Modelminuman> getAll() {
        List<Modelminuman> daftarminuman = null;
        try{
            daftarminuman = new ArrayList <>();
            Statement st = Database.connect().createStatement();
            String select = "SELECT * FROM minuman;";
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                Modelminuman minuman = new Modelminuman ();
          
            minuman.setId(rs.getInt("id"));
            minuman.setName(rs.getString("name"));
            minuman.setPrice(rs.getDouble("price"));
           
                daftarminuman.add(minuman);
            }
        }catch(SQLException ex){
            Logger.getLogger(DAOMinuman.class.getName()).log(Level.SEVERE, null,ex);
        }
        return daftarminuman;
    }

    @Override
    public void insert(Modelminuman mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Modelminuman mahasiswa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
