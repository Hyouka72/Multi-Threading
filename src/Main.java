public class Main {
    public static void main(String[] args){
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c =new Consumer(comp);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}