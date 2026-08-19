/*
Comparação entre dois valores
Leia dois números inteiros e informe qual deles é o maior. Caso sejam iguais,
 informe "Valores iguais".
*/

import java.util.Scanner;

public class Exercicio10 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Comparação entre dois valores");
        System.out.println("Digite 2 numeros inteiros:");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            System.out.println(a + " é maior que " + b);

        }else if(a < b){
            System.out.println(b + " é maior que " + a);

        }else{
            System.out.println("Os numeros digitados são iguais.");
        }
        sc.close();    
    
    }
    
}
