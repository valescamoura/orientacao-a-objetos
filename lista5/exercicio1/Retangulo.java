package poo.lista5.exercicio1;

public class Retangulo extends FormaGeometrica{
    public void calcularArea(float lado1, float lado2){
        float area = lado1*lado2;
        this.area = area;
    }

    public void calcularPerimetro(float lado1, float lado2){
        float perimetro = (lado1*2)+(lado2*2);
        this.perimetro = perimetro;
    }
}
