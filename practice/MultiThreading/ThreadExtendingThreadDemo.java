class NewThreadExtendingThread extends Thread{

    NewThreadExtendingThread() {
        super("Demo Thread");
        System.out.println("Child thread created");
        start();
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

public class ThreadExtendingThreadDemo {
    public static void main(String[] args) {
        new NewThreadExtendingThread();
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
