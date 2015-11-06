/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutia.simi.service;
import java.util.List;
import com.mutia.simi.domain.User;
/**
 *
 * @author LabGSG
 */
public interface UserService {
    void save(User user);
    User update(String username, User user);
    void delete(User user);
    void delete(String username);
    List<User> findAll();
    User findById(String username);
}
