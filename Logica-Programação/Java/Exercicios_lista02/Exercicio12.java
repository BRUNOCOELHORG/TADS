/*
Classificação por idade
Leia a idade de uma pessoa e classifique-a como:

Criança: de 0 a 11 anos;
Adolescente: de 12 a 17 anos;
Adulto: de 18 a 59 anos;
Idoso: 60 anos ou mais.
Caso a idade seja negativa, informe que o valor é inválido.
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificação por idade");
        System.out.println("Por favor, informe a sua idade:");
        int idade = sc.nextInt();

        if(idade < 0){
            System.out.println("IDADE INVALIDA!");

        }else if(idade >= 0 && idade <= 11){
            System.out.println("Criança: de 0 a 11 anos");

        }else if(idade >= 12 && idade <= 17){
            System.out.println("Adolescente: de 12 a 17 anos");


        }else if(idade >= 18 && idade <= 59){
            System.out.println("Adulto: de 18 a 59 anos");
    
        }else {
            System.out.println("Idoso: 60 anos ou mais");

        }
        sc.close();
    }
}
