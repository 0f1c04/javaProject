package com.kosta.day11;

public class BeepPrintTest {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("삡");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
