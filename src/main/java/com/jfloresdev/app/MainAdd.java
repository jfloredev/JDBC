package com.jfloresdev.app;

import com.jfloresdev.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainAdd extends MainBase{


    public static void main(String[] args) {

        try{

            Connection cn = DBUtil.conectar();
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
