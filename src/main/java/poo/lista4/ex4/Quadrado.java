package poo.lista4.ex4;

public class Quadrado extends Quadrilatero{
    public Quadrado(double lado){
        this.base = lado;
        this.altura = lado;
    }

    @Override
    public void imprimirArea(){
        System.out.println("Quadrado:");
        super.imprimirArea();
    }
}
