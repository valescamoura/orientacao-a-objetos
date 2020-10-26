package poo.lista4.ex5;

public class ContatoPessoaFisica extends Contato{
    private String nome;
    private String cpf;
    private String dataDeAniversario;

    public ContatoPessoaFisica(String nome, String cpf, String dataDeAniversario, String telefone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeAniversario = dataDeAniversario;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = "fisica";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getID() {
        return cpf;
    }
    
    @Override
    public void imprimirContato(){
        System.out.println("Nome: "+ nome);
        super.imprimirContato();
        System.out.println("CPF: "+ cpf);
        System.out.println("Data de Aniversário: "+ dataDeAniversario);
    }
}
