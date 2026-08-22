/*
Empréstimo simplificado
Leia:

salário mensal;
valor solicitado de empréstimo;
quantidade de parcelas.
Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.

O empréstimo será aprovado somente se:

a parcela não ultrapassar 30% do salário;
o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida.
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Empréstimo simplificado");
        System.out.println("Informe o salario:");
        float salario = sc.nextFloat();
        System.out.println("Informe o valor solicitado:");
        float valorSolicitado = sc.nextFloat();
        System.out.println("Informe a quantidade de parcelas:");
        int quantidadeParcelas = sc.nextInt();

        float parcela = valorSolicitado / quantidadeParcelas;



        if(salario <= 0 || valorSolicitado <= 0 || quantidadeParcelas <= 0){
            System.out.println("Os dados informados NÂO sao validos!");
        }else{

            if(parcela > (salario * .3)){
                System.out.println("Valor da parcela ACIMA do permitido!");
            }else{
                if(valorSolicitado > (salario * 10)){
                System.out.println("Valor solicitado ULTRPASSA o limite permitido!");
                }else{
                System.out.println("Empréstimo APROVADO!");
                System.out.printf("Valor consedido: R$ %.2f \n", valorSolicitado);
                System.out.printf("Valor da parcela: R$ %.2f", parcela);
                }
            }
        }
        sc.close();
    }
    
}
