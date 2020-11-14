package poo.lista6.exercicio3;

public class ClienteInexistenteException extends Exception{
    public ClienteInexistenteException(){
        super("Cliente não está cadastrado.");
    }
}
