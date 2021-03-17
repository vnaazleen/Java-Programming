// implentation of Producer-Consumer problem

class ItemQueue {
    int item;
    boolean valueSet = false;

    synchronized int get() {
        // while value is not set wait for producer to set the value
        while(!valueSet) {
            try {
                wait();
            } catch(Exception e) {
                System.out.println("InterruptedExeption caught");
            }
        }

        System.out.println("Got: " + item);
        valueSet = false;
        notify();
        return item;
    }

    synchronized void put(int num) {
        // while value is not set wait for producer to set the value
        while(valueSet) {
            try {
                wait();
            } catch(Exception e) {
                System.out.println("InterruptedExeption caught");
            }
        }

        item = num;
        System.out.println("Put: " + item);
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {
    ItemQueue q;
    Producer(ItemQueue q1) {
        q = q1;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i <= 5) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    ItemQueue q;
    Consumer(ItemQueue q1) {
        q = q1;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (i <= 5) {
            q.get();
            i++;
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        ItemQueue q = new ItemQueue();
        new Producer(q);
        new Consumer(q);
    }
}

/*
Output:
-------
Put: 0
Got: 0
Put: 1
Got: 1
Put: 2
Got: 2
Put: 3
Got: 3
Put: 4
Got: 4
Put: 5
Got: 5
*/
