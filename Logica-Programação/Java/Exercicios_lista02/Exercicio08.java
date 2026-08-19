/*
Número múltiplo de 5
Leia um número inteiro e informe se ele é ou não múltiplo de 5.
*/
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplos de 5");
        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("O numero digitado É multiplo de 5.");
        }else {
            System.out.println("O numero digitado NÃO É multiplo de 5.");
        }
        sc.close();
    }   

}
