import java.awt.*;
import java.awt.event.*;

class GUI3
{
    public static void main(String[] args)
    {
       MarvellousFrame mobj = new MarvellousFrame("PPA49");
    }
}
class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600); //H,W
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}
    
class MarvellousListener implements WindowListener
{
    public void WindowDeactivated(WindowEvent obj){}
    public void WindowDActivated(WindowEvent obj){}
    public void WindowDeiconified(WindowEvent obj){}
    public void WindowIconified(WindowEvent obj){}
    public void WindowClosed(WindowEvent obj){}
    public void WindowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void WindowOpened(WindowEvent obj){}

}