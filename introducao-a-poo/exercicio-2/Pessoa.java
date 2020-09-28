public class Pessoa {
    String nome;
    int idade;

    void fazAniversario(){
        idade ++;
        System.out.println("Feliz Aniversário de "+idade+" anos, "+nome+"!");
    }

    void imprimirNome(){
        System.out.println("Nome: "+nome);
    }

    void imprimirIdade(){
        System.out.println("A idade de "+nome+" é "+idade+" anos.");
    }
}
