import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o seu sexo: 1 para feminino e 2 para masculino.");
        int sexo = in.nextInt();
        in.nextLine();

        System.out.println("Informe sua altura em centimetros.");
        double altura = in.nextDouble();

        double pesoIdealFeminino = (62.1 * (altura / 100)) - 44.7;
        
        double pesoIdealMasculino = (72.7 * (altura / 100)) - 58;

        if(sexo == 1){
            System.out.println("O seu peso ideal é de: " + pesoIdealFeminino);
        } else if( sexo == 2){
            System.out.println("O seu peso ideal é de: " + pesoIdealMasculino);
        } else {
            System.out.println("Por favor, insira um número valido.");
        }
    }
}