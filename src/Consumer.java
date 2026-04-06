public class Consumer implements Runnable{

    Company c;
    Consumer(Company c){
        this.c = c;

    }

    @Override
    public void run() {
        while (true){
            this.c.consume_item();
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}
