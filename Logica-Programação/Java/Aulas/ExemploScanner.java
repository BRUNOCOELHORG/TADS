import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade (int): ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura em metros (float): ");
        float altura = sc.nextFloat();

        System.out.print("Digite seu salário (double): ");
        double salario = sc.nextDouble();

        System.out.println("\n--- Resumo ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);

        sc.close();
    }
}