package poo.lista9.questao2;

public class CounterUpOrDown implements Runnable{
    private Counter counter;
    private boolean upOrDown;

    public CounterUpOrDown(Counter counter, boolean upOrDown){
        this.counter = counter;
        this.upOrDown = upOrDown;
    }

	@Override
	public void run() {
		for (int i = 0; i < 20; i++){
            //incrementa se upOrDown igual a true, decrementa caso contrário
            if(upOrDown){
                this.counter.increment();
            }else{
                this.counter.decrement();
            }
            //sleep
            try{
                Thread.sleep((long) Math.ceil(500 * Math.random()));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
	}
}
