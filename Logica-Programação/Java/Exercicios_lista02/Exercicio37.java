/*
Processo seletivo
Leia:

nota da prova técnica;
nota da entrevista;
anos de experiência.
O candidato só pode ser aprovado se tiver:

pelo menos nota 7 na prova técnica;
pelo menos nota 6 na entrevista.
Se atender a esses dois critérios:

com 2 anos ou mais de experiência: Aprovado;
com menos de 2 anos: Cadastro reserva.
Caso contrário, informe em qual etapa o candidato não atingiu a nota mínima.
*/
import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        System.out.println("Exercício 37 - Lista 02");
        Scanner sc = new Scanner(System.in);

        System.out.println("Processo seletivo");
        System.out.println("Nota da prova técnica:");
        float notaTecnica = sc.nextFloat();
        System.out.println("Nota da entrevista:");
        float notaEntrevista = sc.nextFloat();
        System.out.println("Anos de experiência");
        int anosExperiencia = sc.nextInt();

        if(notaTecnica < 0){
            System.out.println("Nota Tecnica INVALIDA!");
        }else if(notaTecnica < 7){
            System.out.println("O candidato não atingiu a nota tecnica minima!");
        }else{
            if(notaEntrevista < 0){
                System.out.println("Nota da Entrevista INVALIDA!");
            }else if(notaEntrevista < 6){
                System.out.println("O candidato não atingiu a nota da entrevista minima!");
            }else{
                if(anosExperiencia < 2){
                    System.out.println("Candidato em cadastro de reserva!");
                }else{
                    System.out.println("Candidato APROVADO!");
                }
            }
        }

        sc.close();
    }
    
}
