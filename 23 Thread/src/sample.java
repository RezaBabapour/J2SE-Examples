public class sample {

    public void printA()
    {
        System.out.println("A");
    }
    public void printB()
    {
        System.out.println("B");
    }
    public static void main(String[] args) {
        sample obj = new sample();
        obj.printA();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.printB();

    }
}
