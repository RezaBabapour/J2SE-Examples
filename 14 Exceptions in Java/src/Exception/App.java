package Exception;

public class App {

    public static void main(String[] args) {
        System.out.println("before code with exception.");
        System.out.println(1/0);	//code with exception
        System.out.println("after exception.");
        /**
         output :
         before code with exception.
         Exception in thread "main" java.lang.ArithmeticException: / by zero
         at Exception.App.main(App.java:7)
         **/
    }
}