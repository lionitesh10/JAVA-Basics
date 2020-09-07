import javax.swing.*;
class FrameInheritanceMain extends JFrame{
	public static void main(String[] args) {
		FrameInheritanceMain f=new FrameInheritanceMain();
		JButton b1=new JButton("Hello Main!!");
		b1.setBounds(50,100,150,50);
		f.setTitle("Frame Inheritance Main Method ");
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}