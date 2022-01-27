package service;

import peaksoft.com.entity.Colleagues;

import java.util.List;

public interface Fabric {
    void create(Colleagues colleagues);

    Colleagues updateUsers(int id, String name, String surName, String position, int age);

    Colleagues getById(int id);

    List<Colleagues> getAllUsers();

    void deleteAllTable();

    void delateById(int id);

    List<Colleagues> reade();

    void updateAllName();

    void cleaneAllName();
}
