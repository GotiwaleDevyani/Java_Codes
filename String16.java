import java.util.*; //Accept the string from user and count the latters

class String16   //514
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        StringBuffer sbobj = new StringBuffer(str);
        sbobj = sbobj.reverse();

        System.out.println("Updated string is : "+sbobj);
        sobj.close();
        
    }
}