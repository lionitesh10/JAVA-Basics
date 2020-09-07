import javax.swing.*;
class FrameAssociationConst{
	FrameAssociationConst(){
		JFrame f=new JFrame("Frame Association in Constructor Method");
		JButton b1=new JButton("Hello Constructor");
		b1.setBounds(50,100,140,50);
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FrameAssociationConst();
	}
}