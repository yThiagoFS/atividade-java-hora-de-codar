import java.util.Scanner;


public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o ano da sua data de nascimento:");
        int date = in.nextInt();

        if(date < 2006){
            System.out.println("Você está elegível para votar este ano.")
        } else {
            System.out.println("Você não poderá votar este ano.")
        }
    }
}