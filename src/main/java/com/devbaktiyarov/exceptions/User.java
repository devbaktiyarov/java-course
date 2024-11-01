package com.devbaktiyarov.exceptions;

public class User {
    private int id;
    private String email;

    public User(int id, String email) {
        this.id = id;
        this.email = email;
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

    public void setEmail(String email) throws EmailInvalidException, UserNotActiveException {
        if(email.length() == 5) {
            throw new EmailInvalidException("Ваш email не подходит");
        } if(email.length() == 2) {
            throw new UserNotActiveException("не зарегис");
        }
        this.email = email;
    }


    

    

}
