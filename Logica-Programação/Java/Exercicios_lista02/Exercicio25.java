/*
Compra de maçãs e pagamento
Leia a quantidade de maçãs e o valor entregue pelo cliente.

Preço:

menos de 12 maçãs: R$ 1,50 por unidade;
12 ou mais: R$ 1,30 por unidade.
Calcule o total. Depois informe se o valor entregue é suficiente. 
Se for, calcule o troco; caso contrário, informe quanto ainda falta pagar. 
Quantidades e valores negativos são inválidos.
*/

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Compra de maçãs e pagamento");
        System.out.println("Informe a quantidade de maças:");
        int quantidadeMacas = sc.nextInt();
        System.out.println("Informe o valor pago:");
        float valorPago = sc.nextFloat();
        float valorUnitario = 0, valorTotal = 0, troco = 0;

        if(quantidadeMacas < 0 || valorPago <0){
            System.out.println("Informações INVALIDAS!");
        }else{
            if(quantidadeMacas < 12){
                valorUnitario = 1.50f;
            }else if(quantidadeMacas >= 12){
                valorUnitario = 1.30f;
            }
            valorTotal = valorUnitario * quantidadeMacas;
            troco = valorPago - valorTotal;
            if(valorTotal < valorPago){
                System.out.printf("Valor total: R$ %.2f \n" , valorTotal);
                System.out.printf("Troco: R$ %.2f", troco );
            }else{
                System.out.printf("Valor total: R$ %.2f \n" , valorTotal);
                System.out.printf("Falta: R$ %.2f", troco );
            }
        }

        sc.close();
    }
    
}
