package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " я демон? " + Thread.currentThread().isDaemon());

        Runnable hiImRunnable = () -> {
            Thread.currentThread().setName("Я поток №1");
            System.out.println(Thread.currentThread().getName() + " я демон? " + Thread.currentThread().isDaemon());
            System.out.println("Привет я Runnable");
        };

        Runnable wakeUp = () -> {
            Thread.currentThread().setName("Я поток №2");
            System.out.println(Thread.currentThread().getName() + " я демон? " + Thread.currentThread().isDaemon());
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Привет, я проснулся после 4 секунд");
            }
        };

        Thread flow1 = new Thread(hiImRunnable);
        Thread flow2 = new Thread(wakeUp);

        flow1.setPriority(10);
        flow1.start();
        flow2.setDaemon(true);
        flow2.start();

    }
}
