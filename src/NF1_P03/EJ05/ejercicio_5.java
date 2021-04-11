package NF1_P03.EJ05;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args){
        int Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre;
        Enero = Marzo = Mayo = Julio = Agosto = Octubre = Diciembre = 31;
        int Abril, Junio, Septiembre, Noviembre;
        Abril = Junio = Septiembre = Noviembre = 30;
        int Febrero = 28;


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int año = sc.nextInt();
        System.out.print("Elige el mes: ");
        int mes = sc.nextInt();
        switch (mes){
                case 1:
                    System.out.println("Enero: " +Enero);
                    break;
                case 2:
                    if ((((año%100)!=0)&&((año%4)==0))||((año%400)==0)){
                        System.out.println("Febrero: " + (Febrero+1));}
                    else{
                        System.out.println("Febrero: " + (Febrero));
                    };
                    break;
                case 3:
                    System.out.println("Marzo: " +Marzo);
                    break;
                case 4:
                    System.out.println("Abril: " +Abril);
                    break;
                case 5:
                    System.out.println("Mayo: " +Mayo);
                    break;
                case 6:
                    System.out.println("Junio: " +Junio);
                    break;
                case 7:
                    System.out.println("Julio: " +Julio);
                    break;
                case 8:
                    System.out.println("Agosto: " +Agosto);
                    break;
                case 9:
                    System.out.println("Septiembre: " +Septiembre);
                    break;
                case 10:
                    System.out.println("Octubre: " +Octubre);
                    break;
                case 11:
                    System.out.println("Noviembre: " +Noviembre);
                    break;
                case 12:
                    System.out.println("Diciembre: " +Diciembre);
                    break;
                default:
                    System.out.println("Este mes no existe");
                    break;
        }
    }
}
