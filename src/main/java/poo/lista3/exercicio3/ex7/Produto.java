package poo.lista3.exercicio3.ex7;

public class Produto {
    private String descricao;
    private double preco;
    private int qtdEmEstoque;

    //construtor
    public Produto(String descricao, double preco, int qtdEmEstoque){
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    //getters
    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtdEmEstoque(){
        return qtdEmEstoque;
    }

    public void diminuiQtdEmEstoque(int decremento){
        this.qtdEmEstoque -= decremento;
    }

    //mostra informações gerais do produto
    public void mostrarInfo(){
        System.out.println("Produto: "+descricao);
        System.out.println("Preço unitário: "+preco);
        System.out.println("Quantidade em estoque: "+qtdEmEstoque);
    };
}