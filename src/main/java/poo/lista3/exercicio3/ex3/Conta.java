package poo.lista3.exercicio3.ex3;

public class Conta {
    private String nomeDoTitular;
    private int numeroDaConta;
    private String agencia;
    private double saldo = 0.0; 
    private String dataDeAbertura;

    //construtor
    public Conta(String nomeDoTitular, String agencia, int numeroDaConta, String dataDeAbertura){
        this.nomeDoTitular = nomeDoTitular;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.dataDeAbertura = dataDeAbertura;
    }
    
    //função privada que verifica a existencia de saldo
    private boolean temSaldo(double valor){
        if(valor <= saldo) return true;
        else return false;
    }

    //retira valor do saldo
    public void saca(double valor){
        if(temSaldo(valor)){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Não há saldo suficiente.");
        }
    }

    //adiciona valor ao saldo
    public void deposita(double valor){
        saldo += valor;
    }
    
    //devolve o rendimento mensal da conta
    public double calculaRendimento(){
        return saldo * 0.1;
    }

    //transfere valor da conta para conta destino
    public void transfere(Conta destino, double valor){
        if(temSaldo(valor)){
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        }
        else{
            System.out.println("Não há saldo suficiente para realizar a transferência.");
        }
    }

    //mostra todas as informacoes da conta
    public void imprimirInfo(){
        System.out.println("Nome do titular: "+nomeDoTitular);
        System.out.println("Número da conta: "+numeroDaConta);
        System.out.println("Agência: "+agencia);
        System.out.println("Saldo total: "+saldo);
        System.out.println("Data de abertura: "+dataDeAbertura);
    }

    //mostra o saldo
    public void consultarSaldo(){
        System.out.println("Saldo disponível: "+saldo);
    }
}
