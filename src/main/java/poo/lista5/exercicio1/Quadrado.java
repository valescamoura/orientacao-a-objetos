package poo.lista5.exercicio1;

public class Quadrado extends Retangulo{

    public void calcularArea(float lado) {
        float area = lado*lado;
        this.area = area;
    }

    public void calcularPerimetro(float lado){
        float perimetro = lado*4;
        this.perimetro = perimetro;
    }
}
