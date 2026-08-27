/*
Contagem regressiva
Leia um número inteiro positivo e apresente uma contagem regressiva desse número até 0.

Ao final, escreva a mensagem FIM DA CONTAGEM.
*/

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contagem regressiva");
        System.out.println("Digite um numero inteiro positivo:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("O numero informado esta INCORRETO.");
        }else{
        
            while (n >= 0) {
                System.out.println(n);
                n--;
            }
            System.out.println("Fim da Contagem");
        }


        sc.close();
    }
    
    
}
