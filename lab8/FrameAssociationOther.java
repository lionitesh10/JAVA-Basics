import javax.swing.*;
class FrameAssociationOther{
	void createGUI(){
		JFrame f=new JFrame("Frame Association in Other Method");
		JButton b1=new JButton("Hello Other Method!!");
		b1.setBounds(50,100,150,50);
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameAssociationOther f1=new FrameAssociationOther();
		f1.createGUI();
	}
}