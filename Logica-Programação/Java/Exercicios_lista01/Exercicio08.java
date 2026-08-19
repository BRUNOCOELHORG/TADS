/*
Solicite ao usuário três notas. Considere os seguintes pesos:

primeira nota: peso 2;
segunda nota: peso 3;
terceira nota: peso 5.
Calcule e mostre a média ponderada.

*/

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, as três notas: ");
    System.out.println("Primeira nota: ");

    int a = sc.nextInt();
    sc.nextLine();

    System.out.println("Segunda nota: ");
    int b = sc.nextInt();
    sc.nextLine();

    System.out.println("Terceira nota: ");
    int c = sc.nextInt();
    sc.nextLine();

    int media = ((a * 2) + (b * 3) + (c * 5)) / 10;

    System.out.println("A média ponderada das notas é: " + media);

    sc.close();
  }
}