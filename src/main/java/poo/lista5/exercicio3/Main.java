package poo.lista5.exercicio3;

import java.util.ArrayList;
import poo.lista5.exercicio2.CarbonFootprint;
import poo.lista5.exercicio2.Carro;
import poo.lista5.exercicio2.Bicicleta;


public class Main {
    //Resposta da pergunta 3.a
    //"O programa que cria a lista de objetos vai continuar funcionando após a modificação na estrutura de classes?"
    //Não continuará funcionando, não é possível criar instâncias da classe edificio pois ela é abstrata.
    //Para resolver tal problema é necessário instanciar classes concretas, como casa e escola, por exemplo.
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<CarbonFootprint>();

        Bicicleta bicicletaAmarela = new Bicicleta("amarela", 29);
        Bicicleta bicicletaRosa = new Bicicleta("rosa", 26);

        Carro carro1 = new Carro("azul", "gasolina", 1.8f, 270f, 5f);
        Carro carro2 = new Carro("cinza", "diesel", 2.0f, 275f, 6f);

        //Edificio construcao1 = new Edificio(3, false, 10, true, 2000f, 100f, "branco");
        //Edificio construcao2 = new Edificio(5, true, 12, true, 2600f, 100f, "verde");

        Casa construcao1 = new Casa(3, false, 10, true, 2000f, 100f, "branco");
        Escola construcao2 = new Escola(5, true, 12, true, 2600f, 100f, "verde");

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
