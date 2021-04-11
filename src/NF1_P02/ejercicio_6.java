import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año actual: ");
        int año = sc.nextInt();
        System.out.println("Introduce tu fecha de nacimiento(año): ");
        int nacimiento = sc.nextInt();
        System.out.println("El usuario tiene: "+ (año-nacimiento)+ " años");
    } 
}
