package com.example.Ex9.model;

import java.util.Objects;

public class ClienteMod {
    private Long idCliente;
    private int cpfCliente;
    private String nomeCliente;
    private int telefoneCliente;
    private String emailCliente;


    public ClienteMod(Long idCliente, int cpfCliente, String nomeCliente, int telefoneCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }


    @Override
    public int hashCode() {
        return Objects.hash(
                idCliente,
                nomeCliente,
                cpfCliente,telefoneCliente,
                emailCliente
        );
    }
}
