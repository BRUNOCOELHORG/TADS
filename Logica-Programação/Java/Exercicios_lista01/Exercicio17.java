/*
Área total de uma sala
Uma sala retangular possui uma porta, também retangular. Solicite ao usuário:

a largura da parede;
a altura da parede;
a largura da porta;
a altura da porta.
Calcule e mostre a área da parede que poderá ser pintada, desconsiderando a área ocupada pela porta.
*/

import java.util.Scanner;

public class Exercicio17{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a Area!");
        System.out.println("Digite a largura da parede:");
        double lpa = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a altura da parede:");
        double apa = sc.nextDouble();
        sc.nextLine();

        System.out.println("Agora digite a largura da porta:");
        double lpo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a altura da porta:");
        double apo = sc.nextDouble();
        sc.nextLine();

        double areaparede = (lpa * apa);
        double areaporta = (lpo * apo);
        double area = (areaparede - areaporta);

        System.out.println("A area a ser considerada para pintura é de " + area + (" metros quadrados."));

        sc.close();

    }
}