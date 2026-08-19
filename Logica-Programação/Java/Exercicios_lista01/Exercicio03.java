/*
Solicite ao usuário dois números reais. Calcule e mostre:

a soma;
a subtração do primeiro pelo segundo;
a multiplicação;
a divisão do primeiro pelo segundo.
Considere que o segundo número sempre será diferente de zero.
 */

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número inteiro: ");

    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.nextLine(); 

    System.out.println("Digite outro número: ");
    int outroNumero = sc.nextInt();
    

    System.out.println("Você digitou os números: " + (numero) + " e " + (outroNumero));
    System.out.println("A soma deles é: " + (numero + outroNumero));
    System.out.println("A Subtração deles é: " + (numero - outroNumero));
    System.out.println("A multiplicação deles é: " + (numero * outroNumero));
    System.out.println("A divisão deles é: " + (numero / outroNumero));

    sc.close();
  }
}