import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int cont = 0;
        int numero = 0;

        while(cont < 10){
            System.out.print("Informe um número");
            numero =  in.nextInt();

            if(numero > 0){
                System.out.println("O número informado é positivo.");
            } else if(numero == 0){
                System.out.println("O número informado é igual a 0.");
            } else {
                System.out.println("O número informado é negativo");
            }

            
        }
    }
}