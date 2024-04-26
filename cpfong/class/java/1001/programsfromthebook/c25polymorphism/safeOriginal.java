import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

abstract class Shape {
    protected int x, y;
    protected int size = 20;
    public abstract void display(Graphics drawArea);
}

class Circle extends Shape {

    public Circle(int initX, int initY) {
        x = initX;
        y = initY;
    }

    public void display(Graphics drawArea) {
        drawArea.drawOval(x, y, size, size);
    }
}

class Square extends Shape {

    public Square(int initX, int initY) {
        x = initX;
        y = initY;
    }

    public void display(Graphics drawArea) {
        drawArea.drawRect(x, y, size, size);
    }
}

class Shapes extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        Shapes demo = new Shapes();
        demo.setSize(250,200);
        demo.createGUI();
        demo.show();
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 150));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("draw");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        Circle circle = new Circle(20, 20);
        Square square = new Square(80, 80);
        ArrayList group = new ArrayList();
        group.add(circle);
        group.add(square);

        paper.setColor(Color.white);
        paper.fillRect(0, 0, 150, 150);
        paper.setColor(Color.black);
        for (int s = 0; s < group.size(); s++) {
Object item = group.get(s);
            Shape shape = (Shape) item;
            shape.display(paper);
        }
    }
}
