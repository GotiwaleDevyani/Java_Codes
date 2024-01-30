import java.io.*;
class Readfile
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fobj = new FileInputStream("PPA.txt"); //read the data we create input stream object.
            int i = 0;

            while((i = fobj.read()) != -1)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
        catch(Exception obj){}
    }
}