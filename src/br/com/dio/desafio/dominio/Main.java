package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso java", 8);
        Curso curso2 = new Curso("Curso js", "Descrição curso js", 4);
        Mentoria mentoria = new Mentoria("Mentoria de java", "Descrição mentoaria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("");
        Dev dev1 = new Dev();
        dev1.setNome("Newton");
        dev1.inscrever(bootcamp);
        System.out.println("Conteudos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluidos " + dev1.getNome() + " : " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        
        System.out.println("\n-------------------------\n");
        
        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscrever(bootcamp);
        System.out.println("Conteudos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluidos " + dev2.getNome() + " : " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        
        

    }
    
}
