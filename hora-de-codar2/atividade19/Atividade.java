import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos lados tem o poligono regular selecionado?");

        int ladosPoligono = in.nextInt();
        in.nextLine();

        if(ladosPoligono < 3) {
            System.out.println("Não é um poligono.");
            return;
        } else if(ladosPoligono > 5) {
            System.out.println("Poligono não identificado."); 
            return;
        } else if(ladosPoligono == 5){
            System.out.println("O Poligono selecionado é um pentágono.");
            return;
        }

        System.out.println("Digite a medida do lado do poligono (em cm)");

        double medidaLado = in.nextDouble();
        in.nextLine();

        

        if(ladosPoligono == 3){
            System.out.println("O poligono selecionado é um Triângulo. Seu perímetro é de: " + medidaLado * 3 + "cm.");
        } else if(ladosPoligono == 4){
            System.out.println("O poligono selecionado é um quadrado. Sua área é de: " + (Math.pow(medidaLado,2)) +"cm²");
        } 
    }
}




