public class Java8 {
    public static void main(String[] args){
        int num1 = 5, num2 = 3, result = 0;
        int para = 10;
        switch(para){
            case 1: result = num1 + num2;
            System.out.println("El resultado de la suma es: " + result);
            break;
            case 2: result = num1 - num2;
            System.out.println("El resultado de la resta es: " + result);
            break;
            case 3: result = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + result);
            break;
            case 4: result = num1 / num2;
            System.out.println("El resultado de la division es: " + result);
            break;
            default: System.out.println("Error, la opcion no existe");
            break;
        }
    }
}