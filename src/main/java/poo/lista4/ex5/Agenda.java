package poo.lista4.ex5;

import java.util.ArrayList;

public class Agenda{
    private int tamanhoDaAgenda;
    private int qtdDeContatos = 0;
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    public Agenda(){
        this.tamanhoDaAgenda = 100;
    }

    public Agenda(int tamanhoDaAgenda){
        this.tamanhoDaAgenda = tamanhoDaAgenda;
    }

    //retorna True caso a agenda esteja cheia
    private boolean agendaCheia(){
        return qtdDeContatos >= tamanhoDaAgenda;
    }
    
    //encontra a posicao do contato na agenda
    private int encontraContato(String id){
        int i = 0;
        for(Contato contato: contatos){
            if(contato.getID().equals(id)) return i;
            i++;
        }
        return -1;                  
    }

    //adiciona o contato a agenda e a ordena em ordem alfabetica --- contato pessoa fisica
    public void adicionarContato(String nome, String cpf, String dataDeAniversario, String telefone, String endereco){
        if (agendaCheia()){
            System.out.println("A agenda está cheia! Não é possível adicionar um novo contato.");
        }
        else{
            ContatoPessoaFisica contato = new ContatoPessoaFisica(nome, cpf, dataDeAniversario, telefone, endereco);
            contatos.add(contato);
            qtdDeContatos++;
            System.out.println("Contato Adicionado!");
        }
    }

    //adiciona o contato a agenda e a ordena em ordem alfabetica --- contato pessoa juridica
    public void adicionarContato(String razaoSocial, String cnpj, double faturamento, String telefone, String endereco){
        if (agendaCheia()){
            System.out.println("A agenda está cheia! Não é possível adicionar um novo contato.");
        }
        else{
            ContatoPessoaJuridica contato = new ContatoPessoaJuridica(razaoSocial, cnpj, faturamento, telefone, endereco);
            contatos.add(contato);
            qtdDeContatos++;
            System.out.println("Contato Adicionado!");
        }
    }

    //busca o contato na agenda pelo identificador e o imprime na tela
    void buscarContato(String identificador){
        int pos = encontraContato(identificador);
        if(pos == -1) System.out.println("Contato não encontrado!");
        else contatos.get(pos).imprimirContato();
    }

    //busca o contato na agenda e altera seu telefone
    void alterarContato(String identificador, String novoTelefone){
        int pos = encontraContato(identificador);
        if(pos == -1) System.out.println("Contato não encontrado! A alteração não foi realizada.");
        else{
        contatos.get(pos).setTelefone(novoTelefone);
        System.out.println("O telefone de "+contatos.get(pos).getNome()+" foi alterado!");
        }
    }
    
    //imprime todos os contatos da agenda
    void listarContatos(){
        for(Contato contato: contatos){
            contato.imprimirContato();
        }
    }

    //informa quantos contatos ainda podem ser adicionados
    void mostrarNumeroDeContatos(){
        int n = tamanhoDaAgenda - qtdDeContatos;
        System.out.println("Sua agenda tem "+qtdDeContatos+" contatos. Você ainda pode adicionar mais "+n+" contatos.");
    }
}
