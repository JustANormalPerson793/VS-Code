package Java.Personal;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        int choice = 0, Num1 = 0, Num2 = 0, result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Hola, bienvenido a Calculadora.");
        while(choice <= 4){
            System.out.println("Por favor, elige:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Dame el primer valor: ");
                    Num1 = in.nextInt();
                    System.out.print("Dame el segundo valor: ");
                    Num2 = in.nextInt();
                    result = Num1 + Num2;
                    System.out.println("El resultado es " + result);
                    break;
                case 2:
                    System.out.print("Dame el primer valor: ");
                    Num1 = in.nextInt();
                    System.out.print("Dame el segundo valor: ");
                    Num2 = in.nextInt();
                    result = Num1 - Num2;
                    System.out.println("El resultado es " + result);
                    break;
                case 3:
                    System.out.print("Dame el primer valor: ");
                    Num1 = in.nextInt();
                    System.out.print("Dame el segundo valor: ");
                    Num2 = in.nextInt();
                    result = Num1 * Num2;
                    System.out.println("El resultado es " + result);
                    break;
                case 4:
                    System.out.print("Dame el primer valor: ");
                    Num1 = in.nextInt();
                    System.out.print("Dame el segundo valor: ");
                    Num2 = in.nextInt();
                    result = Num1 / Num2;
                    System.out.println("El resultado es " + result);
                    break;
                case 5:
                    System.out.println("Gracias por usar calculadora.");
                    System.out.println("¡Adios!");
                    in.close();
                    break;
            }
        }
    }
}
