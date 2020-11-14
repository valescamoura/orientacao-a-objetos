package poo.lista6.exercicio3;

public class CadastroCliente {
    private static int numMaxClientes = 2;
    private static int qtdClientes = 0;
    private static Cliente[] clientes = new Cliente[numMaxClientes];

    public static void main(String[] args) {
        System.out.println("Cadastrando novo cliente:");
        try {
            inserir("12345678900", "Maria", 30, "Rua 1", "2126230000");
            System.out.println("Ok!");
        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println(e.getMessage());
        } catch (DadoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Tentando cadastrar mesmo cliente:");
        try {
            inserir("12345678900", "Maria", 30, "Rua 1", "2126230000");
            System.out.println("Ok!");
        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println(e.getMessage());
        } catch (DadoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cadastrando novo cliente:");
        try {
            inserir("12345678901", "José", -1, "Rua 2", "2126231111");
            System.out.println("Ok!");
        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println(e.getMessage());
        } catch (DadoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cadastrando novo cliente novamente:");
        try {
            inserir("12345678901", "José", 31, "Rua 2", "2126231111");
            System.out.println("Ok!");
        } catch (RepositorioException e) {
            System.out.println(e.getMessage());
        } catch (ClienteJaExistenteException e) {
            System.out.println(e.getMessage());
        } catch (DadoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista de clientes:");
        imprimirClientes();

        System.out.println("Buscando cliente pelo CPF:");
        try {
            Cliente cliente = buscar("12345678900");
            System.out.println("Ok!");
            cliente.exibirInfo();
        } catch (ClienteInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void inserir(String cpf, String nome, int idade, String endereco, String telefone) throws RepositorioException, ClienteJaExistenteException, DadoInvalidoException {
        Cliente cliente = new Cliente(cpf, nome, idade, endereco, telefone);
        if(qtdClientes >= numMaxClientes) {
            throw new RepositorioException();
        }else if(buscarAux(cpf) != null){
            throw new ClienteJaExistenteException();
        }
        clientes[qtdClientes] = cliente;
        qtdClientes++;     
    }

    private static Cliente buscarAux(String cpf){
        for(int i = 0; i < qtdClientes; i++){
            if(cpf.equals(clientes[i].getCpf())){
                return clientes[i];
            }
        }
        return null;
    }

    public static Cliente buscar(String cpf) throws ClienteInexistenteException {
        Cliente cliente = buscarAux(cpf);
        if(cliente == null){
            throw new ClienteInexistenteException();
        }
        return cliente;
    }

    public static void imprimirClientes(){
        for(int i = 0; i < qtdClientes; i++){
            clientes[i].exibirInfo();
        }
    }
}  

