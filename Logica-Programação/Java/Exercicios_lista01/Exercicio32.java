/*
Conversão de segundos
Solicite ao usuário uma quantidade inteira de segundos. Calcule e mostre o tempo no formato:

horas:minutos:segundos
Exemplo:

Segundos informados: 3725
Resultado: 1:2:5
Utilize divisão inteira e o operador %.
*/

import java.util.Scanner;

public class Exercicio32{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversão de segundos:");
        System.out.println("Digite o tempo em segundos:");
        int hora, minuto, segundo, segundorest;
        segundo = sc.nextInt();

        hora = (segundo/3600);
        minuto = ((segundo - (hora * 3600))/60);
        segundorest = ((segundo - (hora * 3600)) % 60);

        System.out.println("Segundos informados: " + segundo);
        System.out.println("Resultado: " + hora + ":" + minuto + ":" + segundorest);

        sc.close();


    }
}