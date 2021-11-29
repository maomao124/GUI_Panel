import java.awt.*;

/**
 * Project name(项目名称)：GUI之Panel
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/29
 * Time(创建时间)： 22:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class MyFrame2 extends Frame
{
    MyFrame2(String s, int x, int y, int w, int h)
    {
        super(s);
        setLayout(null);
        Panel p1 = new Panel(null);
        Panel p2 = new Panel(null);
        Panel p3 = new Panel(null);
        Panel p4 = new Panel(null);
        p1.setBounds(0, 0, w / 2, h / 2);
        p2.setBounds(0, h / 2, w / 2, h / 2);
        p3.setBounds(w / 2, 0, w / 2, h / 2);
        p4.setBounds(w / 2, h / 2, w / 2, h / 2);
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.MAGENTA);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}

public class test2
{
    public static void main(String[] args)
    {
        new MyFrame2("MyFrameWithPanel",150,100,1600,900);
    }
}
