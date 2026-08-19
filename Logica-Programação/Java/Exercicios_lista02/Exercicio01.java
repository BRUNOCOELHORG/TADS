/*
Positivo ou negativo
Leia um número inteiro e informe se ele é positivo ou negativo. Considere o zero como positivo
*/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Positivo ou Negativo:");
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if(numero < 0) {
            System.out.println("O numero digitado é NEGATIVO");

        } else{
            System.out.println("O numero digitado é Possitivo");
        }
        sc.close();
    }
    
}
