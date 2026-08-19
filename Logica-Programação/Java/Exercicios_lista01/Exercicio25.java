/*
Consumo médio de combustível
Solicite ao usuário:

a distância percorrida por um veículo, em quilômetros;
a quantidade de combustível consumida, em litros.
Calcule e mostre o consumo médio do veículo em quilômetros por litro.

Fórmula:

consumoMedio = distanciaPercorrida ÷ litrosConsumidos
*/

import java.util.Scanner;

public class Exercicio25{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Consumo medio de combustivel");
        System.out.println("Por favor, insira a distancia percorrida me KM:");
        int dist = sc.nextInt();

        System.out.println("Por favor, insira a quantidade de combustivel consumida em lt:");
        double cons = sc.nextDouble();

        double media = (dist / cons);

        System.out.println("A media de consumo foi de " + media + " Km/lt.");

        sc.close();
        


    }

}

