public class Cliente {
    String nome;
    String endereco;
    String modoDePagamento; //indica o modo de pagamento do cliente

    //mostra informações gerais do cliente
    void mostrarInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Modo de Pagamento: "+modoDePagamento);
    };
}
