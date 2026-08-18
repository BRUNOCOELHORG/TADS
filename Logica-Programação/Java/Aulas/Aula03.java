// nome do arquivo Aula03.java
// nome da classe acompanha o nome do arquivo

// util -> utilidades do java
// Scanner -> entrada de dados
import java.util.Scanner;

public class Aula03 {  // chaves delimitam um ESCOPO
    // tudo que construirmos neste semestre estara dentro do main
    // main => principal 
    // ponto de entrada do nosso programa
    public static void main(String[] args) {
        
        // CODIGO FONTE
        // codigo que nós como programadores escrevemos para que o computador execute
        System.out.println("FUNCIONA!!!");
        
        // VARIAVEL
        // variavel é um espaço na memoria do computador que armazena um valor
        // declarar
        // tipo nome;
        int idade;

        // atribuicao
        // idade = 35;

        // declaracao do Scanner com entrada padrao do sistema (teclado no terminal)
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO(A) AO JAVA, informe sua idade");

        // atribui a varaivel idade o valor inteiro digitado pelo usuario
        idade = sc.nextInt();

        // + serve para concatenar o texto com o valor da variavel
        System.out.println("VC DIGITOU " + idade + " ANOS");
        

        /*
            comentario de bloco
            System -> sistema
            out -> saida
            print -> imprimir
            ln -> linha (line)
            () -> dentro dos parenteses o que eu quero imprimir com aspas duplas (exceto variaveis)
        */

    }
}