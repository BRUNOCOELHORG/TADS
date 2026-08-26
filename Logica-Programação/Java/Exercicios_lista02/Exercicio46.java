/*
Correção de prova
Leia:

nota da prova (0 a 10);
quantidade de exercícios entregues (0 a 10);
percentual de presença (0 a 100).
Regras:

presença abaixo de 75% causa reprovação por frequência;
caso a presença seja suficiente:
nota >= 7 e pelo menos 8 exercícios: Aprovado;
nota >= 7 e menos de 8 exercícios: Recuperação por atividades;
nota entre 5 e 6.9: Recuperação por nota;
nota abaixo de 5: Reprovado.
Se a nota for 10, os 10 exercícios tiverem sido entregues e 
a presença for pelo menos 90%, mostre também "Desempenho de destaque".
*/

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Correção de prova");
        System.out.println("Informe a nota da prova:");
        float notaProva = sc.nextFloat();
        System.out.println("Informe a quantidade de exercícios entregues:");
        int quantidadeExercicios = sc.nextInt();
        System.out.println("Informe o percentual de presença:");
        float presenca = sc.nextFloat();

        if(notaProva < 0 || notaProva > 10){
            System.out.println("Nota da prova INVALIDA (0 a 10)");
        }else if(quantidadeExercicios < 0 || quantidadeExercicios > 10){
            System.out.println("Quantidade de exercicios INVALIDO (0 a 10)");
        }else if(presenca < 0 || presenca > 100){
            System.out.println("Presença INVALIDA (0 a 100)");
        }else if(presenca < 75){
            System.out.println("Reprovado por presença.");
        }else{
            String situacao;

            if(notaProva >=7){
                if(quantidadeExercicios >= 8){
                    situacao = "APROVADO";
                }else{
                    situacao = "Recuperação por atividades";
                }
            }else if(notaProva < 7 && notaProva >=5){
                situacao = "Recuperação por nota";
            }else {
                situacao = "Reprovado";
            }
            if(notaProva == 10 && quantidadeExercicios == 10 && presenca >= 90){
                situacao = "Desempenho de destaque";
            }
            System.out.println("Situação: " + situacao);
        }

        sc.close();
    }
    
}
