package controller;

public class ThreadBuffer extends Thread {
    public void run() {
        long inicio=System.currentTimeMillis();
        lacoBuffer();
        System.out.println("tempo Buffer ==> " + (System.currentTimeMillis() - inicio) + "ms");
    }

    private void lacoBuffer() {
        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0; i < 32769; i++) {
            strBuffer.append("buffer");
        }
    }
}
