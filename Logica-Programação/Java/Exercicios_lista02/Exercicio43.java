/*
 Loja com desconto e frete
Leia:

valor da compra;
estado de destino ("RS", "SC" ou "PR");
se o cliente é premium ("S" ou "N").
Desconto:

cliente premium: 10%;
cliente comum com compra acima de R$ 500: 5%;
demais casos: sem desconto.
Frete:

RS: R$ 20;
SC: R$ 30;
PR: R$ 35.
Após aplicar o desconto, se o valor restante for igual ou superior a R$ 700,
 o frete será grátis.

Mostre valor original, desconto, frete e total final
*/

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Loja com desconto e frete");
        System.out.println("Informe o valor da compra:");
        float valorCompra = sc.nextFloat();;
        System.out.println("Informe o estado de destino (\"RS\", \"SC\" ou \"PR\"):");
        String estadoDestino = sc.next().toUpperCase();
        System.out.println("Informe se o cliente é premium (\"S\" ou \"N\"):");
        String clientePremium = sc.next().toUpperCase();

        if(valorCompra <=0){
             System.out.println("Valor da compra INVALIDO!");
        }else if(!estadoDestino.equals("RS") && !estadoDestino.equals("SC") && !estadoDestino.equals("PR")){
            System.out.println("Estado de destino INVALIDO!");
        }else if(!clientePremium.equals("S") && !clientePremium.equals("N")){
            System.out.println("Cliente premium INVALIDO!");
        }else{
            float desconto = 0;
            if(clientePremium.equals("S")){
                desconto = 0.1f;
            }else{
                if(valorCompra >= 500){
                    desconto = 0.05f;
                }
            }
            float valorDesconto = valorCompra * desconto;
            float valorTotal = valorCompra - valorDesconto;
            float valorFrete = 0;

            if(valorTotal >= 700){
                valorFrete = 0;
            }else if(estadoDestino.equals("RS")){
                valorFrete = 20;
            }else if(estadoDestino.equals("SC")){
                valorFrete = 30;
            }else if(estadoDestino.equals("PR")){
                valorFrete = 35;
            }
            float valorFinal = valorTotal + valorFrete;

            System.out.printf("Valor Original: R$ %.2f \n", valorCompra);
            System.out.printf("Desconto: R$ %.2f \n", valorDesconto);
            System.out.printf("Valor Frete: R$ %.2f \n", valorFrete);
            System.out.printf("Valor Total: R$ %.2f \n", valorFinal);

        }

        sc.close();
    }
    
}
