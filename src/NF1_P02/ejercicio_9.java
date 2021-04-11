import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero decimal:");
        double numero = sc.nextDouble();
        System.out.println("El numero redondeado es: " + Math.round(numero));
    }
}