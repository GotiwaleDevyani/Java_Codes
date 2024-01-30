import java.util.*;

class InputOutput 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  //object creation

        System.out.println("Enter first number :");
        int No1 = sobj.nextInt();
                       //%d 
        System.out.println("Enter second number :");
          int No2 = sobj.nextInt();

          int Ans = 0;

          Ans = No1 + No2;
        System.out.println("Addition is :"+Ans); //+operator is used to concate
        //sobj.close();

    }
}