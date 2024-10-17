package com.devbaktiyarov.collections;


import java.util.*;

import com.devbaktiyarov.exceptions.UserNotFoundException;

public class Main {
    public static void main(String[] args) {
        User user = new User(0, "A", null, false);
        User user1 = new User(1, "B", null, false);
        User user2 = new User(2, "C", null, false);
        User user3 = new User(3, "D", null, false);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        // users.add(new User(4, "E", null, false));

        UserManager userManager = new UserManager(users);
        userManager.listUsers();

        System.out.println();
        System.out.println(userManager.getUser(40));

        try {
            userManager.removeUser(3);
        } catch (UserNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println();
        // userManager.removeUser(2);
        // userManager.listUsers();

        // System.out.println();
        // userManager.activateUser(1);
        // userManager.listUsers();

        // System.out.println();
        // userManager.deactivateUser(1);
        // userManager.listUsers();

        // System.out.println(userManager.findUserByUsername("E"));


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("JN");

        System.out.println(hashSet.contains("JN"));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "R");
        System.out.println(map.get(1));


        System.out.println();

        Queue<String> queue = new LinkedList<>();
        queue.add("d");
        queue.add("r");
        queue.add("e");
        queue.add("g");
        queue.add("c");
        
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        // queue.size();

        List<String> arr = new ArrayList<>();
        
    }
}
