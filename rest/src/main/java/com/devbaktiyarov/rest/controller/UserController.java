package com.devbaktiyarov.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.devbaktiyarov.rest.domain.User;



// Примеры работы находятся в папке example

// @RestController сообщает Spring Boot, что данный класс будет управлять REST-запросами 
// и автоматически преобразовывать ответы в JSON-формат.
// @RequestMapping("/users") задает базовый путь (/users) для всех маршрутов (endpoint), 
// определенных в этом контроллере. Например, запросы на /users/add, /users/{id} и т.д. 
// будут перенаправлены в методы этого контроллера.

@RestController
@RequestMapping("/users")
public class UserController {

    // Это поле представляет собой хранилище пользователей в виде Map, 
    // где Integer — уникальный идентификатор пользователя (ID), а User — объект пользователя. 
    // Оно временно хранит пользователей в памяти приложения.
    private Map<Integer, User> users = new HashMap<>();


    // private final RestTemplate restTemplate;

    // public UserController(RestTemplate restTemplate) {
    //     this.restTemplate = restTemplate;
    // }

    // @GetMapping("/rest")
    // public String getPosts() {
    //     String url = "https://jsonplaceholder.typicode.com/posts/";
    //     return restTemplate.getForObject(url, String.class);
    // }

    // Этот метод обрабатывает HTTP POST-запросы на путь /users/add.
// Аннотация @RequestBody указывает Spring, что данные пользователя будут получены из тела запроса в формате JSON 
// и автоматически преобразованы в объект User.
// users.put(user.getId(), user); добавляет нового пользователя в Map, используя ID пользователя как ключ.
// Метод возвращает true, чтобы показать, что пользователь успешно добавлен.
    @PostMapping("/add") // users/add
    public boolean addUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return true;
    }

// ?тот метод обрабатывает HTTP GET-запросы на путь /users/{id}, где {id} — переменная, представляющая ID пользователя.
// Аннотация @PathVariable указывает, что параметр id в URL используется для поиска пользователя.
// users.get(id); ищет пользователя по его ID и возвращает его.
    @GetMapping("/{id}") // / users/1
    public User getUserById(@PathVariable Integer id) {
        return users.get(id);
    }

// Этот метод также обрабатывает GET-запросы, но принимает id в виде параметра запроса (например, /users?id=1).
// Аннотация @RequestParam указывает, что id будет получен из строки запроса.
// users.get(id); находит и возвращает пользователя по его ID.
    @GetMapping
    public User getUserByParam(@RequestParam Integer id) {
        return users.get(id);
    }

// Этот метод обрабатывает GET-запросы на путь /users/list.
// Он возвращает весь список пользователей, находящихся в Map, предоставляя их в формате JSON.
    @GetMapping("/list")
    public Map<Integer, User> listUsers() {
        return users;
    }

// Метод deleteUserById добавляет возможность удалять пользователя по его идентификатору (ID) из коллекции users. 
// Он использует аннотацию @DeleteMapping, что указывает на обработку DELETE-запросов.
    @DeleteMapping("/{id}")
    public User deleteUserById(@PathVariable Integer id) {
        return users.remove(id);
    }


}
