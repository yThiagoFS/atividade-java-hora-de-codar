import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a marcação do odômetro no inicio do dia, em KM.");
        double odometroInicio = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a marcação do odômetro no final do dia, em KM.");
        double odometroFim = in.nextDouble();
        in.nextLine();

        System.out.println("Informe o número de litros de combustível gasto.");
        double combustivelGasto = in.nextDouble();
        in.nextLine(); 

        System.out.println("Informe o valor total recebido dos passageiros.");
        double valorTotalRecebido = in.nextDouble();
        
        double mediaCombustivel = (odometroFim - odometroInicio) / combustivelGasto;

        System.out.println(mediaCombustivel); 
    }
}