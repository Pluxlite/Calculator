import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class calculate extends JFrame {	
	
	public static void main(String[] args) {

		new calculate();
		
	}
	
	public calculate(){
				
		this.setSize(250, 350);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JPanel p = new JPanel(new GridLayout(5,10,3,3));

		JTextField input = new JTextField("");
				
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				input.setText("");
			}
		});
		 JButton add = new JButton("+");
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String mathOp = add.getText();
				String textBox = input.getText();
				textBox = textBox.concat(mathOp);
				input.setText(textBox);
			}
		});
		 JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b0.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		 JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b1.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b2.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b3.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b4.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b5.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b6.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b7.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b8.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String num = b9.getText();
				String textBox = input.getText();
				textBox = textBox.concat(num);
				input.setText(textBox);
			}
		});
		JButton equal = new JButton("=");
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			}
		});
		
		
		p.add(input);
		p.add(clear);
		p.add(add);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(equal);
		
		
		this.add(p);
	}

}
