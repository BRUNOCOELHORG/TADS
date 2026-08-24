/*
Resultado de uma partida
Leia o nome de dois times e a quantidade de gols de cada um. Informe o vencedor ou empate.

Depois, classifique a partida:

total de gols igual a 0: Sem gols;
total entre 1 e 3: Poucos gols;
total entre 4 e 6: Jogo movimentado;
total acima de 6: Muitos gols.
Gols negativos são inválidos.
*/

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Resultado de uma partida");
        System.out.println("Informe o primeiro time:");
        String timeUm = sc.next().toUpperCase();
        System.out.println("Informe a quantidade de gols:");
        int golsUm = sc.nextInt();
        System.out.println("Informe o segundo time:");
        String timeDois = sc.next().toUpperCase();
        System.out.println("Informe a quantidade de gols:");
        int golsDois = sc.nextInt();

        if(golsUm < 0 || golsDois < 0){
            System.out.println("Quantidade de gols INVALIDA!");
        }else{
            String vencedor; 
            if(golsUm == golsDois){
                vencedor = "Empate";
            }else if(golsUm > golsDois){
                vencedor = timeUm;
            }else{
                vencedor = timeDois;
            }
            String jogo = "a";
            int totalGols = golsUm + golsDois;
            if(totalGols == 0){
                jogo = "Sem gols";
            }else if(totalGols < 4){
                jogo = "Poucos gols";
            }else if(totalGols < 7){
                jogo = "Jogo Monimentado";
            }else if(totalGols > 6){
                jogo = "Muitos gols";
            }

            System.out.println("Vencedor: " + vencedor);
            System.out.println("Partida: " + jogo);
        }

        sc.close();
    }
    
}
