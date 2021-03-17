
class NewThread implements Runnable{
    Thread t;
    String tname;
    NewThread(String name) {
        tname = name;
        t = new Thread(this, name);
        System.out.println("New thread " + name + " created");
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println( tname + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(tname + " thread interrupted");
        }
        System.out.println(tname + " thread exitied");
    }
}
public class MultiThreadingDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try {
            Thread.sleep(10000);
        } catch ( InterruptedException e ) {
             System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exitied");
    }

    /*
    Output:
    ------
    New thread One created
    New thread Two created
    New thread Three created
    Three : 0
    One : 0
    Two : 0
    Three : 1
    One : 1
    Two : 1
    Three : 2
    One : 2
    Two : 2
    Three : 3
    One : 3
    Two : 3
    Three : 4
    One : 4
    Two : 4
    One thread exitied
    Three thread exitied
    Two thread exitied
    Main thread exitied
    */
}
