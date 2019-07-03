public class MainRunnable {
    public static void main(String[] args) {
        RunnableThread runnableThread0 = new RunnableThread();
        Thread thread0 = new Thread(runnableThread0, "thread0");
        thread0.start();

    }
}
