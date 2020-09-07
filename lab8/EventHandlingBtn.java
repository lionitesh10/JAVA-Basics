import javax.swing.*;
import java.awt.event.*;
class EventHandlingBtn extends JFrame implements ActionListener{
	JLabel l;
	EventHandlingBtn(){
		JButton b1=new JButton("ok!!");
		b1.setBounds(50,100,70,35);
		setTitle("Ok EventHandling ");
		add(b1);
		l=new JLabel("This text will change to Hello World!!");
		l.setBounds(50,180,200,50);
		add(l);
		b1.addActionListener(this);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		l.setText("Hello World");
	}
	public static void main(String[] args) {
		new EventHandlingBtn();
	}
}