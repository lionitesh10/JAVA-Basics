import javax.swing.*;
class FrameInheritanceOther extends JFrame{
	void createGUI(){
		JButton b1=new JButton("Hello Other!!");
		b1.setBounds(50,100,150,50);
		setTitle("Frame Inheritance Other Method ");
		add(b1);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameInheritanceOther f1=new FrameInheritanceOther();
		f1.createGUI();
	}
}