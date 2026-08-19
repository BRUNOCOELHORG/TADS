/*
Maior de idade
Leia a idade de uma pessoa e informe se ela é maior de idade (idade >= 18) ou menor de idade.
*/

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Maior de idade");
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Voce é MAIOR de idade.");

        }else{
            System.out.println("Voce é MENOR de idade.");

        }
        sc.close();
    }
}