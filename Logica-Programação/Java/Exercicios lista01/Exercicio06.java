/*
Solicite ao usuário um número inteiro positivo de dois algarismos.
 Calcule e mostre o número com os algarismos invertidos.
*/

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número inteiro com dois algarismos: ");

    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.nextLine(); 

    int a = (numero / 10 % 10);
    int b = (numero % 10);


    System.out.println("Você digitou o número: " + (numero));
    System.out.println("O numero invertido é: " + (b)+(a));

    sc.close();
  }
}