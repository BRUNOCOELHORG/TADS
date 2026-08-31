/*
Tabuada
Leia um número inteiro e apresente sua tabuada de multiplicação de 1 até 10 utilizando while.

Exemplo de saída para o número 4:

4 x 1 = 4
4 x 2 = 8
...
4 x 10 = 40
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada\n");        
        System.out.println("Informe um numero entre 1 e 10:");
        int numero = sc.nextInt();

            while (numero < 1 || numero > 10) {  
            System.out.println("\nO numero informado não esta entre 1 e 10");
            System.out.println("Por favor, digite outro numero:");
            numero = sc.nextInt();
            }
            int contador = 1;
            while (contador <=10) {
                System.out.println(contador + " X " + numero + " = " + (contador * numero));

                contador++;
            }

        sc.close();
    }
    
}
