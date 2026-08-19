/*
Temperatura
Leia uma temperatura em graus Celsius. 
Informe "Temperatura elevada" quando ela for maior que 30 graus e "Temperatura normal" 
caso contrário.
*/
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura");
        System.out.println("Digite a temperatua atual:");
        float temp = sc.nextFloat();
        
        if(temp > 30){
            System.out.println("Temperatura ELEVADA!");

        } else{
            System.out.println("Temperatura NORMAL.");
        }
        sc.close();
    }
    
}
