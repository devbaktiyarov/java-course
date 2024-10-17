package com.devbaktiyarov.object;

public class Dog {
    public int age;
    public String name;
    public double weight;

    public Dog(int age) {
        MathOOP.count++;
        this.age = age;
    }


    public Dog(int age, String name) {
        MathOOP.count++;
        this.age = age;
        this.name = name;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Dog dog = (Dog) obj;
        return age == dog.age && weight == dog.weight && name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }



    




    





    
    






    

    


}
