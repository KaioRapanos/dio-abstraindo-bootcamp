import dominio.Mentoria;
import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a abstracao do Bootcamp em Java");
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developes");


        System.out.println("Quantos curso gostaria de criar? ao " + bootcamp.getName());
        int quantidadeDeCursos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeDeCursos; i++){
            Curso curso = Curso.criarCurso(sc);
            bootcamp.getConteudos().add(curso);
        }
        
        System.out.println("Quantos Mentorias gostaria de criar? ao " + bootcamp.getName());
        int quantidadeDeMentorias = sc.nextInt();

        for (int i = 0; i < quantidadeDeMentorias; i++){
            Mentoria mentoria = Mentoria.criarMentoria(sc);
            bootcamp.getConteudos().add(mentoria);
        }
        
        
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
