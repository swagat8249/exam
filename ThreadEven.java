package assignment;

class EvenNumberRunnable implements Runnable {
    private int startNumber;

    public EvenNumberRunnable(int startNumber) {
        this.startNumber = startNumber;
    }

    @Override
    public void run() {
        while (startNumber <= 20) {
            System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Even Number: " + startNumber);
            startNumber += 2;
        }
    }
}

public class ThreadEven {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new EvenNumberRunnable(i + 2));
            thread.start();
        }
    }
}
