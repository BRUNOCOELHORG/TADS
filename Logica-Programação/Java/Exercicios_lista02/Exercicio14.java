/*
Menor e maior entre três valores
Leia três números inteiros e informe:

o maior valor;
o menor valor.
*/

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menor e maior entre três valores");
        System.out.println("Digite 3 valores:");
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if(a > b && b > c){
        System.out.println("Maior valor: " + a);
        System.out.println("Menor valor: " + c);

        }else if(b > a && a > c){
        System.out.println("Maior valor: " + b);
        System.out.println("Menor valor: " + c);

        }else if(a > c && c > b){
        System.out.println("Maior valor: " + a);
        System.out.println("Menor valor: " + b);

        }else if(b > c && c > a){
        System.out.println("Maior valor: " + b);
        System.out.println("Menor valor: " + a);

        }else if(c > b && b > a){
        System.out.println("Maior valor: " + c);
        System.out.println("Menor valor: " + a);

        }else{
        System.out.println("Maior valor: " + c);
        System.out.println("Menor valor: " + b);
        }

    sc.close();
    }
}
