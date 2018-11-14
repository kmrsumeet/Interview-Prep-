
public class ThreadClass {
	volatile int i = 1;
    volatile Character c = 'a';
    volatile boolean state = true;

    synchronized public void printAlphabet() {
        try {
            while (!state) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " +c);
        state = false;
        c++;
        notifyAll();
    }
    synchronized public void printNumbers() {
        try {
            while (state) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + i);
        state = true;
        i++;
        notifyAll();
    }
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        Thread t1 = new Thread() {
            int k = 0;
            @Override
            public void run() {
                while (k < 26) {
                    threadClass.printAlphabet();
                    k++;
                }
            }
        };
        t1.setName("Thread1");
        Thread t2 = new Thread() {
            int j = 0;

            @Override
            public void run() {
                while (j < 26) {
                    threadClass.printNumbers();
                    j++;
                }
            }
        };
        t2.setName("Thread2");

        t1.start();

        t2.start();
    }

}
