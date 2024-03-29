package ativso4;

public class Main {

    static double x = 0.0;
    public static int vez = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Antes de rotinas : " + x);

        Thread thread1 = new Thread(aumenta);
        Thread thread2 = new Thread(diminui);
        Thread thread3 = new Thread(multiplica);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        
        System.out.println("\nDepois de rotinas: " + x);

    }

    private static Runnable aumenta = new Runnable() {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("+");
                x++;
            }
        }
    };

    private static Runnable diminui = new Runnable() {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("-");
                x--;
            }
        }
    };

    private static Runnable multiplica = new Runnable() {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("*");
                x *= 2;
            }
        }
    };
}

