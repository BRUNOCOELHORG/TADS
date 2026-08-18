/*
Custo de uma viagem
Solicite ao usuário:

a distância da viagem em quilômetros;
o consumo médio do veículo em quilômetros por litro;
o preço do litro do combustível.
Calcule e mostre:

a quantidade estimada de combustível necessária;
o custo estimado da viagem.
*/

import java.util.Scanner;

public class Exercicio26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Custo de uma viagem");
        System.out.println("Por favor, insira a distancia percorrida em Km:");
        int distancia = sc.nextInt();

        System.out.println("Insira o consumo medio do veiculo em Km/lt:");
        double media = sc.nextDouble();

        System.out.println("Qual o valor medio do combustivel:");
        double comb = sc.nextDouble();

        double quant = (distancia / media);
        double custo = (quant * comb);

        System.out.println("A quantidade estimada de combustivel será de " + quant + "litos.");
        System.out.println("E o custo será de " + custo + " Reais.");

        sc.close();
        

    }
    

}