package poo.lista4.ex4;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.pow(raio,2)*(Math.PI);
    }

    @Override
    public void imprimirArea(){
        System.out.println("Círculo:");
        super.imprimirArea();
    }
}
