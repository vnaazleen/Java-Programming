// Using isAlive() and join() methods

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
public class MultiThreadingisAliveAndJoinDemo {
    public static void main(String[] args) {
        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");
        NewThread three = new NewThread("Three");
        try {
            System.out.println("One thread is alive? " + one.t.isAlive());
            System.out.println("Two thread is alive? " + two.t.isAlive());
            System.out.println("Three thread is alive? " + three.t.isAlive());

            one.t.join();
            two.t.join();
            three.t.join();

            System.out.println("One thread is alive? " + one.t.isAlive());
            System.out.println("Two thread is alive? " + two.t.isAlive());
            System.out.println("Three thread is alive? " + three.t.isAlive());
        } catch ( InterruptedException e ) {
             System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exitied");
    }


}

/*
Output:
-------
New thread One created
New thread Two created
New thread Three created
One thread is alive? true
Two thread is alive? true
Three thread is alive? true
Three : 0
Two : 0
One : 0
Three : 1
Two : 1
One : 1
Three : 2
Two : 2
One : 2
Two : 3
Three : 3
One : 3
Two : 4
Three : 4
One : 4
Two thread exitied
Three thread exitied
One thread exitied
One thread is alive? false
Two thread is alive? false
Three thread is alive? false
Main thread exitied

*/
