package service;

import org.hibernate.Session;
import peaksoft.com.entity.Colleagues;
import peaksoft.com.util.Hibernate;

import javax.persistence.Query;
import java.util.List;

public class FabricImpl implements Fabric {
    @Override
    public void create(Colleagues colleagues) {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            session.save(colleagues);
            session.getTransaction().commit();
            session.close();
            System.out.println("Добавлен : " + colleagues);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Colleagues getById(int id) {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            Colleagues colleagues = session.get(Colleagues.class, id);
            session.getTransaction().commit();
            session.close();
            return colleagues;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Colleagues> getAllUsers() {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            List<Colleagues> colleagues = session.createQuery("from Colleagues ").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println(colleagues.size());
            return colleagues;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void deleteAllTable() {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            Query query = session.createQuery("DELETE FROM Colleagues ");
            query.executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("Таблица очищено : ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delateById(int id) {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            Colleagues colleagues = session.get(Colleagues.class, id);
            session.delete(colleagues);
            session.getTransaction().commit();
            session.close();
            System.out.println("Удачно : ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Colleagues updateUsers(int id, String name, String surName, String position, int age) {
        try {
            Session session = Hibernate.getSession().openSession();
            session.beginTransaction();
            Colleagues colleagues = session.get(Colleagues.class, id);
            colleagues.setId(id);
            colleagues.setName(name);
            colleagues.setSurName(surName);
            colleagues.setPosition(position);
            colleagues.setAge(age);
            session.getTransaction().commit();
            session.close();
            System.out.println("Удачно : ");
            return colleagues;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Colleagues> reade() {
        Session session = Hibernate.getSession().openSession();
        session.beginTransaction();
        List<Colleagues> users = session.createQuery(" FROM Colleagues WHERE age>20 and name IN ('Aza')").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;
    }

    public void updateAllName() {
        Session session = Hibernate.getSession().openSession();
        session.beginTransaction();

        session.createQuery(" UPDATE Colleagues SET age=18 WHERE name='Aza' ").executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }

    public void cleaneAllName() {
        Session session = Hibernate.getSession().openSession();
        session.beginTransaction();
        session.createQuery("DELETE Colleagues WHERE name='Aza'").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully update!\tПроверьте SQL Таблицу чтобы узнать изменение!");
    }
}