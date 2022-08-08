package ru.itsjava.threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        Thread flow1 = new Thread(new PrinterRunnable("Поток 1", 2000L));
        Thread flow2 = new Thread(new PrinterRunnable("Поток 2", 2000L));

        System.out.print("Start: ");

        flow1.setPriority(10);
        flow2.setPriority(1);

        flow1.start();
        flow2.start();

        flow1.join();
        flow2.join();

        System.out.println("End");



        PrinterThread flow3 = new PrinterThread("One", 2000L);
        PrinterThread flow4 = new PrinterThread("Two", 2000L);

        System.out.print("Start: ");

        flow3.setPriority(10);
        flow4.setPriority(1);

        flow3.start();
        flow4.start();

        flow3.join();
        flow4.join();

        System.out.println("End");





    }
}
