package Exception;

public class App2 {

    public static void main(String[] args) {
        System.out.println("before code with exception.");
        try {
            System.out.println(1/0);	//code with exception
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("after exception.");
        /**
         output :
         before code with exception.
         java.lang.ArithmeticException: / by zero
         after exception.
         **/
    }
}