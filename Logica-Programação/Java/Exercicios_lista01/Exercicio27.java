/*
Tempo de viagem
Solicite ao usuário:

a distância de uma viagem em quilômetros;
a velocidade média em quilômetros por hora.
Calcule e mostre o tempo estimado da viagem em horas.

Fórmula:

tempo = distancia ÷ velocidade
*/

import java.util.Scanner;

public class Exercicio27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo de viagem");
        System.out.println("Por favor, insira a distancia percorrida em Km:");
        int dist = sc.nextInt();

        System.out.println("Insira a velocidade media em Km/h:");
        int vel = sc.nextInt();

        double tempo = ((dist / vel) + 0.5);

        System.out.println("O tempo medio será de " + tempo + " horas.");

        sc.close();

    }
}