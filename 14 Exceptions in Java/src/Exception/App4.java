package Exception;

public class App4 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            throw new MyException();
        }
    }
}
