class MultiThread6
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        
        Demo obj1 = new Demo(); //new state
          
        Demo obj2 = new Demo(); //new state          //Runnable state

        //obj1.start();   //Runnable state //5
        //obj2.start();     //Runnable state //5

        //System.out.println("priority of obj1 is :"+obj1.getPriority());
       //System.out.println("priority of obj2 is :"+obj2.getPriority());

        obj1.setPriority(8); 
        obj2.setPriority(10);
        obj1.start();   //Runnable state   //8
        obj2.start();     //Runnable state  //10
        System.out.println("priority of obj1 is :"+obj1.getPriority());
        System.out.println("priority of obj2 is :"+obj2.getPriority());
    }
    
}
class Demo extends Thread
{
    public void run() //Running state
    {
        synchronized public void Display()
        {
            //logic
        }
    }
}