//Accepts 2 numbers from user and finds its even and odd Factors

import java.util.*;
class LBProblamesOnNumbers1
{
    public static void  EvenFactors(int iNo)
    {
        int iFact = 1;
        int iCnt = 0;
        
       for(iCnt = 1; iCnt <= iNo;iCnt++)
       {
        if
            iFact = iFact *iCnt;

        }
        return iFact;
    }

    public static void main(String[] args) 
    {
        {
            Scanner sobj = new Scanner(System.in);
            int iValue = 0;

            System.out.println("Enter Number : ");
            iValue = sobj.nextInt();

            EvenFactors(iValue);

            System.out.println("Factorial is : ");
            sobj.close();
        }
    }
}
