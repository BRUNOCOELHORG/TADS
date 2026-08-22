/*
 Tipo de combustível
Leia o tipo de combustível ("G" para gasolina ou "E" para etanol)
 e a quantidade de litros abastecida.

Considere:

gasolina: R$ 6,20 por litro;
etanol: R$ 4,10 por litro.
Se forem abastecidos mais de 30 litros, conceda 5% de desconto. 
Informe o tipo, o valor antes do desconto, o desconto e o valor final. 
Caso o tipo informado seja inválido, mostre uma mensagem de erro.
*/


import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Tipo de combustível");
        System.out.println(" Tipo de combustíve(G para gasolina E para etanol):");
        String tipo = sc.next();
        System.out.println(" Quantidade de litros abastecido:");
        float quantidade = sc.nextFloat();
        float gasolina, etanol, desconto, valor, valordesconto, valorfinal;
        gasolina = 6.2f;
        etanol = 4.10f;

        if(quantidade >= 30){
            desconto = 0.05f;
        }else{
            desconto = 0f;
        }
            if(tipo.equals("G")){
                tipo = "Gasolina";
                valor = gasolina * quantidade;
                valordesconto = valor * desconto;
                valorfinal = valor - valordesconto;

                System.out.println("Tipo: " + tipo);
                System.out.printf("Valor S/Desconto: %.2f Reais. %n", valor);
                System.out.printf("Desconto: R$ %.2f %n", valordesconto);
                System.out.printf("Valor total: %.2f Reais", valorfinal );
            }else if(tipo.equals("E")){
                tipo = "Etanol";
                valor = etanol * quantidade;
                valordesconto = valor * desconto;
                valorfinal = valor - valordesconto;
            
                System.out.println("Tipo: " + tipo);
                System.out.printf("Valor S/Desconto: %.2f Reais. %n", valor);
                System.out.printf("Desconto: R$ %.2f %n", valordesconto);
                System.out.printf("Valor total: %.2f Reais", valorfinal );

               } else{
                System.out.println("Tipo informado INVALIDO!" );
        } 
    
    sc.close();
    }
}