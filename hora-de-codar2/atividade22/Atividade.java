import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int cont = 20;

        int numero = 0;

        int maiorNum = 0;

        int menorNum = 0;

        for(int i = 0; i < cont; i++){

            System.out.print("Informe um número: ");

            int numeroInformado = in.nextInt();

            if(i == 0){
			menorNum = numeroInformado;
            maiorNum = numeroInformado;
			}

            if(numeroInformado > maiorNum){
                maiorNum = numeroInformado;
                
            }
            if(numeroInformado < menorNum){
                menorNum = numeroInformado;
            }
        }
        System.out.println("O maior número informado é o: " + maiorNum + ", e o menor número informado é o: " + menorNum);

    }
}

