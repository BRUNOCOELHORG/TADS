/*
Maior entre três números
Leia três números inteiros e informe qual é o maior.
O programa também deve identificar o caso em que os três valores são iguais.
*/

import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Maior entre três números");
        System.out.println("Digite três números inteiros:");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && a == c){
            System.out.println("Os numero digitados são IGUAIS.");

        }else if(a > b && a > c){
            System.out.println("O maior numero é " + a);

        }else if(b > a && b > c){
            System.out.println("O maior numero é " + b);
            
        }else{
            System.out.println("O maior numero é " + c);
            
        }
        sc.close();
    }
}