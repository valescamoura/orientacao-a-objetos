package poo.lista9.questao2;

public class CounterUser {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        CounterUpOrDown counterUpThread = new CounterUpOrDown(counter, true);
        Thread threadUp = new Thread(counterUpThread);
        threadUp.start();

        CounterUpOrDown counterDownThread = new CounterUpOrDown(counter, false);
        Thread threadDown = new Thread(counterDownThread);
        threadDown.start();
    }
}
