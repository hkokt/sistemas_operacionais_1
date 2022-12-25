package controller;

public class ThreadString extends Thread {

    public void run() {
        long inicio = System.currentTimeMillis();
        lacoString();
        System.out.println("tempo Buffer ==> " + (System.currentTimeMillis() - inicio) + "ms");
    }

    private void lacoString() {
        String str = "";

        for (int i = 0; i < 32769; i++) {
            str += "string";
        }
    }
}
