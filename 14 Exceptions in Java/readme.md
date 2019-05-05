# Excption handling in JAVA
There is two type of errors in compiled language. errors **before compile phase** and errors **after compile phase**.
the first category of errors are typically about the language syntax. compiler helps programmer to discover and resolve this type of errors.
Excption handling is the way to resolve the errors in **run time** or **after compile phase**.
## What is Runtime Error
Some errors that occurs after compile(interpret in java's term) phase. divide by zero is a simple example of this type, that programmer does not expect this happens in Runtime. there is some hope for handling the situation. like other languages programmer can surround suspicious code in try catch block. in **intellij idea** you can use **Ctrl + Alt + T** for surrounding the suspicious code with try catch block. if you don't use exception handling methods, your app stops working and it may cause dangerous outcome. in below you can see some examples about diffrent cases
```
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

```
As you can see code runs until first exception then stops running.
```
package Exception;

public class App {

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
```
Using try catch block code runs smoothly and catch block handls excption. the **e** object include the exception information. you can use **e.getMessage()** for summarize the output message or use **e.printStackTrace()** for better representation.

## Exception throw
Sometimes programmers does not handle their exceptions, they can demand the user of their method for handling exception. in this case user must surround method in try catch block. like the example programmer should use **throws Exception** after declaring method that includes exception. without using try catch block programmer gets a compile error.
```
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
```
## Create a new exception