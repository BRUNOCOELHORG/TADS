/*
Conta de restaurante com taxa de serviço
Leia:

valor consumido;
qualidade do atendimento ("OTIMO", "BOM" ou "REGULAR");
quantidade de pessoas na mesa.
Taxa de serviço:

ótimo: 15%;
bom: 10%;
regular: 5%.
Regras adicionais:

mesas com 6 ou mais pessoas recebem 5% de desconto sobre o consumo antes da taxa;
se o valor consumido for superior a R$ 500, aplique mais 5% de desconto sobre o consumo;
os dois descontos podem ser acumulados.
Calcule descontos, taxa de serviço e total final.

*/

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conta de restaurante com taxa de serviço\n");
        System.out.println("Informe o valor consumido:");
        float valorConsumido = sc.nextFloat();
        System.out.println("Informe a qualidade do atendimento \n(\"OTIMO\", \"BOM\" ou \"REGULAR\"):");
        String qualidadeServico = sc.next().toUpperCase();
        System.out.println("Informe a quantidade de pessoas na mesa:");
        int quantidadePessoas = sc.nextInt();

        float taxaOtimo = .15f, taxaBom = .10f, taxaRegular = .05f, valorTaxa = 0; 
        float desconto = .05f, valorDesconto = 0f;

        if(quantidadePessoas >= 6){
            valorDesconto = valorConsumido * desconto;
            if(valorConsumido >= 500){
                desconto = .10f;
                valorDesconto = valorConsumido * desconto;
            }
        }
        valorConsumido = valorConsumido - desconto;

        if(qualidadeServico.equals("OTIMO")){
            valorTaxa = taxaOtimo * valorConsumido;
        }else if(qualidadeServico.equals("BOM")){
            valorTaxa = taxaBom * valorConsumido;
        }else if(qualidadeServico.equals("REGULAR")){
            valorTaxa = taxaRegular * valorConsumido;
        }
        float valorFinal = valorConsumido + valorTaxa - valorDesconto;
         System.out.printf("Valor Descontos: R$ %.2f \n", valorDesconto);
         System.out.printf("Valor Taxas: R$ %.2f \n", valorTaxa);
         System.out.printf("Valor Final: R$ %.2f \n", valorFinal);

        sc.close();
    }
    
}
