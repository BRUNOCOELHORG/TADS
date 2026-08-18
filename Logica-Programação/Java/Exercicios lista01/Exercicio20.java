/*
Celsius para Fahrenheit
Solicite ao usuário uma temperatura em graus Celsius. Converta e mostre a temperatura em graus Fahrenheit.

Fórmula:
fahrenheit = celsius × 9 ÷ 5 + 32
Utilize números reais no cálculo para evitar problemas com a divisão inteira.
*/

import java.util.Scanner;

public class Exercicio20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de Celcius para Fahrenheit!");
        System.out.println("Por favor, digite o valor em Celcius:");
        double cel = sc.nextDouble();

        double fah = (((cel * 9) / 5) + 32);

        System.out.println(cel + " graus Celcius é equivalente a " + fah + (" graus Fahrenheit."));

        sc.close();
        
    }
}