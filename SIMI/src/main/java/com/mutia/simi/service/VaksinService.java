/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.service;
import java.util.List;
import com.mutia.simi.domain.Vaksin;
/**
 *
 * @author LabGSG
 */
public interface VaksinService {
    void save(Vaksin vaksin);
    void delete(Vaksin vaksin);
    void delete(Integer id);
    Vaksin update(Integer id, Vaksin vaksin);
    List<Vaksin> findAll();
    Vaksin findById(Integer id);
}
