package poo.lista4.ex3;

public class Main {
    public static void main(String[] args) {
        Pessoa vozinhaMaterna = new Pessoa("Maria", 82);
        Pessoa vozinhomaterno = new Pessoa("João", 84);
        Pessoa mae = new Pessoa("Sara", 53, vozinhaMaterna, vozinhomaterno);

        Pessoa vozinhaPaterna = new Pessoa("Antonieta", 80);
        Pessoa vozinhoPaterno = new Pessoa("José", 83);
        Pessoa pai = new Pessoa("Felipe", 52, vozinhaPaterna, vozinhoPaterno);

        Pessoa filha = new Pessoa("Sophia", 10, mae, pai);
        filha.mostrarArvGenealogica();
    }
}
    
