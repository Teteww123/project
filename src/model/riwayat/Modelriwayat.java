/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.riwayat;

/**
 *
 * @author acer
 */
public class Modelriwayat {
    private Integer id;
    private String customer_name;
    private Double total_price;
    private String order_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return customer_name;
    }

    public void setName(String name) {
        this.customer_name = name;
    }

    public Double getTotal_Harga() {
        return total_price;
    }

    public void setTotal_Harga(Double price) {
        this.total_price = price;
    }
    
    public String getTanggal() {
        return order_date;
    }

    public void setTanggal(String tanggal) {
        this.order_date = tanggal;
    }
}
