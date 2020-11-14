package poo.lista6.exercicio2;

public class TestaContaCorrente {
    public static void main(String[] args) {
        //tratamento de exceção utilizado também no construtor
        //ContaCorrente contaSaldoNegativo = new ContaCorrente(-1, 1000);
        //ContaCorrente contaLimiteNegativo = new ContaCorrente(100, -1000);

        ContaCorrente conta = new ContaCorrente();
        
        System.out.println("Setando valor negativo ao limite:");
        try{
            conta.setValorLimite(-1000);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Setando valor positivo ao limite:");
        try{
            conta.setValorLimite(1000);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Tentando sacar valor maior que saldo + limite:");
        try{
            conta.sacar(1001);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Tentando sacar valor menor ou igual que saldo + limite:");
        try{
            conta.sacar(1000);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Tentando depositar valor negativo:");
        try{
            conta.depositar(-10);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Tentando depositar valor positivo:");
        try{
            conta.depositar(2000);
            System.out.println("Ok!");
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }

    
}
