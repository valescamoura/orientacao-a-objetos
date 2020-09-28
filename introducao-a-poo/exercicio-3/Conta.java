public class Conta {
    String nomeDoTitular;
    int numeroDaConta;
    String agencia;
    private double saldo = 0.0; //privado para não ser possível modificar o saldo externamente
    String dataDeAbertura;

    //função privada que verifica a existencia de saldo
    private boolean temSaldo(double valor){
        if(valor <= saldo) return true;
        else return false;
    }

    //retira valor do saldo
    void saca(double valor){
        if(temSaldo(valor)){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Não há saldo suficiente.");
        }
    }

    //adiciona valor ao saldo
    void deposita(double valor){
        saldo += valor;
    }
    
    //devolve o rendimento mensal da conta
    double calculaRendimento(){
        return saldo * 0.1;
    }

    //transfere valor da conta para conta destino
    void transfere(Conta destino, double valor){
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
    void imprimirInfo(){
        System.out.println("Nome do titular: "+nomeDoTitular);
        System.out.println("Número da conta: "+numeroDaConta);
        System.out.println("Agência: "+agencia);
        System.out.println("Saldo total: "+saldo);
        System.out.println("Data de abertura: "+dataDeAbertura);
    }

    //mostra o saldo
    void consultarSaldo(){
        System.out.println("Saldo disponível: "+saldo);
    }
}
