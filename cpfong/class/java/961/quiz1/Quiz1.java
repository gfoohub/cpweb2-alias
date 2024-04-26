import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz1 extends JFrame implements ActionListener {
	private JButton but;
	private JPanel  pan;
	
	public static void main(String[] args){
		Quiz1 frame = new Quiz1();
		frame.setSize(400,300);
		frame.createGUI(frame);
		frame.setVisible(true);
	}
	
	private void createGUI(Quiz1 mw){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mw.setLayout(new FlowLayout());

		pan =new JPanel();  pan.setPreferredSize(new Dimension(120,80));
		pan.setBackground(Color.white); mw.add(pan );

		but =new JButton("Draw Line");mw.add(but ); but.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		Graphics paper  =  pan.getGraphics();
		paper.drawLine  (50 ,  0,   0, 25);
		paper.drawLine  (0  , 25, 100, 25);
		paper.drawLine  (100, 25,  50,  0);
	}
}
