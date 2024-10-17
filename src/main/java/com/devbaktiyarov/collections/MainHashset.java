package com.devbaktiyarov.collections;


import java.util.*;

public class MainHashset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("T");
        set.add("J");
        set.add("TJ");
        set.add("JT");

        // LinkedHashSet 

        System.out.println(set.contains("T"));
        set.remove("J");

        System.out.println(set.contains("J"));

        
        for (String string : set) {
            System.out.println(string);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("R");

        System.out.println(arrayList.get(0));


        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Tree");
        map.put(4, "Map");
        map.put(1, "Set");
        map.put(5, "List");

        System.out.println(map.get(4));

        System.out.println(map.get(2));

        System.out.println(map.containsKey(5));

        System.out.println(map.containsKey(6));

        System.out.println(map.size());
        map.remove(1);
        System.out.println(map.size());

        for(Map.Entry<Integer, String> item: map.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }


        for (String string : set) {
            System.out.println(string);
        }


        List<Object> objects = new ArrayList<>(); // O(1)
        objects.add("f"); // O(1)
        objects.add(1);
        objects.add(new User(0, null, null, false));
        objects.add(true);
        

        // for (int index = 0; index < array.length; index++) {
            
        // }

        for(Object o : objects) { // O(4) -> O(N)
            System.out.println(o);
        }


        // 23 Person
        // 23 Cat
        

        // 23 -> new LinkedList -> [Person, Cat] 
        // Однако, когда два разных ключа имеют одинаковое хэш-значение, возникает коллизия.
        //  Java использует несколько механизмов для разрешения коллизий,
        //   чтобы обеспечить корректную работу HashMap.






    }
}
