//accept one number from user the number that is  Decimal Formate and checks the 4th bit is on then it will Do off.
import java.util.*;

class Bitwise14
{
    public static int OFFBit(int iNO)
    {
        int iMask = 0X00020000;
        int iResult = 0;
        iResult = iNO & iMask;

        if(iResult == iMask)
        {
            return (iNO ^ iMask);  //18th bit is ON
        }
        else
        {
            return iNO;  //18th bit is oFF  
        }
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int  iRet = 0;

        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = OFFBit(iNo);

        System.out.println("Updated Number is : "+iRet);
    }
}
/*
     0000 0000 0000 0010 0000 0000 0000 0000
      0    0    0    2    0     0    0     0    
      
0X00020000
 */