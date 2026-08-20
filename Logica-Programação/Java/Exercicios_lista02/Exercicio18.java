/*
Média de duas notas
Leia duas notas, calcule a média e informe:

Aprovado: média >= 7;
Recuperação: média >= 5 e < 7;
Reprovado: média < 5.
Antes do cálculo, verifique se ambas as notas estão entre 0 e 10. 
Caso alguma seja inválida, não calcule a média.
*/


import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Média de duas notas");
        System.out.println("Digite as notas:");
        float n1, n2, media;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;

        if(n1 < 0 || n1 > 10 && n2 < 0 || n2 > 10){
            System.out.println("As notas digitadas são INVALIDAS!");

        }else if(media >= 7){
            System.out.println("Sua média é de " + media);
            System.out.println("APROVADO");

        }else if(media >= 5 && media < 7){
            System.out.println("Sua média é de " + media);
            System.out.println("RECUPERAÇÃO");
            
        }else{
            System.out.println("Sua média é de " + media);
            System.out.println("REPROVADO");
            
        }


        sc.close();
    }
    
}
