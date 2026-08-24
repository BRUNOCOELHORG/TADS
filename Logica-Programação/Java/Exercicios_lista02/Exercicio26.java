/*
Autorização para brinquedo
Leia a idade e a altura de uma pessoa.

Um brinquedo exige:

idade mínima de 12 anos;
altura mínima de 1,50 m.
Informe:

se a pessoa pode entrar;
caso não possa, qual requisito não foi atendido;
caso nenhum requisito seja atendido, informe os dois motivos.
*/

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Autorização para brinquedo");
        System.out.println("Informe a idade:");
        int idade = sc.nextInt();
        System.out.println("Informe a altura:");
        float altura = sc.nextFloat();

        if(idade >= 12 && altura >= 1.5f){
            System.out.println("Acesso PERMITIDO!");
        }else{
            if(idade < 12 && altura < 1.5f){
                System.out.println("Acesso NEGADO!");
                System.out.println("Idade abaixo do permitido!");
                System.out.println("Altura abaixo do permitido!");
            }else if(idade < 12){
                System.out.println("Acesso NEGADO!");
                System.out.println("Idade abaixo do permitido!");
            }else if(altura < 1.5f){
                System.out.println("Acesso NEGADO!");
                System.out.println("Altura abaixo do permitido!");
        }

        sc.close();
    }
    
    }
}
