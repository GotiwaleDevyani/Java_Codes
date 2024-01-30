import java.util.*;

class ExceptionDemo1x
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int iNo1 = sobj.nextInt();

        
        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;

        try
        {
            System.out.println("Inside try block :");
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block" +obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array Index Out Of Bounds Exception" +obj);
        }
        catch(Exception obj) //Dhoni //catch All Exeption
        {
            System.out.println("Inside generic catch block" +obj);
        }
        finally
        {
            System.out.println("Inside finally block");
        }
            System.out.println("Division is :"+iAns);
    }
}