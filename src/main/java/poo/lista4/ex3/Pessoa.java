package poo.lista4.ex3;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    Pessoa(String nome, int idade, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
    }

    Pessoa(String nome, int idade, Pessoa mae, Pessoa pai){
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }

    public void fazAniversario(){
        this.idade++;
    }

    public void mostrarArvGenealogica(){
        System.out.println("Nome: "+nome);
        System.out.println(nome +" tem "+idade+" anos.");
        if(mae != null){
            System.out.println("A mãe de "+nome+ " é "+ mae.nome+".");
        }
        if(pai != null){
            System.out.println("O pai de "+nome+ " é "+ pai.nome+".");
        }

        System.out.println("----------------------------------------------------------------------------");

        if(mae != null){
            mae.mostrarArvGenealogica();
        }
        if(pai != null){
            pai.mostrarArvGenealogica();
        }
    }
}
