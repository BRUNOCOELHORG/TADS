/*
Área de um triângulo
Solicite ao usuário a base e a altura de um triângulo. Calcule e mostre sua área.

Fórmula:
area = base × altura ÷ 2
*/
import java.util.Scanner;

public class Exercicio14{
    public static void main(String[] agrs) {
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Area de um Triangulo");
    System.out.println("Insira o valor da base do triangulo:");
    double base = sc.nextDouble();
    sc.nextLine();

    System.out.println("Insira o valor da altura do triangulo:");
    double altura = sc.nextDouble();

    double area = ((altura * base)/2);

    System.out.println(("A Area deste Triangulo é:") + (area));

    sc.close();

    }
}

