/*
Reajuste salarial
Solicite ao usuário:

o salário atual de um funcionário;
o percentual de reajuste.
Calcule e mostre:

o valor do reajuste;
o novo salário.
*/

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Reajuste Salarial");
    System.out.println("Por favor, digite o salário atual do funcionário: ");
    double salario = sc.nextDouble();
    sc.nextLine(); 

    System.out.println("Por favor, digite o percentual de reajuste: ");
    double percentual = sc.nextDouble();
    sc.nextLine();

    double reajuste = salario * (percentual / 100.0);

    System.out.println("Valor do salário atual: " + (salario));
    System.out.println("O valor do reajuste é: " + (reajuste));
    System.out.println("O novo salário é: " + (salario + reajuste));

    sc.close();
  }
}