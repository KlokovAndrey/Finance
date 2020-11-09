package com.project.finance.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "userData")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(name = "login")
    private String login;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public UserData() {
    }

    public UserData(@NotBlank String login, @NotBlank @Email String email, String firstName, String lastName) {
        this.login = login;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData user = (UserData) o;
        return id == user.id &&
                Objects.equals(login, user.login) &&
                Objects.equals(email, user.email) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, firstName, lastName);
    }
}
