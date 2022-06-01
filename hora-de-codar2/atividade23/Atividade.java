import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro javali.");
        int j1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe a idade do segundo javali.");
        int j2 = in.nextInt();
        in.nextLine();

        System.out.println("Informe a idade da primeira girafa.");
        int g1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe a idade da segunda girafa.");
        int g2 = in.nextInt();

        if(j1 > j2 && g1 < g2){
            System.out.println("A soma das idades do javali mais velho com a girafa mais nova é de: " + (j1 + g1));
            System.out.println("O produto das idades do javali mais novo com a girafa mais velha é de: " + (j2 + g2));
        } else if(j1 > j2 && g1 > g2){
            System.out.println("A soma das idades do javali mais velho com a girafa mais nova é de: " + (j1 + g2));
            System.out.println("O produto das idades do javali mas novo com a girafa mais velha é de: " + (j2 + g1));
        } else if(j2 > j1 && g1 > g2){
            System.out.println("A soma das idades do javali mais velho com a girafa mais nova é de: " + (j2 + g2));
            System.out.println("O produto das idades do javali mais novo com a girafa mais velha é de: " + (j1 + g1 ));
        } else if(j2 > j1 && g1 < g2){
            System.out.println("A soma das idades do javali mais velho com a girafa mais nova é de: " + (j2 + g1));
            System.out.println("O produto das idades do javali mais novo com a girafa mais velha é de: " + (j1 + g2));
        }

    }
}



