/*
Categoria de nadador e autorização
Leia a idade de um nadador e informe a categoria:

até 8 anos: Mirim;
9 a 13: Infantil;
14 a 17: Juvenil;
18 ou mais: Adulto.
Depois, informe se ele pode participar de uma prova que exige idade mínima de 14 anos.
 Idades negativas devem ser rejeitadas.
*/

import java.util.Scanner;

public class Exercicio24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Categoria de nadador e autorização");
        System.out.println("Informa a sua idade:");
        int idade = sc.nextInt();
        String categoria = "categ", participacao = "autor";

        if(idade < 0){
            System.out.println("Idade informada é INVALIDA!");
         } else{
            if(idade <= 8){
                categoria = "Mirim";
                participacao = "NEGADA!";
            }else if(idade <= 13){
                categoria = "Infantil";
                participacao = "NEGADA!";
            }else if(idade <= 17){
                categoria = "Juvenil";
                participacao = "AUTORIZADA!";
            }else {
                categoria = "Adulto";
                participacao = "AUTORIZADA!";
            }
           
            System.out.println("Sua categoria é: " + categoria);
            System.out.println("Participação: " + participacao);
    
        sc.close();
         }
    }
}