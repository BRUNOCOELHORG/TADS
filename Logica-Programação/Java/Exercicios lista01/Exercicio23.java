/*
Divisão de uma conta
Solicite ao usuário:

o valor total de uma conta;
a quantidade de pessoas que dividirão a conta.
Calcule e mostre quanto cada pessoa deverá pagar.

Considere que a quantidade de pessoas sempre será maior que zero.
*/

import java.util.Scanner;

public class Exercicio23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Divisão de uma conta.");
        System.out.println("Por favor insira o valor da conta:");
        double conta = sc.nextDouble();

        System.out.println("Por favor insira a quantidade de pessoas a dividir a conta:");
        int pess = sc.nextInt();

        double valor = (conta / pess);

        System.out.println("O valor a ser pago por pessoa é de " + valor + " reais.");

        sc.close();


    }
}