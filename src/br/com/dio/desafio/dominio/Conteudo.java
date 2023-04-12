package br.com.dio.desafio.dominio;

import javax.security.auth.x500.X500Principal;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    
    protected String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
    
}
