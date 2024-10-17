package com.devbaktiyarov.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(0, null);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(7);
        aList.add(7);
        aList.add(7);
        aList.add(7);

        // 0 1 2 3 4 5 6


        System.out.println("Index 3: " + arrayList.get(3));
        arrayList.remove(3);

        System.out.println("Index 3: " + arrayList.get(3));

        System.out.println("Size : " + arrayList.size());

        arrayList.addAll(aList);

        System.out.println("Size : " + arrayList.size());


        for(int i : arrayList) {
            System.out.println(i);
        }


        // 1     2   444     3 222        4
        // 001   111        444       222

        System.out.println();

        User user = new User(0, "A", null, false);
        User user1 = new User(1, "B", null, false);
        User user2 = new User(2, "C", null, false);
        User user3 = new User(3, "D", null, false);

        LinkedList<User> users = new LinkedList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.remove(3);

        for (User u : users) {
            System.out.println(u);
        }
        
    }
}
