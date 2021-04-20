package pl.hrapp.domain.api;

public class DataSaveRequest {

    private String name;
    private String surname;
    private String username;
    private String address;
    private String email;
    private String marital_status;
    private String author;

    public DataSaveRequest(String name, String surname, String username, String address, String email, String marital_status, String author) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.email = email;
        this.marital_status = marital_status;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
