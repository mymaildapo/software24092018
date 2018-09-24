import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class first {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	JCheckBox checkBox1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first window = new first();
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
	public first() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Value 1");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(34, 40, 113, 44);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(213, 51, 146, 26);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Value 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(34, 120, 113, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField2 = new JTextField();
		textField2.setBounds(213, 133, 146, 26);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1=Integer.parseInt(textField1.getText());
				int val2=Integer.parseInt(textField2.getText());
				int res = val1 + val2;
				textField3.setText(""+res);
				
				
				
			}
		});
		btnAdd.setBounds(32, 203, 115, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnNewButton_1 = new JButton("Subtract");
		btnNewButton_1.setBounds(213, 203, 161, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(34, 302, 69, 20);
		frame.getContentPane().add(lblResult);
		
		textField3 = new JTextField();
		textField3.setBounds(213, 299, 146, 26);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		checkBox1 = new JCheckBox("Greater 10");
		checkBox1.setBounds(138, 387, 139, 29);
		frame.getContentPane().add(checkBox1);
	}
}
