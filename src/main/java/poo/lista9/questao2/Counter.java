package poo.lista9.questao2;

public class Counter extends Thread{
    private int counter = 0;

    synchronized void increment(){
        if (this.counter < 3){
            this.counter += 1;
            System.out.println("Valor de counter incrementado. Valor atual: " + this.counter);
        }
        else{
            System.out.println("Esperando para incrementar valor de counter... Valor atual: " + this.counter);
        }
    }

    synchronized void decrement(){
        if (this.counter > 0){
            this.counter -= 1;
            System.out.println("Valor de counter decrementado. Valor atual: " + this.counter);
        }
        else{
            System.out.println("Esperando para decrementar valor de counter... Valor atual: " + this.counter);
        }
    }
}
