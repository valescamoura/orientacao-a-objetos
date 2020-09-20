/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 1 
*Imprima a soma de 1 até 1000*/

class Soma{
    public static void main(String[] args){
        int soma = 0;

        for(int i = 1; i <= 1000; i++){
            soma += i;
        }

        System.out.println("A soma de 1 até 1000 é: " + soma);
    }   
}
