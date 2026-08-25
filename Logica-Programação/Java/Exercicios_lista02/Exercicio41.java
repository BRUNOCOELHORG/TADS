/*
Simulação de financiamento
Leia:

salário mensal;
valor do bem;
valor da entrada;
quantidade de parcelas.
Regras:

Todos os valores devem ser positivos, e a entrada não pode ser maior que o valor do bem.
Calcule o valor financiado: valor do bem - entrada.
Calcule a parcela sem juros: valor financiado / quantidade de parcelas.
O financiamento só pode ser aprovado se a parcela não ultrapassar 30% do salário.
Se a entrada for pelo menos 30% do valor do bem, informe "Boa entrada"; caso contrário,
 informe "Entrada baixa".
Se aprovado e a entrada for baixa, informe também "Aprovação com maior risco".
*/

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simulação de financiamento");
        System.out.println("Informe o seu salario:");
        float salario = sc.nextFloat();
        System.out.println("Informe o valor do bem:");
        Float valorBem = sc.nextFloat();
        System.out.println("Informe o valor da entrada:");
        float valorEntrada = sc.nextFloat();
        System.out.println("Informe a quantidade de parcelas:");
        int quantidadeParcelas = sc.nextInt();

        if(valorBem <= 0){
            System.out.println("Valor do bem INVALIDO!");
        }else if(valorEntrada < 0){
            System.out.println("Valor da entrada é INVALIDO!");
        }else if(quantidadeParcelas <= 0){
            System.out.println("Quantidade de parcelas INVALIDO!");
        }else if (valorEntrada > valorBem){
            System.out.println("Valor da entrada é maior que o valor do bem!");
        }else{
            float valorFinanciamento = valorBem - valorEntrada;
            float valorParcela = valorFinanciamento / quantidadeParcelas;

            if(valorParcela > (salario * .3)){
                System.out.println("Financiamento NEGADO!");
                System.out.println("A parcela ultrapassa 30% do salário");
            }else{
                if(valorEntrada < (valorBem * .3)){
                    System.out.println("Financiamento APROVADO!");
                    System.out.println("Entrada Baixa!");
                    System.out.println("Aprovação com maior risco!");
                }else{
                    System.out.println("Financiamento APROVADO!");
                    System.out.println("Boa entrada!");
                }
            }
        }

        sc.close();
    }
    
}
