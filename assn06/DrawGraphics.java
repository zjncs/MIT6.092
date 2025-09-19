// 这是 DrawGraphics.java 文件的全部内容
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

// 这是总指挥。它负责创建遥控器和玩具，并将它们组合起来。
public class DrawGraphics {

    // 这是一个“大箱子”，里面可以装下所有类型的“遥控器”（Mover）。
    ArrayList<Mover> movers;

    public DrawGraphics() {
        // 创建这个大箱子
        movers = new ArrayList<Mover>();

        // --- 开始创建玩具和遥控器 ---

        // 创建4个不同的“玩具”
        Sprite rect1 = new Rectangle(50, 30, Color.RED);        // 红色方块
        Sprite oval1 = new Oval(40, 40, Color.BLUE);           // 蓝色椭圆
        Sprite rect2 = new Rectangle(20, 60, Color.ORANGE);    // 橙色方块
        Sprite oval2 = new Oval(50, 30, Color.GREEN);          // 绿色椭圆

        // 1. 创建两个“弹跳遥控器”(Bouncer)
        Mover bouncer1 = new Bouncer(100, 170, rect1); // 用它控制红色方块
        bouncer1.setMovementVector(3, 1);
        
        Mover bouncer2 = new Bouncer(50, 50, oval1);   // 用它控制蓝色椭圆
        bouncer2.setMovementVector(-2, 2);

        // 2. 创建两个“直线遥控器”(StraightMover)
        Mover straightMover1 = new StraightMover(20, 80, rect2); // 用它控制橙色方块
        straightMover1.setMovementVector(2, 4);
        
        Mover straightMover2 = new StraightMover(200, 250, oval2); // 用它控制绿色椭圆
        straightMover2.setMovementVector(-3, -1);

        // 把这4个创建好的遥控器（已经绑定了玩具）全部放进大箱子里
        movers.add(bouncer1);
        movers.add(bouncer2);
        movers.add(straightMover1);
        movers.add(straightMover2);
    }

    // 这个方法会被反复调用，每一帧画面都会执行一次
    public void draw(Graphics surface) {
        // 遍历大箱子里的每一个遥控器，按下它们的“draw”按钮
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}