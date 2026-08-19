/*


*/

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {

    System.out.println("Por favor, digite um número inteiro com três algarismos: ");

    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    sc.nextLine(); 

    int a = (numero / 100 % 10);
    int b = (numero / 10 % 10);
    int c = (numero % 10);


    System.out.println("Você digitou o número: " + (numero));
    System.out.println("A soma dos algamismos deste numero é: " + (a+b+c));

    sc.close();
  }
}