/*
Área e perímetro de um retângulo
Solicite ao usuário a largura e a altura de um retângulo. Calcule e mostre:

a área;
o perímetro
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area e Perimetro de um Retangulo");
        System.out.println("Insira a largura em metros:");
        double largura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Insira a Altura em metros:");
        double altura = sc.nextDouble();
        sc.nextLine();

        double area = (largura * altura);
        double perimetro = ((largura * 2) + (altura * 2));

        System.out.println("Area e Perimetro");
        System.out.println("Area em metros quadrados:" + (area));
        System.out.println("Perimetro em metros linear:" + (perimetro));

        sc.close();


    }

    }  

