import javax.servlet.http.*;  //Upgratend package of java that is javax used for swings.
import javax.servlet.*;  
import java.io.*;  
public class DemoServlet extends HttpServlet
{  
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException  
    {  
        res.setContentType("text/html");//setting the content type  
        PrintWriter pw=res.getWriter();//get the stream to write the data  
        
        //writing html in the stream  
        pw.println("<html><body>");  
        pw.println("Jay Ganesh...");  
        pw.println("</body></html>");  
        
        pw.close();//closing the stream  
    }
}