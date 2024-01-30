//Additions of 2 numbers using java.

import java.util.*;

class JavaLB7
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Arithematic aobj = new Arithematic();

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        iAns = aobj.Arithematic();
        System.out.println("Addition is :"+iAns);
    }

    
}
 class Arithematic
{
        
    public static int Addition (int iValue1 ,int iValue2) //if we write the 2 function in class the it nesessory to write the function is static
     
    {
        int iSum = 0;
        iSum = iValue1 + iValue2;
        return iSum;
    }

}

