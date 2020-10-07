package poo.lista3.exercicio3.ex7;

public class Item {
    private Produto produto;
    private int quantidade;

    //construtor
    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //getters
    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    //calcula o subtotal de cada item
    public double obterSubTotal(){
        return produto.getPreco() * quantidade;
    }

    //mostra informações gerais do item
    public void mostrarInfo(){
        System.out.println("Produto: "+produto.getDescricao());
        System.out.println("Preço total do item: "+obterSubTotal());
        System.out.println("Quantidade: "+quantidade);
    };
}
