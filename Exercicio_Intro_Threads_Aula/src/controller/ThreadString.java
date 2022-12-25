package controller;

public class ThreadString extends Thread {
    
    public void lacoString() {
        String str = "";

        for (int i = 0; i < 32769; i++) {
            str += "string";
        }
    }
}
