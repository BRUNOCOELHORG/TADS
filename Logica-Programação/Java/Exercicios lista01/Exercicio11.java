/*
Solicite ao usuário:

o valor total vendido por um funcionário;
o percentual de comissão recebido.
Calcule e mostre o valor da comissão.
*/


import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o valor total vendido: ");
    double valor = sc.nextDouble();
    sc.nextLine();

    System.out.println("Por favor, digite o percentual de comissão: ");
    double comissao = sc.nextDouble();
    sc.nextLine();

    double a = (comissao / 100.0);
    double b = (valor * a);

    System.out.println("O valor total vendido é: " + (valor));
    System.out.println("O valor da comissão é: " + (b));

    sc.close();
  }
}