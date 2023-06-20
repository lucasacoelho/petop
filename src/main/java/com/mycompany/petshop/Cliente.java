package com.mycompany.petshop;

public class Cliente {
    
    private String nome; 
    private String telefone; 
    private String CPF;
    private String endereco;
    private String email;

    public Cliente(String nome, String telefone, String CPF, String endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
