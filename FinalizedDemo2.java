class FinalizedDemo1
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit",78000,28,"Karve Road Pune");
        eobj.Display();
        System.out.println(eobj.getClass());
        String str = "Marvellous";
         System.out.println(str.getClass());

        
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
    
}