package poo.lista5.exercicio7;

public class Main{
    public static void main(String[] args) {
        Par par = new Par();
        par.setFirst(2);
        par.setSecond("string");

        System.out.println("First: "+par.getFirst());
        System.out.println("Second: "+par.getSecond());

        Par<Integer, Integer> par2 = new Par<Integer, Integer>();
        par2.setFirst(2);
        par2.setSecond(5);

        System.out.println("First: "+par2.getFirst());
        System.out.println("Second: "+par2.getSecond());
    }
}
