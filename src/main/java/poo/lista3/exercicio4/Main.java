package poo.lista3.exercicio4;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(1, 12, 2020);
        data1.imprimirFormatado();

        Data data2 = new Data(10, 6, 2018);
        data2.imprimirFormatado();

        Data data3 = new Data("Agosto", 12, 2015);
        data3.imprimirFormatado();

        Data data4 = new Data("Abril", 20, 2014);
        data4.imprimirFormatado();

        Data data5 = new Data(365, 2020);
        data5.imprimirFormatado();

        Data data6 = new Data(32, 2019);
        data6.imprimirFormatado();

        System.out.println("");
        System.out.println("Imprimir data em 3 formatos independente de como foi instanciada: ");
        data1.imprimirEmTresFormas();
        data3.imprimirEmTresFormas();
        data5.imprimirEmTresFormas();

    }
}
