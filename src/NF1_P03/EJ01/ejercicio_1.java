package NF1_P03.EJ01;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero decimal: ");
        double numero = sc.nextDouble();
        if(numero < 1 && numero > -1 && numero != 0){
            System.out.println("El numero es casi 0.");
        }
        else{
            System.out.println("El numero no es casi 0.");
        }
    }
}
