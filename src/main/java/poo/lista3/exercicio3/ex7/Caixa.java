/*Exercícios - Introdução a POO
*Exercicio 7
*Identifique e implemente as classes em Java para a seguinte especificação:
*O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e
*uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde
*cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
*pedido pode ser pago em dinheiro, cheque ou cartão.*/

package poo.lista3.exercicio3.ex7;

public class Caixa {
    //pergunta ao cliente a forma de pagamento e verifica o pagamento do pedido
    public static void verificarPagamento(Cliente cliente){
        if(cliente.getModoDePagamento() == "dinheiro" || 
        cliente.getModoDePagamento() == "Dinheiro" || 
        cliente.getModoDePagamento() == "cheque" || 
        cliente.getModoDePagamento() == "Cheque" || 
        cliente.getModoDePagamento() == "cartão" || 
        cliente.getModoDePagamento() == "Cartão") System.out.println("Pagamento aceito! O pedido está pago.");
        else System.out.println("O pagamento não foi aceito!");
    }
    public static void main(String[] args){
        Cliente cliente = new Cliente("José", "Rua 2, número 100", "dinheiro");
        System.out.println("Cliente:");
        cliente.mostrarInfo();
        System.out.println("");

        Produto arroz = new Produto("Arroz", 15.0, 500);
        Produto feijao = new Produto("Feijão", 12.0, 500);
        Produto cartelaDeOvos = new Produto("Ovos", 10.0, 1000);
        Produto leite = new Produto("Leite", 9.0, 200);
        Produto couve = new Produto("Couve", 2.5, 300);

        arroz.mostrarInfo();
        feijao.mostrarInfo();
        cartelaDeOvos.mostrarInfo();
        leite.mostrarInfo();
        couve.mostrarInfo();
        System.out.println("");

        Pedido pedido = new Pedido(cliente, 200);
        System.out.println("Adicionando itens ao pedido:");
        pedido.addItem(arroz, 3);
        pedido.addItem(feijao, 3);
        pedido.addItem(cartelaDeOvos, 1);
        pedido.addItem(leite, 4);
        pedido.addItem(couve, 5);
        System.out.println("");

        pedido.mostrarInfo();
        pedido.mostraNumItens();
        System.out.println("");

        System.out.println("Produtos após adicionar pedidos a lista:");
        arroz.mostrarInfo();
        feijao.mostrarInfo();
        cartelaDeOvos.mostrarInfo();
        leite.mostrarInfo();
        couve.mostrarInfo();
        System.out.println("");

        double total = pedido.calcularTotal();
        System.out.println("Valor total do pedido: "+total+" reais.");

        verificarPagamento(cliente);
    }
}
