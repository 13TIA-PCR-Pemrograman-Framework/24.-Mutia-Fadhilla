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
@Table(name = "simi_imunisasi")
public class Imunisasi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "imunisasi_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "bayi_id", nullable = false)
    private Bayi bayi;
    @ManyToOne
    @JoinColumn(name = "vaksin_id", nullable = false)
    private Vaksin vaksin;
    @Column(name = "imunisasi_tanggal", nullable = false, length = 100)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @Column(name = "imunisasi_status", nullable=false, length=10)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bayi getBayi() {
        return bayi;
    }

    public void setBayi(Bayi bayi) {
        this.bayi = bayi;
    }

    public Vaksin getVaksin() {
        return vaksin;
    }

    public void setVaksin(Vaksin vaksin) {
        this.vaksin = vaksin;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
