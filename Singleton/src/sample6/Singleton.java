package sample6;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    // Thread safe and performance promote
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // When more than two threads run into the first null check same time,
                // to avoid instanced more than one time, it needs to be checked again.
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
