package poo.lista3.exercicio3.ex7;

public class Cliente {
    private String nome;
    private String endereco;
    private String modoDePagamento; //indica como o cliente paga suas compras

    //construtor
    public Cliente(String nome, String endereco, String modoDePagamento){
        this.nome = nome;
        this.endereco = endereco;
        this.modoDePagamento = modoDePagamento;
    }

    //get
    public String getModoDePagamento(){
        return modoDePagamento;
    }

    //mostra informações gerais do cliente
    public void mostrarInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Modo de Pagamento: "+modoDePagamento);
    };
}
