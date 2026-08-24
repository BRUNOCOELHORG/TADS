/*
Conta de energia
Leia o consumo mensal em kWh e o tipo de imóvel:

"R" — residencial;
"C" — comercial.
Tarifa:

residencial:
até 100 kWh: R$ 0,60 por kWh;
acima de 100 kWh: R$ 0,75 por kWh sobre todo o consumo;
comercial:
até 200 kWh: R$ 0,80 por kWh;
acima de 200 kWh: R$ 0,95 por kWh sobre todo o consumo.
Se o valor calculado da conta for inferior a R$ 30, cobre a tarifa mínima de R$ 30.
*/

import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Conta de energia");
            System.out.println("Informe o consume mensal em KW/h:");
            float consumo = sc.nextFloat();
            System.out.println("Informe o tipo de imovel:\nR = Residencial \nC = Comercial");
            String tipo = sc.next().toUpperCase();
            float kwh = 0, valorTotal = 0;

            if(!tipo.equals("R") && !tipo.equals("C")){
                System.out.println("Tipo da residencia INVALIDO!");
                valorTotal = 0f;
            }else{
                if(tipo.equals("R")){
                    if(consumo < 100){
                        kwh = .6f;
                    }else{
                        kwh = .75f;
                    }
                }else if(tipo.equals("C")){
                    if(consumo < 200){
                        kwh = .8f;
                    }else{
                        kwh = .95f;
                    }
                }
                valorTotal = consumo * kwh;
                if(valorTotal < 30){
                valorTotal = 30f;
            }
            
            }
            System.out.printf("Valor total da conta: R$ %.2f", valorTotal);

        sc.close();
    }
    
}
