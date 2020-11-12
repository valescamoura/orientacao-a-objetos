package poo.lista5.exercicio8;

import java.util.ArrayList;
import poo.lista5.exercicio1.*;

public class Generica{

    /** método genérico capaz de efetuar a soma das áreas de arrays contendo apenas objetos dos tipos apresentados no exercício 1
     * @param formas
     * @return float
     */
    public static <T extends FormaGeometrica> float somarAreas(ArrayList<T> formas){
        float soma = 0;
        for(FormaGeometrica forma: formas){
            soma += forma.getArea();
        }
        return soma;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();
        ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

        circulo.calcularArea(2);
        triangulo.calcularArea(2, 5);
        retangulo.calcularArea(5, 5);
        quadrado.calcularArea(10);

        formas.add(circulo);
        formas.add(triangulo);
        formas.add(retangulo);
        formas.add(quadrado);

        System.out.println("A soma das áreas de todas as formas geométricas no vetor é "+somarAreas(formas)+".");
    }
}
