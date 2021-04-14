import java.util.ArrayList;

public class ThreadTest extends Thread {
    int seq;

    public ThreadTest(int number) {
        this.seq = number;
    }
    public void run() {
        System.out.println("thread start " + this.seq);
        try {
//            Thread.sleep(1000);
        } catch(Exception e) {

        }
        System.out.println("thread end " + this.seq);
    }

    public static void main(String[] args) {
//         for(int i = 0; i < 10; i++) {
//            ThreadTest test = new ThreadTest(i);
//             test.start();
//         }
         System.out.println("main end");

         ArrayList<Thread> threads = new ArrayList<Thread>();
         for(int i = 0; i < 10; i++) {
             Thread t = new ThreadTest(i);
             t.start();
             threads.add(t);
         }

         for(int i = 0; i < threads.size(); i++) {
             Thread t = threads.get(i);
             try {
                 t.join();
             }catch (Exception e) {

             }
         }
         System.out.println("join end");
    }
}
