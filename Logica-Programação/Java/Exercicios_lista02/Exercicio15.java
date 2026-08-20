/*
Classificação de nota
Leia uma nota de 0 a 10 e classifique:

>= 9: Excelente;
>= 7: Bom;
>= 6: Suficiente;
< 6: Insuficiente.
Se a nota estiver fora do intervalo de 0 a 10, mostre uma mensagem de erro.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificação de nota");
        System.out.println("Digite a nota (0 a 10):");
        float nota = sc.nextFloat();

        if(nota < 0 || nota > 10){
            System.out.println("Nota digitada FORA DO PADÃO (0 a 10)");

        }else if(nota < 6){
            System.out.println("Nota INSUFICIENTE!");

        }else if(nota < 7 && nota >= 6){
            System.out.println("Nota SUFICIENTE!");
            
        }else if(nota < 9 && nota >=7){
            System.out.println("Nota BOA!");
            
        }else {
            System.out.println("NOTA EXCELENTE!");
            
        }

        sc.close();
    }
    
}
