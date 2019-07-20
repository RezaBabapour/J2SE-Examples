package reflect;

public class App {
    static
    {
        System.out.println("Static block in App class");
    }

    public App()
    {
        System.out.println("constructor in class App");
    }

    public void a()
    {
        System.out.println("this is A method");
    }

    private void b()
    {
        System.out.println("this is B method");
    }
}
