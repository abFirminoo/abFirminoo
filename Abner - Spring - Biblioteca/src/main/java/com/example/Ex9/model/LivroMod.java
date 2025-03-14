package com.example.Ex9.model;

public class LivroMod {
    private int idLivro;
    private String nomeLivro;
    private String autorLivro;
    private String generoLivro;

    public LivroMod(int idLivro, String nomeLivro, String autorLivro, String generoLivro) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.generoLivro = generoLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }
}
