import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro número");
        int n2 = in.nextInt();
        
        if(n1>n2){
            System.out.println("O primeiro número é o maior informado. " + n1);
        } else {
            System.out.println("O segundo número é o maior informado. " + n2);
        }
    }
}