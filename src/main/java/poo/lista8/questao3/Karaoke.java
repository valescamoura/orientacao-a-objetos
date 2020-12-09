package poo.lista8.questao3;

import java.util.Collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Karaoke {
    Set<Musica> conjuntoMusicas; //conjunto com cada musica uma unica vez
    ArrayDeque<Musica> filaMusicas; //fila de reproducao das musicas

    public Karaoke(){
        this.conjuntoMusicas = new HashSet<Musica>();
        this.filaMusicas = new ArrayDeque<Musica>();
    }

    //adicinar nova musica ao conjunto
    public void adicionarMusica(Musica musica){
        this.conjuntoMusicas.add(musica);
    }

    //listar musicas disponiveis no karaoke
    public void listarMusicas(String criterioDeOrdenacao){
        List<Musica> listaDeMusicas = new ArrayList<>(this.conjuntoMusicas);

        System.out.println("----------------------------------------------");
        if (criterioDeOrdenacao.equals("artista")){
            System.out.println("MÚSICAS ORDENADAS POR NOME DO ARTISTA:");
            Collections.sort(listaDeMusicas, Musica.comparadorArtista);
        }
        else{
            System.out.println("MÚSICAS ORDENADAS POR NOME:");
            Collections.sort(listaDeMusicas, Musica.comparadorMusica);
        }

        for (Musica m: listaDeMusicas){
            m.exibirInfo();
            System.out.println("");
        }
    }

    //adicionar na musica na fila para ser tocada
    public void adicionarMusicaNaFila(Musica musica){
        this.filaMusicas.addLast(musica);
    }
 
    //listar musicas que estao na fila para serem tocadas
    public void consultarFilaMusicas(){
        System.out.println("----------------------------------------------");
        System.out.println("MÚSICAS QUE ESTÃO NA FILA:");
        for (Musica musica : this.filaMusicas){
            musica.exibirInfo();
            System.out.println("");
        }
    }

    //tocar proxima musica da lista e a remover da fila
    public Musica tocarProximaMusica(){
        return this.filaMusicas.pollFirst();
    }

    public static void main(String[] args) {
        Karaoke karaoke = new Karaoke();

        Musica musica1 = new Musica("Willow", "Jasmine Thompson");
        Musica musica2 = new Musica("Oceans", "Hillsong United");
        Musica musica3 = new Musica("So Will I", "Hillsong United");

        karaoke.adicionarMusica(musica1);
        karaoke.adicionarMusica(musica2);
        karaoke.adicionarMusica(musica3);
        karaoke.adicionarMusica(musica3);

        karaoke.listarMusicas("artista");
        System.out.println("");

        karaoke.listarMusicas("nome");
        System.out.println("");

        karaoke.adicionarMusicaNaFila(musica1);
        karaoke.adicionarMusicaNaFila(musica2);

        karaoke.consultarFilaMusicas();
        System.out.println("");

        Musica musicaAtual = karaoke.tocarProximaMusica();
        System.out.println("MÚSICA TOCANDO AGORA:");
        musicaAtual.exibirInfo();
        System.out.println("");

        System.out.println("FILA DE MÚSICAS ATUALIZADA:");
        karaoke.consultarFilaMusicas();
    }
}
