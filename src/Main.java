
public class Main {
    public static void main(String[] args){
        MyThread t = new MyThread();

        Thread thread = new Thread(t);
        thread.start();

    }

}