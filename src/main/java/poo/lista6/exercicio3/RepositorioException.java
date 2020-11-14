package poo.lista6.exercicio3;

public class RepositorioException extends Exception{
    public RepositorioException(){
        super("Não é possível cadastrar novo cliente. Repositório de clientes está cheio.");
    }
}
