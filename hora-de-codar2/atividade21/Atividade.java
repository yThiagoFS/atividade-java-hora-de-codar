import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double capacetePreco = 18.230;

        System.out.println("Informe em quantas vezes o produto será parcelado.");
        int valorParcela = in.nextInt();

        System.out.println("O valor que será pago em cada parcela é de: " + (capacetePreco / valorParcela));

    }
}

