public class MyThread implements Runnable {


    public void run() {
        for (int i=0; i <= 10 ;i++){
            System.out.println("hello guys, thikxa tah");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
