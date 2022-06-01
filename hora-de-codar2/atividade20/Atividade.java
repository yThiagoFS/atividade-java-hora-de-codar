import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a nota da primeira avaliação.");
        double n1 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a nota da segunda avaliação.");
        double n2 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a nota da avaliação optativa.");
        double n3 = in.nextDouble();
        
        double notaMedia = 0;

        if(n3 > n1){
            notaMedia = (n3 + n2) / 2;
        } else if(n3 > n2){
            notaMedia = (n3 + n1) / 2;
        } else {
            notaMedia = (n1 + n2) / 2;
        }

        if(notaMedia >=  6){
            System.out.println("O aluno foi aprovado! Sua média foi de: " + notaMedia);
        } else if(notaMedia < 3){
            System.out.println("O aluno foi reprovado. Sua média foi de: " + notaMedia);
        } else {
            System.out.println("O aluno está em exame. Sua média foi de " + notaMedia);
        }

    }
}