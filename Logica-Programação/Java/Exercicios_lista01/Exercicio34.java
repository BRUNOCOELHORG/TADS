/*
Conversão de dias
Solicite ao usuário uma quantidade inteira de dias. Calcule e mostre:

a quantidade de semanas completas;
a quantidade de dias restantes.
Considere que uma semana possui sete dias.
*/

import java.util.Scanner;

public class Exercicio34{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de dias:");
        System.out.println("Insira a quantidade de dias:");
        int dias, semanas, diasrestantes;
        dias = sc.nextInt();

        semanas = dias / 7;
        diasrestantes = dias % 7;
        
        System.out.println("Semanas = " + semanas);
        System.out.println("Dias restantes = " + diasrestantes);

        sc.close();

    }
}