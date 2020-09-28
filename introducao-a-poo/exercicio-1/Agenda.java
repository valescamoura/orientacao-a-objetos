public class Agenda{
    private int tamanhoDaAgenda = 100;
    private int qtdDeContatos = 0;
    Contato[] contatos = new Contato[tamanhoDaAgenda];
    
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

                if((contatos[j-1].nome).compareTo(elementoAtual.nome) > 0) comp = true;
                else comp = false;

                while (j > 0 && comp){
                    contatos[j] = contatos[j-1];
                    j --;
                    if(j>0){
                        if((contatos[j-1].nome).compareTo(elementoAtual.nome) > 0) comp = true;
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
        while(i < qtdDeContatos && contatos[i].nome != nomeDoContato){
            i++;
        }

        if(i < qtdDeContatos) return i;
        else return -1;
    }

    //imprime o contato
    private void imprimirContato(Contato contato){
        System.out.println("Nome: "+ contato.nome);
        System.out.println("Telefone: "+ contato.telefone);
    }
    
    //adiciona o contato a agenda e a ordena em ordem alfabetica
    void adicionarContato(String nomeDoContato, String telefoneDoContato){
        if (agendaCheia()){
            System.out.println("A agenda está cheia! Não é possível adicionar um novo contato.");
        }
        else{
            Contato contato = new Contato();
            contato.nome = nomeDoContato;
            contato.telefone = telefoneDoContato;
            contatos[qtdDeContatos] = contato;
            qtdDeContatos++;
            System.out.println("Contato Adicionado!");
        }
        ordenaContatos();
    }

    //busca o contato na agenda e o imprime na tela
    void mostrarContato(String nomeDoContato){
        int pos = encontraContato(nomeDoContato);
        if(pos == -1) System.out.println("Contato não encontrado!");
        else imprimirContato(contatos[pos]);
    }

    //busca o contato na agenda e altera seu telefone
    void alterarContato(String nomeDoContato, String novoTelefone){
        int pos = encontraContato(nomeDoContato);
        if(pos == -1) System.out.println("Contato não encontrado! A alteração não foi realizada.");
        else{
        contatos[pos].telefone = novoTelefone;
        System.out.println("O telefone de "+nomeDoContato+" foi alterado!");
        }
    }
    
    //imprime todos os contatos da agenda
    void listarContatos(){
        for(int i = 0; i < qtdDeContatos; i++){
            imprimirContato(contatos[i]);
        }
    }

    //informa quantos contatos ainda podem ser adicionados
    void mostrarNumeroDeContatos(){
        int n = tamanhoDaAgenda - qtdDeContatos;
        System.out.println("Sua agenda tem "+qtdDeContatos+" contatos. Você ainda pode adicionar mais "+n+" contatos.");
    }
}
