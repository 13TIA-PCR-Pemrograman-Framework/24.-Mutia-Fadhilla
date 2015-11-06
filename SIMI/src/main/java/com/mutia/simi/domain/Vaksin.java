/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.domain;

import javax.persistence.*;

/**
 *
 * @author LabGSG
 */
@Entity
@Table(name = "simi_vaksin")
public class Vaksin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vaksin_id")
    private Integer id;
    @Column(name = "vaksin_nama", nullable=false, length=100)
    private String nama;
    @Column(name = "vaksin_usia",nullable=false)
    private Integer usia;
    @Column(name = "vaksin_info")
    private String info;

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

    public Integer getUsia() {
        return usia;
    }

    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
