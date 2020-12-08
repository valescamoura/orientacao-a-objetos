package poo.lista7;

public class ClienteJaExistenteException extends Exception{
    public ClienteJaExistenteException(){
        super("Cliente com o CPF informado já cadastrado!");
    }
}
