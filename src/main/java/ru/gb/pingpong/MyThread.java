package ru.gb.pingpong;

public class MyThread extends Thread {
    private String threadName;
    private static Object syncObject;
    public MyThread(String threadName) {
        this.threadName = threadName;
        syncObject = new Object();
    }

    @Override
    public void run() {
        synchronized (syncObject) {
            while(true) {
                syncObject.notify();
                System.out.println(threadName);
                try {
                    Thread.sleep(500);
                    syncObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
