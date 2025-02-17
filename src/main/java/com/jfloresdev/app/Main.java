package com.jfloresdev.app;


import com.jfloresdev.persistencia.LibroDB;
import com.jfloresdev.persistencia.LibroDBImpl;
import com.jfloresdev.util.DBUtil;

import static  com.jfloresdev.constants.GlobalConstants.USER;
import static  com.jfloresdev.constants.GlobalConstants.PASSWORD;

import java.sql.*;

public class Main /* extends MainBase*/{
    public static void main(String[] args) {

        try{
            LibroDB libroDB = new LibroDBImpl();

            libroDB.listar().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
            throw  new RuntimeException("e");
        }
    }
}

