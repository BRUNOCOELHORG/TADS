import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade (int): ");
        int idade = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite a sua altura em metros (float): ");
        float altura = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite o seu salario (double): ");
        double salario = sc.nextDouble(); 
        sc.nextLine();

        System.out.println("\n--- Resumo ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);

        sc.close();


    
    }
}