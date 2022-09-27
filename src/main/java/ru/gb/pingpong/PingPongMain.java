package ru.gb.pingpong;

public class PingPongMain {
    public static void main(String[] args) throws InterruptedException {
        Thread ping = new MyThread("ping");
        Thread pong = new MyThread("pong");
        ping.start();
        pong.start();
    }
}
