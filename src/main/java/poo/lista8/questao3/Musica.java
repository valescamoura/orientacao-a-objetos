package poo.lista8.questao3;

import java.util.Comparator;

public class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista){
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome(){
        return this.nome;
    }

    public String getArtista() {
        return artista;
    }

    public void exibirInfo(){
        System.out.println("Nome da música: " + this.getNome());
        System.out.println("Artista: " + this.getArtista());
    }

    public static Comparator<Musica> comparadorMusica = new Comparator<Musica>(){
        public int compare(Musica m1, Musica m2){
            return m1.getNome().compareTo(m2.getNome());
        }
    };

    public static Comparator<Musica> comparadorArtista = new Comparator<Musica>(){
        public int compare(Musica m1, Musica m2){
            return m1.getArtista().compareTo(m2.getArtista());
        }
    };
}
