import java.awt.*;

/**
 * Project name(项目名称)：GUI之Panel
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/29
 * Time(创建时间)： 22:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        if (args.length != 0 && args[0].equals("test2"))
        {
            test2.main(null);
        }
        else
        {
            Frame f = new Frame("测试窗口");
            Panel p = new Panel(null);
            Panel p1 = new Panel(null);
            f.setLayout(null);
            f.setBounds(150, 100, 1600, 900);
            f.setBackground(new Color(158, 0, 247));
            p.setBounds(50, 50, 400, 400);
            p.setBackground(new Color(204, 204, 15));
            p1.setBounds(500, 50, 400, 400);
            p1.setBackground(new Color(36, 245, 111));
            f.add(p);
            f.add(p1);
            f.setVisible(true);
        }
    }
}
