/*
Validação de usuário e senha
Leia um nome de usuário e uma senha.

usuário correto: "admin";
senha correta: "java123".
O programa deve informar separadamente se o usuário está incorreto ou
 se a senha está incorreta. O acesso só deve ser permitido quando os dois estiverem corretos.
*/


import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Validação de usuário e senha");
        System.out.println("Usuario:");
        String usuario = sc.next();
        System.out.println("Senha:");
        String senha = sc.next();
        String acesso;

        if(usuario.equals("admin")){
            usuario = "Usuario correto";
            if(senha.equals("java123")){
                senha = "Senha correta";
            }else{
                senha = "Senha incorreta";
            }
        }else{
            usuario = "Usuario incorreto";
            if(senha.equals("java123")){
                senha = "Senha correta";
            }else{
                senha = "Senha incorreta";
            }
        }
        if(usuario.equals("Usuario correto") && senha.equals("Senha correta")){
            acesso = "Acesso Permitido";
        }else{
            acesso = "Acesso Negado";
        }
        System.out.println(usuario);
        System.out.println(senha);
        System.out.println(acesso);

        sc.close();
    }
    
}
