import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número de gols marcados pelo Grêmio.");
        int golsGremio = in.nextInt();
        in.nextLine();

        System.out.println("Informe o número de gols marcados pelo Internacional.");
        int golsInter = in.nextInt();
        in.nextLine();

        if( golsGremio > golsInter){
            System.out.println("O vencedor deste grenal foi o Grêmio, ganhando por " + golsGremio + " a " + golsInter);
        } else if(golsInter > golsGremio){
            System.out.println("O vencedor deste grenal foi o Internacional, ganhando por " + (golsInter) + " a " + (golsGremio));
        } else {
            System.out.println("Não houve vencedor neste grenal. O placar final foi de: " + (golsInter) + " a " + (golsGremio) );
        }
    }
}
// Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.