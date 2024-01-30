class MultiThread4
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        
        Demo obj1 = new Demo(); //new state
        obj1.start();           //Runnable state
        obj1.join();
        System.out.println("End of main thread");
    }
}
class Demo extends Thread
{
    public void run() //Running state
    {
        for(int i = 1; i > 10; i++)
        {}
         System.out.println("End of thread");
    }
}