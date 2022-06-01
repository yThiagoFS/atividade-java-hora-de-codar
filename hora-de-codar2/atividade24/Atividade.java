import java.util.Scanner;

public class Atividade{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        double n1 = in.nextDouble();
        in.nextLine();

        System.out.println("Infome outro número:");
        double n2 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe qual operação será executada: 1 - Adição, 2 - Subtração, 3 - Divisão, 4 - Multiplicação.");
        int operacao = in.nextInt();

        while(operacao < 1 || operacao > 4){
            
            System.out.println("Informe um valor válido.");
            operacao = in.nextInt();
        
        }

        if(operacao == 1){
            System.out.println("A soma dos valores inseridos é de: " + (n1 + n2));
        } else if(operacao == 2){
            System.out.println("A subtração dos valores inseridos é de: " + (n1 - n2));
        } else if(operacao == 3) {
            System.out.println("A divisão dos valores inseridos é de: " + (n1 / n2));
        } else if(operacao == 4){
            System.out.println("A produto da multiplicação dos valores inseridos é : " + (n1 * n2));
        } 
    }
}

/*Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
que só serão lidos os valores 1, 2, 3 ou 4 para as operações */