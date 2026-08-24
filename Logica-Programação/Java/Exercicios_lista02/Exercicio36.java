/*
Pedido de restaurante
Leia o código de um prato e a quantidade:

1 — Hambúrguer — R$ 25;
2 — Pizza — R$ 40;
3 — Salada — R$ 20.
Calcule o subtotal.

Depois leia se o cliente possui cupom ("S" ou "N"). 
Caso possua e o subtotal seja maior ou igual a R$ 50, aplique 10% de desconto. 
Caso o código, a quantidade ou a resposta do cupom sejam inválidos, 
apresente uma mensagem adequada.
*/

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pedido de restaurante");
        System.out.println("Informe o código do prato: \n1 = Hamburguer \n2 = Pizza \n3 = Salada ");
        String pedido = sc.next().toUpperCase();
        System.out.println("Informe  a quantidade: ");
        int quantidade = sc.nextInt();
        float valor = 0, valorPedido = 0;

        if(!pedido.equals("1") && !pedido.equals("2") && !pedido.equals("3")){
            System.out.println("Codigo INVALIDO!");
        }else if(quantidade <= 0){
            System.out.println("Quantidade INVALIDA!");
        }else{
        if(pedido.equals("1")){
            valor = 25f;
        }else if(pedido.equals("2")){
            valor = 40f;
        }else if(pedido.equals("3")){
            valor = 20f;
        }
        valorPedido = valor * quantidade;
        System.out.printf("valor do pedido : R$ %.2f\n", valorPedido);
        System.out.println("Cliente possui cupom: \nS =SIM \nN = NÂO");
        String cupom = sc.next().toUpperCase();

        float desconto = 0;

        if(!cupom.equals("S") || cupom.equals("N")){
            System.out.println("Cupom INVALIDO!");
        }else{
        if(cupom.equals("S")){
            if(valorPedido > 50){
                desconto = .10f;
            }
        }
    
    }}


        sc.close();
    }
    
}
