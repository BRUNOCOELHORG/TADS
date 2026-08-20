/*
Faixa de temperatura
Leia uma temperatura em graus Celsius e classifique:

abaixo de 0: Congelante;
de 0 a 15: Frio;
acima de 15 até 25: Agradável;
acima de 25 até 35: Quente;
acima de 35: Muito quente.
*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Faixa de temperatura");
        System.out.println("Digite a temperutura (graus celsius):");
        float temp = sc.nextFloat();

        if(temp < 0){
            System.out.println("TEMPERATURA: CONGELANTE!");

        }else if(temp >= 0 && temp <= 15){
            System.out.println("TEMPERATURA: FRIO!");
            
        }else if(temp > 15 && temp <= 25){
            System.out.println("TEMPERATURA: AGRADAVEL!");
            
        }else if(temp > 25 && temp <= 35){
            System.out.println("TEMPERATURA: QUENTE!");
            
        }else{
            System.out.println("TEMPERATURA: MUITO QUENTE!");
            
        }



        sc.close();
    }
    
}
