package dominio;

import java.util.Scanner;

public class Curso extends Conteudo{
    
    private int cargaHoraria;
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "\n Curso: " + getTitulo() 
            + "\nDescricao: " + getDescricao() 
            + "\nCarga Horaria: " + cargaHoraria + "\n";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public static Curso criarCurso(Scanner sc){
         
        Curso curso = new Curso();
        System.out.println("Digite o título do curso :");
        curso.setTitulo(sc.nextLine());

        System.out.println("Digite a descrição do curso :");
        curso.setDescricao(sc.nextLine());

        System.out.println("Digite a carga horária do curso :");
        curso.setCargaHoraria(sc.nextInt());

        sc.nextLine();
        return curso;
    } 

}
