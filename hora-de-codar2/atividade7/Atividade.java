import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe um número");
        int n2 = in.nextInt();
        in.nextLine();

        System.out.println("Informe um número");
        int n3 = in.nextInt();
        in.nextLine();

        System.out.println("Informe um número");
        int n4 = in.nextInt();
        in.nextLine();

        if(n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("O primeiro número é: " + n1 + ", o último número é: " + n4 + ", já o maior número é: " + n1);
        }else if(n2 > n1 && n2 > n3 && n2 > n4){
            System.out.println("O primeiro número é: " + n1 + ", o último número é: " + n4 + ", já o maior número é: " + n2);
        }else if(n3 > n1 && n3 > n2 && n3 > n4){
            System.out.println("O primeiro número é: " + n1 + ", o último número é: " + n4 + ", já o maior número é: " + n3);
        } else{
            System.out.println("O primeiro número é: " + n1 + ", o último número é: " + n4 + ", já o maior número é: " + n4);
        }
        
        
    }
}