package poo.lista5.exercicio4;

public class FuncionarioHoraExtra extends FuncionarioAssalariado{
    protected int horasTrabalhadas; 
    protected double salarioHora;

    FuncionarioHoraExtra(String nome, double salarioBase, int horasTrabalhadas, double salarioHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    //pode mudar em curto prazo (semanalmente)
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double calcularPagamento() {
        double horaExtra = 0;
        if(horasTrabalhadas>40){
            horaExtra = (horasTrabalhadas-40)*1.5*salarioHora;
        }
        return salarioBase + horaExtra;
    }

    @Override
    public void imprimirFuncionario() {
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salarioBase);
        System.out.println("Horas trabalhadas: "+horasTrabalhadas);
        System.out.println("Salário por hora: "+salarioHora);
    }
}
