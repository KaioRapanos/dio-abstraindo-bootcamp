package dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Mentoria extends Conteudo {
    
    LocalDate data;
    
    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() 
        + "\nDescricao: " + getDescricao() 
        + "\nData:" + data + "\n";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public static Mentoria criarMentoria(Scanner sc){
         
        Mentoria Mentoria = new Mentoria();
        System.out.println("Digite o título do Mentoria :");
        Mentoria.setTitulo(sc.nextLine());

        System.out.println("Digite a descrição do Mentoria :");
        Mentoria.setDescricao(sc.nextLine());

        Mentoria.setData(LocalDate.now());

        sc.nextLine();
        return Mentoria;
    } 

}
