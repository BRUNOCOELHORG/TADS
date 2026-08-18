/*
Fahrenheit para Celsius
Solicite ao usuário uma temperatura em graus Fahrenheit. Converta e mostre a temperatura em graus Celsius.

Fórmula:
celsius = (fahrenheit - 32) × 5 ÷ 9
*/

import java.util.Scanner;

public class Exercicio21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de graus Fahrenheit para graus Celcius.");
        System.out.println("Por favor, insira o valor em Fahrenheit:");
        double fah = sc.nextDouble();

        double cel = (((fah - 32) * 5 ) / 9);

        System.out.println(fah + " graus Fahrenheit correspondem a " + cel + " graus Celcius.");

        sc.close();
        

    }
}