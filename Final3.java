
class Final3
{
    public static void main (String arg[])
    {
    }
}

class Demo
{
    public void fun()
    { }
    public final void gun()
    { }
}
class Hello extends Demo
{
     public void fun()
    { }
    //public final void gun() //generate error
    { }

}