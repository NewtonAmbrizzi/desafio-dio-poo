package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;
    
    public Mentoria() {
    }
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [Título=" + getTitulo() + ", Descrição=" + getDescricao() + ", Data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "]";
    }

    
}
