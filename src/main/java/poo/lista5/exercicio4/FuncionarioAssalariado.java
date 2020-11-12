package poo.lista5.exercicio4;

public class FuncionarioAssalariado extends Funcionario{
    protected double salarioBase;

    FuncionarioAssalariado(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase;
    }

    @Override
    public void imprimirFuncionario() {
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salarioBase);
    }
}
    

