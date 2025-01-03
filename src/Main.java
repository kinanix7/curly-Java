import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        int operator;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu principal :\n");
            System.out.println("1 - Addition");
            System.out.println("2 - Soustraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Puissance");
            System.out.println("6 - Racine carree");
            System.out.println("7 - Factorielle");
            System.out.println("8 - Quitter");
            System.out.print("Entre votre choix : ");
            operator = sc.nextInt();

            if (operator >= 1 && operator <= 5) {
                System.out.print("Enter first number : ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number : ");
                num2 = sc.nextDouble();
            } else if (operator == 6 || operator == 7) {
                System.out.print("Enter first number :");
                num1 = sc.nextDouble();
            } else if (operator == 8) {
                System.out.println("Au revoir !!!");
                break;
            } else {
                System.out.println("Option invalide");
                continue;
            }

            switch (operator) {
                case 1:
                    System.out.println("Addition : " + Calculatrice.addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Soustraction : " + Calculatrice.soustraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication : " + Calculatrice.multiplication(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Erreur : Division par zero");
                    } else {
                        System.out.println("Division : " + Calculatrice.division(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Puissance : " + Calculatrice.puissance(num1, num2));
                    break;
                case 6:
                    if (num1 < 0) {
                        System.out.println("Erreur : Racine carree d'un nombre negatif");
                    } else {
                        System.out.println("Factorielle : " + Calculatrice.factorielle((int) num1));
                    }
                    break;
                case 7:
                    if (num1 < 0) {
                        System.out.println("Erreur : Factorielle d'un nombre negatif");
                    } else {
                        System.out.println("Factorielle : " + Calculatrice.factorielle((int) num1));
                    }
                    break;
            }
        }

        sc.close();
    }
}
