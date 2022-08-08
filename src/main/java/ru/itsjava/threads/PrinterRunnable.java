package ru.itsjava.threads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrinterRunnable implements Runnable {
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
