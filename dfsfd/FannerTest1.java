package dfsfd;
import java.awt.Frame;
 
// Frame 상속해서 
public class FannerTest1 extends Frame
{
    public FannerTest1()
    {
        super("두 번째 프레임입니다.");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }


    public static void main(String args[])
    {
        FannerTest1 Obj = new FannerTest1();
    }
}