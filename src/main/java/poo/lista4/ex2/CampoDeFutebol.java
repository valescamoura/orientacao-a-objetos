package poo.lista4.ex2;

import java.text.DecimalFormat;
import poo.lista4.ex1.ConversaoDeUnidadesDeArea;

public class CampoDeFutebol{
    public static void main(String[] args){
    DecimalFormat df = new DecimalFormat("#.00");
    double campoDeFutebol = 8250.00;
    System.out.println("A área de um campo de futebol em metros quadrados é "+df.format(campoDeFutebol)+".");
    double pesQuadrados = ConversaoDeUnidadesDeArea.metroToPes(campoDeFutebol);
    System.out.println("A área de um campo de futebol em pés quadrados é "+ df.format(pesQuadrados)+".");
    System.out.println("A área de um campo de futebol em acres é "+ df.format(ConversaoDeUnidadesDeArea.PesToAcres(pesQuadrados))+".");
    System.out.println("A área de um campo de futebol em centímetros quadrados é "+ df.format(ConversaoDeUnidadesDeArea.pesToCentimetros(pesQuadrados))+".");
    }
}