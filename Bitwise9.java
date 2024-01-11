//accept one number from user the number that is  Decimal Formate and checks the 3rd bit or 7th bit  is on or off.
import java.util.*;

class Bitwise3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iMask = 0X00000004;
        int iResult = 0;
        
        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("3rd bit is ON..");
        }
        else
        {
            System.out.println("3rd bit is OFF..");
        }
    }
}

/*
    iMask = 4

    0000 0000 0000 0000 0000 0000 0000 0100
      0    0    0    0    0    0    0    4     
      
      0X00000004

 */