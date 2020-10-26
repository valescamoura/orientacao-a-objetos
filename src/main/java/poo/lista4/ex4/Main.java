package poo.lista4.ex4;

public class Main{
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(2, 4);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(5, 10, "isósceles");

        quadrado.imprimirArea();
        retangulo.imprimirArea();
        circulo.imprimirArea();
        triangulo.imprimirArea();
    }
}
