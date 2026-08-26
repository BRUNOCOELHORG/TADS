/*
Resultado de campeonato
Leia os gols de dois times em uma partida e os pontos que cada time possuía antes do jogo.

Regras de pontuação:

vitória: 3 pontos;
empate: 1 ponto para cada;
derrota: 0 pontos.
O programa deve:

validar que os gols e pontos não são negativos;
identificar vencedor ou empate;
atualizar os pontos de cada time;
informar qual time ficou com mais pontos após a partida;
informar se os dois terminaram com a mesma pontuação.
*/

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Resultado de campeonato");
        System.out.println("Informe os gols do time A:");
        int golsA = sc.nextInt();
        System.out.println("Informe os gols do time B:");
        int golsB = sc.nextInt();
        System.out.println("Informe os pontos do time A:");
        int pontosA = sc.nextInt();
        System.out.println("Informe os pontos do time B:");
        int pontosB = sc.nextInt();

        String vencedor;
        int pontosPartidaA = 0, pontosPartidaB = 0;
        if(golsA < 0 || golsB < 0){
            System.out.println("PLACAR INFORMADO É INCORRETO");
        }else if(pontosA < 0 || pontosB < 0){
            System.out.println("PONTUAÇÃO INFORMADO É INCORRETA");
        }else{

            if(golsA > golsB){
                vencedor = "Time A";
                pontosPartidaA = pontosA + 3;
                pontosPartidaB = pontosB;
            }else if(golsA < golsB){
                vencedor = "Time B";
                pontosPartidaB = pontosB + 3;
                pontosPartidaA = pontosA;
            }else{
                vencedor = "EMPATE";
                pontosPartidaA = pontosA + 1;
                pontosPartidaB = pontosB + 1;
            }    
                String lidera;
                if(pontosPartidaA > pontosPartidaB){
                    lidera = "Time A esta na frente";
                }else if(pontosPartidaA < pontosPartidaB){
                    lidera = "Time B esta na frente";
                }else{
                    lidera = "Os times estao empatados na classificação";
                }
            

            System.out.println("Placar: "+golsA+" X " + golsB );
            System.out.println("Vencedor: " + vencedor);
            System.out.println("Pontuação time A: " + pontosPartidaA);
            System.out.println("Pontuação time B: " + pontosPartidaB);
            System.out.println(lidera);
        }

        sc.close();
    }
    
}
