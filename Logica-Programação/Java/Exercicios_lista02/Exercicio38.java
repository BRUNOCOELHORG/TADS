/*
Seguro de veículo
Leia:

idade do motorista;
quantidade de anos de habilitação;
valor base do seguro.
Regras:

motorista com menos de 21 anos: acréscimo de 20%;
de 21 a 25 anos: acréscimo de 10%;
acima de 25 anos: sem acréscimo por idade.
Além disso, se tiver menos de 2 anos de habilitação, acrescente mais 15% sobre o valor base.

Mostre cada acréscimo separadamente e o valor final. 
Idade e tempo de habilitação não podem ser negativos, 
e o tempo de habilitação não pode ser maior que a idade.
*/

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seguro de veículo");
        System.out.println("Informe a idade do motorista:");
        int idadeMotorista = sc.nextInt();
        System.out.println("Informe a quantidade de anos de habilitação:");
        int anosHabilitacao = sc.nextInt();
        System.out.println("Informe o valor base do seguro:");
        float valorBase = sc.nextFloat();

        float acressimoIdade = 0, acressimoTempo = 0, valorIdade = 0, valorTempo = 0, total =0;

        if(idadeMotorista < 0){
            System.out.println("Idade informada é INVALIDA!");
        }else{
            if(anosHabilitacao < 0){
                System.out.println("Tempo de habilitação INVALIDO!");
            }else{
                if(anosHabilitacao > idadeMotorista){
                    System.out.println("Idade e tempo de habilitação INCOMPATIVEL!");
                }else{
                    if(idadeMotorista < 21){
                        acressimoIdade = 0.2f;
                    }else if(idadeMotorista <= 25){
                        acressimoIdade = 0.1f;
                    }else{
                        acressimoIdade = 0;
                    }
                    if(anosHabilitacao < 2){
                        acressimoTempo = 0.15f;
                    }else{
                        acressimoTempo = 0;
                    }
                        valorIdade = valorBase * acressimoIdade;
                        valorTempo = valorBase * acressimoTempo;
                        total = valorBase + valorIdade + valorTempo; 
                        
                    System.out.printf("Acressimo por idade: R$ %.2f \n", valorIdade);
                    System.out.printf("Acressimo por tempo de CNH: R$ %.2f \n", valorTempo);
                    System.out.printf("Valor total: R$ %.2f", total);
                }
            }
        }


        sc.close();
    }
    
}
