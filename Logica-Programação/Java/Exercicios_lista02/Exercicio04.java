/*
Pode dividir?
Leia dois números reais. Antes de realizar a divisão do primeiro pelo segundo,
 verifique se o segundo número é diferente de zero. Se for zero, 
 apresente uma mensagem informando que a divisão não pode ser realizada.
*/
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pode dividir?");
        System.out.println("Digite dois numeros reais:");
        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();

        if( b == 0 ){
        System.out.println("Essa divisão NÃO pode ser realizada!");

        } else{

            c = (a / b);
            System.out.println("Essa divisão PODE ser calculada:");
            System.out.println("A divisão de "+ a + " / "+ b + " é igual a " + c);

        }
        sc.close();
    }    
}
