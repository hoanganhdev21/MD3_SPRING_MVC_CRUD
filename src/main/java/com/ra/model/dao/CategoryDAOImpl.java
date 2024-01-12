package com.ra.model.dao;

import com.ra.model.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        Session session = sessionFactory.openSession();
        try {
            list = session.createQuery("from Category", Category.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public Category findById(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            Category category = session.get(Category.class,id);
            return category;
        }catch (Exception e){

        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public Boolean saveOrUpdate(Category category) {
        Session section = sessionFactory.openSession();
        try {
            section.beginTransaction();
            section.saveOrUpdate(category);
            section.getTransaction().commit();
            return true;
        } catch (Exception E) {
            section.getTransaction().rollback();
        } finally {
            section.close();
        }
        return false;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(findById(id));
            session.getTransaction().commit();
        }
        catch (Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
    }
}
