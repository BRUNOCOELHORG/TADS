/*
Área de um círculo
Solicite ao usuário o raio de um círculo. Calcule e mostre sua área.
Utilize 3.14159 como valor de π.

Fórmula:
area = π × raio × raio
*/

import java.util.Scanner;
public class Exercicio15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo da Area de um Circulo!");
        System.out.println("Por favor, insira o valor do raio:");
        int raio = sc.nextInt();
        sc.nextLine();

        double π = (3.14159);
        double area = (raio * raio * π);

        System.out.println("A area do circulo é:" + (area) + ("  metros quadrados!"));

        sc.close();
    }
}