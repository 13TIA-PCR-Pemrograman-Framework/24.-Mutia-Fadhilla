/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.service;
import com.mutia.simi.domain.Imunisasi;
import java.util.List;
/**
 *
 * @author LabGSG
 */
public interface ImunisasiService {
    void save(Imunisasi imunisasi);
    Imunisasi update(Integer id, Imunisasi imunisasi);
    void delete(Imunisasi imunisasi);
}
