/*
Desconto simples
Leia o valor de uma compra. Se o valor for maior ou igual a 200, 
aplique 10% de desconto. Caso contrário, mantenha o valor original. Mostre o valor final da compra.
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Desconto Simples");
        System.out.println("Informe o valor da compra:");
        float valor, valortotal;
        valor = sc.nextFloat();

        valortotal = valor - (valor * 0.1f);

        if(valor < 200){
            System.out.println("Sua compra não se enquadra em descontos.");
            System.out.println("Valor total de " + valor + " Reais.");
        }else{
            System.out.println("Voce obteve um desconto de 10% nesta compra.");
            System.out.println("Valor total de " + valortotal + " Reais.");
        }
        sc.close();
    }
    
}
