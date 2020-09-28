/*Exercícios - Introdução a POO
*Exercício 3
*Considere um sistema para gerenciar contas de um banco e modelo uma conta
*bancária. Uma conta deve ter o nome do titular, o número, a agência, o saldo e uma
*data de abertura. Além disso, ela deve fazer as seguintes ações: saca, para retirar
*um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento,
*para devolver o rendimento mensal dessa conta (para calcular, considere o valor do
*saldo multiplicado por 0.1). Implemente essa classe e teste-a, usando uma outra classe 
*que tenha o main*/

public class Banco {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        conta1.nomeDoTitular = "Maria Conceição da Silva";
        conta1.agencia = "9876-9";
        conta1.numeroDaConta = 251203;
        conta1.dataDeAbertura = "21/10/2018";
        System.out.println("Informações da conta 1 após ser criada.");
        conta1.imprimirInfo();
        
        System.out.println("Saldo da conta 1 após depositar 1000 reais: ");
        conta1.deposita(1000.0);
        conta1.consultarSaldo();

        System.out.println("Saldo da conta 1 após sacar 200 reais: ");
        conta1.saca(200.0);
        conta1.consultarSaldo();

        System.out.println("Saldo da conta 1 após tentar sacar 1000 reais: ");
        conta1.saca(1000.0);
        conta1.consultarSaldo();

        Conta conta2 = new Conta();
        conta2.nomeDoTitular = "Ana Magalhães da Silva";
        conta2.agencia = "9876-9";
        conta2.numeroDaConta = 251204;
        conta2.dataDeAbertura = "15/12/2019";
        System.out.println("Informações da conta 2 após ser criada.");
        conta2.imprimirInfo();

        System.out.println("Saldo da conta 1 após transferir 500 reais para a conta 2: ");
        conta1.transfere(conta2, 500.0);
        conta1.consultarSaldo();
        System.out.println("Saldo da conta 2 após receber transferência de 500 reais da conta 1: ");
        conta2.consultarSaldo();

        double rendimentoConta1 = conta1.calculaRendimento();
        System.out.println("O redimento da conta 1 foi de "+rendimentoConta1+" reais.");

        double rendimentoConta2 = conta2.calculaRendimento();
        System.out.println("O redimento da conta 2 foi de "+rendimentoConta2+" reais.");
    }
}
