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
public class HelloService {
    public static String sayHello(String kode, String nama, String harga, String stok){
        return "" 
                + "Kode barang : "+kode+"<br>"
                + "Nama barang : "+nama+"<br>"
                + "Harga : Rp."+harga+"<br>"
                + "Stok : "+stok;
    }
}
