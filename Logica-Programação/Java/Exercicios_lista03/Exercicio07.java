/*
 Número dentro de uma faixa
Solicite um número inteiro entre 10 e 50, inclusive.

Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido e
 solicite uma nova entrada.
 Quando um valor válido for informado, apresente-o na tela.
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero entre 10 e 50:");
        int numero = sc.nextInt();

        while (numero < 10 || numero > 50) {
            System.out.println("Numero informadoo esta fora da faixa solicitada!");
            System.out.println("Informe outro numero:");
            numero = sc.nextInt();
        }
        System.out.println("O numero informado foi: " + numero);

        sc.close();
    }
    
}
