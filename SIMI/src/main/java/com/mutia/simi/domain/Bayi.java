/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.domain;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author LabGSG
 */
@Entity
@Table(name = "simi_bayi")
public class Bayi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bayi_id")
    private Integer id;
    @Column(name = "bayi_nama", nullable = false, length = 100)
    private String nama;
    @Column(name = "bayi_jk", nullable = false, length = 100)
    private String jk;
    @Column(name = "bayi_tanggal_lahir", nullable = false, length = 100)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal_lahir;
    @Column(name = "bayi_nama_ortu", nullable = false, length = 100)
    private String nama_ortu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getNama_ortu() {
        return nama_ortu;
    }

    public void setNama_ortu(String nama_ortu) {
        this.nama_ortu = nama_ortu;
    }
    
    
}
