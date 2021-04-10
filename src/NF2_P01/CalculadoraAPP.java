package NF2_P01;

public class CalculadoraAPP {
    public static void main(String[] args){
        calculadora numeros1= new calculadora(5,5);
        calculadora numeros2= new calculadora(3,3);
        numeros1.sumar();
        numeros1.multi();
        numeros2.multi();
    }
}

