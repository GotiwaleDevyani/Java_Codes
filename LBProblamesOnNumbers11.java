import java.util.*;
class LBProblamesOnNumbers9
{
    public static void Display(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

            for(iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                System.out.println(Arr[iCnt]);
            }
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter Your Name :");
        str = sobj.nextLine();

        Display(str);
        sobj.close();
    }
}
