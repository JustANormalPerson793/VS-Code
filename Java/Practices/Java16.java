import java.util.Scanner;
public class Java16 {
    public static void main(String[] args){
        String name_1 = "", name_2 = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer nombre: ");
        name_1 = in.nextLine();
        System.out.print("Por favor, ingresa el segundo nombre: ");
        name_2 = in.nextLine();
        if(name_1.equalsIgnoreCase(name_2)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres son diferentes");
        }
        in.close();
    }
}