/*
Metros para centímetros e milímetros
Solicite ao usuário uma medida em metros. Converta e mostre essa medida em:

centímetros;
milímetros.
Considere:
1 metro = 100 centímetros
1 metro = 1000 milímetros
*/

import java.util.Scanner;

public class Exercicio18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite um valor em metros:");
        int metro = sc.nextInt();

        int cent = (metro * 100);
        int mili = (metro * 1000);

        System.out.println(metro + " metros é igual a:");
        System.out.println( (cent) + " centimetros.");
        System.out.println(mili + " milimitros.");

        sc.close();

    }
}