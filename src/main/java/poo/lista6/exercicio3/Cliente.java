package poo.lista6.exercicio3;

public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;

    public Cliente(String cpf, String nome, int idade, String endereco, String telefone) throws DadoInvalidoException {
        setCpf(cpf);
        setNome(nome);
        setIdade(idade);
        setEndereco(endereco);
        setTelefone(telefone);
    }

    public void setCpf(String cpf) throws DadoInvalidoException{
        if(cpf.length() > 11){
            throw new DadoInvalidoException("Formato do CPF inválido. Incluir apenas números, sem pontos, traços ou espaços.");
        }
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) throws DadoInvalidoException {
        if(endereco.length()>200){
            throw new DadoInvalidoException("Campo de endereço limitado a 200 caracteres.");
        }
        this.endereco = endereco;
    }

    public void setIdade(int idade) throws DadoInvalidoException {
        if(idade<0){
            throw new DadoInvalidoException("Idade Inválida. Não é possível inserir idades negativas.");
        }
        this.idade = idade;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if(nome.length()>200){
            throw new DadoInvalidoException("Campo de nome limitado a 200 caracteres.");
        }
        this.nome = nome;
    }

    public void setTelefone(String telefone) throws DadoInvalidoException {
        if(telefone.length()>11){
            throw new DadoInvalidoException("Campo de telefone limitado a 11 caracteres. Inserir apenas números.");
        }
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirInfo() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereço: "+this.endereco);
    }
}
