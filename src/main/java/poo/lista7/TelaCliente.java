package poo.lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaCliente {
    public static void criaMenu() {
        boolean loop = true;
        
        do{
            System.out.println("-------------- MENU -------------\n"+
            "0 - Encerrar\n"+
            "1 - Cadastrar novo cliente\n" +
            "2 - Buscar cliente pelo nome\n" +
            "3 - Buscar cliente pelo CPF\n" +
            "4 - Excluir cliente\n" +
            "5 - Listar clientes cadastrados");

            System.out.println("Digite a opção desejada: ");
            Scanner teclado = new Scanner(System.in);
            int opcao = teclado.nextInt();
            //teclado.nextLine();
            // teclado.close();

            switch (opcao) {
                case 0:
                    loop = false;
                    teclado.close();
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2: 
                    buscarN();
                    break;
                case 3:
                    buscar();
                    break;
                case 4: 
                    excluir();
                    break;
                case 5:
                    CadastroCliente.listar();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }while(loop);   
    }

    public static void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        int cpf = teclado.nextInt();
        System.out.println("Digite a idade do cliente: ");
        int idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        String endereco = teclado.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        String telefone = teclado.nextLine();

        try {
            CadastroCliente.inserir(cpf, nome, idade, endereco, telefone);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    public static void buscar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o CPF do cliente que você deseja buscar: ");
        int cpf = teclado.nextInt();

        try {
            Cliente cliente = CadastroCliente.buscar(cpf);
            cliente.exibirInfo();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }

    public static void buscarN() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do cliente que você deseja buscar: ");
        String nome = teclado.next();

        try {
            ArrayList<Cliente> clientes = CadastroCliente.buscar(nome);
            for(Cliente c: clientes){
                c.exibirInfo();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public static void excluir() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o CPF do cliente que você deseja excluir: ");
        int cpf = teclado.nextInt();

        try {
            CadastroCliente.excluir(cpf);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
