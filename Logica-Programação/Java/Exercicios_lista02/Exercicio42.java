/*
Avaliação de desempenho de funcionário
Leia três notas de 0 a 10:

produtividade;
qualidade;
pontualidade.
Calcule a média e classifique:

média >= 9: Excelente;
média >= 7: Bom;
média >= 5: Regular;
média < 5: Insuficiente.
Entretanto:

se qualquer nota for menor que 4, a classificação máxima permitida é Regular;
se duas ou mais notas forem menores que 4, a classificação deve ser Insuficiente.
Valide todas as notas antes de calcular.
*/

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Avaliação de desempenho de funcionário");
        System.out.println("Informe a nota em produtividade:;");
        int notaProdutividade = sc.nextInt();
        System.out.println("Informe a nota em qualidade:");
        int notaQualidade = sc.nextInt();
        System.out.println("Informe a nota em pontualidade:");
        int notaPontualidade = sc.nextInt();
        
        if(notaProdutividade < 0 || notaProdutividade > 10){
            System.out.println("Produtividade INVALIDA!:");
        }else if(notaQualidade < 0 || notaQualidade > 10){
            System.out.println("Qualidade INVALIDA!:");
        }else if(notaPontualidade < 0 || notaPontualidade > 10){
            System.out.println("Pontualidade INVALIDA!:");
        }else{
            int media = (notaProdutividade + notaQualidade + notaPontualidade) / 3;
            String classificacao = "classificação";
            if(notaProdutividade < 4 && notaQualidade < 4){
                classificacao = "INSUFICIENTE";
            }else if(notaProdutividade < 4 && notaPontualidade < 4){
                classificacao = "INSUFICIENTE";
            }else if(notaQualidade < 4 && notaPontualidade < 4){
                classificacao = "INSUFICIENTE";
            }else{
                if(media >= 9){
                    classificacao = "EXCELENTE";
                }else if(media >= 7){
                    classificacao = "BOM";
                }else if(media >= 5){
                    classificacao = "REGULAR";
                }else{
                    classificacao = "INSUFICIENTE";
                }
                if(media >= 7 && notaProdutividade < 4){
                    classificacao = "REGULAR";                    
                }else if(media >= 7 && notaQualidade < 4){
                    classificacao = "REGULAR";                    
                }else if(media >= 7 && notaPontualidade < 4){
                    classificacao = "REGULAR";                    
                }
            }
            System.out.println("Classificação: " + classificacao);
        }

        sc.close();
    }
    
}
