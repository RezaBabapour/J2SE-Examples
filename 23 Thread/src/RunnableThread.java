public class RunnableThread implements Runnable {
    public void run()
    {
        int clientNumber = 1;
        while (clientNumber < 100)
        {
            System.out.println("clientNumber is " + clientNumber++);
        }
    }
}
