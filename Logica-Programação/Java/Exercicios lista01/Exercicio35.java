/*
Distribuição de itens
Solicite ao usuário:

a quantidade total de itens;
a quantidade de pessoas.
Calcule e mostre:

quantos itens cada pessoa receberá;
quantos itens restarão sem distribuição.
Considere que a quantidade de pessoas será maior que zero.
*/

import java.util.Scanner;

public class Exercicio35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        int itens, pessoas, restante, itensporpessoas;
        System.out.println("Distribuição de itens:");
        System.out.println("Insira a quantidade total de itens:");
        itens = sc.nextInt();
        System.out.println("Insira a quantidade total de pessoas:");
        pessoas = sc.nextInt();

        itensporpessoas = itens / pessoas;
        restante = itens % pessoas;

        System.out.println("Cada pessoa levará " + itensporpessoas + " itens.");
        System.out.println("Restará " + restante + " itens.");

        sc.close();
        

    }
}