package com.example.Ex9.model;

import java.util.ArrayList;

public class EmprestimoMod {
    private Long idEmprestimo;
    private int dataEmprestimo;
    //private int dataFim;
    private LivroMod livroEmprestado;
    private ClienteMod clienteEmp;

    public EmprestimoMod(Long idEmprestimo, int dataEmprestimo, LivroMod livroEmprestado, ClienteMod cliente) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.livroEmprestado = livroEmprestado;
        this.clienteEmp = cliente;
    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LivroMod getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(LivroMod livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public ClienteMod getCliente() {
        return clienteEmp;
    }

    public void setCliente(ClienteMod cliente) {
        this.clienteEmp = cliente;
    }
}

