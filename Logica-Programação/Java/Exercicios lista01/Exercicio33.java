/*
Idade aproximada em dias
Solicite ao usuário:

a quantidade de anos completos;
a quantidade de meses completos;
a quantidade de dias adicionais.
Calcule a idade aproximada da pessoa em dias.

Considere:

1 ano = 365 dias
1 mês = 30 dias
*/

import java.util.Scanner;

public class Exercicio33{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade aproximada em dias:");
        System.out.println("Digite a sua idade em anos meses e dias completos:");
        int anos, meses, dias, idade;
        anos = sc.nextInt();
        meses = sc.nextInt();
        dias = sc.nextInt();

        idade = ((anos * 365)+(meses * 30)+ dias);

        System.out.println("A sua idade é de " + idade + " dias aproximadamente.");

        sc.close();

    }
}