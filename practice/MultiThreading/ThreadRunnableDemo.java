// example of creating a thread "implementing Runnable interface"
class NewThreadRunnable implements Runnable{
    Thread t;
    NewThreadRunnable() {
        t = new Thread(this, "Demo thread");
        System.out.println("Child therad created");
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Child thread exitied");
    }
}
public class ThreadRunnableDemo {
    public static void main(String[] args) {
        new NewThreadRunnable();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exitied");
    }
}
