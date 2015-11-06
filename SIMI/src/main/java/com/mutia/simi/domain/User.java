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
@Table(name = "simi_user")
public class User {
    @Id
    @Column(name = "username")
    private Integer username;
    @Column(name = "password", nullable = false, length = 30)
    private String password;
    @Column(name = "nama", nullable = false, length = 100)
    private String nama;
    @Column(name = "level", nullable = false, length = 10)
    private String level;

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
}
