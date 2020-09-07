import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Counter extends JFrame{
	JLabel l;
	int count=0;
	Counter(){
		createGUI();
	}
	void createGUI(){
		setTitle("Number Counter ");
		setLayout(null);
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(3);

		l=new JLabel(String.valueOf(count));
		l.setBounds(150,25,100,50);
		l.setFont(l.getFont().deriveFont(64.0f));
		add(l);
		JButton incrBtn=new JButton("Increase");
		incrBtn.setBounds(30,100,100,50);
		incrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               	count=count+1;
               	l.setText(String.valueOf(count));
            }
        });
		add(incrBtn);
		JButton decrBtn=new JButton("Decrease");
		decrBtn.setBounds(130,100,100,50);
		decrBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				count=count-1;
				l.setText(String.valueOf(count));
			}
		});
		add(decrBtn);
		JButton resetBtn=new JButton("Reset");
		resetBtn.setBounds(230,100,100,50);
		resetBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				count=0;
				l.setText(String.valueOf(count));
			}
		});
		add(resetBtn);

	}
	public static void main(String[] args) {
		new Counter();
	}
}