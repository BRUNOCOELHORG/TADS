/*
 Divisão segura
Leia um número real a. Depois, solicite um segundo número real b.

Enquanto b for igual a zero, informe que o divisor é inválido e s
olicite novamente apenas o segundo número.

Quando um divisor válido for informado, apresente o resultado de a / b.
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Divisão segura\n");
        System.out.println("Informe um numero real:");
        int numeroUm = sc.nextInt();
        System.out.println("Informe outro numero real:");
        int numeroDois = sc.nextInt();

        while (numeroDois == 0) {
            System.out.println("O segundo numero informado é INVALIDO");
            System.out.println("Informe um numero diferente de \"0\" :");
            numeroDois = sc.nextInt();            
        }

        int resultado = numeroUm / numeroDois;

        System.out.println("o resultado da divisão dos numreos informados é " + resultado);

        sc.close();
    }
    
}
