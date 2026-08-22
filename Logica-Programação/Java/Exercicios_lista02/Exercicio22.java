/*
Frete por região e valor da compra
Leia o valor da compra e a região de entrega:

"S" — Sul;
"SE" — Sudeste;
"CO" — Centro-Oeste.
Fretes:

Sul: R$ 20;
Sudeste: R$ 30;
Centro-Oeste: R$ 40.
Se a compra for igual ou superior a R$ 500, o frete será grátis, 
independentemente da região. Caso a região seja inválida, informe erro. 
Mostre o valor da compra, frete e total final.
*/

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Frete por região e valor da compra");
        System.out.println("Informe o valor da compra:");
        float valorCompra = sc.nextFloat();
        System.out.println("Informe a região de entrega: \n S = Sul \n SE = Sudeste \n CO = Centro-Oeste ");
        String regiao = sc.next();
        float frete = 0, valorFinal = 0;

        if(!regiao.equals("S") && !regiao.equals("SE") && !regiao.equals("CO") ){
            System.out.println("Região informada NÃO atendida!");

        }else{
            if(regiao.equals("S")){
            frete = 20;
            }
            if(regiao.equals("SE")){
            frete = 30;
            }
            if(regiao.equals("CO")){
            frete = 40;
            }
            if(valorCompra >= 500){
            valorFinal = valorCompra;
            System.out.printf("Valor da compra: R$ %.2f \n", valorCompra);
            System.out.println("Valor do frete: FRETE GRATIS!");
            System.out.printf("Valor final: R$ %.2f ", valorFinal);   

            }else{
            valorFinal = valorCompra + frete;
            System.out.printf("Valor da compra: R$ %.2f \n", valorCompra);
            System.out.printf("Valor do frete: R$ %.2f \n", frete);
            System.out.printf("Valor final: R$ %.2f ", valorFinal);
            }
            
        }

        sc.close();
    }
    
}
