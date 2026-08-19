/*
Salário por horas trabalhadas
Solicite ao usuário:

a quantidade de horas trabalhadas no mês;
o valor recebido por hora.
Calcule e mostre o salário bruto do funcionário.
*/

import java.util.Scanner;

public class Exercicio28{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         float quanthora, valorhora, salariobruto;
    System.out.println("Salario por horas trabalhadas");
    System.out.println("Digite a quantidade de horas trabalhadas no mês e o valor da hora: ");
       
    quanthora = sc.nextFloat();
    valorhora = sc.nextFloat();
    salariobruto = quanthora * valorhora;

    System.out.println("O salario bruto será de " + salariobruto + " Reais.");

    sc.close();


    }
    
}