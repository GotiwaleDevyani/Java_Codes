class AbstractDemo1
{
     public static void main(String arg[])
    {
        System.out.println("Inside Main");
       
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    }
}
class Hello extends Demo
{
    public Hello()
    {
        System.out.println("inside Hello constructor");
    }
    public void fun()
    {
        System.out.println("inside fun of Hello ");
    }
}

abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Demo Constructor\n");
        this.A = 0;
        this.B = 0;
    }
    abstract void fun(); // <--virtual void fun()=0; c++
    void gun()
    {
        System.out.println("Inside gun Demo");
    }
}
