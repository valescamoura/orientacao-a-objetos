package poo.lista3.exercicio3.ex2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void fazAniversario(){
        idade ++;
        System.out.println("Feliz Aniversário de "+idade+" anos, "+nome+"!");
    }

    public void imprimirNome(){
        System.out.println("Nome: "+nome);
    }

    public void imprimirIdade(){
        System.out.println("A idade de "+nome+" é "+idade+" anos.");
    }
}
