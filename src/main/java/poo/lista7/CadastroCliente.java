package poo.lista7;

import java.util.ArrayList;

public class CadastroCliente {
    protected static int numMaxClientes = 10;
    protected static int qtdClientes = 0;

    public static void inserir(int cpf, String nome, int idade, String endereco, String telefone) throws Exception {
        Cliente cliente = new Cliente(cpf, nome, idade, endereco, telefone);
        Cliente aux = ClienteArquivo.buscarPorCPF(cpf);
        //System.out.println(aux);
        if(qtdClientes >= numMaxClientes) {
            throw new RepositorioException();
        }else if(aux != null){
            throw new ClienteJaExistenteException();
        }
        ClienteArquivo.inserir(cliente);  
        qtdClientes++;
    }

    public static Cliente buscar(int cpf) throws ClienteInexistenteException {
        Cliente cliente = ClienteArquivo.buscarPorCPF(cpf);
        if(cliente == null){
            throw new ClienteInexistenteException();
        }
        return cliente;
    }

    public static ArrayList<Cliente> buscar(String nome) throws ClienteInexistenteException {
        ArrayList<Cliente> cliente = ClienteArquivo.buscarPorNome(nome);
        if(cliente == null){
            throw new ClienteInexistenteException();
        }
        return cliente;
    }

    public static void listar(){
        ArrayList<Cliente> listaDeClientes = ClienteArquivo.listar();
        for(Cliente cliente: listaDeClientes){
            cliente.exibirInfo();
        }
    }

    public static void excluir(int cpf) {
        ClienteArquivo.excluir(cpf);
    }
}  

