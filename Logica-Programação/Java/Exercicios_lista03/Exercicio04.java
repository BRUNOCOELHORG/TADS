/*
Pares de um intervalo
Leia um número inteiro positivo n e apresente todos os números pares existentes entre 1 e n.

Ao final, informe também quantos números pares foram encontrados.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pares de um intervalo");
        System.out.println("Digite um numero inteiro positivo:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Numero informado esta INCORRETO");
        }else{
            int contador = 0; 
            while (n >= 1) {

                if(n % 2 == 0){
                    System.out.println(n +" é par.");
                    contador = contador + 1;
                }

                n--;
            }
            System.out.printf("Foram encontrados %d numeros pares.", contador);
            
            }
           
        


    sc.close();
    }
    
}
