/*
Leia a quantidade de minutos utilizados no mês e a 
quantidade de gigabytes de internet utilizados.

Plano básico:

R$ 50 inclui até 100 minutos e até 10 GB;
cada minuto excedente custa R$ 0,50;
cada GB excedente custa R$ 5,00.
Calcule separadamente os excedentes de voz e internet e mostre o valor final. 
Valores negativos devem ser rejeitados.
*/

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Plano internet/telefone (Mensal)");
        System.out.println("Informe a quantidade de minutos utilizado:");
        int minutosTelefone = sc.nextInt();
        System.out.println("Informe a quantidade de internet utilizada (Gigabits):");
        float quantidadeInternet = sc.nextFloat();
        float valorFinal = 0;

        if(minutosTelefone < 0 || quantidadeInternet < 0){
            System.out.println("Dados informados INVALIDOS");
        }else{
            //if((minutosTelefone <= 100 && quantidadeInternet <= 100)){
                //valorFinal = 50.0f;
           // }
            float acressimoMinutos = 0;
            if(minutosTelefone > 100){
                acressimoMinutos = (minutosTelefone - 100) * 0.5f;
            }
            float acressimoInternet = 0;
            if(quantidadeInternet > 10){
                acressimoInternet = (quantidadeInternet - 10) * 5.0f;
            }
            float acressimo = acressimoMinutos + acressimoInternet;
            valorFinal = acressimo + 50f;

            System.out.println("Valor base: R$ 50,00");
            System.out.printf("Valor excedente telefone: R$ %.2f\n", acressimoMinutos);
            System.out.printf("Valor excedente internet: R$ %.2f\n", acressimoInternet);
            System.out.printf("Valor Final: R$ %.2f", valorFinal);
        }

        sc.close();
    }
    
}
