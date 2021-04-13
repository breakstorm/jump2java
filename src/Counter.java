class Updater {
//    public void update(int count) {
    public void update(Counter counter) {
        counter.count++;
    }
}
public class Counter {
    int count = 0;

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update: " + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
//        myUpdater.update(myCounter.count);
        System.out.println("after update: " + myCounter.count);
    }
}
