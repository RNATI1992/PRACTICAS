package NF2_P03;
import java.util.Scanner;

public class cuenta_bancaria {
    //atributos
    private int balance;
    //Constructores
    cuenta_bancaria (int balance){
        this.balance = balance;
    }
    public int getbalance(){
        return balance;
    }
    public void setbalance(int nuevobalance){
        balance = nuevobalance;
    }
    //metodo
    void depositarDinero(){

        System.out.println("Cuanto dinero quieres depositar: "+ balance=);
    }
    void retirarDinero(){
        System.out.println("");
    }
    void obtenerBalance(){
        System.out.println("");
    }
}
