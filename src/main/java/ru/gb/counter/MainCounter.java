package ru.gb.counter;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    counter.inc();
                    System.out.println(counter.getCount());
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread tt = new Thread() {
            @Override
            public void run() {
                while (true) {
                    counter.inc();
                    System.out.println(counter.getCount());
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        tt.start();
    }
}
