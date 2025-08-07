import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição Bootcamp Java Develop");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devPauli = new Dev();
        devPauli.setNome("Pauli");
        devPauli.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pauli: " + devPauli.getConteudosInscritos());
        devPauli.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pauli: " + devPauli.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pauli: " + devPauli.getConteudosConcluidos());
        System.out.println("XP: " + devPauli.calcularTotalXp());

    }
}
