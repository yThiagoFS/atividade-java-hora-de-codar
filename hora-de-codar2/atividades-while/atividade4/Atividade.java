import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;

        int soma = 0;

        for(int cont = 0; cont<=10; cont++){
            if(cont == 1){
                System.out.print("Informe um número");
                n1 = in.nextInt();
                soma += n1;
            }else if(cont == 2){
                System.out.print("Informe um número");
                n2 = in.nextInt();
                soma += n2;
            }else if(cont == 3){
                System.out.print("Informe um número");
                n3 = in.nextInt();
                soma += n3;
            }else if(cont == 4){
                System.out.print("Informe um número");
                n4 = in.nextInt();
                soma += n4;
            }else if(cont == 5){
                System.out.print("Informe um número");
                n5 = in.nextInt();
                soma += n5;
            }else if(cont == 6){
                System.out.print("Informe um número");
                n6 = in.nextInt();
                soma += n6;
            }else if(cont == 7){
                System.out.print("Informe um número");
                n7 = in.nextInt();
                soma += n7;
            }else if(cont == 8){
                System.out.print("Informe um número");
                n8 = in.nextInt();
                soma += n8;
            }else if(cont == 9){
                System.out.print("Informe um número");
                n9 = in.nextInt();
                soma += n9;
            }else if(cont == 10){
                System.out.print("Informe um número");
                n10 = in.nextInt();
                soma += n10;
            }
        }

        System.out.println("Você informou 10 números, sendo eles: " + (n1) + " " + (n2) + " " + (n3) + " " + (n4) + " " + (n5) + " " + (n6) + " " + (n7) + " " + (n8) + " " + (n9) + " " + (n10) + ", a soma de todos eles é de: " + soma + ", a média aritimética desses números é de: " + (soma/10));
    }
}