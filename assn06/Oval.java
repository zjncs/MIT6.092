// 这是 Oval.java 文件的全部内容
import java.awt.Color;
import java.awt.Graphics;

// 这个文件定义了一个新的“玩具”：椭圆形。
// 它实现了 Sprite 接口，意味着它承诺会告诉别人“我长什么样”。
public class Oval implements Sprite {

    private int width;
    private int height;
    private Color color;

    // 这是构造函数，用来创建椭圆并设置它的大小和颜色
    public Oval(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // 这是 draw 方法，负责把自己画在屏幕上
    @Override
    public void draw(Graphics surface, int x, int y) {
        surface.setColor(this.color);
        surface.fillOval(x, y, this.width, this.height);
        surface.setColor(Color.BLACK);
        surface.drawOval(x, y, this.width, this.height);
    }

    // 这两个方法告诉别人它的宽度和高度是多少
    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}