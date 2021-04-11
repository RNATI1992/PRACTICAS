package NF2_P01.AC02;

class Calculadora{
    //atributos
    private int numero1;
    private int numero2;
    //Constructores
    Calculadora (int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int getNumero1()
    {
        return numero1;
    }
    public int getNumero2()
    {
        return numero2;
    }
    public void setNumero1(int nuevonumero1)
    {
        numero1 = nuevonumero1;
    }
    public void setNumero2(int nuevonumero2)
    {
        numero2 = nuevonumero2;
    }
    //metodos
    void sumar()  {
        System.out.println("El resultado es: "+ (numero1+numero2));
    }
    void multi()  {
        System.out.println("El resultado es: "+ (numero1*numero2));
    }
}

