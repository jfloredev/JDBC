package com.jfloresdev.app;


import com.jfloresdev.util.DBUtil;

import java.sql.*;

public class Main /* extends MainBase*/{
    public static void main(String[] args) {
        try{
            Connection cn = DBUtil.conectar();
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