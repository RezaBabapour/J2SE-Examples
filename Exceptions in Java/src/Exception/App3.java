package Exception;

public class App3 {
    public static void main(String[] args) {
        App3 obj = new App3();

        try {
            obj.methodWithException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void methodWithException() throws Exception
    {
        System.out.println(1/0);
    }

}
