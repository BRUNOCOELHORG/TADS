/*
Solicite ao usuário:

o valor de um produto;
o percentual de acréscimo.
Calcule e mostre:

o valor do acréscimo;
o valor final do produto.
Exemplo: um produto de R$ 100,00 com acréscimo de 15% terá valor final de R$ 115,00.
*/

import java.util.Scanner;

public class Exercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o valor do produto: ");

    double valor = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("Por favor, digite o valor do acréscimo em %: ");
    double acrescimo = sc.nextDouble();

    double a = (acrescimo / 100.0);
    double b = (valor * a);
    sc.nextLine();
        

    System.out.println("O valor original é: " + (valor));
    System.out.println("O valor do acrescimo é : " + (b));
    System.out.println("O valor final do produto é: " + (valor + b));

    sc.close();
  }
}