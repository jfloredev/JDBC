package com.jfloresdev.persistencia;

import com.jfloresdev.clases.Libro;
import com.jfloresdev.clases.User;

import java.sql.SQLException;
import java.util.List;

public interface LibroDB {

    List<Libro> listar() throws SQLException;

}
