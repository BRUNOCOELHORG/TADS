/*
Soma de uma sequência informada
Leia uma quantidade n de números que serão digitados pelo usuário. Em seguida, 
leia exatamente n valores reais e apresente:

a soma de todos os valores;
a média dos valores informados.
O valor de n deve ser maior que zero.


*/

import java.util.Scanner;

public class Ex06L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de uma sequência informada\n");
        System.out.println("Informe a quantidade de numeros a serem calculados:");
        int quantidadeNumeros = sc.nextInt();

        while (quantidadeNumeros <= 0) {
            System.out.println("Quantidade informada é invalida\n");
            System.out.println("Informe a quantidade de numeros novamente:");
            quantidadeNumeros = sc.nextInt();
        }
        int contador = 0;
        int contadorDois = quantidadeNumeros;
        while (contadorDois > 0) {
            
            System.out.println("Informe um numero:");
            int numero = sc.nextInt();
            contador = contador + numero;
            contadorDois --; 
        }
        System.out.println("A soma dos numeros informados é : " + contador);
        System.out.println("A media dos numeros é: " + (contador / quantidadeNumeros));


        sc.close();
    }
    
}
