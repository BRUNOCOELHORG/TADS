/*
Cálculo de salário com bônus
Leia o salário fixo de um vendedor e o valor total vendido no mês.

Bônus:

até R$ 5.000 em vendas: sem bônus;
acima de R$ 5.000 até R$ 10.000: 5% sobre o salário;
acima de R$ 10.000: 10% sobre o salário.
Se o vendedor ultrapassar R$ 20.000 em vendas, acrescente ainda um prêmio fixo de R$ 300.

Mostre salário, bônus, prêmio e salário final.
*/

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de salário com bônus");
        System.out.println("Informe o salario base:");
        float salarioBase = sc.nextFloat();
        System.out.println("Informe o valor vendido:");
        float valorVendido = sc.nextFloat();

        float bonus = 0, premio = 0, valorBonus = 0, valorLiquido = 0;

        if(valorVendido < 0 || salarioBase < 0){
            System.out.println("Dados informados INVALIDOS");        
        }else{
            if(valorVendido < 20.000f){
                if(valorVendido < 5.000f){
                    bonus = 0f;
                }else if(valorVendido < 10.000f){
                    bonus = 0.05f;
                }else if(valorVendido < 20.000f){
                    bonus = 0.10f;
                }
            }else{
                premio = 300f;
                bonus = 0.10f;
            }

            valorBonus = salarioBase * bonus;
            valorLiquido = salarioBase + valorBonus + premio;

        System.out.printf("Salario: R$ %.2f\n",salarioBase);
        System.out.printf("Bônus: %.2f \n", valorBonus );
        System.out.printf("Premio: R$ %.2f\n", premio);
        System.out.printf("Salario liquido: R$ %.2f", valorLiquido);
        }
        sc.close();
    }
    
}
