import javax.swing.*;
class FrameAssociationMain{
	public static void main(String[] args) {
		JFrame f=new JFrame("Frame Association in Main Method");
		
		JButton b1=new JButton("Click Here!!");
		b1.setBounds(50,100,120,50);
		f.add(b1);

		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}