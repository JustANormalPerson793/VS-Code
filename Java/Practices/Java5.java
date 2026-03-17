public class Java5 {
    public static void main(String[] args){
        int operaciones = 1;
        int num1 = 8;
        int num2 = 4;
        int resultado = 0;
        if(operaciones == 1){
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if(operaciones == 2){
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if(operaciones == 3){
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if(operaciones == 4){
            resultado = num1 / num2;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("La opcion que elegiste no existe");
        }
    }
}
