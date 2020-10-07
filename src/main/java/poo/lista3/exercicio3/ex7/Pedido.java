package poo.lista3.exercicio3.ex7;

public class Pedido {
    private Cliente cliente;
    private int maxDeItens = 200;
    private Item[] itens = new Item[maxDeItens];
    private int qtdDeItens = 0;

    public Pedido(Cliente cliente, int maxDeItens){
        this.cliente = cliente;
        this.maxDeItens = maxDeItens;
    }

    //calcula o total da compra
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < qtdDeItens; i++){
            total += itens[i].obterSubTotal();
        }
        return total;
    }

    //mostra o numero de itens na lista
    public void mostraNumItens(){
        System.out.println("O pedido tem "+qtdDeItens+" itens.");
    }

    //função privada que verifica se a lista de itens está cheia
    private boolean listaDeItensCheia(){
        if(qtdDeItens >= maxDeItens) return true;
        else return false;
    }

    //adiciona novo item a lista de itens do pedido
    public void addItem(Produto produto, int quantidade){
        if (listaDeItensCheia()) System.out.println("A lista de itens está cheia! Não é possível adicionar um novo item.");
        else if(quantidade > produto.getQtdEmEstoque()) System.out.println("Não há quantidade suficiente do produto em estoque.");
        else{
            Item item = new Item(produto, quantidade);
            produto.diminuiQtdEmEstoque(quantidade);
            itens[qtdDeItens] = item;
            qtdDeItens++;
            System.out.println("Item Adicionado!");
        }
    }

    //mostra informações gerais do item
    public void mostrarInfo(){
        System.out.println("Pedido");
        for(int i = 0; i < qtdDeItens; i++){
            System.out.println("Item "+(i+1)+":");
            itens[i].mostrarInfo();
        }
    };
}
