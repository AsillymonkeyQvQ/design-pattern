package sample4;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        slowdown();
        System.out.println("インスタンスを生成しました。");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

}
