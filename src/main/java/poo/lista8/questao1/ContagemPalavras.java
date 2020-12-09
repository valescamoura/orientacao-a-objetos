package poo.lista8.questao1;

import java.util.HashMap;
import java.util.Scanner;

public class ContagemPalavras {

    //conta quantas vezes cada palavra aparece na frase
    public static HashMap<String, Integer> contaPalavras(String[] frase) {
        HashMap<String, Integer> palavras = new HashMap<String, Integer>();

        for(String palavra: frase){
            if(!palavras.containsKey(palavra)){
                palavras.put(palavra, 1);
            }else{
                palavras.put(palavra, palavras.get(palavra)+1);
            }
        }

        return palavras;
    }

    //lê frase do teclado e retorna vetor de palavras da frase
    public static String[] lerFrase() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        teclado.close();

        return frase.split(" ");
    }

    public static void main(String[] args) {
        String[] frase = lerFrase();
        HashMap<String, Integer> palavras = contaPalavras(frase);

        for (String palavra : palavras.keySet()){
            System.out.println("Palavra: " + palavra + " | Quantidade de vezes que aparece na frase: " + palavras.get(palavra));
        }
    }
}
