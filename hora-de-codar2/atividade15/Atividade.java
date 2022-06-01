import java.util.Scanner;

public class  Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe sua senha.");
        int senha = in.nextInt();

        while(senha != 1234){
            System.out.println("ACESSO NEGADO! Informe a senha novamente:");
            senha = in.nextInt();
        }
        System.out.println("Acesso permitido!");
    }
}