/*
Análise de crédito
Leia:

renda mensal;
valor da parcela desejada;
idade;
se possui dívida em atraso ("S" ou "N").
Regras:

dados numéricos devem ser positivos;
se houver dívida em atraso, o crédito é negado;
caso não haja dívida:
parcela até 25% da renda: condição financeira adequada;
acima de 25% e até 35%: condição financeira de atenção;
acima de 35%: crédito negado;
para clientes com menos de 21 anos, mesmo com condição financeira adequada, 
o resultado deve ser "Análise adicional necessária";
para clientes com 65 anos ou mais, a parcela não pode ultrapassar 20% da renda.
Apresente o resultado final e o motivo principal da decisão.
*/

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Análise de crédito");
        System.out.println("Informe a renda mensal:");
        float rendaMensal = sc.nextFloat();
        System.out.println("Informe o valor da parcela desejada:");
        float valorParcela = sc.nextFloat();
        System.out.println("Informe a idade:");
        int idade = sc.nextInt();
        System.out.println("Informe se possui dívida em atraso (\"S\" ou \"N\"):");
        String possuiDivida = sc.next().toUpperCase();

        if(rendaMensal <= 0){
            System.out.println("Renda informada esta INCORRETA!");
        }else if(valorParcela <= 0){
            System.out.println("Valor da parcela esta INCORRETO");
        }else if(idade <= 0){
            System.out.println("Idade informada esta INCORRETA");
        }else if(!possuiDivida.equals("S") && !possuiDivida.equals("N")){
            System.out.println("Possui divida esta incorreto \n Informar S ou N");
        }else if(possuiDivida.equals("S")){
            System.out.println("Credito NEGADO");
            System.out.println("Cliente com divida");
        }else if((rendaMensal * .35f) < valorParcela){
            System.out.println("Credito NEGADO");
            System.out.println("Valor da parcela acima de 35% da renda");
        }else if(idade >= 65){
            if((rendaMensal * .20f) <= valorParcela){
                System.out.println("Credito NEGADO");
                System.out.println("Cliente com mais de 65 anos");
                System.out.println("Parcela maior que 20% da renda");
            }
        }else{

            if(valorParcela <= (rendaMensal * .25f)){
                System.out.println("Credito APROVADO");
                System.out.println("Condição financeira adequada");  
            }else if(valorParcela <= (rendaMensal * .35f)){
                System.out.println("Credito APROVADO");
                System.out.println("Condição financeira de atenção");  
            }
            if(idade < 21){
                System.out.println("Credito EM ANALISE");
                System.out.println("Menos que 21 anos");
                System.out.println("Análise adicional necessária");  
            }

        }

        sc.close();
    }
    
}
