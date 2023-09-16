package com.hypeboy.hypeBoard.dto;


import lombok.ToString;



@ToString
public class UserDto {
    private String id;
    private String name;
    private String pwd;
    private String phone;
    private String email;
    public UserDto(String id, String name, String pwd, String phone, String email) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
    }
    public UserDto(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
    }
    public UserDto(){

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
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}