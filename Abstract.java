

class Abstract
{
    public static void main(String arg[])
    {
        System.out.println("Inside Main");
       // Demo obj = new Demo(); Error
    }
}

abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        System.out.println("Inside Constructor\n");
        this.A = 0;
        this.B = 0;
    }

    abstract void fun(); // <--virtual void fun()=0; c++

    void gun()
    {
        System.out.println("Inside gun");
    }
}