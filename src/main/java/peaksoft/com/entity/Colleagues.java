package peaksoft.com.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "colleagues")
public class Colleagues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surName;
    private String position;
    private int age;

    public Colleagues() {
    }

    public Colleagues(String name, String surName, String position, int age) {
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " id : " + id + "|" +
                " name : " + name + "|" +
                " surName : " + surName + "|" + " position : " + position + "|" +
                " age : " + age + "|" + "\n" +
                "---------------------------------------------------------------------------------";
    }
}
