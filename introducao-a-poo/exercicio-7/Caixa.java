/*Exercícios - Introdução a POO
*Exercicio 7
*Identifique e implemente as classes em Java para a seguinte especificação:
*O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e
*uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde
*cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
*pedido pode ser pago em dinheiro, cheque ou cartão.*/

public class Caixa {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nome = "José";
        cliente.endereco = "Rua 2, número 100";
        cliente.modoDePagamento = "dinheiro";
        System.out.println("Cliente:");
        cliente.mostrarInfo();
        System.out.println("");

        Produto arroz = new Produto();
        arroz.descricao = "Arroz";
        arroz.preco = 15.0;
        arroz.qtdEmEstoque = 500;

        Produto feijao = new Produto();
        feijao.descricao = "Feijão";
        feijao.preco = 12.0;
        feijao.qtdEmEstoque = 500;

        Produto cartelaDeOvos = new Produto();
        cartelaDeOvos.descricao = "Ovos";
        cartelaDeOvos.preco = 10.0;
        cartelaDeOvos.qtdEmEstoque = 1000;

        Produto leite = new Produto();
        leite.descricao = "Leite";
        leite.preco = 9.0;
        leite.qtdEmEstoque = 200;

        Produto couve = new Produto();
        couve.descricao = "Couve";
        couve.preco = 2.50;
        couve.qtdEmEstoque = 300;

        arroz.mostrarInfo();
        feijao.mostrarInfo();
        cartelaDeOvos.mostrarInfo();
        leite.mostrarInfo();
        couve.mostrarInfo();
        System.out.println("");

        Pedido pedido = new Pedido();
        pedido.cliente = cliente;
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

        pedido.verificarPagamento(cliente);
    }
}
