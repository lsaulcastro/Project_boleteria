/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import java.util.List;

/**
 *
 * @author sauld
 * @param <entidad>
 */
public interface Repository<entidad> {

     void  save(entidad en);

    void update(entidad en, int x);

    javax.swing.JTable search(javax.swing.JTable en , String a , int b);

    void delete(int id);

    List<entidad> finAll();
}
