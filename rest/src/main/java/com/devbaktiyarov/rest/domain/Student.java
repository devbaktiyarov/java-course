package com.devbaktiyarov.rest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String name;
    private int studentGroup;


// Этот класс представляет сущность Student, которая будет храниться в базе данных с использованием JPA. Разберем его основные части:

// 1. Аннотация @Entity
// Указывает, что класс является сущностью и соответствует таблице в базе данных.
// Таблица будет автоматически создана/обновлена в зависимости от настроек (spring.jpa.hibernate.ddl-auto).
// 2. Поле id
// @Id
// Указывает, что это поле — первичный ключ таблицы.
// @GeneratedValue(strategy = GenerationType.AUTO)
// Настраивает автоматическую генерацию значения для id. Стратегия AUTO позволяет JPA выбрать наиболее подходящий способ генерации.

    public Student() {
    }

    public Student(String name, int studentGroup) {
        this.name = name;
        this.studentGroup= studentGroup;
    }
 
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", group=" + studentGroup + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStidentGroup() {
        return studentGroup;
    }

    public void setStidentGroup(int stidentGroup) {
        this.studentGroup = stidentGroup;
    }

    

    
    
    
}
