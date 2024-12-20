package com.devbaktiyarov.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devbaktiyarov.rest.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer > {
    
}


// Этот код представляет собой интерфейс репозитория в Spring Data JPA. Вот краткое объяснение:

// @Repository

// Аннотация указывает, что этот интерфейс является компонентом Spring, 
// который будет использоваться для доступа к данным.
// // Обычно аннотацию можно опустить, так как Spring автоматически распознает интерфейсы, 
// расширяющие JpaRepository.
// StudentRepository

// Это интерфейс для работы с сущностью Student.
// extends JpaRepository<Student, Integer>

// JpaRepository — это базовый интерфейс Spring Data JPA, предоставляющий готовые методы для работы с базой данных.
// Параметры:
// Student — класс сущности, связанный с таблицей базы данных.
// Integer — тип первичного ключа (id) сущности.
// Методы по умолчанию
// JpaRepository предоставляет множество готовых методов:

// findAll() — получить все записи.
// findById(Integer id) — найти запись по ID.
// save(Student student) — сохранить или обновить запись.
// deleteById(Integer id) — удалить запись по ID.