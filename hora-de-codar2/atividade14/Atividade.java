import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de maçãs a ser comprado.");
        double macas = in.nextDouble();
        int totalMacas = (int)Math.round(macas);

        if(macas < 6){
            System.out.println("O número total de maçãs compradas é de: " + totalMacas + ", tendo o valor total de: R$" + macas * 0.30);
        } else {
            System.out.println("O número total de maçãs compradas é de: " + totalMacas + ", tendo o valor total de: R$" + macas * 0.25);
        }
    }
}