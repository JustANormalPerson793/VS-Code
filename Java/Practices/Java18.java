import java.util.Scanner;
public class Java18{
    public static void main(String[] args){
        String c_o = "", c_s = "";
        int num_c = 0, from = 0, until = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres: ");
        c_o = in.nextLine();
        num_c = c_o.length();
        System.out.println("La cadena de caracteres " + c_o + " pose " + num_c + " caracteres.");
        System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
        from = in.nextInt();
        System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        until = in.nextInt();
        c_s = c_o.substring(from, until);
        System.out.println("La nueva cadena es: " + c_s);
        in.close();
    }
}