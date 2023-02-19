import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.controle.DevControle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DevControle devControle = new DevControle();

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        devControle.inscreverBootCamp(dev1, bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        devControle.progredir(dev1);
        devControle.progredir(dev1);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + devControle.calcularTotalXp(dev1));

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        devControle.inscreverBootCamp(dev2, bootcamp);
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        devControle.progredir(dev2);
        devControle.progredir(dev2);
        devControle.progredir(dev2);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + devControle.calcularTotalXp(dev2));
    }
}
