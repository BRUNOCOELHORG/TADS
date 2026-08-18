/*
 Conta com gorjeta
Solicite ao usuário:

o valor consumido em um restaurante;
o percentual de gorjeta.
Calcule e mostre:

o valor da gorjeta;
o valor total da conta;
o valor que cada pessoa deverá pagar, considerando que a conta será dividida igualmente entre quatro pessoas.
*/

import java.util.Scanner;

public class Exercicio24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Conta com Gorjeta");
        System.out.println("Por favor, insira o valor total da conta:");
        double conta = sc.nextDouble();
        

        System.out.println("Por favor, insira a quantidade de pessoa a dividir a conta:");
        int pess = sc.nextInt();


        System.out.println("Por favor, insira o percentual da gorjeta:");
        double gorj = sc.nextDouble();
        

        double gorjp = ( gorj / 100 +1);
        double total = ((conta * gorjp) / pess);

        System.out.println("O valor a ser pago por pessoa é de " + total + (" reais."));

        sc.close();


    }
}