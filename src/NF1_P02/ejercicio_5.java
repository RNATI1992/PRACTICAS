import java.util.Scanner;

public class ejercicio_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        if(numero%2==0 && numero%5==0){
            System.out.println("El numero es par y multiplo de: " + numero);
        }
        else{
            System.out.println("El numero es impar y tampoco multiplo de: " + numero);
        }
    }
}