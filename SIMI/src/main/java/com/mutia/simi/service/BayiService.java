/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.service;
import java.util.List;
import com.mutia.simi.domain.Bayi;
/**
 *
 * @author LabGSG
 */
public interface BayiService {
    void save(Bayi bayi);
    Bayi update(Integer id, Bayi bayi);
    List<Bayi> findAll();
    Bayi findById(Integer id);
    void delete(Bayi bayi);
    void delete(Integer id);
}
