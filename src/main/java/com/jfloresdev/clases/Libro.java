package com.jfloresdev.clases;

public class Libro {

    private Long id;
    private String titulo;
    private String resumen;
    private Integer nroPaginas;

    public Libro() {
    }

    public Libro(Long id, String titulo, String resumen, Integer nroPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.resumen = resumen;
        this.nroPaginas = nroPaginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", resumen='" + resumen + '\'' +
                ", nroPaginas=" + nroPaginas +
                '}';
    }
}