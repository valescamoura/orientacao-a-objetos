package poo.lista5.exercicio6;

public class Main {
    public static void main(String[] args) {
        DiaDaSemana domingo = DiaDaSemana.DOMINGO;
        DiaDaSemana segunda = DiaDaSemana.SEGUNDA;

        if(domingo.ehDiaUtil()){
            System.out.println(domingo+" é dia útil!");
        }
        else{
            System.out.println(domingo+" não é dia útil.");
        }

        if(segunda.ehDiaUtil()){
            System.out.println(segunda+" é dia útil!");
        }
        else{
            System.out.println(segunda+" não é dia útil.");
        }
    }
}
