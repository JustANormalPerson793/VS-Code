import java.util.Scanner;
public class Java17 {
    public static void main(String[] args){
        String name_u = "", pass = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        name_u = in.nextLine();
        System.out.print("Ingresa tu contraseña de usuario: ");
        pass = in.nextLine();
        if(name_u.equals("Sebastian") && pass.equals("123456")){
            System.out.println("Inicio de Sesion correcto");
        }else{
            System.out.println("Nombre de usuaro o contraseña incorrectos");
        }
        in.close();
    }
}