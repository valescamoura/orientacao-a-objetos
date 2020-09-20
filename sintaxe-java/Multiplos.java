/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 2 
*Imprima todos os múltiplos de 3, entre 1 e 100*/

class Multiplos{
    public static void main(String[] args){
        System.out.print("Os múltiplos de 3, entre 1 e 100, são: ");
        
        for(int i = 3; i <= 100; i += 3){
            System.out.print(i);

            //Formatar impressão
            if(i+3 < 100) System.out.print(", ");
            else System.out.println(".");
        }
    }
}
