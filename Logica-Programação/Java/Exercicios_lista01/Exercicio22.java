/*
Velocidade em metros por segundo
Solicite ao usuário uma velocidade em quilômetros por hora. Converta e mostre a velocidade em
 metros por segundo.

Fórmula:
velocidadeEmMetrosPorSegundo = velocidadeEmQuilometrosPorHora ÷ 3.6
*/

import java.util.Scanner;

public class Exercicio22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, indique uma velocidade em Km/h");
        int km = sc.nextInt();
        
        double ms = (km / 3.6);

        System.out.println(km + " Km/h é igual a " + ms + " m/s");

        sc.close();
        
    }
}