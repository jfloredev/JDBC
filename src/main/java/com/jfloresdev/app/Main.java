package com.jfloresdev.app;


import com.jfloresdev.clases.User;
import com.jfloresdev.constants.GlobalConstants;
import com.jfloresdev.util.DBUtil;

import static  com.jfloresdev.constants.GlobalConstants.USER;
import static  com.jfloresdev.constants.GlobalConstants.PASSWORD;

import java.sql.*;

public class Main /* extends MainBase*/{
    public static void main(String[] args) {
        try{

            DBUtil db = new DBUtil();
            User user = new User(USER,PASSWORD);
            Connection cn = db.conectar(user,user);
            System.out.println("Connection OK");

            String sql = "SELECT * FROM libros";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("title")+ " - " + rs.getString("resumen") + " - " + rs.getInt("paginas"));
            }
            rs.close();
            st.close();
            cn.close();
        }catch (SQLException e){
            e.printStackTrace();
            throw  new RuntimeException("e");
        }
    }
}

;