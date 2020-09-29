public class Produto {
    String descricao;
    double preco;
    int qtdEmEstoque;

    //mostra informações gerais do produto
    void mostrarInfo(){
        System.out.println("Produto: "+descricao);
        System.out.println("Preço unitário: "+preco);
        System.out.println("Quantidade em estoque: "+qtdEmEstoque);
    };
}
