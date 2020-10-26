package poo.lista4.ex4;

public class Retangulo extends Quadrilatero{
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void imprimirArea(){
        System.out.println("Retângulo:");
        super.imprimirArea();
    }
}
