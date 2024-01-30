import java.util.*; //Accept the string from user and count the latters

class String3
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll(" ","");

        System.out.println("Updated string is : "+str);
        
    }
}