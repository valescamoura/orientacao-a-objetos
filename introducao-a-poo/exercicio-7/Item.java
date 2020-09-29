public class Item {
    Produto produto;
    int quantidade;

    //calcula o subtotal de cada item
    double obterSubTotal(){
        return produto.preco * quantidade;
    }

    //mostra informações gerais do item
    void mostrarInfo(){
        System.out.println("Produto: "+produto.descricao);
        System.out.println("Preço total do item: "+obterSubTotal());
        System.out.println("Quantidade: "+quantidade);
    };
}
