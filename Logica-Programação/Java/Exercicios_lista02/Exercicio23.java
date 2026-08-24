/*
Ingresso de cinema
Leia a idade do cliente, informe se ele é estudante ("S" ou "N") e
 leia o preço normal do ingresso.

Regras:

menores de 12 anos pagam 50%;
pessoas com 60 anos ou mais pagam 50%;
entre 12 e 59 anos, estudantes pagam 50%;
demais clientes pagam o preço integral.
A idade não pode ser negativa e a opção de estudante deve ser válida.
*/

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresso de cinema");
        System.out.println("Informe a sua IDADE");
        int idade = sc.nextInt();
        System.out.println("Você é estudante: \nS = Sim \nN = Não");
        String estudante = sc.next();
        System.out.println("Valor do ingresso");
        float valorIngresso = sc.nextFloat();
        float percentual = 1, valorFinal = 0;

        if(!estudante.equals("S") && !estudante.equals("N")){
            System.out.println("Dados digitados são INVALIDOS!");
        }else if(idade < 0){
            System.out.println("Dados digitados são INVALIDOS!");
        }else{
            if(estudante.equals("S")){
                percentual = 0.5f;
            }
             if(idade < 12 || idade >= 60){
                percentual = 0.5f;
            }
                valorFinal = valorIngresso * percentual;

            System.out.println("Valor final: " + valorFinal);
        }
        sc.close();
    }  
}
