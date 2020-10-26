package poo.lista4.ex6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Pais brasil = new Pais("Brasil", "Brasília", 8515767.049);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 	2780400);
        Pais bolivia = new Pais("Bolivia", "Sucre", 1098581);
        Pais colombia = new Pais("Colômbia", "Bogotá", 1138914);
        Pais paraguai = new Pais("Paraguai", "Assunção", 406752);

        ArrayList<Pais> fronteiraBrasil = new ArrayList<Pais>();
        ArrayList<Pais> fronteiraParaguai = new ArrayList<Pais>();
        ArrayList<Pais> vizinhosComuns = new ArrayList<Pais>();

        fronteiraBrasil.add(argentina);
        fronteiraBrasil.add(bolivia);
        fronteiraBrasil.add(colombia);
        fronteiraBrasil.add(paraguai);
        brasil.setFronteira(fronteiraBrasil);

        fronteiraParaguai.add(argentina);
        fronteiraParaguai.add(bolivia);
        fronteiraParaguai.add(brasil);
        paraguai.setFronteira(fronteiraParaguai);

        brasil.imprimirPais();
        System.out.println("Alguns países que fazem fronteira com o Brasil: ");
        for(Pais pais: brasil.getFronteira()){
            pais.imprimirPais();
        }
        System.out.println("--------------------------------------------------");
        paraguai.imprimirPais();
        System.out.println("Alguns países que fazem fronteira com o Paraguai: ");
        for(Pais pais: paraguai.getFronteira()){
            pais.imprimirPais();
        }
        System.out.println("--------------------------------------------------");

        if(brasil.equals(paraguai)) System.out.println("Brasil e Paraguai possuem mesmo nome e capital.");
        else System.out.println("Brasil e Paraguai não possuem mesmo nome e capital.");
        System.out.println("--------------------------------------------------");

        vizinhosComuns = brasil.vizinhosEmComumTo(paraguai);
        System.out.println("Vizinhos Comuns entre Brasil e Paraguai: ");
        for(Pais pais: vizinhosComuns){
            pais.imprimirPais();
        }
    }
}
