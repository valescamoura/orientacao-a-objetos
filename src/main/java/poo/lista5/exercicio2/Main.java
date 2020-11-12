package poo.lista5.exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<CarbonFootprint>();

        Bicicleta bicicletaAmarela = new Bicicleta("amarela", 29);
        Bicicleta bicicletaRosa = new Bicicleta("rosa", 26);

        Carro carro1 = new Carro("azul", "gasolina", 1.8f, 270f, 5f);
        Carro carro2 = new Carro("cinza", "diesel", 2.0f, 275f, 6f);

        Construcao construcao1 = new Construcao(3, false, 10, true, 2000f, 100f, "branco");
        Construcao construcao2 = new Construcao(5, true, 12, true, 2600f, 100f, "verde");

        carbonFootprints.add(bicicletaAmarela);
        carbonFootprints.add(bicicletaRosa);
        carbonFootprints.add(carro1);
        carbonFootprints.add(carro2);
        carbonFootprints.add(construcao1);
        carbonFootprints.add(construcao2);

        for(CarbonFootprint carbonFootprint: carbonFootprints){
            carbonFootprint.imprimirInfo();
            System.out.println("Pegada de carbono: "+carbonFootprint.getCarbonFootprint());
            System.out.println("");
        }

    }
}
