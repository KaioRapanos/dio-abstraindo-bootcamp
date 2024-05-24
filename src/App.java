import dominio.Mentoria;
import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(5);

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

        /*System.out.println(curso);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developes");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setName("Kaio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kaio " + dev1.getConteudosInscritos());
        System.out.println("------------------");
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("progrediu");
        System.out.println("Conteudos Inscritos Kaio " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Kaio " + dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());
        
        System.out.println("-*********************************-");

        Dev dev2 = new Dev();
        dev2.setName("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao " + dev2.getConteudosInscritos());
        System.out.println("------------------");
        dev2.progredir();
        System.out.println("progrediu");  
        System.out.println("Conteudos Inscritos Joao " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao " + dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());
    }
}
