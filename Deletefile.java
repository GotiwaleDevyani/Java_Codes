import java.io.*;
class Deletefile
{
    public static void main(String[] args)
    {
        try
        {
            File fobj = new File("PPA.txt");
            fobj.delete();
            System.out.println("File Deleted successfully..");
        }
        catch(Exception obj){}
    }
}