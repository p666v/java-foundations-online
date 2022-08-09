package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrinterThread extends Thread {
    private final String message;
    private final long delay;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(message + " ");
        }
    }
}
