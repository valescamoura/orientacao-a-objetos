package poo.lista5.exercicio4;

public class FuncionarioComissionado extends Funcionario{
    protected double porcentagemSobreVendas;
    protected double valorTotalDeVendas;

    FuncionarioComissionado(String nome, double porcentagemSobreVendas, double valorTotalDeVendas){
        this.nome = nome;
        this.porcentagemSobreVendas = porcentagemSobreVendas;
        this.valorTotalDeVendas = valorTotalDeVendas;
    }

    //pode mudar em curto prazo (semanalmente)
    public void setValorTotalDeVendas(double valorTotalDeVendas) {
        this.valorTotalDeVendas = valorTotalDeVendas;
    }

    @Override
    public double calcularPagamento() {
        double comissao = (porcentagemSobreVendas/100) * valorTotalDeVendas;
        return comissao;
    }

    @Override
    public void imprimirFuncionario() {
        System.out.println("Nome: "+nome);
        System.out.println("Valor total das vendas realizadas: "+valorTotalDeVendas);
        System.out.println("Porcentagem de comissão sobre as vendas: "+porcentagemSobreVendas);
    }
    
}
