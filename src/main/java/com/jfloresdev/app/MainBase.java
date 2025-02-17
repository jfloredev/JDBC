package com.jfloresdev.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainBase {


         private static String url = "jdbc:postgresql://localhost:5432/mydb-libros";

         protected static Connection conectar() throws SQLException {
             try {
                 Connection cn = DriverManager.getConnection(url, "postgres", "12345678");
                 System.out.println("Connection OK");
                 return cn;
             }catch (SQLException e){
                 throw e;
             }
         }

}
