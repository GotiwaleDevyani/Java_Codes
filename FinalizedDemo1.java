class FinalizedDemo1
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit",78000,28,"Karve Road Pune");
        eobj.Display();
        Employee eobj2 = eobj;
        Employee eobj3 = new Employee("sagar",88000,28,"Karve Road Pune");

        System.out.println("Hash code of eobj is :"+eobj.hashCode());
        System.out.println("Hash code of eobj is :"+eobj2.hashCode());
        System.out.println("Hash code of eobj is :"+eobj3.hashCode()); //Hash code value display or store the adderess of object.
        eobj = null;
        System.gc(); //Garbage collector.

    }
}
class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

   Employee(String str , int amount , int A, String Addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = Addr;
    }
    
    void Display()
    {
        System.out.println("Employee Name :"+this.Name);
        System.out.println("Employee Age :"+this.Age);
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Address:"+this.Address);
    }
    protected void finalize()
    {
        System.out.println("InSide Fizalize Method..");
    }
}