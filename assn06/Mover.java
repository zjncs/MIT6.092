// 这是 Mover.java 文件的全部内容
import java.awt.Graphics;

// 这个文件是“遥控器”的设计图（接口）。
// 它规定了所有遥控器都必须有两个“按钮”：
// 1. setMovementVector: 设置移动方向和速度
// 2. draw: 按下这个按钮，遥控器就会控制玩具移动并把自己画出来
public interface Mover {

    void setMovementVector(int xIncrement, int yIncrement);

    void draw(Graphics surface);
}