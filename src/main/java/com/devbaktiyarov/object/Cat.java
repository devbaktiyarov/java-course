package com.devbaktiyarov.object;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    // @Override
    // public int hashCode() {
    //     return 1;
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
    
}
