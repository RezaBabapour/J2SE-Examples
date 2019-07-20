package reflect;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Object tmp = Class.forName("reflect.App").newInstance();
        Method m = tmp.getClass().getDeclaredMethod("b");
        m.setAccessible(true);
        m.invoke(tmp);  // tmp.b();

    }
}
