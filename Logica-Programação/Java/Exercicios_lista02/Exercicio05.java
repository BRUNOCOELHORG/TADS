/*
Nota suficiente
Leia a nota final de um aluno. 
Informe APROVADO quando a nota for maior ou igual a 6.0 e REPROVADO caso contrário.
*/
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota sufucuente");
        System.out.println("Digite a nota final:");
        float nota = sc.nextFloat();

        if(nota >= 6){
            System.out.println("APROVADO");

        }else {
            System.out.println("REPROVADO");
        }
        sc.close();


    } 
    
}
