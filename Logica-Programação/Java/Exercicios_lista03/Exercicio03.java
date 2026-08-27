/*
Soma dos números
Leia um número inteiro positivo n e calcule a soma de todos os números inteiros de 1 até n.

Exemplo: para n = 5, o resultado corresponde a 1 + 2 + 3 + 4 + 5.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de numeros");
        System.out.println("Digite um numero inteiro positivo:");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Numero informado esta INCORRETO");
        }else{

            int i = 1;
            int soma = 0;
            while (i <= n) {
                soma = soma + i;    
                i++;
            }
            System.out.println(soma);
        }


    sc.close();
    }
    
}
