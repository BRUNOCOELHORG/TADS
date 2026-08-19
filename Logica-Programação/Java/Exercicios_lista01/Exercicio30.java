/*
Quantidade de carne para churrasco
Solicite ao usuário:

a quantidade de homens;
a quantidade de mulheres;
a quantidade de crianças.
Considere o seguinte consumo médio:

Homem: 400 gramas
Mulher: 320 gramas
Criança: 200 gramas
Calcule e mostre:

a quantidade total de carne em gramas;
a quantidade total de carne em quilogramas.
*/

import java.util.Scanner;

public class Exercicio30{
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);

    int homem, mulher, crianca;
    float totalgramas, totalkg;
    System.out.println(" Quantidade de carne para churrasco: ");
    System.out.println(" Digite a quantidade de homens, mulheres e crianças:");
    homem = sc.nextInt();
    mulher = sc.nextInt();
    crianca = sc.nextInt();

    totalgramas = ((homem * 400)+(mulher * 320)+(crianca * 200));
    totalkg = totalgramas / 1000;

    System.out.println(" A quantidade de carne necessaria será de " + totalgramas + " gramas.");
    
    System.out.println(" Ou " + totalkg + " quilos de carne.");

    sc.close();


    }

    }