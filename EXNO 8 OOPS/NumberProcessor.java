package Main;

import java.util.Random;

public class NumberProcessor {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Thread thread1 = new Thread(generator);
        Thread thread2 = new Thread(new SquareCalculator());
        Thread thread3 = new Thread(new CubeCalculator(generator));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RandomNumberGenerator implements Runnable {
    private Random random = new Random();

    @Override
    public void run() {
        int num = random.nextInt(100);
        System.out.println("Generated number: " + num);
        if (num % 2 == 0) {
            synchronized (SquareCalculator.lock) {
                SquareCalculator.number = num;
                SquareCalculator.lock.notify();
            }
        } else {
            synchronized (CubeCalculator.lock) {
                CubeCalculator.number = num;
                CubeCalculator.lock.notify();
            }
        }
    }
}

class SquareCalculator implements Runnable {
    static final Object lock = new Object();
    static int number;

    public SquareCalculator() {
        
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
                int square = number * number;
                System.out.println("Square: " + square);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubeCalculator implements Runnable {
    static final Object lock = new Object();
    static int number;

    public CubeCalculator(RandomNumberGenerator generator) {
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
                int cube = number * number * number;
                System.out.println("Cube: " + cube);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
