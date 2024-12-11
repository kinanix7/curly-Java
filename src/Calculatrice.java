
public class Calculatrice {

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }


    public static double soustraction(double num1, double num2){
        return num1 - num2 ;
    }


    public static double multiplication(double num1 ,double num2){
        return num1 * num2 ;
    }

    public static double division(double num1 , double num2){
        if (num2 == 0){
            System.out.println("Erreur !");
        }
        return num1 / num2 ;
    }

    public static double puissance(double num1, double num2) {
        return Math.pow(num1,num2);
    }

    public static double racinecarree(int num1){
        return Math.sqrt(num1);
    }

    public static int factorielle(int num1){
        if (num1 <= 1){
            return 1;
        }
        return num1 * factorielle(num1 - 1);

    }
}
