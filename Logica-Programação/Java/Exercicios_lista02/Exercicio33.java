/*
 Compra com forma de pagamento
Leia o valor da compra e a forma de pagamento:

"PIX";
"DINHEIRO";
"CARTAO".
Regras:

PIX: 10% de desconto;
dinheiro: 5% de desconto;
cartão: sem desconto.
Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de 2%.

Mostre desconto, taxa e valor final. 
Formas de pagamento diferentes das três indicadas devem ser rejeitadas.
*/

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Compra com forma de pagamento");
        System.out.println("Informe o valor da compra:");
        float valorCompra = sc.nextFloat();
        System.out.println("Informe a forma de pagamento: \nPIX \nDinheiro \nCartão");
        String meioPagamento = sc.next().toUpperCase();
        float desconto = 0, acressimo = 0, valorDesconto = 0, valorAcressimo = 0, valorFinal = 0;

        if(!meioPagamento.equals("PIX") && !meioPagamento.equals("DINHEIRO") && !meioPagamento.equals("CARTAO")){
            System.out.println("Forma de pagamento REJEITADA!");
        }else{
            if(meioPagamento.equals("PIX")){
                desconto = .10f;
            }else if(meioPagamento.equals("DINHEIRO")){
                desconto = .05f;
            }else if(meioPagamento.equals("CARTAO")){
                desconto = 0f;
                if(valorCompra > 1000){
                    acressimo = .02f;
                }
            }
            valorDesconto = desconto * valorCompra;
            valorAcressimo = acressimo * valorCompra;
            valorFinal = (valorCompra + valorAcressimo) - valorDesconto;

        System.out.printf("Valor da Compra: R$ %.2f\n", valorCompra);
        System.out.printf("Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Taxa: R$ %.2f\n", valorAcressimo);
        System.out.printf("Valor final: R$ %.2f", valorFinal);

        }


        sc.close();
    }    
}
