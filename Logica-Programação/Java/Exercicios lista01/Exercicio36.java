/*
Decomposição de um valor em cédulas
Solicite ao usuário um valor inteiro em reais. Calcule quantas cédulas de cada valor seriam necessárias para representar o valor informado.

Utilize cédulas de:

R$ 100
R$ 50
R$ 20
R$ 10
R$ 5
R$ 2
R$ 1
Exemplo:

Valor informado: R$ 187

Cédulas de R$ 100: 1
Cédulas de R$ 50: 1
Cédulas de R$ 20: 1
Cédulas de R$ 10: 1
Cédulas de R$ 5: 1
Cédulas de R$ 2: 1
Cédulas de R$ 1: 0
Resolva utilizando somente divisões inteiras e o operador de resto da divisão.
*/

import java.util.Scanner;

public class Exercicio36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor, n100, n50, n20, n10, n5, n2, n1;
        
        System.out.println("Decomposição de um valor em cédulas:");
        System.out.println("Digite um valor inteiro:");
        valor = sc.nextInt();

        n100 = valor / 100;
        n50 = (valor - (n100 * 100))/50;
        n20 = (valor - ((n100 * 100)+(n50 * 50)))/20;
        n10 = (valor - ((n100 * 100)+(n50 * 50)+(n20 * 20)))/10;
        n5 = (valor - ((n100 * 100)+(n50 * 50)+(n20 * 20)+(n10 * 10)))/5;
        n2 = (valor - ((n100 * 100)+(n50 * 50)+(n20 * 20)+(n10 * 10)+(n5 * 5)))/2;
        n1 = (valor - ((n100 * 100)+(n50 * 50)+(n20 * 20)+(n10 * 10)+(n5 * 5)))%2;

        System.out.println("Cédulas de R$ 100: " + n100);
        System.out.println("Cédulas de R$ 50: " + n50);
        System.out.println("Cédulas de R$ 20: " + n20);
        System.out.println("Cédulas de R$ 10: " + n10);
        System.out.println("Cédulas de R$ 5: " + n5);
        System.out.println("Cédulas de R$ 2: " + n2);
        System.out.println("Cédulas de R$ 1: " + n1);

        sc.close();


        
        


    }

}