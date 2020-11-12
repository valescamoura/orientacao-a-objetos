package poo.lista5.exercicio4;

public class FuncionarioAssalariadoComissionado extends FuncionarioAssalariado{
    protected double porcentagemSobreVendas;
    protected double valorTotalDeVendas;

    FuncionarioAssalariadoComissionado(String nome, double salarioBase, double porcentagemSobreVendas, double valorTotalDeVendas){
        super(nome, salarioBase);
        this.porcentagemSobreVendas = porcentagemSobreVendas;
        this.valorTotalDeVendas = valorTotalDeVendas;
        ajustarSalario();
    }
    
    @Override
    public double calcularPagamento() {
        double comissao = (porcentagemSobreVendas/100) * valorTotalDeVendas;
        return salarioBase + comissao;
    }

    @Override
    public void imprimirFuncionario() {
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salarioBase);
        System.out.println("Valor total das vendas realizadas: "+valorTotalDeVendas);
        System.out.println("Porcentagem de comissão sobre as vendas: "+porcentagemSobreVendas);
    }

    private void ajustarSalario() {
        this.salarioBase = salarioBase * 1.1;
    }
}
