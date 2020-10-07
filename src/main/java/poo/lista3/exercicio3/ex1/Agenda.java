package poo.lista3.exercicio3.ex1;

public class Agenda{
    private int tamanhoDaAgenda = 100;
    private int qtdDeContatos = 0;
    private Contato[] contatos = new Contato[tamanhoDaAgenda];
    
    //construtor que cria agenda para 100 contatos
    public Agenda(){
        this.tamanhoDaAgenda = 100;
    }

    //construtor que cria agenda para o número especificado de contatos
    public Agenda(int tamanhoDaAgenda){
        this.tamanhoDaAgenda = tamanhoDaAgenda;
    }
    
    //retorna True caso a agenda esteja cheia
    private boolean agendaCheia(){
        return qtdDeContatos >= tamanhoDaAgenda;
    }
    
    //ordena a lista de contatos
    private void ordenaContatos(){
        if(qtdDeContatos>1){
            for (int i = 1; i < qtdDeContatos; i++){
                Contato elementoAtual = contatos[i];
                int j = i;
                boolean comp; 

                if((contatos[j-1].getNome()).compareTo(elementoAtual.getNome()) > 0) comp = true;
                else comp = false;

                while (j > 0 && comp){
                    contatos[j] = contatos[j-1];
                    j --;
                    if(j>0){
                        if((contatos[j-1].getNome()).compareTo(elementoAtual.getNome()) > 0) comp = true;
                        else comp = false;
                    }
                }
                contatos[j] = elementoAtual;
            }
        }   
    }

    //encontra a posicao do contato na agenda
    private int encontraContato(String nomeDoContato){
        int i = 0;
        while(i < qtdDeContatos && contatos[i].getNome() != nomeDoContato){
            i++;
        }

        if(i < qtdDeContatos) return i;
        else return -1;
    }

    //imprime o contato
    private void imprimirContato(Contato contato){
        System.out.println("Nome: "+ contato.getNome());
        System.out.println("Telefone: "+ contato.getTelefone());
    }
    
    //adiciona o contato a agenda e a ordena em ordem alfabetica
    public void adicionarContato(String nomeDoContato, String telefoneDoContato){
        if (agendaCheia()){
            System.out.println("A agenda está cheia! Não é possível adicionar um novo contato.");
        }
        else{
            Contato contato = new Contato(nomeDoContato, telefoneDoContato);
            contatos[qtdDeContatos] = contato;
            qtdDeContatos++;
            System.out.println("Contato Adicionado!");
        }
        ordenaContatos();
    }

    //busca o contato na agenda e o imprime na tela
    public void mostrarContato(String nomeDoContato){
        int pos = encontraContato(nomeDoContato);
        if(pos == -1) System.out.println("Contato não encontrado!");
        else imprimirContato(contatos[pos]);
    }

    //busca o contato na agenda e altera seu telefone
    public void alterarContato(String nomeDoContato, String novoTelefone){
        int pos = encontraContato(nomeDoContato);
        if(pos == -1) System.out.println("Contato não encontrado! A alteração não foi realizada.");
        else{
            contatos[pos].setTelefone(novoTelefone); 
            System.out.println("O telefone de "+nomeDoContato+" foi alterado!");
        }
    }
    
    //imprime todos os contatos da agenda
    public void listarContatos(){
        for(int i = 0; i < qtdDeContatos; i++){
            imprimirContato(contatos[i]);
        }
    }

    //informa quantos contatos ainda podem ser adicionados
    public void mostrarNumeroDeContatos(){
        int n = tamanhoDaAgenda - qtdDeContatos;
        System.out.println("Sua agenda tem "+qtdDeContatos+" contatos. Você ainda pode adicionar mais "+n+" contatos.");
    }
}
