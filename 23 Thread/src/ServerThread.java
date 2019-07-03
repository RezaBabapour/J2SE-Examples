public class ServerThread extends Thread {
    public ServerThread(String threadName)
    {
        this.setName(threadName);
    }
    public void run()
    {
        int clientNumber0 = 1;
        int clientNumber1 = 500;
        if(this.getName().equals("myServer0"))
        {
            while (clientNumber0 < 100)
                {
                    System.out.println(this.getName() + " ClientNumber is " + clientNumber0++);
                    if(clientNumber0 == 50)
                        try {
                            this.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                }
        }
        else if(this.getName().equals("myServer1"))
        {
            while (clientNumber1 < 1000)
            {
                System.out.println(this.getName() + " ClientNumber is " + clientNumber1++);

            }
        }
    }
}
