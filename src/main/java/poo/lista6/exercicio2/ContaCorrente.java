package poo.lista6.exercicio2;

public class ContaCorrente {
    private float limite = 0;
    private float saldo = 0;
    private float valorLimite = 0;

    public ContaCorrente(){}

    public ContaCorrente(float saldo, float valorLimite){
        try{
            this.depositar(saldo);
            this.setValorLimite(valorLimite);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void sacar(float valor) throws IllegalArgumentException{
        if(valor < 0){
            throw new IllegalArgumentException("Não é possível sacar valor negativo da conta corrente.");
        }
        else if(valor > saldo + limite){
            throw new IllegalArgumentException("Não é possível sacar um valor maior do que o saldo + limite disponível.");
        }

        if(saldo>=valor){
            this.saldo -= valor;
        }
        else{
            this.limite -= valor - this.saldo;
            this.saldo = 0;
        }
    }

    public void depositar(float valor) throws IllegalArgumentException{
        if(valor < 0 ){
            throw new IllegalArgumentException("Não é possível depositar valor negativo na conta corrente.");
        }

        //repor saldo utilizado do limite
        if(this.limite < this.valorLimite){
            this.limite += valor;
            if(this.limite > this.valorLimite){
                this.saldo += this.valorLimite - this.limite;
            }
        }
        else this.saldo += valor;
    }

    public void setValorLimite(float valorLimite) throws IllegalArgumentException{
        if(valorLimite < 0 ){
            throw new IllegalArgumentException("Não é possível setar valor negativo para o limite.");
        }
        //ao modificar o valor limite, a quantidade disponivel de limite da conta do usuario deve ser 
        //ajustada de forma a continuar considerando o que já foi utilizado do valorLimite
        float limiteUtilizado = this.valorLimite - this.limite;
        this.valorLimite = valorLimite;
        if(this.valorLimite - limiteUtilizado < 0){
            throw new IllegalArgumentException("Não é possivel diminuir o valor limite máximo no momento pois isso tornaria o valor limite disponível negativo.");
        }
        this.limite = this.valorLimite - limiteUtilizado;
    }
}
