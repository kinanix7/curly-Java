import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1,num2;
        int operator ;

        System.out.println(" Menu principal :\n");
        System.out.println("1 - Addition");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Puissance");
        System.out.println("6 - Racine carrée");
        System.out.println("7 - Factorielle");
        System.out.println("8 - Quitter");

        System.out.print("Entre votre choix :");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();

    }


}
