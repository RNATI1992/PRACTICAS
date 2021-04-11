package NF1_P04.EJ03;

public class ejercicio_3 {
    public static void main(String[] args){
        int numero = 100;
        int contador = 0;
        //principal
        for (int i=3; i<=numero; i++) {
            contador=0;
            for (int j = numero; j > 0; j--) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("El numero " + i + " es primo.");
            } else {
                System.out.println("El numero " + i + " no es primo.");
            }
        }
    }
}
