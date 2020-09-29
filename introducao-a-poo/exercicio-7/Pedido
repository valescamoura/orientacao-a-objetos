public class Pedido {
    Cliente cliente;
    private int maxDeItens = 200;
    private Item[] itens = new Item[maxDeItens];
    private int qtdDeItens = 0;

    //calcula o total da compra
    double calcularTotal(){
        double total = 0;
        for(int i = 0; i < qtdDeItens; i++){
            total += itens[i].obterSubTotal();
        }
        return total;
    }

    //mostra o numero de itens na lista
    void mostraNumItens(){
        System.out.println("O pedido tem "+qtdDeItens+" itens.");
    }

    //função privada que verifica se a lista de itens está cheia
    private boolean listaDeItensCheia(){
        if(qtdDeItens >= maxDeItens) return true;
        else return false;
    }

    //adiciona novo item a lista de itens do pedido
    void addItem(Produto produto, int quantidade){
        if (listaDeItensCheia()) System.out.println("A lista de itens está cheia! Não é possível adicionar um novo item.");
        else if(quantidade > produto.qtdEmEstoque) System.out.println("Não há quantidade suficiente do produto em estoque.");
        else{
            Item item = new Item();
            item.produto = produto;
            item.quantidade = quantidade;
            produto.qtdEmEstoque -= quantidade;
            itens[qtdDeItens] = item;
            qtdDeItens++;
            System.out.println("Item Adicionado!");
        }
    }

    //pergunta ao cliente a forma de pagamento e verifica o pagamento do pedido
    void verificarPagamento(Cliente cliente){
        if(cliente.modoDePagamento == "dinheiro" || 
        cliente.modoDePagamento == "Dinheiro" || 
        cliente.modoDePagamento == "cheque" || 
        cliente.modoDePagamento == "Cheque" || 
        cliente.modoDePagamento == "cartão" || 
        cliente.modoDePagamento == "Cartão") System.out.println("Pagamento aceito! O pedido está pago.");
        else System.out.println("O pagamento não foi aceito!");
    }

    //mostra informações gerais do item
    void mostrarInfo(){
        System.out.println("Pedido");
        for(int i = 0; i < qtdDeItens; i++){
            System.out.println("Item "+(i+1)+":");
            itens[i].mostrarInfo();
        }
    };
}
