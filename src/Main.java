import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

//        Conteudo conteudo = new Curso(); //polimorfismo


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTalita = new Dev();
        devTalita.setNome("Talita");
        devTalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Talita: " + devTalita.getConteudoInscritos());
        devTalita.progredir();
        devTalita.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Talita: " + devTalita.getConteudoInscritos());
        System.out.println("Conteudos Concluido Talita: " + devTalita.getConteudoConcluido());
        System.out.println("XP: " + devTalita.calcularXp());

        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao: " + devTalita.getConteudoInscritos());
        System.out.println("Conteudos Concluido Joao: " + devTalita.getConteudoConcluido());
        System.out.println("XP: " + devJoao.calcularXp());



    }
}
