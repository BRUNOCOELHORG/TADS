/*
Locação de veículo
Leia:

tipo de veículo ("ECONOMICO" ou "SUV");
quantidade de dias;
quantidade de quilômetros percorridos.
Preços:

Econômico: R$ 120 por dia + R$ 0,80 por km;
SUV: R$ 220 por dia + R$ 1,20 por km.
Regras adicionais:

com 7 ou mais dias, desconto de 10% sobre o valor das diárias;
se a quilometragem total ultrapassar 1.000 km, acrescente taxa fixa de R$ 150;
se a locação tiver 7 ou mais dias e até 500 km, conceda mais R$ 50 de desconto.
Mostre os componentes do cálculo e o total final.
*/

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Locação de veículo");
        System.out.printf("Informe o tipo de veículo \n(\"ECONOMICO\" ou \"SUV\"):");
        String tipoVeiculo = sc.next().toUpperCase();
        System.out.println("Informe a quantidade de dias:");
        int quantidadeDias = sc.nextInt(); 
        System.out.println("Informe a quantidade de quilometros percorridos:");
        float kmPercorrido = sc.nextFloat();

        //float valorEconomico = (quantidadeDias * 120) + (kmPercorrido * .8f);
        //float valorSUV = (quantidadeDias * 220) + (kmPercorrido * 1.2f);

        float valorDiariaEconomico = 120, valorDiariaSUV = 220;
        float valorKMEconomico = kmPercorrido * 0.8f, valorKMSUV = kmPercorrido * 1.2f;
        float taxa = 0, desconto = 0;

        if(quantidadeDias >= 7){
            valorDiariaEconomico = 120 - (120 * 0.1f); 
            valorDiariaSUV = 220 - (220 * 0.1f);
            if(kmPercorrido >= 500){
                desconto = 50;
            }
        }
        if(kmPercorrido >= 1000){
            taxa = 150;
        }
        if(tipoVeiculo.equals("ECONOMICO")){

        float valorFinal = (quantidadeDias * valorDiariaEconomico) + valorKMEconomico + taxa - desconto;
        System.out.println("Tipo do Veiculo: " + tipoVeiculo);
        System.out.println("Quantidade de dias: " + quantidadeDias);
        System.out.println("Quilometros Percorridos: " + kmPercorrido);
        System.out.println("Valor da diaria: " + valorDiariaEconomico);
        System.out.println("Desconto: " + desconto);
        System.out.println("Taxa: " + taxa);
        System.out.println("Valor total: " + valorFinal);

        }else if(tipoVeiculo.equals("SUV")){
            
        float valorFinal = (quantidadeDias * valorDiariaSUV) + valorKMSUV + taxa - desconto;
        System.out.println("Tipo do Veiculo: " + tipoVeiculo);
        System.out.println("Quantidade de dias: " + quantidadeDias);
        System.out.println("Quilometros Percorridos: " + kmPercorrido);
        System.out.println("Valor da diaria: " + valorDiariaSUV);
        System.out.println("Desconto: " + desconto);
        System.out.println("Taxa: " + taxa);
        System.out.println("Valor total: " + valorFinal);
        
        }
        sc.close();
    }
    
}
