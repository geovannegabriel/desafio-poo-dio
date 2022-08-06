import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curo JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria do java");
        mentoria.setDescricao("Descricacao da mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel" + devGabriel.getConteudosIncritos());
        devGabriel.proguedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel" + devGabriel.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosIncritos());
        devJoao.proguedir();
        devJoao.proguedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }



}
