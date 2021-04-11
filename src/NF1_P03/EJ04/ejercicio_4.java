package NF1_P03.EJ04;

public class ejercicio_4 {
    public static void main(String[] args){
        long millis = System.currentTimeMillis();
        int hora   = (int) ((millis / (1000*60*60)) % 24);
        int minuto = (int) ((millis / (1000*60)) % 60);
        int segundo = (int) (millis / 1000) % 60 ;
        System.out.println("Hora actual : " + hora + ":"+ (minuto+1)+":"+segundo);
    }
}
