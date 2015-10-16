/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author LabGSG
 */
public class ProdukService {
    public static String tampilJudul(){
        return "<h3>Data produk yang diinputkan : </h3>";
    }
    public static String tampilKode(String kode){
        return "<tr>"
                + "<td>Kode Produk</td>"
                + "<td>:</td>"
                + "<td>" + kode + "</td>";
    }
    public static String tampilNama(String nama){
        return "<tr>"
                + "<td>Nama Produk</td>"
                + "<td>:</td>"
                + "<td>" + nama + "</td>";
    }
    public static String tampilHarga(String harga){
        return "<tr>"
                + "<td>Harga</td>"
                + "<td>:</td>"
                + "<td>Rp. " + harga + "</td>";
    }
    public static String tampilStok(String stok){
        return "<tr>"
                + "<td>Stok</td>"
                + "<td>:</td>"
                + "<td>" + stok + "</td>";
    }
}
