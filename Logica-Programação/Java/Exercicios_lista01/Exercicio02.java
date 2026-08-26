/*
Dobro, triplo e metade
Solicite ao usuário um número real. Calcule e mostre:

o dobro do número;
o triplo do número;
a metade do número
 */

import java.util.Scanner;

public class Exercicio02{
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número real: ");

    Scanner sc = new Scanner(System.in);

    double numero = sc.nextDouble();

    System.out.println("Você digitou o número: " + (numero));
    System.out.println("O dobro do número é: " + (numero * 2));
    System.out.println("O triplo do número é: " + (numero * 3));
    System.out.println("A metade do número é: " + (numero / 2));

    sc.close();
  }
}

