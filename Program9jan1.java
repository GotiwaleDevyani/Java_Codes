
class Program9jan1
{
    public static void main(String arg[])
    {
       SinglyLL obj = new SinglyLL();

       obj.InsertFirst(51);
       obj.InsertFirst(21);
       obj.InsertFirst(11);

       obj.Display();
       
        
    }
}
class node              //Struct Node
{
    public int data;
    public node next;   // struct node *next;

    public node(int no) //Constructor
    {
        data = no;
        next = null;
    }
}
class SinglyLL
{
    private node first;
    private int Count;    

    public SinglyLL() //Constructor
    {
        first = null;
        Count = 0;
    }

    public void InsertFirst(int no){}
    public void InsertLast(int no){}
    public void InsertAtPos(int no, int ipos){}
    public void DeleteFirst(){}
    public void DeleteLast(){}
    public void DeleteAtPos(int ipos){}
    public void Display(){}
    public int Count(){ return Count;}
}