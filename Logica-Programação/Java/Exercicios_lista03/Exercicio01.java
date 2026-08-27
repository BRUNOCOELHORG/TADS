/*
Contagem progressiva
Leia um número inteiro positivo n e escreva todos os números de 1 até n, um por linha.

Caso n seja menor ou igual a zero, apresente uma mensagem informando que o valor é inválido.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contagem progressiva");
        System.out.println("Digite um numero inteiro positivo:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("O numero informado esta INCORRETO.");
        }else{
            int i = 0;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }


        sc.close();
    }
    
}
