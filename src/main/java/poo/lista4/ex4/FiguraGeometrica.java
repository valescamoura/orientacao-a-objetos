package poo.lista4.ex4;

import java.text.DecimalFormat;

public class FiguraGeometrica {
    private DecimalFormat df = new DecimalFormat("#.0");
    
    public void imprimirArea(){
        System.out.println("A área é "+df.format(calcularArea())+".");
    }

    public double calcularArea(){
        return 0.0;
    }
}
