/*
Conversão de minutos
Solicite ao usuário uma quantidade inteira de minutos. Calcule e mostre:

a quantidade de horas completas;
a quantidade de minutos restantes.
Exemplo:

Minutos informados: 135
Horas: 2
Minutos restantes: 15
*/

import java.util.Scanner;

public class Exercicio31{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de minutos:");
        System.out.println("Por favor, insira o tempo em minutos:");
        int horas, minutos, minutosrestantes;
        minutos = sc.nextInt();

        horas = minutos / 60;
        minutosrestantes = (minutos - (horas * 60));

        System.out.println("Total de :");
        System.out.println(horas + " Horas");
        System.out.println(minutosrestantes + " Minutos");

        sc.close();


    }
}