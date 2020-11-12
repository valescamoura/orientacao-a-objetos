package poo.lista5.exercicio4;

import java.util.ArrayList;

public class FolhaDePagamento{
    protected static ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();

    public static double calcularFolhaDePagamento(){
        double total = 0;

        for(Funcionario funcionario: listaDeFuncionarios){
            total += funcionario.calcularPagamento();
        }

        return total;
    }

    public static void main(String[] args) {
        FuncionarioAssalariado a = new FuncionarioAssalariado("Ana", 2000);
        FuncionarioHoraExtra b = new FuncionarioHoraExtra("Bruno", 1500, 45, 37.5);
        FuncionarioComissionado c = new FuncionarioComissionado("Celso", 15, 5000);
        FuncionarioAssalariadoComissionado d = new FuncionarioAssalariadoComissionado("Daniela", 2000, 10, 5000);

        listaDeFuncionarios.add(a);
        listaDeFuncionarios.add(b);
        listaDeFuncionarios.add(c);
        listaDeFuncionarios.add(d);

        System.out.println("Valor total da folha de pagamento: "+calcularFolhaDePagamento());
        System.out.println("");

        System.out.println("Funcionários: ");
        for(Funcionario funcionario: listaDeFuncionarios){
            funcionario.imprimirFuncionario();
            System.out.println("");
        }
    }
}
