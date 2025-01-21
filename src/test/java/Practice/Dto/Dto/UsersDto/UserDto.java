package Practice.Dto.Dto.UsersDto;

public class UserDto {
    private String first_name;
    private String surname;
    private String email;
    private String username;
    private String plain_password;
    private String roles;
    private CustomData customData;

    public UserDto( CustomData customData,String first_name, String surname, String email, String username, String plain_password, String roles) {
        this.first_name = first_name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.plain_password = plain_password;
        this.roles = roles;
        this.customData = customData;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlain_password() {
        return plain_password;
    }

    public void setPlain_password(String plain_password) {
        this.plain_password = plain_password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }
}
