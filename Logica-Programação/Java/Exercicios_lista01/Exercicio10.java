/*
Solicite ao usuário:

o valor original de uma compra;
o percentual de desconto.
Calcule e mostre:
o valor do desconto;
o valor final da compra.
*/

import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o valor da compra: ");

    double valor = sc.nextDouble();
    sc.nextLine(); 

    System.out.println("Por favor, digite o percentual de desconto: ");
    double desconto = sc.nextDouble();
    sc.nextLine();

    double a = (desconto / 100.0);
    double b = (valor * a);

    System.out.println("O valor original é: " + (valor));
    System.out.println("O valor do desconto é: " + (b));    
    System.out.println("O valor final da compra é: " + (valor - b));
    
    sc.close();
  }
}