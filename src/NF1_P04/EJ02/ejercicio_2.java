package NF1_P04.EJ02;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args){
        long factorial = 1;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        while(i<=numero){
            factorial=factorial*i;
            i++;
        }
        System.out.println("El factorial es el siguiente: " +factorial);
    }
}
