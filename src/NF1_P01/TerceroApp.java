import java.util.Scanner;

public class TerceroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        Integer edad = sc.nextInt();
        edad += 1;
        System.out.println("Tu edad el próximo año será de " +edad);
    }
}