/*
Tarifa de estacionamento
Leia a quantidade total de minutos que um veículo permaneceu estacionado.

Regras:

até 15 minutos: grátis;
de 16 a 60 minutos: R$ 5;
de 61 a 180 minutos: R$ 10;
acima de 180 minutos: R$ 10 mais R$ 2 para cada hora adicional.
Para este exercício, considere que os minutos acima de 180 serão informados em múltiplos de 60.
Valores negativos são inválidos.
*/

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tarifa de estacionamento");
        System.out.println("Informe os minutos de estacionamento:");
        int minutos = sc.nextInt();

        float valorEstacionamento = 0, acressimo = 0, valorTotal = 0;

        if(minutos < 0){
            System.out.println("Tempo infomado é INVALIDO!");
        }else{
            if(minutos <= 15){
                System.out.println("Estacionamento Gratuito");
            }else if(minutos <= 60){
                valorEstacionamento = 5f;
            }else if(minutos <= 180){
                valorEstacionamento = 10f;
            }else if(minutos > 180){
                valorEstacionamento = 10f;
                acressimo = 2f;
            }
            valorTotal = valorEstacionamento + ((((minutos - 180)/ 60) + 1) * acressimo);
            System.out.printf("Valor do estacionamento: R$ %.2f", valorTotal);
        }



        sc.close();
    }
    
}
