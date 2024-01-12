package com.ra.model.dao;

import java.util.List;

public interface DAO<T>{
    List<T> findAll();
    T findById(Integer id);
    Boolean saveOrUpdate(T t);
    void delete(Integer id);
}
