/*
Quilômetros para metros
Solicite ao usuário uma distância em quilômetros. Converta e mostre a distância em metros.

Considere:
1 quilômetro = 1000 metros
*/

import java.util.Scanner;

public class Exercicio19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de quilômetros para metros!");
        System.out.println("Digite o valor em quilômetros:");
        double km = sc.nextDouble();

        double mt = (km * 1000);

        System.out.println(km + " quilometros é igual a " + mt + (" metros."));
        sc.close();

    }
}