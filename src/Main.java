import dominio.Mentoria;
import dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);
        
        Curso curso1 = new Curso();
        curso.setTitulo("curso js");
        curso.setDescricao("Descrição curso js");
        curso.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);

    }
}
