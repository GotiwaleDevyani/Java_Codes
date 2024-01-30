//Customised Database managments system.

class DataBase1
{
    public static void main(String Arg[])
    {
        DBMS obj = new DBMS();

        obj.InsertIntoTable(1, "Amit", "Pune", 89);
        obj.InsertIntoTable(2, "Pooja", "Mumbai", 95);
        obj.InsertIntoTable(3, "Rahul", "Satara", 80);
        obj.InsertIntoTable(4, "Neha", "Pune", 78);
    }
}
class node
{
    public int Rno;     //primary key
    public String Name;
    public String City;
    public int Marks;

    public node next;

    public node(int A, String B, String C, int D)
    {
        Rno = A;
        Name = B;
        City = C;
        Marks = D;
        next = null;
    }
}
class DBMS
{
    public node first;

    public DBMS()
    {
       first = null;
       System.out.println("DBMS initialised succesfully..");
       System.out.println("Student table gets created succesfully..");
    }
    //iNSERT LAST
    public void InsertIntoTable(int Rno, String Name, String City, int Marks)
    {
        node newn = new node(Rno, Name, City, Marks);

        if(first == null)
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
        System.out.println("One record get inserted succesfully");
    }
}