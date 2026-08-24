/*
Aprovação com frequência
Leia duas notas e o percentual de frequência de um aluno.

Regras:

frequência abaixo de 75%: Reprovado por frequência;
com frequência suficiente:
média >= 7: Aprovado;
média >= 5 e < 7: Recuperação;
média < 5: Reprovado por nota.
Notas devem estar entre 0 e 10 e a frequência entre 0 e 100
*/

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Aprovação com frequência");
        System.out.println("Informe as notas:");
        float notaUm = sc.nextFloat();
        float notaDois = sc.nextFloat();
        System.out.println("Informe a frequencia:");
        float frequencia = sc.nextFloat();
        float media = 0;
        String situacao = "Situacao";

        if(notaUm < 0 || notaUm > 10){
            System.out.println("Nota INVALIDA");
        }else if(notaDois < 0 || notaDois > 10){
            System.out.println("Segunda nota INVALIDA");
        }else if(frequencia < 0 || frequencia > 100){
            System.out.println("Frequencia INVALIDA");
        }else if(frequencia < 75){
            System.out.println("Reprovado por Frequencia");
        }else{
            media = (notaUm + notaDois)/2;
            if(media >= 7){
                situacao = "Aprovado";
            }else if(media >= 5 && media < 7){
                situacao = "Recuperação";
            }else if(media < 5){
                situacao = "Reprovado por nota";
            }
            System.out.println("Situação: " + situacao);    
            System.out.println("Media: " + media);
        }
        

        sc.close();
    }
    
}
