/*
Cupom de desconto
Leia o valor da compra e um cupom.

Cupons disponíveis:

"VALE10": 10% de desconto, limitado a R$ 10, válido somente para compras de pelo menos R$ 30;
"VALE20": 20% de desconto, limitado a R$ 25, válido somente para compras de pelo menos R$ 100.
Caso o cupom seja inválido, a compra permanece sem desconto.

Mostre o desconto calculado,
 informe quando o limite precisar ser aplicado e apresente o valor final.
*/

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cupom de desconto");
        System.out.println("Informe o valor da compra:");
        float valorCompra = sc.nextFloat();
        System.out.println("Informe o cupom:");
        String cupom = sc.next().toUpperCase();

            float desconto=0, valorDesconto = 0, valorTotal = 0;
            if(!cupom.equals("VALE10") && !cupom.equals("VALE20")){
                System.out.println("Cupom INVALIDO");
            desconto = 0f;
            }else if(cupom.equals("VALE10")){
                if(valorCompra >= 30){
                    desconto = .1f;
                    valorDesconto = desconto * valorCompra;
                    System.out.println("Cupom APLICADO");
                    if(valorDesconto > 10){
                        valorDesconto = 10f;
                        System.out.println("Limite aplicado");
                    }
                }
            }else if(cupom.equals("VALE20")){
                    if(valorCompra >= 100){
                        desconto = .2f;
                        valorDesconto = desconto * valorCompra;
                    System.out.println("Cupom APLICADO");

                        if(valorDesconto > 25){
                            valorDesconto = 25f;
                            System.out.println("Limite aplicado");
                        }
                    }
                }
                    valorTotal = valorCompra - valorDesconto;
                System.out.printf("Valor Compra: R$ %.2f\n", valorCompra);
                System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
                System.out.printf("Valor Total: R$ %.2f", valorTotal);
            

        sc.close();
    }
    
}
