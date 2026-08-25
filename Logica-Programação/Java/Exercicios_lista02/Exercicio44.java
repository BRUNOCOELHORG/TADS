/*
Sistema de autenticação com nível de acesso
Leia usuário, senha e código de perfil.

Credenciais:

usuário: "admin";
senha: "1234".
Somente após validar usuário e senha, analise o perfil:

1: Administrador;
2: Operador;
3: Consulta.
Se usuário estiver incorreto, não é necessário verificar a senha. 
Se a senha estiver incorreta, não é necessário verificar o perfil. 
Códigos de perfil diferentes de 1, 2 e 3 são inválidos.

*/

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de autenticação com nível de acesso");
        System.out.println("Informe o Usuario:");
        String usuario = sc.next();

        if(!usuario.equals("admin")){
            System.out.println("Usuario INCORRETO!");
        }else{
            System.out.println("Informe a Senha:");
            String senha = sc.next();  

            if(!senha.equals("1234")){
                System.out.println("Senha INCORRETA");
            }else{
                System.out.println("Informe o codigo de perfil:");
                String perfil = sc.next();   
                
                if(!perfil.equals("1") && !perfil.equals("2") && !perfil.equals("3")){
                    System.out.println("PERFIL INEXISTENTE:");
                }else{
                    if(perfil.equals("1")){
                        System.out.println("Perfil: Administrador");
                    }else if( perfil.equals("2")){
                        System.out.println("Perfil: Operador");
                    }else{
                        System.out.println("Perfil: Consulta");
                    }
                }
            }   
        }
        

        sc.close();;
    }
    
}
