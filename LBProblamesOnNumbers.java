//Accepts 2 numbers from user and finds its Factorials

import java.util.*;
class LBProblamesOnNumbers
{
    public static int Factorial(int iNo)
    {
        int iFact = 1;
        int iCnt = 0;
        iCnt= 1;
        if(iCnt <= iNo)
        {
            iFact = iFact *iCnt;

        }
        return iFact;
    }

    public static void main(String[] args) 
    {
        {
            Scanner sobj = new Scanner(System.in);
            int iValue = 0 , iAns = 0;

            System.out.println("Enter Number : ");
            iValue = sobj.nextInt();

            iAns = Factorial(iValue);

            System.out.println("Factorial is : "+iAns);
            sobj.close();
        }
    }
}
