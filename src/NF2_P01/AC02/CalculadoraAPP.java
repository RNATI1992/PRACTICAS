package NF2_P01.AC02;

import NF2_P01.AC02.Calculadora;

public class CalculadoraAPP {
    public static void main(String[] args){
        Calculadora numeros1= new Calculadora(5,5);
        Calculadora numeros2= new Calculadora(3,3);
        numeros1.sumar();
        numeros1.multi();
        numeros2.multi();
    }
}