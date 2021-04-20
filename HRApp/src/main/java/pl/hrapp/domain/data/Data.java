package pl.hrapp.domain.data;

import java.time.LocalDateTime;

public class Data {

    private Integer user_id;
    private String name;
    private String surname;
    private String username;
    private String address;
    private String email;
    private String marital_status;
    private Integer data_id;

    public Data(Integer user_id, String name, String surname, String username, String address, String email, String marital_status, Integer data_id) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.email = email;
        this.marital_status = marital_status;
        this.data_id = data_id;
    }

    public Data(Integer user_id, String name, String surname, String username, String address, String email, String marital_status) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.email = email;
        this.marital_status = marital_status;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public Integer getData_id() {
        return data_id;
    }

    public void setData_id(Integer data_id) {
        this.data_id = data_id;
    }
}
