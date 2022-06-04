import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numero = 0;
        int numeros = 0;
        int cont = 0;

        while (cont < 6){
            System.out.println("Informe um numero");
            numero = in.nextInt();
            System.out.println("O número informado foi: " + numero);

            if(numero < 72){
                numeros += numero;
            }
            cont++;
        }
        System.out.println("A soma dos números informados é de: " + numeros);
    }   
}