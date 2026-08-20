/*
Desconto por faixa de compra
Leia o valor de uma compra e aplique:

abaixo de R$ 100,00: sem desconto;
de R$ 100,00 até R$ 299,99: 5%;
de R$ 300,00 até R$ 499,99: 10%;
R$ 500,00 ou mais: 15%.
Mostre o percentual aplicado, o valor do desconto e o valor final.
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Desconto por faixa de compra");
        System.out.println("Digite o valor da compra:");
        float valorcompra = sc.nextFloat();

        float d5,d10, d15, valortotal;
        d5 = valorcompra * 0.05f;
        d10 = valorcompra * 0.10f;
        d15 = valorcompra * 0.15f;
        
        if(valorcompra < 100){
            System.out.println("Compra sem direito a desconto.");
        System.out.println("Valor final: " + valorcompra + " Reais.");

        }else if(valorcompra >= 100 && valorcompra < 300){
            valortotal = valorcompra - d5;
            System.out.println("Compra com direito a desconto.");
            System.out.println("Desconto aplicado de 5%");
            System.out.println("Valor do desconto : " + d5 + " Reais.");
            System.out.println("Valor final: " + valortotal + " Reais.");
        
        }else if(valorcompra >= 300 && valorcompra < 500){
            valortotal = valorcompra - d10;
            System.out.println("Compra com direito a desconto." );
            System.out.println("Desconto aplicado de 10%");
            System.out.println("Valor do desconto : " + d10 + " Reais.");
            System.out.println("Valor final: " + valortotal + " Reais.");
        
        }else{
            valortotal = valorcompra - d15;
            System.out.println("Compra com direito a desconto.");
            System.out.println("Desconto aplicado de 15%");
            System.out.println("Valor do desconto : " + d15 + " Reais.");
            System.out.println("Valor final: " + valortotal + " Reais.");
        }
        sc.close();
    }
    
}
