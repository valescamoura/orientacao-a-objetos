package poo.lista6.exercicio3;

public class ClienteJaExistenteException extends Exception{
    public ClienteJaExistenteException(){
        super("Cliente com o CPF informado já cadastrado!");
    }
}
