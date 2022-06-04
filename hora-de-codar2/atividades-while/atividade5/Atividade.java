import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        int soma = 0;

       

        for(int cont = 0; cont < 4; cont++){
            if(cont == 0){
                System.out.println("Informe a nota da primeira avaliação.");
                a1 = in.nextInt();
                soma += a1;
            } else if(cont == 1){
                System.out.println("Informe a nota da segunda avaliação.");
                a2 = in.nextInt();
                soma += a2;
            } else if(cont == 2){
                System.out.println("Informe a nota da terceira avaliação.");
                a3 = in.nextInt();
                soma += a3;
            } else {
                System.out.println("Informe a nota da quarta avaliação.");
                a4 = in.nextInt();
                soma += a4;
            }
        }
        int media = (soma / 4);

        if(media >= 6){
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }

        
    }
}