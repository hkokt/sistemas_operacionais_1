package controller;

public class ThreadBuffer extends Thread {
    public void lacoBuffer() {
        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0; i < 32769; i++) {
            strBuffer.append("buffer");
        }
    }
}
