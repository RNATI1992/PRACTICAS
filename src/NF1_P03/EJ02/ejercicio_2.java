package NF1_P03.EJ02;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args){
        int numero1, numero2, numero3, aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        numero3 = sc.nextInt();
        if(numero3>numero2){
            aux=numero3;
            numero3=numero2;
            numero2=aux;
        }
        if(numero2>numero1){
            aux=numero2;
            numero2=numero1;
            numero1=aux;
        }
        System.out.println("Los numeros ordenados son: " +numero1+ " " +numero2+ " " +numero3);
    }
}
