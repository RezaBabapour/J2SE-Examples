public class Main {
    public static void main(String[] args) {
        ServerThread thread0 = new ServerThread("myServer0");
        ServerThread thread1 = new ServerThread("myServer1");
        thread0.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread0.start();
        thread1.start();
    }


}
