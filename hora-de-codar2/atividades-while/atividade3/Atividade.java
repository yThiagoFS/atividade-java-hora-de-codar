import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        
       for(int cont = 0; cont <3; cont++ ){
           if(cont == 0 ){
               System.out.println("Informe um número");
               n1 = in.nextInt();
           } else if(cont == 1){
               System.out.println("Informe um número");
                   n2 = in.nextInt();
           } else {
               System.out.println("Informe um número");
               n3 = in.nextInt();
           }
       }
       if(n1 > n3 && n2 > n3){
           System.out.println("A soma dos 2 maiores números é de: " + (n1+n2));
       } else if(n1 > n2 && n3 > n2){
           System.out.println("A soma dos 2 maiores é de: " + (n1 + n3));
       } else if(n2 > n1 && n3 > n1){
           System.out.println("A soma dos 2 maiores números é de: " + (n2 + n3));
       }
       
    }
}