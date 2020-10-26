package poo.lista4.ex5;

public class Main {
    public static void main(String[] args){
        Agenda agendaTelefonica = new Agenda(200);
        agendaTelefonica.mostrarNumeroDeContatos();

        agendaTelefonica.adicionarContato("Maria", "12345678900", "23/09/1999", "(11)99999-9999", "Rua 1");
        agendaTelefonica.adicionarContato("João", "12345678901", "01/10/1997", "(11)98000-0000", "Rua 10");
        agendaTelefonica.adicionarContato("Simone", "12345678902", "16/03/2002", "(11)98675-8765", "Rua 14");
        agendaTelefonica.adicionarContato("Ana", "12345678903", "05/08/2000", "(21)91234-6789", "Rua 31");
        agendaTelefonica.adicionarContato("Loja", "12345678123456", 10000, "(11)26239999", "Rua das Lojas");
        agendaTelefonica.adicionarContato("Pizzaria", "12345678123460", 8000, "(11)262300000", "Rua da Pizzaria");

        System.out.println("");
        agendaTelefonica.listarContatos();
        agendaTelefonica.mostrarNumeroDeContatos();
        System.out.println("");

        System.out.println("Buscar contato pelo CNPJ: 12345678123460");
        agendaTelefonica.buscarContato("12345678123460");
        System.out.println("");

        System.out.println("Buscar contato pelo CPF: 12345678902");
        agendaTelefonica.buscarContato("12345678902");
        System.out.println("");

        System.out.println("Contato após alteração do número:");
        agendaTelefonica.alterarContato("12345678902", "(11)98675-4321");
        agendaTelefonica.buscarContato("12345678902");
    }
}
