/*
Solicite ao usuário um número inteiro. Calcule e mostre:

o número elevado ao quadrado;
o número elevado ao cubo.
Para manter o exercício dentro do conteúdo estudado, realize os cálculos utilizando multiplicações.
 */

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número inteiro: ");

    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.nextLine(); 

    System.out.println("Você digitou o número: " + (numero));
    System.out.println("O número elevado ao quadrado é: " + (numero * numero));
    System.out.println("O número elevado ao cubo é: " + (numero * numero * numero));

    sc.close();
  }
}