package com.kinoafisha.siteKino.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users_table")
public class UsersModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String login;

    String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void voice(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel usersModel = (UsersModel) o;
        return Objects.equals(id, usersModel.id) && Objects.equals(login, usersModel.login) && Objects.equals(password, usersModel.password) && Objects.equals(email, usersModel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, email);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }*/
}
