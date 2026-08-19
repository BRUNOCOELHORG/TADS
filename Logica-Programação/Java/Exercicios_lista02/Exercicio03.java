/*
Par ou ímpar
Leia um número inteiro e informe se ele é par ou ímpar.
*/
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Par ou Ímpar");
        System.out.println("Digite um numero;");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero digitado é PAR.");

        } else{
            System.out.println("O numero digitado é ÍMPAR.");

        } 
        sc.close();

    }
    
    
}
