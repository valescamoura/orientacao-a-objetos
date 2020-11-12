package poo.lista5.exercicio1;

public class Circulo extends FormaGeometrica{
    public void calcularArea(float raio){
        float area = (float) (Math.PI * Math.pow(raio, 2));
        this.area = area;
    }

    public void calcularPerimetro(float raio){
        float perimetro = (float) (Math.PI * 2 * raio);
        this.perimetro = perimetro;
    }
}
