/*
Reserva de hotel
Leia:

quantidade de diárias;
tipo de quarto ("SIMPLES" ou "LUXO");
se é alta temporada ("S" ou "N").
Valores por diária:

simples: R$ 180;
luxo: R$ 350.
Na alta temporada, acrescente 20% ao valor das diárias. 
Para reservas com 7 ou mais diárias, aplique depois um desconto de 10% sobre o valor calculado.

Valide todos os dados antes de calcular.
*/

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Reserva de hotel");
        System.out.println("Informe a quantidade de diárias:");
        int quantidadeDiarias = sc.nextInt();
        System.out.println("Informe o tipo de quarto (\"SIMPLES\" ou \"LUXO\"):");
        String tipoQuarto = sc.next().toUpperCase();
        System.out.println("Informe se é alta temporada (\"S\" ou \"N\"):");
        String altaTemporada = sc.next().toUpperCase();

        float valorDiaria = 0, acressimo = 0, valorAcressimo = 0, valorFinal = 0, desconto = 0;
        float valorAntesDesconto = 0, valorDesconto = 0;

        if(quantidadeDiarias <= 0){
            System.out.println("Quantidade de diárias INVALIDO!");
        }else if(!tipoQuarto.equals("SIMPLES") && !tipoQuarto.equals("LUXO")){
            System.out.println("Tipo de quarto INVALIDO!");
        }else if(!altaTemporada.equals("S") && !altaTemporada.equals("N")){
            System.out.println("Alta temporada informada INCORRETAMENTE!");
        }else{
            if(tipoQuarto.equals("SIMPLES")){
                valorDiaria = 180;
            }else{
                valorDiaria = 350;
            }
            if(altaTemporada.equals("S")){
                acressimo = .2f;
            }else{
                acressimo = 0;
            }
            valorAcressimo = (valorDiaria * quantidadeDiarias) * acressimo;

            if(quantidadeDiarias > 7){
                desconto = .1f;
            }else{
                desconto = 0;
            }

            valorAntesDesconto = (valorDiaria * quantidadeDiarias) + valorAcressimo;
            valorDesconto = (valorDiaria * quantidadeDiarias) * desconto;
            valorFinal = valorAntesDesconto - valorDesconto;

            System.out.printf("Valor inicial: R$ %.2f \n", (valorDiaria * quantidadeDiarias));
            System.out.printf("Valor acressimo: R$ %.2f \n", valorAcressimo);
            System.out.printf("Valor desconto: R$ %.2f \n", valorDesconto);
            System.out.printf("Valor Final: R$ %.2f ", valorFinal);
        }

        sc.close();
    }
    
}
