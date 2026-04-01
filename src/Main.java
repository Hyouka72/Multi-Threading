public class Main {
    public static void main(String[] args){
        System.out.println("Program is starting...");
        int x = 10+20;
        System.out.println("sum = "+x);
        Thread t =  Thread.currentThread();
        String name = t.getName();
        System.out.println("Thread name "+name);

        //setName
        t.setName("mymain");
        System.out.println(t.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t.threadId());
        System.out.println("Program is ended...");

        MyThread myThread = new MyThread();
        Thread t2 = new Thread(myThread);
        t2.start();
        System.out.println("2nd Thread name"+t2.getName());
        System.out.println("2nd Thread Id "+t2.threadId());
    }

}