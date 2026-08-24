/*
Verificação de triângulo
Leia três valores representando os lados de um possível triângulo.

Primeiro verifique se os valores são positivos.
Depois verifique se realmente podem formar um triângulo.

Caso seja válido, classifique-o como:

Equilátero;
Isósceles;
Escaleno.
*/

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Verificação de triângulo");
        System.out.println("Informe a medida do primeiro lado:");
        float ladoUm = sc.nextFloat();
        System.out.println("Informe a medida do segundo lado:");
        float ladoDois = sc.nextFloat();
        System.out.println("Informe a medida do terceiro lado:");
        float ladoTres = sc.nextFloat();

        if(ladoUm <=0 || ladoDois <= 0 || ladoTres <= 0){
            System.out.println("Medidas informadas NÂO formam um triangulo!");
        }else{
            String triangulo = "triangulo";

            if(ladoUm == ladoDois && ladoUm ==ladoTres){
                triangulo = "Equilatero";
            }else if(ladoUm == ladoDois && ladoUm != ladoTres){
                triangulo = "Isoceles";
            }else if(ladoUm == ladoTres && ladoUm != ladoDois){
                triangulo = "Isoceles";
            }else if(ladoDois == ladoTres && ladoDois != ladoUm){
                triangulo = "Isoceles";
            }else if(ladoUm != ladoDois && ladoUm !=ladoTres && ladoDois != ladoTres){
                triangulo = "Escaleno";
            }

            System.out.println("Conforme as medidas é possivel formar um triangulo " + triangulo);
        }

        sc.close();
    }
    
}
