/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.dao;

import java.util.ArrayList;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public interface CrudDao<T, ID> extends SuperDao {

    boolean add(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(String ID) throws Exception;

    T get(String ID) throws Exception;

    ArrayList<T> getAll() throws Exception;
}


