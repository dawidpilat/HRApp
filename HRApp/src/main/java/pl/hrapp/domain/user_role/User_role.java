package pl.hrapp.domain.user_role;

public class User_role {

    private String username;
    private String role_name;
    private Integer user_id;

    public User_role(String username, String role_name, Integer user_id) {
        this.username = username;
        this.role_name = role_name;
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
