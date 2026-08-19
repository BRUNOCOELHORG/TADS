/*
Senha simples
Leia uma senha inteira. Se a senha digitada for 4321, 
mostre "Acesso permitido". Caso contrário, mostre "Senha incorreta".
*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Senha Simples");
        System.out.println("Digite a senha:");
        String senha = sc.next();

        if(senha.equals("1234")){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("Senha INCORRETA");
        }
        sc.close();
    }
    
}
