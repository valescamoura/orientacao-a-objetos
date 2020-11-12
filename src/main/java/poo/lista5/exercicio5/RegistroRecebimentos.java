package poo.lista5.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroRecebimentos{
    private static ArrayList<Recebivel> registros = new ArrayList<Recebivel>();

    
    /** método que registra recebimento
     * @param recebivel
     */
    public static void registrarRecebimento(Recebivel recebivel){
        registros.add(recebivel);
    }

    /** método que registra item*/
    public static void registrarItem(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = teclado.nextLine();
        System.out.print("Digite um número inteiro para especificar a quantidade do produto: ");
        int quantidade = teclado.nextInt();
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = teclado.nextDouble();
        ItemVenda item = new ItemVenda(produto, quantidade, precoUnitario);
        registrarRecebimento(item);
        System.out.println("Produto registrado!");
        System.out.println("");
    }

    /** método que registra serviço*/
    public static void registrarServico(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a descrição do serviço: ");
        String descricao = teclado.nextLine();
        System.out.print("Digite um número inteiro para especificar o número de horas trabalhadas: ");
        int horas = teclado.nextInt();
        System.out.print("Digite o preço cobrado por hora: ");
        double precoHora = teclado.nextDouble();
        Servico servico= new Servico(descricao, horas, precoHora);
        registrarRecebimento(servico);
        System.out.println("Serviço registrado!");
        System.out.println("");
    }

    public static void imprimirRegistros(){
        for(Recebivel registro: registros){
            registro.imprimirRecebivel();
        }
    }

    /** método que calcula a soma da receita de todos os "recebiveis"*/
    public static void calcularReceita(){
        double total = 0;
        for(Recebivel registro: registros){
            total += registro.totalizarReceita();
        }
        System.out.println("A receita é de "+total);
        System.out.println("");
    }

    
    /** método que imprime menu para escolha de ação a ser realizada e retorna valor representando a escolha
     * @return int
     */
    public static int menuInicial(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------ Menu Inicial ------------------");
        System.out.println("1 - Registrar Recebimentos");
        System.out.println("2 - Visualizar registros");
        System.out.println("3 - Calcular Receita");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
        int cont = 0, opcao = teclado.nextInt();
        System.out.println("");
        while((opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3)){
            if(cont<10){
                System.out.print("Opção Inválida! Digite a opção desejada novamente: ");
                opcao = teclado.nextInt();
                cont++;
            }
        }
        if(cont==10) return 0;
        return opcao;
    }

    
    /** método que imprime menu para escolha de tipo de registro e retorna valor representando a escolha
     * @return int
     */
    public static int menuSecundario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------ Tipo de Registro ------------------");
        System.out.println("1 - Venda de item");
        System.out.println("2 - Serviço");
        System.out.println("0 - Voltar ao Menu Inicial");
        System.out.print("Escolha o tipo de recebimento a ser registrado: ");
        int cont = 0, opcao = teclado.nextInt();
        System.out.println("");
        while((opcao != 0 && opcao != 1 && opcao != 2)){
            if(cont<10){
                System.out.print("Opção Inválida! Digite a opção desejada novamente: ");
                opcao = teclado.nextInt();
                cont++;
            }
        }
        if(cont==10) return 0;
        return opcao;
    }

    public static void main(String[] args) {
        int menuIni = menuInicial();
        
        while(menuIni != 0){
            if(menuIni == 1){
                int menuSec = menuSecundario();
                if(menuSec == 1){
                    registrarItem();
                }
                else if(menuSec == 2){
                    registrarServico();
                }
            }
            else if(menuIni == 2){
                System.out.println("...............Registros...............");
                imprimirRegistros();
                System.out.println("");
            }
            else if(menuIni == 3){
                calcularReceita();
            } 

            menuIni = menuInicial();
        }  
    }
}
