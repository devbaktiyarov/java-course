package com.devbaktiyarov.collections;

import java.util.*;

import com.devbaktiyarov.exceptions.UserNotActiveException;
import com.devbaktiyarov.exceptions.UserNotFoundException;

public class UserManager {
    List<User> users;

    public UserManager(List<User> users) {
        this.users = users;
    }


    public void addUser(User user) {
        users.add(user);
    }


    public void removeUser(int userId) throws UserNotFoundException{
        users.remove(userId);
    }

    public User getUser(int userId) {
        User user = null;
        try {
             user = users.get(userId); // IndexOutOfBoundsException
             return user;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        // if(user.isActive() == false) {
        //     // throw new UserNotFoundException("Пользователь не найден");
        //     throw new UserNotActiveException("Пользователь не активирован");
        // }
        return user;

        // return users.get(userId);
    }

    public void listUsers() {
        for(User user : users) {
            System.out.println(user);
        }
    }

    public boolean activateUser(int userId) {
        if(users.get(userId) != null) {
            users.get(userId).setActive(true);
            return true;
        }
        
        return false;
    }

    public boolean deactivateUser(int userId) {
        if(users.get(userId) != null) {
            users.get(userId).setActive(false);
            // removeUser(userId);
            return true;
        }
        
        return false;
    }


    public User findUserByUsername(String username) {
        for(User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }


//     Создайте имитацию базы данных для управления пользователями. Реализуйте классы для работы с пользователями и коллекции для хранения данных.
// Требования:
// Классы:
// User:
// Поля: id (int), username (String), email (String), isActive (boolean).
// Методы: конструктор, геттеры, сеттеры, метод toString().
// UserManager:
// Поле: List<User> users.
// Методы:
// addUser(User user): добавление пользователя.
// removeUser(int userId): удаление пользователя по id.
// getUser(int userId): получение пользователя по id.
// listUsers(): вывод всех пользователей.
// activateUser(int userId): активация пользователя.
// deactivateUser(int userId): деактивация пользователя.
// findUserByUsername(String username): поиск пользователя по имени.
// Пример использования:
// В main методе создайте несколько пользователей и добавьте их в UserManager.
// Удалите, активируйте и деактивируйте пользователей.
// Выведите список всех пользователей и результаты поиска.

        

    
}
