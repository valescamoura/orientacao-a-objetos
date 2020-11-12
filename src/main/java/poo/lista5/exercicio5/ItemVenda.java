package poo.lista5.exercicio5;

public class ItemVenda implements Recebivel{
    private String produto;
    private int quantidade;
    private double precoUnitario;

    ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalizarReceita() {
        return precoUnitario*quantidade;
    }

    @Override
    public void imprimirRecebivel() {
       System.out.println("Produto: "+produto);
       System.out.println("Quantidade: "+quantidade);
       System.out.println("Preço Unitário: "+precoUnitario);
       System.out.println(".....................................");
    }
}
