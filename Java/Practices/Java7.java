import java.util.Scanner;

public class Java7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = "";
        int pass = 0, ant = 0;

        System.out.println("*************************************************************************");
        System.out.println("*Bienvenido al sistema nacional de Coca-Cola Company*");
        System.out.println("*************************************************************************");
        System.out.println("");

        System.out.println("Dame el nombre de trabajador");
        name = in.nextLine();
        System.out.println("Cuanto tiempo de servicio tiene el trabajador?");
        ant = in.nextInt();
        System.out.println("Cual es la clave del trabajador");
        pass = in.nextInt();
        System.out.println("");

        if(pass == 1){
            if(ant == 1){
                System.out.println("El trabajador " + name + " tiene derecho a 6 días de vacaciones");
            } else if(ant >= 2 && ant <= 6){
                System.out.println("El trabajador " + name + " tiene derecho a 14 días de vacaciones");
            } else if(ant >= 7){
                System.out.println("El trabajador " + name + " tiene derecho a 20 días de vacaciones");
            }
        } 
        else if(pass == 2){
            if(ant == 1){
                System.out.println("El trabajador " + name + " tiene derecho a 7 días de vacaciones");
            } else if(ant >= 2 && ant <= 6){
                System.out.println("El trabajador " + name + " tiene derecho a 15 días de vacaciones");
            } else if(ant >= 7){
                System.out.println("El trabajador " + name + " tiene derecho a 22 días de vacaciones");
            }
        } 
        else if(pass == 3){
            if(ant == 1){
                System.out.println("El trabajador " + name + " tiene derecho a 10 días de vacaciones");
            } else if(ant >= 2 && ant <= 6){
                System.out.println("El trabajador " + name + " tiene derecho a 20 días de vacaciones");
            } else if(ant >= 7){
                System.out.println("El trabajador " + name + " tiene derecho a 30 días de vacaciones");
            }
        }
        else {
            System.out.println("Error, la clave del departamento es incorrecta");
        }

        in.close();
    }
}