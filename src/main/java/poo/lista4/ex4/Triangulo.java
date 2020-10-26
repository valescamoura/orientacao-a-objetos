package poo.lista4.ex4;

public class Triangulo extends FiguraGeometrica{
    private String tipo;
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String tipo){
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public void imprimirArea(){
        System.out.println("Triangulo:");
        super.imprimirArea();
    }
}
