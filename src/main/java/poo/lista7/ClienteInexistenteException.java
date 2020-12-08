package poo.lista7;

public class ClienteInexistenteException extends Exception{
    public ClienteInexistenteException(){
        super("Cliente não está cadastrado.");
    }
}
