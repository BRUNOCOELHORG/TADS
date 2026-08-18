/*
Compra de combustível
Solicite ao usuário:

o preço do litro do combustível;
o valor que será utilizado para abastecer.
Calcule e mostre quantos litros de combustível poderão ser comprados.
*/

import java.util.Scanner;

public class Exercicio29{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Compra de Combustivel");
        System.out.println("Insira o valor do combustivel e o valor do abastecimento:");
        float valorcomb, valorabast, quantcombus;
        valorcomb = sc.nextFloat();
        valorabast = sc.nextFloat();

        quantcombus = valorabast / valorcomb;

        System.out.println(" A quantidade do abastecimento foi de " + quantcombus + " Litros.");

        sc.close();


    }
}