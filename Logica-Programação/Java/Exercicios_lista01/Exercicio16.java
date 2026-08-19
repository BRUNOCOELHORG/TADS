/*
Comprimento de uma circunferência
Solicite ao usuário o raio de uma circunferência. Calcule e mostre seu comprimento.

Utilize 3.14159 como valor de π.

Fórmula:
comprimento = 2 × π × raio
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);


        System.out.println("Comprimento de uma circunferencia");
        System.out.println("Digite o valor do raio:");
        int raio = sc.nextInt();

        double pi = (3.14159);

        double comprimento = (2 * pi * raio);

        System.out.println("O comprimento do circulo é " + (comprimento));

        sc.close();    

    }
}