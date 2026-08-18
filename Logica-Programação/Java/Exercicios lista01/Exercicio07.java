/*
Solicite ao usuário três notas reais. Calcule e mostre a média aritmética das notas.

Não é necessário informar se o aluno foi aprovado ou reprovado.
*/

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, insira as três notas: ");

    System.out.println("Primeira nota: ");

    int a = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Segunda nota: ");
    int b = sc.nextInt();
    sc.nextLine();

    System.out.println("Terceira nota: ");
    int c = sc.nextInt();
    sc.nextLine();

    int media = (a + b + c) / 3;

    System.out.println("A média aritmética das notas é: " + media);

 
    sc.close();
  }
}