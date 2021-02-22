/*
Write a java program that implements a multi-threading application that has three threads. First thread generates a random integer every 1
second and if the value is even, second thread computes the sqaure of number and prints.If the value is odd, the third will print the value 
of the cube of the number
*/
import java.util.Random;

class Square extends Thread {
    int x;
    Square (int n) {
        x = n;
    }
    public void run() {
        int sqrx = x * x;
        System.out.println("Square of " + x + " = " + sqrx);
    }
}

class Cube extends Thread {
    int x;
    Cube (int n) {
        x = n;
    }
    public void run() {
        int cubx = x * x * x;
        System.out.println("Cube of " + x + " = " + cubx);
    }
}

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100);
            System.out.println("Random number generated: " + randNum);

            if (randNum % 2 == 0) {
                System.out.println(randNum + " is even");
                Square sq = new Square(randNum);
                sq.start();
            } else {
                System.out.println(randNum + " is odd");
                Cube cb = new Cube(randNum);
                cb.start();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class Experiment15 {
    public static void main(String[] args) {
        RandomNumberGenerator randNumGen = new RandomNumberGenerator();
        randNumGen.start();
    }
    
    /*
Sample output:
    
Random number generated: 66
66 is even
Random number generated: 65
65 is odd
Square of 66 = 4356
Random number generated: 8
8 is even
Random number generated: 37
37 is odd
Square of 8 = 64
Random number generated: 4
4 is even
Cube of 65 = 274625
Random number generated: 38
38 is even
Cube of 37 = 50653
Random number generated: 13
13 is odd
Square of 4 = 16
Random number generated: 61
61 is odd
Cube of 13 = 2197
Random number generated: 7
7 is odd
Cube of 61 = 226981
Random number generated: 99
99 is odd
Cube of 7 = 343
Square of 38 = 1444
Cube of 99 = 970299
*/
}
