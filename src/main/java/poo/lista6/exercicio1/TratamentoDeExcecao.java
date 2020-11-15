package poo.lista6.exercicio1;


/* Exercício 1 - Pesquise na API Java os tipos de Exceção IllegalArgumentException 
*  e NumberFormatException. O que causa essas exceções? (escreva como comentário em seu 
*  código). Implemente um programa em Java que faça o tratamento dessas exceções
*/

/*IllegalArgumentException
* Esta exceção ocorre quando um método recebe um argumento ilegal ou impróprio.
*/

/*NumberFormatException - subclasse da classe IllegalArgumentException
* Esta exceção é causada ao tentar converter uma string que não tem formato apropriado
* em um dos tipos numéricos.
*/

public class TratamentoDeExcecao {
    public static void main(String[] args) {
        float divisao = 0;

        System.out.println("Tratatando a exceção do tipo IllegalArgumentException");
        System.out.println("");

        System.out.print("Divisão de 100 por 0: ");
        try{
            divisao = divide(100, 0);
            System.out.println(divisao);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.print("Divisão de 100 por 2: ");
        try{
            divisao = divide(100, 2);
            System.out.println(divisao);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nTratatando a exceção do tipo NumberFormatException");
        System.out.println("");

        System.out.print("Calculando perimetro de circulo de raio "+divisao+" e pi 3,14: ");
        try{
            float perimetro = calculaPerimetroCirculo(divisao, "3,14");
            System.out.print("Perimetro: "+perimetro);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.print("Calculando perimetro de circulo de raio "+divisao+" e pi 3.14a: ");
        try{
            float perimetro = calculaPerimetroCirculo(divisao, "3.14a");
            System.out.print("Perimetro: "+perimetro);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.print("Calculando perimetro de circulo de raio "+divisao+" e pi 3.14: ");
        try{
            float perimetro = calculaPerimetroCirculo(divisao, "3.14");
            System.out.print("Perimetro: "+perimetro);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static float divide(float dividendo, float divisor) throws IllegalArgumentException{
        if(divisor == 0){
            throw new IllegalArgumentException("Não é permitida divisão por zero."); //aqui uma IllegalArgumentException pode ser causada
        }
        return dividendo/divisor;
    }

    public static float calculaPerimetroCirculo(float raio, String strPi) {
        if(raio < 0){
            throw new IllegalArgumentException("O círculo não pode ter raio menor que zero."); //aqui uma IllegalArgumentException pode ser causada
        }
        float pi = Float.parseFloat(strPi); //aqui a NumberFormatException pode ser causada
        float perimetro = 2 * pi * raio;
        return perimetro;
    }
}
