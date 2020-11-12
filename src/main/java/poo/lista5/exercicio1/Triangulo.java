package poo.lista5.exercicio1;

public class Triangulo extends FormaGeometrica{
    public void calcularArea(float base, float altura){
        float area = (base*altura)/2;
        this.area = area;
    }

    public void calcularPerimetro(float lado1, float lado2, float lado3){
        float perimetro = lado1+lado2+lado3;
        this.perimetro = perimetro;
    }
}
