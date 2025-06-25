package Klausuraufgaben.ptwotter;

import java.io.Serializable;

public class User implements Serializable {
    private final  String username;
    private String password;

    public User (String username, String passsword){
        this.username =username;
        this.password = password;

    }

    public String getUsername(){
        return this.username;

    }

    public String getPasssword(){
        return this.password;
    }

    public void SetPassword(String pass){
        this.password =pass;
    }

    @Override
    public String toString(){
        return this.username;
    }
}

