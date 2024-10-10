package com.devbaktiyarov.collections;

public class User {
    private int id;
    private String username;
    private String email;
    private boolean isActive;

    public User(int id, String username, String email, boolean isActive) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.isActive = isActive;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

   


    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", isActive=" + isActive + "]";
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }
    

    

    
    
    
}
