import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // 保留一个 BouncingBox 实例变量，如果还需要单独控制它的话
    BouncingBox box;

    // 声明一个列表来存储多个 BouncingBox 对象
    ArrayList<BouncingBox> boxList;

    /** * 构造函数：初始化所有对象和变量
     */
    public DrawGraphics() {
        // 初始化单个 box
        box = new BouncingBox(200, 50, Color.RED);

        // 1. 初始化列表
        boxList = new ArrayList<BouncingBox>();

        // 2. 创建对象并添加到列表中 (只执行一次)
        // 你可以创建不同颜色和位置的方块，让画面更丰富
        BouncingBox box1 = new BouncingBox(100, 50, Color.BLUE);
        BouncingBox box2 = new BouncingBox(150, 100, Color.GREEN);
        BouncingBox box3 = new BouncingBox(200, 150, Color.YELLOW);

        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.get(0).setMovementVector(1,0);
        boxList.get(1).setMovementVector(2,0);
        boxList.get(2).setMovementVector(3,0);
    }

    /** * 绘图方法：在界面上绘制所有内容
     * 这个方法会被反复调用来更新画面
     */
    public void draw(Graphics surface) {
        // 绘制一条静态的线
        surface.drawLine(50, 50, 250, 250);

        // 绘制单个的 box
        box.draw(surface);

        // 遍历列表，绘制列表中的所有方块
        // 使用 "for-each" 循环语法更简洁
        for (BouncingBox currentBox : boxList) {
            currentBox.draw(surface);
        }
    }
}