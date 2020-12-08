package poo.lista7;

public class RepositorioException extends Exception{
    public RepositorioException(){
        super("Não é possível cadastrar novo cliente. Repositório de clientes está cheio.");
    }
}
