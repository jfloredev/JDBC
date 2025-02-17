package com.jfloresdev.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private String url = "jdbc:postgresql://localhost:5432/mydb-libros";

    private String user;
    private String password;

    public Connection conectar() throws SQLException {
        try {
            Connection cn = DriverManager.getConnection(url, this.user, this.password);
            System.out.println("Connection OK");
            return cn;
        } catch (SQLException e) {
            throw e;
        }
    }


    public Connection conectar(String user, String password) throws SQLException {
        this.user = user;
        this.password=password;
      /*
        try {
            this.user = user;
            this.password=password;
            Connection cn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection OK");
            return cn;
        }catch (SQLException e){
            throw e;
        }*/
        return  this.conectar();
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
