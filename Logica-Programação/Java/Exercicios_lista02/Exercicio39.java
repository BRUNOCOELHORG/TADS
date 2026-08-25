/*
Entrega de pedido
Leia:

valor do pedido;
distância da entrega em quilômetros;
tipo de cliente ("COMUM" ou "PREMIUM").
Frete-base:

até 5 km: R$ 8;
acima de 5 km até 15 km: R$ 15;
acima de 15 km: R$ 25.
Clientes premium têm frete grátis em compras de pelo menos R$ 100. 
Clientes comuns têm frete grátis em compras de pelo menos R$ 200.

Mostre frete e valor total.
*/

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrega de pedido");
        System.out.println("Informe o valor do pedido:");
        float valorPedido = sc.nextFloat();
        System.out.println("Informe a distância da entrega em quilômetros:");
        float distanciaEntrega = sc.nextFloat();
        System.out.println("Informe o tipo de cliente (\"COMUM\" ou \"PREMIUM\"):");
        String tipoCliente = sc.next().toUpperCase();

        float valorEntrega = 0, valorFinal = 0;

        if(distanciaEntrega < 0){
            System.out.println("Distancia entrega INCORRETA!");
        }else{
             if(distanciaEntrega <= 5){
            valorEntrega = 8;
            }else if(distanciaEntrega <= 15){
            valorEntrega = 15;
            }else{
            valorEntrega = 25;
            }
            if(tipoCliente.equals("COMUM")){
            if(valorPedido >= 200){
                valorEntrega = 0;
            }
            }else if(tipoCliente.equals("PREMIUM")){
            if(valorPedido >= 100){
                valorEntrega = 0;
            }
            }
            valorFinal = valorPedido + valorEntrega;

        System.out.printf("Valor do pedido: R$ %.2f \n", valorPedido);
        System.out.printf("Valor da entrega: R$ %.2f \n", valorEntrega);
        System.out.printf("Valor Total: R$ %.2f \n", valorFinal);

        }

        sc.close();
    }
    
}
