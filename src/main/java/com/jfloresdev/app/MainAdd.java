package com.jfloresdev.app;


import com.jfloresdev.clases.User;
import com.jfloresdev.constants.GlobalConstants;
import com.jfloresdev.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import static  com.jfloresdev.constants.GlobalConstants.USER;
import static  com.jfloresdev.constants.GlobalConstants.PASSWORD;

public class MainAdd {


    public static void main(String[] args) {

        try{
            DBUtil db = new DBUtil();
            User user = new User(USER,PASSWORD);
            Connection cn = db.conectar(user, user);
            System.out.println("Connection OK");

            String sql = "INSERT INTO libros (uuid, title, resumen, paginas) VALUES (2,'Java', 'JFlores', 100)";
            Statement st = cn.createStatement();
            st.executeUpdate(sql);

            st.close();
            cn.close();
        }catch (SQLException e){
            e.printStackTrace();
            throw  new RuntimeException("e");
        }
    }
}
