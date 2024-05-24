import dominio.Mentoria;
import dominio.Conteudo;
import dominio.Curso;

import java.time.LocalDate;

public class App {
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

        Conteudo curso2 = new Curso();
        curso2.setTitulo("Polimorfismo");
        curso2.setDescricao("descricao polimorfismo");
        if(curso2 instanceof Curso){
            ((Curso)curso2).setCargaHoraria(5);
        }

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
