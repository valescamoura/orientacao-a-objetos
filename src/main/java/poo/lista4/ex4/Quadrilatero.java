package poo.lista4.ex4;

public class Quadrilatero extends FiguraGeometrica{
    protected double base, altura;

    @Override
    public double calcularArea(){
        return base*altura;
    }
}
