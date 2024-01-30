
class Program9jan1
{
    public static void main(String arg[])
    {
       int iRet = 0;
       SinglyLL obj = new SinglyLL();

       obj.InsertFirst(51);
       obj.InsertFirst(21);
       obj.InsertFirst(11);

       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);

       obj.InsertLast(101);
       obj.InsertLast(111);
       obj.InsertLast(121);

       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);

       obj.InsertAtPos(105, 5);
       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);

       obj.DeleteAtPos(5);
       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);


       obj.DeleteFirst();

       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);

       obj.DeleteLast();

       obj.Display();
       iRet = obj.Count();
       System.out.println("NUmber of Elements are : "+iRet);

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

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(first == null) //LL is empty
        {
            first = newn;
        }
        else
        {
            newn.next = first; //(insted of -> we used . operator in java)
            first = newn;
        }
        Count++;
    }
    public void InsertLast(int no)
    {
        node newn = new node(no);
      
        if(first == null) //LL is empty
        {
            first = newn;
        }
        else
        {
            node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        Count++;
    }
  
    public void DeleteFirst()
    {
        if(first == null)      //LL is empty
        {
            return;
        }
        else if(first.next == null)  //LL Contains Single node
        {
            first = null;
        }
        else   //LL Contains more than one node
        {
            first = first.next;
        }
        Count--;
    }
    public void DeleteLast()
    {
        if(first == null)      //LL is empty
        {
            return;
        }
        else if(first.next == null)  //LL Contains Single node
        {
            first = null;
        }
        else   //LL Contains more than one node
        {
            node temp = first;

            while (temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        Count--;
    }
   
    public void Display()
    {
        node temp = first;

        System.out.println("Elements of the Linked list Are : ");
        while(temp != null)
        {
            System.out.print("| "+ temp.data +" |->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return Count;
    }
    
    public void InsertAtPos(int no, int ipos)
    {
        if((ipos < 1) || (ipos > (Count+1)))
        {
            System.out.println("Invalide possition ");
            return;
        }
     
        if(ipos == 1)
        {
            InsertFirst(no);
        }
        else if(ipos == Count+1)
        {
            InsertLast(no);
        }
        else
        {
        
            node newn = new node(no);
            node temp = first;

            for(int i = 1; i < ipos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

            Count++;
        }
    }

    public void DeleteAtPos(int ipos)
    {
        if((ipos < 1) || (ipos > (Count)))
        {
            System.out.println("Invalide possition ");
            return;
        }
     
        if(ipos == 1)
        {
            DeleteFirst();
        }
        else if(ipos == Count)
        {
           DeleteLast();
        }
        else
        {
            node temp = first;

            for(int i = 1; i < ipos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            Count--;
        }
    }
}