package NF1_P03.EJ03;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce una nota del 0 al 10: ");
            double nota = sc.nextDouble();

            if(nota<5){
                System.out.print("Insuficiente");
            }
            else if(nota<6){
                System.out.print("Suficiente");
            }
            else if(nota<7){
                System.out.print("Bien");
            }
            else if(nota<9){
                System.out.print("Notable");
            }
            else if(nota<=10){
                System.out.print("Excelente");
            }
    }
}
