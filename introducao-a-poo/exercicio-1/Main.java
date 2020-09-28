/*Exercícios - Introdução a POO
*
*Exercício 1
*Faça um programa de agenda telefônica, com as classes Agenda e Contato*/

public class Main {
    public static void main(String[] args){
        Agenda agendaTelefonica = new Agenda();
        
        agendaTelefonica.mostrarNumeroDeContatos();
        agendaTelefonica.adicionarContato("Maria", "(21)99999-9999");
        agendaTelefonica.adicionarContato("João", "(21)98000-0000");
        agendaTelefonica.adicionarContato("Zé", "(21)91234-5678");
        agendaTelefonica.adicionarContato("Simone", "(21)98675-4321");
        agendaTelefonica.adicionarContato("Ana", "(21)91234-6789");
        agendaTelefonica.adicionarContato("Pedro", "(21)97890-1234");
        agendaTelefonica.adicionarContato("Bia", "(21)98877-6655");
        System.out.println("");
        agendaTelefonica.listarContatos();
        agendaTelefonica.mostrarNumeroDeContatos();
        System.out.println("");

        System.out.println("Contato antes da alteração do número:");
        agendaTelefonica.mostrarContato("Simone");
        agendaTelefonica.alterarContato("Simone", "(11)98675-4321");
        agendaTelefonica.mostrarContato("Simone");
    }
}
