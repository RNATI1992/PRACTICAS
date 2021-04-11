public class RelacionApp {
    public static void main(String[] args) {
        int x=8;
        int y=5;
        boolean compara=(x<y);
        System.out.println("x<y es "+compara);
        compara=(x>y);
        System.out.println("x>y es "+compara);
        compara=(x==y);
        System.out.println("x==y es "+compara);
        compara=(x!=y);
        System.out.println("x!=y es "+compara);
        compara=(x<=y);
        System.out.println("x<=y es "+compara);
        compara=(x>=y);
        System.out.println("x=>y es "+compara);
        try {
        //espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }
    catch (Exception e) { }
    }
}
