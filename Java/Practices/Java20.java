import java.util.Scanner;
public class Java20{
    public static void main(String[] args){
        int lon = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Cuantos números deseas ingresar?");
        lon = in.nextInt();
        int nums[] = new int[lon];
        for(int i = 0; i < nums.length; i++){
            System.out.println("Porfavor dame le valor #" + (i + 1));
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print("[" + nums[i] + "]");
        }
        in.close();
    }
}