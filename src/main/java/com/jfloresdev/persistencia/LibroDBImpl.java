package com.jfloresdev.persistencia;

import com.jfloresdev.clases.Libro;
import com.jfloresdev.clases.User;
import com.jfloresdev.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.jfloresdev.constants.GlobalConstants.PASSWORD;
import static com.jfloresdev.constants.GlobalConstants.USER;

public class LibroDBImpl implements LibroDB {


    @Override
    public List<Libro> listar() throws SQLException {
            DBUtil db = new DBUtil();
            User user = new User(USER, PASSWORD);
            Connection cn = db.conectar(user, user);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM libros");

            List<Libro> libros = new ArrayList<>();
            while (rs.next()) {

                libros.add(new Libro());
                Libro libro = new Libro();
                libro.setTitulo(rs.getString("title"));
                libro.setResumen(rs.getString("resumen"));
                libro.setNroPaginas(rs.getInt("paginas"));
                libros.add(libro);
            }
            rs.close();
            st.close();
            cn.close();
            return libros;
    }
}


