package com.example.home;

public class SearchProfile {
    private String id,name,email,password,user_pic,user_cover;


//
    public SearchProfile(String id, String name, String email,String password, String user_pic,String user_cover) {
        this.id = id;
        this.name = name;
        this.email = email ;
        this.password = password;
        this.user_pic = user_pic;
        this.user_cover = user_cover;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUser_pic() {
        return user_pic;
    }

    public void setUser_pic(String user_pic) {
        this.user_pic = user_pic;
    }

    public String getUser_cover(){ return user_cover;}

    public void setUser_cover(String user_cover){ this.user_cover = user_cover;}
}
