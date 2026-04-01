public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Thread thread1 = new Thread(new MyThread());
            Thread thread2 = new Thread(new MyThread());

            thread1.start(); // start first thread

            try {
                Thread.sleep(1000); // wait 1 second before starting thread2
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            thread2.start(); // start second thread after delay
        }
    }
}