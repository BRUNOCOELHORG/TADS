

//o número antecessor;
//o número informado;
//o número sucessor.

import java.util.Scanner;


public class Exercicio01 {
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número inteiro: ");

    Scanner sc = new Scanner(System.in);

    int numero = sc.nextInt();

    System.out.println("Você digitou o número: " + (numero));
    System.out.println("O numero antecessor é: " + (numero - 1));
    System.out.println("O numero sucessor é: " + (numero + 1));

    sc.close();
    

  }
}
