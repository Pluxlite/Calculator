import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;


public class interfaceCalc {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField output;

	int num1 = 0;
	int num2 = 0;
	int ans = 0;
	private JButton btnSub;
	private JButton btnDiv;
	private JButton btnMult;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceCalc window = new interfaceCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaceCalc() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 289, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb1 = new JTextField();
		tb1.setBounds(11, 13, 116, 22);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(148, 13, 116, 22);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					num1 = Integer.parseInt(tb1.getText());
					num2 = Integer.parseInt(tb2.getText());
					ans = num1 + num2;
					
					output.setText(Integer.toString(ans));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, " please enter numbers only");
				}
			}
		});
		
		btnAdd.setBounds(64, 61, 41, 25);
		frame.getContentPane().add(btnAdd);
		
		output = new JTextField();
		output.setBounds(11, 99, 248, 22);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					num1 = Integer.parseInt(tb1.getText());
					num2 = Integer.parseInt(tb2.getText());
					ans = num1 - num2;
					
					output.setText(Integer.toString(ans));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, " please enter numbers only");
				}
				
			}
		});
		
		btnSub.setBounds(117, 61, 41, 25);
		frame.getContentPane().add(btnSub);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					num1 = Integer.parseInt(tb1.getText());
					num2 = Integer.parseInt(tb2.getText());
					ans = num1 / num2;
					
					output.setText(Integer.toString(ans));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, " please enter numbers only");
				}
			}
		});
		
		btnDiv.setBounds(170, 61, 41, 25);
		frame.getContentPane().add(btnDiv);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					num1 = Integer.parseInt(tb1.getText());
					num2 = Integer.parseInt(tb2.getText());
					ans = num1 * num2;
					
					output.setText(Integer.toString(ans));
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, " please enter numbers only");
				}
			}
		});
		btnMult.setBounds(223, 61, 41, 25);
		frame.getContentPane().add(btnMult);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tb1.setText("");
				tb2.setText("");
				output.setText("");
		
			}
		});
		
		btnClear.setBounds(0, 61, 52, 25);
		frame.getContentPane().add(btnClear);
	}
}
