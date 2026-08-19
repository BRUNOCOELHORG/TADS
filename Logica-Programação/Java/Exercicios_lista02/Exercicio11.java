/*
 Positivo, negativo e paridade
Leia um número inteiro. Primeiro informe se ele é positivo, negativo ou zero.
 Depois, caso seja diferente de zero, informe também se ele é par ou ímpar.
*/

import java.util.Scanner;

public class Exercicio11 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Positivo, negativo e paridade");
        System.out.println("Digite um numero inteiro:");
        int numero = sc.nextInt();

        if(numero == 0){
            System.out.println("Voce digitou o numero ZERO.");


        }else if(numero > 0){
            System.out.println("O numero digitado é POSITIVO.");

            if(numero % 2 == 0){
                System.out.println("e PAR.");
            }else{
                System.out.println("e IMPAR.");
            }

        }else{
            System.out.println("O numero digitado é NEGATIVO.");

            if(numero % 2 == 0){
                System.out.println("e PAR.");
            }else{
                System.out.println("e IMPAR.");
        }
        sc.close();  
        
     }
     }
    }