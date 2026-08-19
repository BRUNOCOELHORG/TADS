/*
FAÇA UM INVERSOR DE 4 DIGITOS
    1234 -> 4321
        UTILIZANDO OPERACOES MATEMATICAS
*/

import java.util.Scanner;

public class Exercicio37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n0, n1, n2, n3, n4;

        System.out.println("Inversor de 4 digitos");
        System.out.println("Insira um numero com 4 digitos:");
        n0 = sc.nextInt();

        n1 = n0 / 1000;
        n2 = (n0 - (n1 * 1000))/100;
        n3 = (n0 - ((n1 * 1000)+(n2 * 100))) / 10;
        n4 = (n0 - ((n1 * 1000)+(n2 * 100))) % 10;
    

        System.out.println("A inversão dos algarismos é : " + n4 + n3 + n2 + n1);

        sc.close();


    }
}