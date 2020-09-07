import javax.swing.*;
class FrameInheritanceConst extends JFrame{
	FrameInheritanceConst(){
		JButton b1=new JButton("Hello Constructor!!");
		b1.setBounds(50,100,150,50);
		setTitle("Frame Inheritance Constructor Method ");
		add(b1);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FrameInheritanceConst();
	}
}