package NF1_P04.EJ01;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args){
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        for(int i=1; i<=numero; i++){
            System.out.println(factorial);
            factorial=factorial*i;
        }
        System.out.println("El factorial es el siguiente: " +factorial);
    }
}
